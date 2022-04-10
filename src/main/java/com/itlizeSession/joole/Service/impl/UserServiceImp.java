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



	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getUserList() {
		return userRepository.findAll();
	}

	@Override
	public User updateUserByName(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUserByName(String userName) {
		userRepository.deleteById(userName);
	}
}

