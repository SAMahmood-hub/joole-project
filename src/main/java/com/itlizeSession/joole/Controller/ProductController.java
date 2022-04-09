package com.itlizeSession.joole.Controller;

import com.itlizeSession.joole.Config.LimitConfig;
import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;


@RestController
@RequestMapping("/controller")
public class ProductController {



	@Autowired
	private ProductService service;

	@Autowired
	private LimitConfig limitConfig;


	@GetMapping("/products")
	public List<Product> list() {
		return service.findAll();
	}


	@PostMapping("/products")
	public Product create(@RequestParam("brand") String brand,
							 @RequestParam("price") BigDecimal price,
	                         @RequestParam("type") String type,
						     @RequestParam("firm_specs") int firmSpecs,
						     @RequestParam("global_specs") int globalSpecs,
							 @RequestParam("certifications") String certifications) {
		Product product = new Product();
		product.setBrand(brand);
		product.setCertification(certifications);
		return service.update(1, product);
	}


	@GetMapping("/products/")
	public Product findById(@RequestParam("id") Integer id) {
		return service.findOneById(id);
	}


	@PutMapping("/products/")
	public Product update(@RequestParam("id") Integer id,
							 @RequestParam("type") String type) {
		Product product= service.findOneById(id);
		return service.update(1, product);
		}


	@PostMapping("/products/one")
	public void create() {
	}
}
