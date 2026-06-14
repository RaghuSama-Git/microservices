package com.microservices.payment_service.service;

import com.microservices.payment_service.model.Payment;
import com.microservices.payment_service.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepo;

    public PaymentService(PaymentRepository paymentRepo) {
        this.paymentRepo = paymentRepo;
    }

    public Payment makePayment(Payment payment) {
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString());
        payment.setPaymentId(UUID.randomUUID().hashCode());
        Payment savedPayment = paymentRepo.save(payment);
        System.out.println("Saved Payment : " + savedPayment);
        return savedPayment;
    }

    public Payment fetchDetailsByOrderId(Integer orderId){
        return paymentRepo.findPaymentByOrderId(orderId);
    }

    public String paymentProcessing() {
        return new Random().nextBoolean() ? "SUCCESS" : "FAILED";
    }
}
