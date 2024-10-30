package com.foodordering.foodorderingsystem.repositories;

import com.foodordering.foodorderingsystem.entities.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    // Additional query methods can be defined here if needed
}
