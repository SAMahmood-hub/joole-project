package com.itlizeSession.joole.Controller;

import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Entity.ProjectProduct;
import com.itlizeSession.joole.Service.ProjectProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/controller")
public class ProjectProductController {

	@Autowired
	private ProjectProductService service;

	@GetMapping("/projectproducts")
	public List<ProjectProduct> list() {
		return service.findAll();
	}

	@PostMapping("/projectproducts")
	public ProjectProduct create() {
		return service.create(new ProjectProduct());
	}


	@GetMapping("/projectproducts/")
	public ProjectProduct findById(@RequestParam("id") Integer id) {
		return service.findOneById(id);
	}


	@PutMapping("/projectproducts/")
	public ProjectProduct saveProject(@RequestBody ProjectProduct projectProduct){
		return service.update(1, projectProduct);
	}


	@PostMapping("/projectproducts/")
	public void delete(@RequestParam("id") Integer id) {
		service.delete(id);
	}
}
