package com.foodordering.foodorderingsystem.repositories;

import com.foodordering.foodorderingsystem.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    // Additional query methods can be defined here if needed
}
