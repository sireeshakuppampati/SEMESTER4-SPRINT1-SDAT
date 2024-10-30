package com.foodordering.foodorderingsystem.repositories;

import com.foodordering.foodorderingsystem.entities.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}
