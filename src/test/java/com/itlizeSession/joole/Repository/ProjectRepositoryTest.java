package com.itlizeSession.joole.Repository;

import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Repository.ProjectRepository;
import com.itlizeSession.joole.Entity.User;
import junit.framework.TestCase;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectRepositoryTest extends TestCase {
    @Autowired
    private ProjectRepository repository;
    @Test
    public void test() {
        // Create an object of your entity
        Timestamp time1 = new Timestamp(System.currentTimeMillis());
        Timestamp time2 = new Timestamp(System.currentTimeMillis());
        Project pro = new Project(new User("Sniper"),time1,time2);


        // Try to save it to your repository
        repository.save(pro);

        // Check to see if the save worked with assert
        Assertions.assertThat(pro.getId()).isGreaterThan(0);
    }

}
