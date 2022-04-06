package com.itlizeSession.joole.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="resource_id")
	private int resourceId;

	@Column(name="product_type_id")
	private int productTypeId;

	@Column(name="technical_detail_id")
	private int technicalDetailId;

	@Column(name="mechanical_detail_id")
	private int mechanicalDetailId;

	@Column(name="certifications")
	private String certification;

	@Column(name="brand")
	private String brand;

	@OneToMany(mappedBy="prod", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JoinColumn(name="project_id")
	private Set<ProjectProduct> projectProduct;

	@Column(name="time_created")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp timeCreated;

	@Column(name="time_updated")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp timeUpdated;

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int id) {
		this.resourceId = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getTechnicalDetailId() {
		return technicalDetailId;
	}

	public void setTechnicalDetailId(int firmSpecs) {
		this.technicalDetailId = firmSpecs;
	}

	public int getMechanicalDetailId() {
		return mechanicalDetailId;
	}

	public void setMechanicalDetailId(int globalSpecs) {
		this.mechanicalDetailId = globalSpecs;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certifications) {
		this.certification = certifications;
	}

	public int getProductTypeId() {
		return productTypeId;
	}

	public void setProductTypeId(int product_type_id) {
		this.productTypeId = product_type_id;
	}

	public Set<ProjectProduct> getProjectProduct() {
		return projectProduct;
	}

	public void setProjectProduct(Set<ProjectProduct> projectProduct) {
		this.projectProduct = projectProduct;
	}

	public Timestamp getTimeCreated() {
		return timeCreated;
	}

	public void setTimeCreated(Timestamp time_created) {
		this.timeCreated = time_created;
	}

	public Timestamp getTimeUpdated() {
		return timeUpdated;
	}

	public void setTimeUpdated(Timestamp time_updated) {
		this.timeUpdated = time_updated;
	}

}
