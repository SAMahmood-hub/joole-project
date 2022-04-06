package com.itlizeSession.joole.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


import static javax.persistence.CascadeType.ALL;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User")
public class User {

	@Id
	private String user_name;
	private String role;
	//encoded password
	private String password;
	//    private Date time_created;
//    private Date time_updated;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp time_created;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp time_updated;

	@OneToMany(targetEntity = Product.class, cascade = ALL)
	@JoinColumn(name = "up_fk", referencedColumnName = "id")
	private List<Product> products;

}