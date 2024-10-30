package com.foodordering.foodorderingsystem.controllers;

import com.foodordering.foodorderingsystem.entities.User;
import com.foodordering.foodorderingsystem.repositories.UserRepository;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController@RequestMapping("/api/users")public class UserController {

    @Autowiredprivate UserRepository userRepository;

    @GetMappingpublic List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @PostMappingpublic User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}