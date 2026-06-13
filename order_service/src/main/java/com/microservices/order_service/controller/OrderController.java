package com.microservices.order_service.controller;

import com.microservices.order_service.dto.TransactionRequest;
import com.microservices.order_service.dto.TransactionResponse;
import com.microservices.order_service.model.Order;
import com.microservices.order_service.service.interfaces.OrderService;
import com.microservices.order_service.util.ResponseDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/place-order")
    public ResponseDTO<TransactionResponse> placeOrder(@RequestBody TransactionRequest transactionRequest) {

        if (transactionRequest == null) {
            return new ResponseDTO<>("FAIL", null, "please fill the order details");
        }
        TransactionResponse orderRequestStatus = orderService.placeNewOrder(transactionRequest);
        return new ResponseDTO<>("SUCCESS", orderRequestStatus, "Data inserted successfully");
    }
}