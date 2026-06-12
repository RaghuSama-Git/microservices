package com.microservices.payment_service.service;

import com.microservices.payment_service.model.Payment;
import com.microservices.payment_service.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepo;

    public PaymentService(PaymentRepository paymentRepo) {
        this.paymentRepo = paymentRepo;
    }

    public Payment makePayment(Payment payment){
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepo.save(payment);
    }
}
