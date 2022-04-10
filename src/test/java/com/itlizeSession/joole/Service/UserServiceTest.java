package com.itlizeSession.joole.Service;

import com.itlizeSession.joole.Entity.User;
import com.itlizeSession.joole.Repository.UserRepository;
import com.itlizeSession.joole.Service.impl.UserServiceImp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserServiceImp userServiceImp;
    @Autowired
    UserRepository userRepository;
    /*@Test
    public void saveUser() {
        User u1 = new User("abc","qqq","aaa");
        userServiceImp.saveUser(u1);
        Assertions.assertEquals(u1.getUserName(),userRepository.findByUserName("abc"));
    }

    @Test
    public void getUserList() {
        User u1 = new User("11111","abb","156");
        User u2 = new User("2222","cdd","116");
        userServiceImp.getUserList();
        Assertions.assertEquals(userServiceImp.getUserList(),"11111");
    }

    @Test
    public void updateUserByName() {
        User u1 = new User("abc","qqq","aaa");
        userServiceImp.updateUserByName(u1);
        Assertions.assertNotEquals(userRepository.findByUserName("abc").getRole(), "bbb");
    }

    @Test
    public void deleteUserByName() {
        userServiceImp.deleteUserByName("abc");
        Assertions.assertFalse(userRepository.findById("abc").isPresent());

    }*/



}