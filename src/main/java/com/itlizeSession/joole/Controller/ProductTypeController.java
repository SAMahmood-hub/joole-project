package com.itlizeSession.joole.Controller;


import com.itlizeSession.joole.Entity.ProductType;
import com.itlizeSession.joole.Service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productTypeController")
public class ProductTypeController {
	@Autowired
	ProductTypeService productTypeService;
	@PostMapping("/save")
	public ResponseEntity<?> saveProductType (@RequestBody ProductType productType) {
		try{
			productTypeService.saveProductType(productType);
		} catch(Exception e) {
			return new ResponseEntity<>("{\"error\":\""+e.getMessage() + "\"}", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PostMapping("/get")
	public ResponseEntity<?> getProductType () {
		try{
			productTypeService.getProductTypeList();
		} catch(Exception e) {
			return new ResponseEntity<>("{\"error\":\""+e.getMessage() + "\"}", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<?> updateProductType(@RequestBody ProductType productType) {
		productTypeService.updateProductType(productType);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteProductType(@RequestParam(name = "id") Integer id) {
		productTypeService.deleteProductTypeById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
