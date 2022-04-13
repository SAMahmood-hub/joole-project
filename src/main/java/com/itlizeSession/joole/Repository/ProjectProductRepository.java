package com.itlizeSession.joole.Repository;

import com.itlizeSession.joole.Entity.ProjectProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectProductRepository extends JpaRepository<ProjectProduct, Integer> {
}
