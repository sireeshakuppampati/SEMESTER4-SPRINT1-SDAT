package com.foodordering.foodorderingsystem.repositories;

import com.foodordering.foodorderingsystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}