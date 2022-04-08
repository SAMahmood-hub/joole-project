package com.itlizeSession.product.Service;

import com.itlizeSession.product.Entity.User;
import com.itlizeSession.product.Service.impl.UserServiceImp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserServiceImp userServiceImp;

    @Test
    public void create() {
        User u1 = userServiceImp.Create();
        Assert.assertNotNull(u1);

    }

    @Test
    public void update() {
        User u1 = userServiceImp.Create();
        User u2 = userServiceImp.Update(u1);
        Assert.assertEquals(u1, u2);
    }

}