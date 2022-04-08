package com.itlizeSession.product.Service;

import com.itlizeSession.product.Entity.ProductType;

public interface ProductTypeService {
    ProductType create();
    ProductType update(ProductType productType);
    void deleteByApplication(String application);
}
