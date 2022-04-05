package com.itlizeSession.product.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_TBL")

public class User {

    @Id

    private String user_name;
    private String role;
    //encoded password
    private String password;
//    private Date time_created;
//    private Date time_updated;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time_created;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time_updated;

}
