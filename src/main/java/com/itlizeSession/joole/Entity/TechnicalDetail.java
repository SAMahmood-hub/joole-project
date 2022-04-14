package com.itlizeSession.joole.Entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
	@JsonIgnore
	private Product product;

	//@Column(name="details")
	private String details;

	public TechnicalDetail() {

	}

	public TechnicalDetail(String details) {
		this.details = details;
	}

	public TechnicalDetail(Product prod, String details) {
		this.product = prod;
		this.details = details;
	}

}