package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.Product;
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
	public ProductType create(Product prod, String useType, String app, String mountingLocation, String accessories, int year) {
		ProductType productType = new ProductType(prod, useType, app,mountingLocation,accessories,year);
		productTypeRepository.save(productType);

		return productType;
	}

	@Override
	public ProductType saveProductType(ProductType productType) {
		return productTypeRepository.save(productType);
	}

	@Override
	public List<ProductType> getProductTypeList() {
		return productTypeRepository.findAll();
	}

	@Override
	public ProductType updateProductType(ProductType productType) {

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

	@Override
	public void deleteProductTypeById(Integer id) {
		productTypeRepository.deleteById(id);

	}
}