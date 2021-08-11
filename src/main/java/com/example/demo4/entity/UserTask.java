package com.example.demo4.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "user_task")
@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserTask {
    //Table

    @Id
    @Column(name = "user_task_id")
    private int userTaskId;

    @JoinColumn(name = "user_id")
    private Long userId;

    @JoinColumn(name = "task_id")
    private Long taskId;

    @Column(name = "status")
    private String status;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "executed_time")
    private Date executedTime; //Datetime

}
