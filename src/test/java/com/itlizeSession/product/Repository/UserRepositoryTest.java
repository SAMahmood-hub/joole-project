package com.itlizeSession.product.Repository;

import com.itlizeSession.product.Entity.User;
import junit.framework.TestCase;
import org.junit.Assert;
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
    UserRepository userRepository;

    @Test
    public void saveTest() {
        User user1 = new User();
        user1.setUser_name("Tiance");
        user1.setPassword("123");
        user1.setRole("Actor");

        Date date1 = new Date(System.currentTimeMillis());
        Date date2 = new Date(System.currentTimeMillis());
        user1.setTime_created(date1);
        user1.setTime_updated(date2);

        User res = userRepository.save(user1);
        Assert.assertNotEquals(null, res);

    }
    @Test
    public void findByUser_name() {
        User res = userRepository.findByUser_name("Tiance");

        System.out.println(res);
        Assert.assertNotEquals(null, res);
    }

    @Test
    public void findByRole() {

        List<User> res = userRepository.findByRole("Actor");

        System.out.println(res);
        Assert.assertNotEquals(null, res);
    }
}