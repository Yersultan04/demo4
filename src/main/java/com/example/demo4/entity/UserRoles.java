package com.example.demo4.entity;


import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "user_roles")
@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserRoles {
    //Table
 @Id
 @Column (name="user_roles_id")
 private Long userRoleId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", referencedColumnName = "role_id") //FOREIGN KEY
    private Role role;//May be Wrong

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id") //FOREIGN KEY
    private User user;//May be Wrong

    //  \\Table\\




}

