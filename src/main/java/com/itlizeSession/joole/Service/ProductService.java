package com.itlizeSession.joole.Service;

import com.itlizeSession.joole.Entity.Product;

import java.util.List;

public interface ProductService {

    Product findOneById(Integer Id);

    List<Product> findAll();

    public Product create(String brand, String certification, String techDetail, String prodType);

    Product update(Integer id, Product updateProduct);

    void delete(Integer Id);

    Product read(Integer Id);

    void deleteAll();

}
