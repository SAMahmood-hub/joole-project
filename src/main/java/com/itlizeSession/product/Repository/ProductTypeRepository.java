package com.itlizeSession.product.Repository;

import com.itlizeSession.product.Entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, Integer> {

    List<ProductType> findByApplication(String app);
}
