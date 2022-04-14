package com.itlizeSession.joole.Service;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Entity.ProductType;

import java.util.List;

public interface ProductTypeService {
    ProductType create(Product prod, String useType, String app, String mountingLocation, String accessories, int year);
    ProductType updateProductType(ProductType productType);
    void deleteByApplication(String application);
    ProductType saveProductType(ProductType productType);
    List<ProductType> getProductTypeList();
    void deleteProductTypeById(Integer id);
}