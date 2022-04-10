package com.itlizeSession.product.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
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
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @CreatedDate
    private Date time_created;

//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @LastModifiedDate
    private Date time_updated;

    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "user",
            cascade = {CascadeType.REMOVE})

    public User(String userName, String role, String password) {
        this.userName = userName;
        this.role =role;
        this.password =password;
    }


    private List<Project> project;
    //private List<Product> product;
}
