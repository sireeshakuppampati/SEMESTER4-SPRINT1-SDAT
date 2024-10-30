package com.foodordering.foodorderingsystem.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import com.foodordering.foodorderingsystem.repositories.UserRepository;
import com.foodordering.foodorderingsystem.repositories.RestaurantRepository;
import com.foodordering.foodorderingsystem.repositories.MenuItemRepository;
import com.foodordering.foodorderingsystem.repositories.OrderRepository;
import com.foodordering.foodorderingsystem.services.UserService;
import com.foodordering.foodorderingsystem.services.RestaurantService;
import com.foodordering.foodorderingsystem.services.MenuItemService;
import com.foodordering.foodorderingsystem.services.OrderService;

@Configuration
public class AppConfig {

    // Repositories are injected here
    private final UserRepository userRepository;
    private final RestaurantRepository restaurantRepository;
    private final MenuItemRepository menuItemRepository;
    private final OrderRepository orderRepository;

    @Autowired
    public AppConfig(UserRepository userRepository, RestaurantRepository restaurantRepository,
                     MenuItemRepository menuItemRepository, OrderRepository orderRepository) {
        this.userRepository = userRepository;
        this.restaurantRepository = restaurantRepository;
        this.menuItemRepository = menuItemRepository;
        this.orderRepository = orderRepository;
    }

    // Define the service beans with injected repositories
    @Bean
    public UserService userService() {
        return new UserService(userRepository);
    }

    @Bean
    public RestaurantService restaurantService() {
        return new RestaurantService(restaurantRepository);
    }

    @Bean
    public MenuItemService menuItemService() {
        return new MenuItemService(menuItemRepository);
    }

    @Bean
    public OrderService orderService() {
        return new OrderService(orderRepository);
    }

    // Bean for ModelMapper
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
