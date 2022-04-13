package com.itlizeSession.joole.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itlizeSession.joole.Entity.TechnicalDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicalDetailRepository extends JpaRepository<TechnicalDetail, Integer>{

}