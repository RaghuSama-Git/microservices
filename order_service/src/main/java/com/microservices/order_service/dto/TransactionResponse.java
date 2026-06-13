package com.microservices.order_service.dto;

import com.microservices.order_service.model.Order;

public class TransactionResponse {
    private Order order;
    private Double amount;
    private String transactionId;
    private String message;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TransactionResponse(double amount, String message, Order order, String transactionId) {
        this.amount = amount;
        this.message = message;
        this.order = order;
        this.transactionId = transactionId;
    }

    public TransactionResponse() {
    }
}