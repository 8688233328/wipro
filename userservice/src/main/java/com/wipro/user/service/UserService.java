package com.wipro.user.service;

import java.util.List;

import com.wipro.user.entity.User;

public interface UserService {
    
    User saveUser(User user);
    
    User getUserById(int id);
    
    List<User> getAllUsers();
    
    User updateUser(User user);
    
    void deleteUser(int id);
    
}
