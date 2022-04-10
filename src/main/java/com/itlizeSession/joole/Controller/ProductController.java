package com.itlizeSession.joole.Controller;

import com.itlizeSession.joole.Config.LimitConfig;
import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Entity.ProductType;
import com.itlizeSession.joole.Entity.ProjectProduct;
import com.itlizeSession.joole.Entity.TechnicalDetail;
import com.itlizeSession.joole.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


@RestController
@RequestMapping("/controller")
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping("/products")
	public List<Product> list() {
		return service.findAll();
	}

	@PostMapping("/products")
	public Product create(@RequestParam("brand") String brand,
	                         @RequestParam("type") String type,
						     @RequestParam("technical_details") String specs,
							 @RequestParam("certifications") String certifications) {
		return service.create(brand, certifications, specs, type);
	}


	@GetMapping("/products/")
	public Product findById(@RequestParam("id") Integer id) {
		return service.findOneById(id);
	}


	@PutMapping("/products/")
	public Product saveProject(@RequestBody Product product){
		return service.update(1, product);
	}


	@PostMapping("/products/")
	public void delete(@RequestParam("id") Integer id) {
		service.delete(id);
	}
}
