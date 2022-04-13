package com.itlizeSession.joole.Service;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Repository.ProductRepository;
import com.itlizeSession.joole.Service.impl.ProductServiceImp;
import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest extends TestCase {
    @Autowired
    private ProductService service;
    @Test
    public void createReadTest() {

        Product check = service.create("Toshiba", "Energy Safe", "Cool", "Laptop");
        Product test = service.read(check.getResourceId());

        assertEquals(check.getBrand(), test.getBrand());
    }

    @Test
    public void updateTest() {
        Product check = service.create("Toshiba", "Energy Safe", "Cool", "Laptop");
        int checkID = check.getResourceId();
        Product test = new Product(checkID, "HP", "Energy Safe", "Cool", "Laptop");
        service.update(check.getResourceId(), test);
        assertNotEquals(service.read(test.getResourceId()).getBrand(), check.getBrand());
    }

    @Test
    public void deleteTest() {
        Product check = service.create("Toshiba", "Energy Safe", "Cool", "Laptop");
        service.delete(check.getResourceId());
        assertNull(service.read(check.getResourceId()));
    }

}
