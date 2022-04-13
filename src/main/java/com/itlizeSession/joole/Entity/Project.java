package com.itlizeSession.joole.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
//@Table(name="project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	//@Column(name="project_id")
	private int id;

	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.MERGE)
	private User owner;

	//@Column(name="time_created")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp timeCreated;

	//@Column(name="time_updated")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp timeUpdated;

	@OneToMany(mappedBy = "proj", fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	//@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JoinColumn(name="project_id")
	Set<ProjectProduct> productProject;


	public Project( User owner,Timestamp timeCreated, Timestamp timeUpdated) {
		this.owner = owner;
		this.timeCreated = timeCreated;
		this.timeUpdated = timeUpdated;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public Set<ProjectProduct> getProjectProduct() {
		return productProject;
	}
	public void setProjectProduct(Set<ProjectProduct> projectProduct) {
		this.productProject = projectProduct;
	}
	public Timestamp getTimeCreated() {
		return timeCreated;
	}

	public void setTimeCreated(Timestamp timeCreated) {
		this.timeCreated = timeCreated;
	}

	public Timestamp getTimeUpdated() {
		return timeUpdated;
	}

	public void setTimeUpdated(Timestamp timeUpdated) {
		this.timeUpdated = timeUpdated;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", owner=" + owner + ", timeCreated=" + timeCreated + ", timeUpdated="
				+ timeUpdated + ", projectProduct=" + productProject + "]";
	}



}
