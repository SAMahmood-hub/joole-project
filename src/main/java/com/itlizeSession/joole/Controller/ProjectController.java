package com.itlizeSession.joole.Controller;

import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
	@Autowired
	private ProjectService projectService;

	@PostMapping(path="/save")
	public ResponseEntity<?> saveProject(@RequestBody Project project){
		try{
			projectService.saveProject(project);
		} catch(Exception e) {
			return new ResponseEntity<>("{\"error\":\""+e.getMessage() + "\"}", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping(path="/list")
	public ResponseEntity<?> fetchProjectList(){
		try{
			projectService.fetchProjectList();
		} catch(Exception e) {
			return new ResponseEntity<>("{\"error\":\""+e.getMessage() + "\"}", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping(path="/fetch/{id}")
	public ResponseEntity<?>  fetchProjectById(@PathVariable("id") Integer id){
		try{
			projectService.fetchProjectById(id);
		} catch(Exception e) {
			return new ResponseEntity<>("{\"error\":\""+e.getMessage() + "\"}", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@DeleteMapping(path="/delete/{id}")
	public ResponseEntity<?> deleteProject(@PathVariable("id") Integer id){
		projectService.deleteProjectById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@PutMapping(path="/save")
	public ResponseEntity<?> updateProject(@RequestBody Project project){
		projectService.saveProject(project);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
