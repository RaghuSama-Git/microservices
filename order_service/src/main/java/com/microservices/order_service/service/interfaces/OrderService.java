package com.microservices.order_service.service.interfaces;

import com.microservices.order_service.model.Order;

public interface OrderService {

    Order placeNewOrder(Order orderRequest);

}
