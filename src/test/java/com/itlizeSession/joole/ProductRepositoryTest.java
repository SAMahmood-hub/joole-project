package com.itlizeSession.joole;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Repository.ProductRepository;
import com.itlizeSession.joole.Repository.ProjectRepository;
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
public class ProductRepositoryTest extends TestCase {
    @Autowired
    private ProductRepository repository;
    @Test
    public void test() {
        // Create an object of your entity
        Product prod = new Product();
        prod.setTimeCreated(new Timestamp(System.currentTimeMillis()));
        prod.setTimeUpdated(new Timestamp(System.currentTimeMillis()));
        prod.setBrand("Toshiba");
        prod.setCertification("energy safe");


        // Try to save it to your repository
        repository.save(prod);

        // Check to see if the save worked with assert
        Assertions.assertThat(prod.getResourceId()).isGreaterThan(0);
    }

}
