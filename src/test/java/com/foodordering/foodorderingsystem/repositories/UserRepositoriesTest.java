package com.foodordering.foodorderingsystem.repositories;

import com.foodordering.foodorderingsystem.entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveUser() {
        User user = new User();
        user.setName("Jane Doe");
        user.setEmail("jane@example.com");
        user.setPhoneNumber("1234567890");

        User savedUser = userRepository.save(user);
        assertNotNull(savedUser.getId());
    }
}
