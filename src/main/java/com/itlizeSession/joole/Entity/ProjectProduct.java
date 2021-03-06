package com.itlizeSession.joole.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
//@Table(name="projectproduct")
public class ProjectProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="pp_id")
	private int ppID;

	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.PERSIST)
	//@JoinColumn(name = "resource_id")
	private Product prod;

	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.PERSIST)
	//@JoinColumn(name = "project_id")
	private Project proj;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	//@Column(name="time_created")
	private Timestamp timeCreated;

	public int getPpID() {
		return ppID;
	}

	public void setPpID(int pp_id) {
		this.ppID = pp_id;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}

	public Project getProj() {
		return proj;
	}

	public void setProj(Project proj) {
		this.proj = proj;
	}

	public Timestamp getTimeCreated() {
		return timeCreated;
	}

	public void setTimeCreated(Timestamp timeCreated) {
		this.timeCreated = timeCreated;
	}

	public String toString() {
		return "ID: " + ppID;
	}

	public ProjectProduct(ProjectProduct other) {
		this.ppID = other.ppID;
		this.prod = other.prod;
		this.proj = other.proj;
		this.timeCreated = new Timestamp(System.currentTimeMillis());
	}

	public ProjectProduct(Project proj, Product prod) {
		this.proj = proj;
		this.prod = prod;
	}

}
