package com.itlizeSession.joole.Service;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Entity.ProjectProduct;

import java.util.List;

public interface ProjectProductService {

    ProjectProduct findOneById(Integer Id);

    List<ProjectProduct> findAll();

    public ProjectProduct create(ProjectProduct myPP);

    ProjectProduct update(Integer id, ProjectProduct updateProjectProduct);

    void delete(Integer Id);

    ProjectProduct read(Integer Id);

}
