package com.itlizeSession.product.Service;

import com.itlizeSession.product.Entity.ProductType;
import com.itlizeSession.product.Entity.User;

import java.util.List;

public interface ProductTypeService {
//    ProductType create();
//    ProductType update(ProductType productType);
//    void deleteByApplication(String application);

//    User saveUser(User user);
//
//    List<User> getUserList();
//
//    User updateUserByName(User user);
//
//    void deleteUserByName(String userName);

    ProductType saveProductType(ProductType productType);

    List<ProductType> getProductTypeList();

    ProductType updateProductType(ProductType productType);

    void deleteProductTypeById(Integer id);
}
