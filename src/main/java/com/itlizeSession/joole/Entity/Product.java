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
@Table(name="Product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="resource_id")
	private int resource_id;

	@Column(name="product_type_id")
	private int product_type_id;

	@Column(name="technical_detail_id")
	private int technical_detail_id;

	@Column(name="mechanical_detail_id")
	private int mechanical_detail_id;

	@Column(name="certification")
	private String certification;

	@Column(name="brand")
	private String brand;

	@OneToMany(mappedBy="prod", fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	@JoinColumn(name="project_id")
	private Set<ProjectProduct> projectProduct;

	@Column(name="time_created")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp time_created;

	@Column(name="time_updated")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp time_updated;

	public int getResource_id() {
		return resource_id;
	}

	public void setResource_id(int id) {
		this.resource_id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getTechnical_detail_id() {
		return technical_detail_id;
	}

	public void setTechnical_detail_id(int firmSpecs) {
		this.technical_detail_id = firmSpecs;
	}

	public int getMechanical_detail_id() {
		return mechanical_detail_id;
	}

	public void setMechanical_detail_id(int globalSpecs) {
		this.mechanical_detail_id = globalSpecs;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certifications) {
		this.certification = certifications;
	}

	public int getProduct_type_id() {
		return product_type_id;
	}

	public void setProduct_type_id(int product_type_id) {
		this.product_type_id = product_type_id;
	}

	public Set<ProjectProduct> getProjectProduct() {
		return projectProduct;
	}

	public void setProjectProduct(Set<ProjectProduct> projectProduct) {
		this.projectProduct = projectProduct;
	}

	public Timestamp getTime_created() {
		return time_created;
	}

	public void setTime_created(Timestamp time_created) {
		this.time_created = time_created;
	}

	public Timestamp getTime_updated() {
		return time_updated;
	}

	public void setTime_updated(Timestamp time_updated) {
		this.time_updated = time_updated;
	}

}
