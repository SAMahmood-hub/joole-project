package com.itlizeSession.product.Service;

import com.itlizeSession.product.Entity.User;
import com.itlizeSession.product.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUserByRole(String role) {
        return userRepository.findByRole(role);
    }

    public User getUserByName(String user_name) {
        return  userRepository.findByUser_name(user_name);
    }




}
