package com.itlizeSession.joole.Repository;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Entity.ProjectProduct;
import com.itlizeSession.joole.Entity.User;
import junit.framework.TestCase;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectProductRepositoryTest extends TestCase {
    @Autowired
    private ProjectProductRepository repository;
    @Test
    public void test() {
        // Create an object of your entity

        Timestamp time1 = new Timestamp(System.currentTimeMillis());
        Timestamp time2 = new Timestamp(System.currentTimeMillis());
        Project pro = new Project(new User("Fisher"),time1,time2);

        Product prod = new Product();
        prod.setTimeCreated(new Timestamp(System.currentTimeMillis()));
        prod.setTimeUpdated(new Timestamp(System.currentTimeMillis()));
        prod.setBrand("Toshiba");
        prod.setCertification("energy safe");

        ProjectProduct projProd = new ProjectProduct();
        projProd.setTimeCreated(new Timestamp(System.currentTimeMillis()));
        projProd.setProd(prod);
        projProd.setProj(pro);

        // Try to save it to your repository
        repository.save(projProd);

        // Check to see if the save worked with assert
        Assertions.assertThat(projProd.getPpID()).isGreaterThan(0);
    }

}
