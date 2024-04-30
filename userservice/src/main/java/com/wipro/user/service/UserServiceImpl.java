package com.wipro.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.user.entity.User;
import com.wipro.user.exception.ResourceNotFoundException;
import com.wipro.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
	public User getUserById(int userId) {
		Optional<User> optionalUser = userRepository.findById(userId);
        if(optionalUser.isEmpty()) {
        	throw new ResourceNotFoundException("User not existing with id: "+userId);
        }
        User user = optionalUser.get();
        return user;
	}

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
	public User updateUser(User user) {
		Optional<User> optionalUser = userRepository.findById(user.getUserId());
        if(optionalUser.isEmpty()) {
        	throw new ResourceNotFoundException("User not existing with id: "+user.getUserId());
        }
        userRepository.save(user);
        return user;
	}
	
	@Override
	public void deleteUser(int userId) {
		Optional<User> optionalUser = userRepository.findById(userId);
        if(optionalUser.isEmpty()) {
        	throw new ResourceNotFoundException("User not existing with id: "+userId);
        }
        User user = optionalUser.get();
        userRepository.delete(user);
	}
}