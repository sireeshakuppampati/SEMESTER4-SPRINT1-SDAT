package com.foodordering.foodorderingsystem.repositories;

import com.foodordering.foodorderingsystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository

public interface UserRepository extends JpaRepository<User, Long> {
    // Additional query methods can be defined here if needed
}
