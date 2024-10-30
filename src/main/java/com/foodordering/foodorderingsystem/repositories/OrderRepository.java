package com.foodordering.foodorderingsystem.repositories;

import com.foodordering.foodorderingsystem.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}