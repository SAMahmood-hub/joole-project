package com.itlizeSession.joole.Service;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Entity.ProjectProduct;
import com.itlizeSession.joole.Entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;

import static org.junit.Assert.assertNotEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ProjectProductServiceTest {
    @Autowired
    private ProjectProductService service;

    private ProjectProduct projectProduct;
    @BeforeEach
    public void init() {
        this.projectProduct = new ProjectProduct();
        Project proj = new Project();
        Product prod = new Product();
        /*
        projectProduct.setTimeCreated(new Timestamp(System.currentTimeMillis()));
        Timestamp time1 = new Timestamp(System.currentTimeMillis());
        Timestamp time2 = new Timestamp(System.currentTimeMillis());
        Project proj = new Project(new User("Fischer"),time1,time2);
        Product prod = new Product();
        prod.setTimeCreated(new Timestamp(System.currentTimeMillis()));
        prod.setTimeUpdated(new Timestamp(System.currentTimeMillis()));
        prod.setBrand("Toshiba");
        prod.setCertification("energy safe");*/
        this.projectProduct.setProj(proj);
        this.projectProduct.setProd(prod);
    }
    @Test
    public void createReadTest() {
        //this.projectProduct = new ProjectProduct();
        System.out.println(projectProduct);
        ProjectProduct check = service.create(projectProduct);
        ProjectProduct test = service.read(projectProduct.getPpID());

        assertEquals(check.getPpID(), test.getPpID());
    }

    @Test
    public void updateTest() {
        ProjectProduct check = service.create(this.projectProduct);
        ProjectProduct test = new ProjectProduct(this.projectProduct);
        test.setTimeCreated(new Timestamp(System.currentTimeMillis()));
        service.update(check.getPpID(), test);
        assertNotEquals(service.read(test.getPpID()).getTimeCreated(), check.getTimeCreated());
    }

    @Test
    public void deleteTest() {
        service.create(this.projectProduct);
        service.delete(this.projectProduct.getPpID());
        assertNull(service.read(this.projectProduct.getPpID()));
    }

}
