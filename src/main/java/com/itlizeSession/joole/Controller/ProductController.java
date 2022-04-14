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
		List<Product> prodList;
		try {
			prodList = service.findAll();
		} catch(Exception e) {
			return new ResponseEntity<>("{\"error\":\""+e.getMessage() + "\"}", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(prodList, HttpStatus.CREATED);
	}


	@PutMapping(path="/create")
	public ResponseEntity<?> create(@RequestParam("brand") String brand,
	                         @RequestParam("type") String type,
						     @RequestParam("tech") String specs,
							 @RequestParam("cert") String certifications) {
		try {
			service.create(brand, certifications, specs, type);
		} catch(Exception e) {
			return new ResponseEntity<>("{\"error\":\""+e.getMessage() + "\"}", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}


	@GetMapping(path="/get")
	public ResponseEntity<?> findById(@RequestParam("id") Integer id) {
		Product prod;
		try {
			prod = service.findOneById(id);
		} catch(Exception e) {
			return new ResponseEntity<>("{\"error\":\""+e.getMessage() + "\"}", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(prod, HttpStatus.CREATED);
	}


	@PutMapping(path="/save")
	public ResponseEntity<?> save(@RequestBody Product product, @RequestParam Integer id){
		try {
			service.update(id, product);
		} catch(Exception e) {
			return new ResponseEntity<>("{\"error\":\""+e.getMessage() + "\"}", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}


	@DeleteMapping(path="/delete")
	public ResponseEntity<?> delete(@RequestParam("id") Integer id) {
		try {
			service.delete(id);
		} catch(Exception e) {
			return new ResponseEntity<>("{\"error\":\""+e.getMessage() + "\"}", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
