package com.example.demo4.entity;

import lombok.*;
import javax.persistence.*;
import java.awt.font.NumericShaper;
import java.sql.Date;

@Entity
@Table(name = "task")
@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Task {

    @Id
    @Column(name = "task_id")
    private Long taskId;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id", referencedColumnName = "subject_id") //FOREIGN KEY
    private Subject subject; //May be Wrong

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id", referencedColumnName = "author_id") //FOREIGN KEY
    private User user;  //May be Wrong

    @Column(name = "description")
    private String description;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "priority")
    private NumericShaper priority; //NUMERIC

    @Column(name = "status")
    private String status;



}
