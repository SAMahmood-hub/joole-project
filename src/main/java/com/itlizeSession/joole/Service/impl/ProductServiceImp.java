package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Entity.ProductType;
import com.itlizeSession.joole.Entity.TechnicalDetail;
import com.itlizeSession.joole.Repository.ProductRepository;
import com.itlizeSession.joole.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService {


	@Autowired
	private ProductRepository repository;

	@Override
	public Product findOneById(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Product> findAll() {
		return repository.findAll();
	}

	@Transactional
	public Product create(String brand, String certification, String techDetail, String prodType) {
		Product prod1 = new Product();
		prod1.setTimeCreated(new Timestamp(System.currentTimeMillis()));
		prod1.setTimeUpdated(new Timestamp(System.currentTimeMillis()));
		prod1.setBrand(brand);
		prod1.setCertification(certification);
		prod1.setTechnicalDetail(new TechnicalDetail(techDetail));
		prod1.setType(new ProductType(prodType));
		return repository.save(prod1);
	}

	@Transactional
	public Product update(Integer id, Product updateProduct) {
		return repository.save(updateProduct);
    }
	@Transactional
	public void delete(Integer id) {
		repository.delete(findOneById(id));

	}
	@Transactional
	public Product read(Integer id) {
		System.out.println(findOneById(id));
		return findOneById(id);
	}
}
