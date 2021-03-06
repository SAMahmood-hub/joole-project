package com.itlizeSession.joole.Repository;

import com.itlizeSession.joole.Repository.UserRepository;
import com.itlizeSession.joole.Entity.User;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest extends TestCase {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveTest() {
        User user1 = new User("Tiance");
        user1.setPassword("123");
        user1.setRole("Actor");
//        user1.setTime_created();
//        user1.setTime_updated();

        User res = userRepository.save(user1);
        Assert.assertNotEquals(null, res);

    }
}