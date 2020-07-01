package com.trackerapp4.services;

import com.trackerapp4.models.User;
import com.trackerapp4.repositories.UserRepository;

import java.util.List;

public class UserService {

    private UserRepository userRepository;

    private List<User> findAll() {
        return userRepository.findAll();
    }

    private User save(User newUser) {
        return userRepository.save(newUser);
    }

    private User findUserById(int userId) {
        return userRepository.findById(userId);
    }

}
