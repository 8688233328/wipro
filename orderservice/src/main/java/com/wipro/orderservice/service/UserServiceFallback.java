package com.wipro.orderservice.service;

import org.springframework.stereotype.Component;
import com.wipro.orderservice.model.User;

@Component
public class UserServiceFallback implements UserServiceConsumer {

    @Override
    public User getUserDetailsById(int userId) {
        // Implement fallback logic here
        // For example, return a default User object or throw a custom exception
        return new User(); // Default user object
    }
}
