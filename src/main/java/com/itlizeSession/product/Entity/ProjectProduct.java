package com.itlizeSession.product.Entity;

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
@Table(name="ProjectProduct")
public class ProjectProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pp_id;

	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name = "resource_id")
	private Product prod;

	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name = "project_id")
	private Project proj;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp time_created;

	public int getPp_id() {
		return pp_id;
	}

	public void setPp_id(int pp_id) {
		this.pp_id = pp_id;
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

	public Timestamp getTime_created() {
		return time_created;
	}

	public void setTime_created(Timestamp time_created) {
		this.time_created = time_created;
	}

}
