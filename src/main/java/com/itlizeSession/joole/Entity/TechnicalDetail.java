package com.itlizeSession.joole.Entity;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
//@Table(name="technical_detail")
public class TechnicalDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="id")
	private int id;

	@OneToOne(mappedBy="technicalDetail")
	private Product product;

	//@Column(name="details")
	private String details;

	public TechnicalDetail() {

	}

	public TechnicalDetail(String details) {
		super();
		this.details = details;
	}

}