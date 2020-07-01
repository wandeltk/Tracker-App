package com.trackerapp4.services;

import com.trackerapp4.models.User;
import com.trackerapp4.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Transactional
    public User findById(int id) {
        return userRepository.findById(id);
    }

    @Transactional
    public User save(User newUser) {
        return userRepository.save(newUser);
    }

    @Transactional
    public User findUserById(int userId) {
        return userRepository.findById(userId);
    }

}
