package com.itlizeSession.joole.Repository;

import com.itlizeSession.joole.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByBrand(String brand);
}
