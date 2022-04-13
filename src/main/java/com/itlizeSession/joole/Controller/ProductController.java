package com.itlizeSession.joole.Controller;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping(path="/list")
	public ResponseEntity<?> list() {
		service.create("hello", "hi", "its", "me");
		System.out.println(service.findOneById(1));
		List<Product> prod;
		try {
			prod = service.findAll();
		} catch(Exception e) {
			return new ResponseEntity<>("{\"error\":\""+e.getMessage() + "\"}", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(prod, HttpStatus.CREATED);
	}

	@GetMapping(path="/create")
	public Product create(@RequestParam("brand") String brand,
	                         @RequestParam("type") String type,
						     @RequestParam("technical_details") String specs,
							 @RequestParam("certifications") String certifications) {
		return service.create(brand, certifications, specs, type);
	}


	@GetMapping(path="/get")
	public Product findById(@RequestParam("id") Integer id) {
		return service.findOneById(id);
	}


	@PutMapping(path="/save")
	public Product saveProject(@RequestBody Product product){
		return service.update(1, product);
	}


	@PostMapping(path="/delete")
	public void delete(@RequestParam("id") Integer id) {
		service.delete(id);
	}
}
