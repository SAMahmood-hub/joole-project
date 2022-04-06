package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Repository.ProductRepository;
import com.itlizeSession.joole.Service.ProductService;
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
		prod1.setMechanical_detail_id(50);
		prod1.setTechnical_detail_id(20);
		prod1.setCertification("energy safe");
		repository.save(prod1);

		Product prod2 = new Product();
		prod2.setBrand("Toshiba");
		prod2.setPrice(new BigDecimal("2000"));
		prod2.setType("computer");
		prod2.setMechanical_detail_id(120);
		prod2.setTechnical_detail_id(50);
		prod2.setCertification("uranium free");
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
