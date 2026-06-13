package com.microservices.payment_service.controller;

import com.microservices.payment_service.model.Payment;
import com.microservices.payment_service.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/make-payment")
    public Payment makePayment(@RequestBody Payment payment){
        return paymentService.makePayment(payment);
    }
}
