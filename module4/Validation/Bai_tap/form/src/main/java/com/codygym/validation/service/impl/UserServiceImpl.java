package com.codygym.validation.service.impl;

import com.codygym.validation.model.User;
import com.codygym.validation.repository.UserRepository;
import com.codygym.validation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
