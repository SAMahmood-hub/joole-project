package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.ProductType;
import com.itlizeSession.joole.Repository.ProductTypeRepository;
import com.itlizeSession.joole.Service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeServiceImp implements ProductTypeService {
	@Autowired
	ProductTypeRepository productTypeRepository;

	@Override
	public ProductType create() {
		ProductType productType = new ProductType("abc", "bcd","cda","fgd",1999);
		productTypeRepository.save(productType);

		return productType;
	}



	@Override
	public ProductType update(ProductType productType) {

		productType.setUseType("abc");
		productType.setApplication("bbb");
		productType.setMountingLocation("aaa");
		productType.setAccessories("qqq");
		productType.setYear(2022);
		return productType;
	}

	@Override
	public void deleteByApplication(String application) {
		List<ProductType> list1 = productTypeRepository.findByApplication(application);
		for(ProductType pt : list1) {
			productTypeRepository.delete(pt);
		}

	}
}