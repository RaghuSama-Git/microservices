package com.microservices.order_service.controller;

import com.microservices.order_service.model.Order;
import com.microservices.order_service.service.interfaces.OrderService;
import com.microservices.order_service.util.ResponseDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/Order")
    public String getProduct() {
        return "Order details";
    }

    @PostMapping("/place-order")
    public ResponseDTO<Order> placeOrder(@RequestBody Order orderRequest) {

        if (orderRequest == null) {
            return new ResponseDTO<>("FAIL", null, "please fill the order details");
        }
        Order orderRequestStatus = orderService.placeNewOrder(orderRequest);
        return new ResponseDTO<>("SUCCESS", orderRequestStatus, "Data inserted successfully");
    }
}