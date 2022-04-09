package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Entity.User;
import com.itlizeSession.joole.Repository.UserRepository;
import com.itlizeSession.joole.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserRepository userRepository;


//    @Override
//    public List<User> findByRole(String role) {
//        return userRepository.findByRole(role);
//    }
//
//    @Override
//    public List<User> findAll() {
//        return userRepository.findAll();
//    }
//
//    @Transactional
//    public void createTwo() {
//
//        User user1 = new User();
//        user1.setRole("actor");
//        user1.setUserName("Paul");
//        user1.setPassword("12345");
//        userRepository.save(user1);
//
//        User user2 = new User();
//        user1.setRole("actor2");
//        user1.setUserName("Paul2");
//        user1.setPassword("123452");
//        userRepository.save(user2);
//
//    }

//    @Override
//    public User findByUserName(String user_name) {
//        return userRepository.findByUserName(user_name);
//    }
//
//    @Override
//    public User save(User myUser) {
//        return userRepository.save(myUser);
//    }

	@Override
	public User Create() {
		User u1 = new User("bib");

		userRepository.save(u1);
		return u1;
	}


	@Override
	public User Update(User user) {
		user.setRole("aaa");
		user.setPassword("123344");
		return user;
	}
}