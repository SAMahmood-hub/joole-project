package com.itlizeSession.joole.Controller;

import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {
	@Autowired
	private ProjectService projectService;

	@PostMapping("/project")
	public Project saveProject(@RequestBody Project project){
		return projectService.saveProject(project);
	}

	@GetMapping("/project")
	public List<Project> fetchProjectList(){
		return projectService.fetchProjectList();
	}

	@GetMapping("/project/{id}")
	public Project fetchProjectById(@PathVariable("id") Integer id){
		return projectService.fetchProjectById(id);
	}

	@DeleteMapping("/project/{id}")
	public String deleteProject(@PathVariable("id") Integer id){
		projectService.deleteProjectById(id);
		return "Project deleted successfully";
	}
	@PutMapping("/project")
	public Project updateProject(@RequestBody Project project){
		return projectService.saveProject(project);
	}
}
