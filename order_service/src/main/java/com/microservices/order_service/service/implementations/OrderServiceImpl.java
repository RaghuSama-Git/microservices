package com.microservices.order_service.service.implementations;

import com.microservices.order_service.dto.InventoryResponse;
import com.microservices.order_service.dto.OrderRequest;
import com.microservices.order_service.dto.OrderedItemsDto;
import com.microservices.order_service.model.Order;
import com.microservices.order_service.repository.OrderRepository;
import com.microservices.order_service.service.interfaces.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final WebClient webClient;

    public OrderServiceImpl(OrderRepository orderRepository, WebClient webClient) {
        this.orderRepository = orderRepository;
        this.webClient = webClient;
    }


    @Override
    public Order placeNewOrder(Order orderRequest) {
        return orderRepository.save(orderRequest);
    }
}
