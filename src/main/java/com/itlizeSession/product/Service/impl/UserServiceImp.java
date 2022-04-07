package com.itlizeSession.product.Service.impl;

import com.itlizeSession.product.Entity.Product;
import com.itlizeSession.product.Entity.User;
import com.itlizeSession.product.Repository.UserRepository;
import com.itlizeSession.product.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;




    @Override
    public List<User> findByRole(String role) {
        return userRepository.findByRole(role);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Transactional
    public void createTwo() {

        User user1 = new User();
        user1.setRole("actor");
        user1.setUserName("Paul");
        user1.setPassword("12345");
        userRepository.save(user1);

        User user2 = new User();
        user1.setRole("actor2");
        user1.setUserName("Paul2");
        user1.setPassword("123452");
        userRepository.save(user2);

    }

    @Override
    public User findByUserName(String user_name) {
        return userRepository.findByUserName(user_name);
    }

    @Override
    public User save(User myUser) {
        return userRepository.save(myUser);
    }
}
