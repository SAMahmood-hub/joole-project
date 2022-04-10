package com.itlizeSession.product.Service;

import com.itlizeSession.product.Entity.User;
import java.util.*;


public interface UserService {
//    @Autowired
//    private UserRepository userRepository;
//
//    public List<User> getUserByRole(String role) {
//        return userRepository.findByRole(role);
//    }
//
//    public User getUserByName(String user_name) {
//        return  userRepository.findByUser_name(user_name);
//    }
    User saveUser(User user);

    List<User> getUserList();

    User updateUserByName(User user);

    void deleteUserByName(String userName);




}
