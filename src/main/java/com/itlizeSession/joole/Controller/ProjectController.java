package com.itlizeSession.joole.Controller;

import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
	@Autowired
	private ProjectService projectService;

	@PostMapping(path="/save")
	public Project saveProject(@RequestBody Project project){
		return projectService.saveProject(project);
	}

	@GetMapping(path="/list")
	public List<Project> fetchProjectList(){
		return projectService.fetchProjectList();
	}

	@GetMapping(path="/fetch/{id}")
	public Project fetchProjectById(@PathVariable("id") Integer id){
		return projectService.fetchProjectById(id);
	}

	@DeleteMapping(path="/delete/{id}")
	public String deleteProject(@PathVariable("id") Integer id){
		projectService.deleteProjectById(id);
		return "Project deleted successfully";
	}
	@PutMapping(path="/save")
	public Project updateProject(@RequestBody Project project){
		return projectService.saveProject(project);
	}
}
