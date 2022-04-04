package com.itlizeSession.product.Service.impl;

import com.itlizeSession.product.Entity.Product;
import com.itlizeSession.product.Repository.ProductRepository;
import com.itlizeSession.product.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService {


	@Autowired
	private ProductRepository repository;

	@Override
	public Product findOneById(Integer Id) {
		return repository.findById(Id).orElse(null);
	}

	@Override
	public List<Product> findAll() {
		return repository.findAll();
	}

	/**
	 * Transaction
	 *  inventory > order
	 */
	@Transactional
	public void createTwo() {
		Product prod1 = new Product();
		prod1.setBrand("Honeybell");
		prod1.setPrice(new BigDecimal("150"));
		prod1.setType("fan");
		prod1.setGlobalSpecs(50);
		prod1.setFirmSpecs(20);
		prod1.setCertifications("energy safe");
		repository.save(prod1);

		Product prod2 = new Product();
		prod2.setBrand("Toshiba");
		prod2.setPrice(new BigDecimal("2000"));
		prod2.setType("computer");
		prod2.setGlobalSpecs(120);
		prod2.setFirmSpecs(50);
		prod2.setCertifications("uranium free");
		repository.save(prod2);
	}

	@Override
	public Product save(Product myProduct) {
		return repository.save(myProduct);

	}

	@Override
	public List<Product> findByBrand(String b) {
		return repository.findByBrand(b);
	}
}
