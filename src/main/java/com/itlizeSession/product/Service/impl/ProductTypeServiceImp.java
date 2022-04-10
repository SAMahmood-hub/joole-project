package com.itlizeSession.product.Service.impl;

import com.itlizeSession.product.Entity.ProductType;
import com.itlizeSession.product.Repository.ProductTypeRepository;
import com.itlizeSession.product.Service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeServiceImp implements ProductTypeService {
    @Autowired
    ProductTypeRepository productTypeRepository;

    @Override
    public ProductType saveProductType(ProductType productType) {
        return productTypeRepository.save(productType);
    }

    @Override
    public List<ProductType> getProductTypeList() {
        return productTypeRepository.findAll();
    }

    @Override
    public ProductType updateProductType(ProductType productType) {
        return productTypeRepository.save(productType);
    }

    @Override
    public void deleteProductTypeById(Integer id) {
        productTypeRepository.deleteById(id);

    }
}
