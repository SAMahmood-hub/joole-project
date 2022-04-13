package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.TechnicalDetail;
import com.itlizeSession.joole.Repository.TechnicalDetailRepository;
import com.itlizeSession.joole.Service.TechnicalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnicalDetailServiceImp implements TechnicalDetailService {
	@Autowired
	private TechnicalDetailRepository technicalDetailRepository;

	@Override
	public TechnicalDetail saveTechnicalDetail(TechnicalDetail technicalDetail){
		return technicalDetailRepository.save(technicalDetail);
	}

	@Override
	public List<TechnicalDetail> fetchTechnicalDetailList() {
		return technicalDetailRepository.findAll();
	}

	@Override
	public TechnicalDetail fetchTechnicalDetailById(Integer id) {
		return technicalDetailRepository.findById(id).get();
	}

	@Override
	public void deleteTechnicalDetailById(Integer id) {
		technicalDetailRepository.deleteById(id);
	}

	@Override
	public TechnicalDetail updateTechnicalDetailById(TechnicalDetail technicalDetail) {
		return technicalDetailRepository.save(technicalDetail);
	}
}