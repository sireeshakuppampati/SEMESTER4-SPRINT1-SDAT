package com.foodordering.foodorderingsystem.repositories;

import com.foodordering.foodorderingsystem.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
