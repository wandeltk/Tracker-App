package com.trackerapp4.repositories;

import com.trackerapp4.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findById(int id);
    User save(User newUser);
    List<User> findAll();
}
