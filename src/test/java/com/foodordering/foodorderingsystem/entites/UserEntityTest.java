package com.foodordering.foodorderingsystem.entites;

import com.foodordering.foodorderingsystem.entities.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserEntityTest {

    @Test
    public void testUserAttributes() {
        User user = new User();
        user.setId(1L);
        user.setName("John Doe");
        user.setEmail("johndoe@example.com");

        assertEquals(1L, user.getId());
        assertEquals("John Doe", user.getName());
        assertEquals("johndoe@example.com", user.getEmail());
    }
}
