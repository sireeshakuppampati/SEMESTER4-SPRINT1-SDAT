package com.foodordering.foodorderingsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService; // Example service, replace with your actual service class

    @GetMapping("/users")
    public List<User> getUsers() {
        // Implementation
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        // Implementation
    }
}
