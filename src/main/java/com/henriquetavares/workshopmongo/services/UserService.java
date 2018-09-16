package com.henriquetavares.workshopmongo.services;

import com.henriquetavares.workshopmongo.domain.User;
import com.henriquetavares.workshopmongo.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

}
