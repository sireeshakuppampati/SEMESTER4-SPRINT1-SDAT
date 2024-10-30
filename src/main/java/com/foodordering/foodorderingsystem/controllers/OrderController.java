package com.foodordering.foodorderingsystem.controllers;

import com.foodordering.foodorderingsystem.entities.Order;
import com.foodordering.foodorderingsystem.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowiredprivate OrderRepository orderRepository;

    @GetMappingpublic List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    @PostMappingpublic Order createOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }
}