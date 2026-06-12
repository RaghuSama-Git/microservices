package com.microservices.payment_service.model;

import org.springframework.data.mongodb.core.mapping.MongoId;

public class Payment {

    @MongoId
    private String id;
    private int paymentId;
    private String paymentStatus;
    private String transactionId;
    private int orderId;
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Payment(double amount, String id, int orderId, int paymentId, String paymentStatus, String transactionId) {
        this.amount = amount;
        this.id = id;
        this.orderId = orderId;
        this.paymentId = paymentId;
        this.paymentStatus = paymentStatus;
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", id='" + id + '\'' +
                ", paymentId=" + paymentId +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", orderId=" + orderId +
                '}';
    }
}
