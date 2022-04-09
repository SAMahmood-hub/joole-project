package com.itlizeSession.joole.Repository;

import com.itlizeSession.joole.Entity.ProductType;
import com.itlizeSession.joole.Repository.ProductTypeRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTypeRepositoryTest {

    @Autowired
    ProductTypeRepository productTypeRepository;

    @Test
    public void saveTest(){
        ProductType productType = new ProductType("abc","bcd","efg","qqq",1993);
        ProductType result = productTypeRepository.save(productType);
        Assert.assertNotEquals(null, result);
    }


    @Test
    public void findByApplication() {
        List<ProductType> result = productTypeRepository.findByApplication("Indoor");
        System.out.println(result);
        Assert.assertNotEquals(null, result);
    }
}