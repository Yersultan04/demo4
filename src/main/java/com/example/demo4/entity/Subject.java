package com.example.demo4.entity;


import javax.persistence.Column;
import javax.persistence.Id;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "subject")
@Data
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Subject {

    @Id
    @Column(name = "subject_id")
    private Long subjectId;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;

   }
