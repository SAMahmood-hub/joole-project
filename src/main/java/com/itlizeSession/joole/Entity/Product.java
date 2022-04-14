package com.itlizeSession.joole.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
//@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="resource_id")
	private int resourceId;

	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "product_type_id")
	private ProductType type;

	//@Column(name="technical_detail_id")
	@OneToOne(cascade = CascadeType.ALL)
	private TechnicalDetail technicalDetail;

	//@Column(name="certifications")
	private String certification;

	//@Column(name="brand")
	private String brand;

	@OneToMany(mappedBy="prod", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JoinColumn(name="project_id")
	@JsonIgnore
	private Set<ProjectProduct> projectProduct;

	//@Column(name="time_created")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp timeCreated;

	//@Column(name="time_updated")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp timeUpdated;

	public Product(String brand, String certification, String techDetail, String prodType) {
		this.brand = brand;
		this.certification = certification;
		this.technicalDetail = new TechnicalDetail(this, techDetail);
		this.type = new ProductType(this, prodType);
		this.timeCreated = new Timestamp(System.currentTimeMillis());
		this.timeUpdated = new Timestamp(System.currentTimeMillis());
	}

	public Product(int id, String brand, String certification, String techDetail, String prodType) {
		this.brand = brand;
		this.certification = certification;
		this.technicalDetail = new TechnicalDetail(this, techDetail);
		this.type = new ProductType(this, prodType);
		this.resourceId = id;
		this.timeCreated = new Timestamp(System.currentTimeMillis());
		this.timeUpdated = new Timestamp(System.currentTimeMillis());
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int id) {
		this.resourceId = id;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certifications) {
		this.certification = certifications;
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

	public String toString() {
		return "ID: " + resourceId + "\nBrand: " + brand + "\nCertification: " + certification +"\nTime Created: " + timeCreated +"\nTime Updated: " + timeUpdated + "";
	}

}
