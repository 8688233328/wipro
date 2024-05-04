package com.wipro.orderservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wipro.orderservice.model.User;

@FeignClient(name = "USERSERVICE", fallback = UserServiceFallback.class)
public interface UserServiceConsumer {

    @GetMapping("/customer/{id}")
    User getUserDetailsById(@PathVariable("id") int userId);
}
