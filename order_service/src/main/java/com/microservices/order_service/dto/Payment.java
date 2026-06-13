package com.microservices.order_service.dto;

import java.util.UUID;

public class Payment {
    private Integer paymentId;
    private String paymentStatus;
    private String transactionId;
    private Integer orderId;
    private Double amount;

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Payment(Integer paymentId, String paymentStatus, String transactionId, Integer orderId, Double amount) {
        this.paymentId = paymentId;
        this.paymentStatus = paymentStatus;
        this.transactionId = transactionId;
        this.orderId = orderId;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", paymentId=" + paymentId +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", orderId=" + orderId +
                '}';
    }
}
