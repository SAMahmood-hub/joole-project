package com.itlizeSession.product.Controller;

import com.itlizeSession.product.Config.LimitConfig;
import com.itlizeSession.product.Entity.Product;
import com.itlizeSession.product.Service.ProductService;
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
		product.setTechnical_detail_id(firmSpecs);
		product.setMechanical_detail_id(globalSpecs);
		return service.save(product);
	}


	@GetMapping("/products/")
	public Product findById(@RequestParam("id") Integer id) {
		return service.findOneById(id);
	}


	@PutMapping("/products/")
	public Product update(@RequestParam("id") Integer id,
							 @RequestParam("type") String type) {
		Product product= service.findOneById(id);
			return service.save(product);
		}


	@PostMapping("/products/two")
	public void createTwo() {
		service.createTwo();
	}
}
