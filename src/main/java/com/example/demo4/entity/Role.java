package com.example.demo4.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "role")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Role {
    //Table
    @Id
    @Column (name ="role_id")
    private Long roleId;


    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;



}
