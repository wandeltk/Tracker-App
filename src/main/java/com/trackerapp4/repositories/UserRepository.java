package com.trackerapp4.repositories;

import com.trackerapp4.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
