package com.itlizeSession.joole.Service;

import com.itlizeSession.joole.Entity.ProductType;
import com.itlizeSession.joole.Service.impl.ProductTypeServiceImp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTypeServiceTest {

    @Autowired
    ProductTypeServiceImp productTypeServiceImp;

    /*@Test
    public void create() {
        ProductType res = productTypeServiceImp.create();
    }

    @Test
    public void update() {
        ProductType pt1 = productTypeServiceImp.create();
        ProductType pt2 = productTypeServiceImp.update(pt1);
        Assert.assertEquals(pt1, pt2);
    }

    @Test
    public void deleteByApplication() {
        productTypeServiceImp.deleteByApplication("aaa");
        productTypeServiceImp.deleteByApplication("abc");
        Assert.assertEquals(productTypeServiceImp, "aaa");
    }*/
}