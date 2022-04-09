package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Repository.ProjectRepository;
import com.itlizeSession.joole.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImp implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	@Override
	public Project saveProject(Project project) {

		return projectRepository.save(project);
	}
	@Override
	public List<Project> fetchProjectList() {

		return projectRepository.findAll();
	}
	@Override
	public Project fetchProjectById(Integer id) {

		return projectRepository.findById(id).get();
	}
	@Override
	public void deleteProjectById(Integer id) {
		projectRepository.deleteById(id);

	}
	@Override
	public Project updateProjectById(Project project) {

		return projectRepository.save(project);
	}

}