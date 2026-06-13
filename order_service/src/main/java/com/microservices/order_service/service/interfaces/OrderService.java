package com.microservices.order_service.service.interfaces;

import com.microservices.order_service.dto.TransactionRequest;
import com.microservices.order_service.dto.TransactionResponse;
import com.microservices.order_service.model.Order;

public interface OrderService {

    TransactionResponse placeNewOrder(TransactionRequest transactionRequest);

}
