package com.microservices.payment_service.controller;

import com.microservices.payment_service.model.Payment;
import com.microservices.payment_service.service.PaymentService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{orderId}")
    public Payment fetchByOrderId(@PathVariable Integer orderId){
        return paymentService.fetchDetailsByOrderId(orderId);
    }
}
