package com.foodordering.foodorderingsystem.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.foodordering.foodorderingsystem.services.UserService;
import com.foodordering.foodorderingsystem.services.RestaurantService;
import com.foodordering.foodorderingsystem.services.MenuItemService;
import com.foodordering.foodorderingsystem.services.OrderService;

@Configuration
public class AppConfig {

    // Define the service beans
    @Bean
    public UserService userService() {
        return new UserService();
    }

    @Bean
    public RestaurantService restaurantService() {
        return new RestaurantService();
    }

    @Bean
    public MenuItemService menuItemService() {
        return new MenuItemService();
    }

    @Bean
    public OrderService orderService() {
        return new OrderService();
    }

    // Bean for ModelMapper
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
