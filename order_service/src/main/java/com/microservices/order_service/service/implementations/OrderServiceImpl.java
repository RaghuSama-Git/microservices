package com.microservices.order_service.service.implementations;

import com.microservices.order_service.dto.Payment;
import com.microservices.order_service.dto.TransactionRequest;
import com.microservices.order_service.dto.TransactionResponse;
import com.microservices.order_service.model.Order;
import com.microservices.order_service.repository.OrderRepository;
import com.microservices.order_service.service.interfaces.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final RestTemplate restTemplate;

    public OrderServiceImpl(OrderRepository orderRepository, RestTemplate restTemplate) {
        this.orderRepository = orderRepository;
        this.restTemplate = restTemplate;
    }


    @Override
    public TransactionResponse placeNewOrder(TransactionRequest transactionRequest) {

        String paymentMessage = "";
        Order order = transactionRequest.getOrder();
        Payment payment = transactionRequest.getPayment();

        payment.setOrderId(transactionRequest.getOrder().getId());
        payment.setAmount(transactionRequest.getOrder().getPrice());

        //Rest Call
        Payment paymentResponse = restTemplate.
                postForObject("http://PAYMENT-SERVICE/payment/make-payment", payment, Payment.class);

        if (paymentResponse != null &&
                paymentResponse.getPaymentStatus().equalsIgnoreCase("Success")) {
            paymentMessage = "Payment Process is successful";
        } else {
            paymentMessage = "Payment has been failed";
        }

        Order savedOrder = orderRepository.save(order);
        System.out.println("Saved Order : " + savedOrder);
        if(paymentResponse != null){
            return new TransactionResponse(paymentResponse.getAmount(), paymentMessage, order, paymentResponse.getTransactionId());
        }
        return null;
    }
}
