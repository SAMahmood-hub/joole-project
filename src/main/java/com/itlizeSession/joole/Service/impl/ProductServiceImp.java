package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Repository.ProductRepository;
import com.itlizeSession.joole.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
		Product prod = new Product(brand, certification, techDetail, prodType);
		return repository.save(prod);
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

	public void deleteAll() {
		repository.deleteAll();
	}
}
