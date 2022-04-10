package com.itlizeSession.product.Service;

import com.itlizeSession.product.Entity.ProductType;
import com.itlizeSession.product.Repository.ProductTypeRepository;
import com.itlizeSession.product.Service.impl.ProductTypeServiceImp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.function.BooleanSupplier;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTypeServiceTest {

    @Autowired
    ProductTypeServiceImp productTypeServiceImp;
    @Autowired
    ProductTypeRepository productTypeRepository;


    @Test
    public void saveProductType() {
        ProductType pt1 = new ProductType("1","2","3","4",1997);
        productTypeServiceImp.saveProductType(pt1);
        Assertions.assertEquals("1", pt1.getUseType());
    }

    @Test
    public void getProductTypeList() {
        ProductType pt1 = new ProductType("2","3","4","5",1994);
        productTypeServiceImp.getProductTypeList();
        Assertions.assertEquals(productTypeServiceImp.getProductTypeList(),"2");
    }

    @Test
    public void updateProductTypeById() {
        ProductType pt1 = new ProductType("2","3","4","5",1994);
        productTypeServiceImp.updateProductType(pt1);
        Assertions.assertEquals(productTypeRepository.findByUseType("2"),"2");
    }

    @Test
    public void deleteProductTypeById() {
        productTypeServiceImp.deleteProductTypeById(2);
        Assertions.assertFalse(productTypeRepository.findById(2).isPresent());

    }
}