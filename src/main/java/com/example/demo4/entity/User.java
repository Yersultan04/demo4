package com.example.demo4.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "user")
@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    //Table
    @Id
    @Column(name = "user_id")
    private Long userId;    //PK

    @Column(name = "email")
    private String email;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "sex")
    private String sex;

    @Column(name = "birthdate")
    private Date birthdate; //Datetime




}
