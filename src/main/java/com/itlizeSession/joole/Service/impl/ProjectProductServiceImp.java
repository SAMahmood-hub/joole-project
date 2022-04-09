package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Entity.ProjectProduct;
import com.itlizeSession.joole.Repository.ProjectProductRepository;
import com.itlizeSession.joole.Service.ProjectProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Service
public class ProjectProductServiceImp implements ProjectProductService {


	@Autowired
	private ProjectProductRepository repository;

	@Override
	public ProjectProduct findOneById(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<ProjectProduct> findAll() {
		return repository.findAll();
	}

	@Transactional
	public ProjectProduct create(ProjectProduct myPP) {
		return repository.save(myPP);
	}

	@Transactional
	public ProjectProduct update(Integer id, ProjectProduct updateProjectProduct) {
		return repository.save(updateProjectProduct);
    }
	@Transactional
	public void delete(Integer id) {
		repository.delete(findOneById(id));
		System.out.println(id + " deleted");

	}
	@Transactional
	public ProjectProduct read(Integer id) {
		System.out.println(findOneById(id));
		return findOneById(id);
	}
}
