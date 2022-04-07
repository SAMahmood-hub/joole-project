package com.itlizeSession.product.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString


public class User {

    @Id
    private String userName;
    private String role;
    //encoded password
    private String password;
//    private Date time_created;
//    private Date time_updated;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time_created;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time_updated;

    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "user",
            cascade = {CascadeType.REMOVE})


    private List<Project> project;
    //private List<Product> product;
}
