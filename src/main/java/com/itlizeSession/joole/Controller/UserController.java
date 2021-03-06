package com.itlizeSession.joole.Controller;

import com.itlizeSession.joole.Entity.User;
import com.itlizeSession.joole.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/signUp")
	public ResponseEntity<?> saveUser (@RequestBody User user) {
		try{
			userService.saveUser(user);
		} catch(Exception e) {
			return new ResponseEntity<>("{\"error\":\""+e.getMessage() + "\"}", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PostMapping(path="/get")
	public ResponseEntity<?> getUser () {
		try{
			userService.getUserList();
		} catch(Exception e) {
			return new ResponseEntity<>("{\"error\":\""+e.getMessage() + "\"}", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<?> updateUser(@RequestBody User user) {
		userService.updateUserByName(user);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteUser(@RequestParam(name = "userName") String userName) {
		userService.deleteUserByName(userName);
		return new ResponseEntity<>(HttpStatus.OK);
	}




}