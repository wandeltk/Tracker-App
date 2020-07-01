package com.trackerapp4.services;

import com.trackerapp4.models.User;
import com.trackerapp4.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository repo){
        this.userRepository = repo;
    }

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
