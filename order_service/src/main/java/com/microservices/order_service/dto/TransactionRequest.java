package com.microservices.order_service.dto;

import com.microservices.order_service.model.Order;

public class TransactionRequest {
    private Order order;
    private Payment payment;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public TransactionRequest(Order order, Payment payment) {
        this.order = order;
        this.payment = payment;
    }

    public TransactionRequest() {
    }

    @Override
    public String toString() {
        return "TransactionRequest{" +
                "order=" + order +
                ", paymentDto=" + payment +
                '}';
    }
}
