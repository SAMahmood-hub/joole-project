package com.itlizeSession.joole.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class ProductType {
	@Id
	@GeneratedValue
	private int productTypeId;

	@OneToOne(mappedBy = "type")
	private Product product;

	private String useType;

	private String application;

	private String mountingLocation;

	private String accessories;

	private int year;

	public ProductType(String useType) {
		this.useType = useType;
	}

	public ProductType(String useType, String application, String mountingLocation, String accessories, int year) {
		this.useType = useType;
		this.application = application;
		this.mountingLocation = mountingLocation;
		this.accessories = accessories;
		this.year = year;
	}


}