package com.itlizeSession.joole.Repository;

import com.itlizeSession.joole.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer>{

}