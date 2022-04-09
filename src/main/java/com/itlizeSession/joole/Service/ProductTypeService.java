package com.itlizeSession.joole.Service;

import com.itlizeSession.joole.Entity.ProductType;

public interface ProductTypeService {
    ProductType create();
    ProductType update(ProductType productType);
    void deleteByApplication(String application);
}