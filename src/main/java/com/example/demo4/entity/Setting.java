package com.example.demo4.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "setting")
@Data
@NoArgsConstructor
@ToString

public class Setting {

    @Id
    @Column(name = "setting_id")
    private Long settingId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id") //FOREIGN KEY
    private User user;

    @Column(name = "email_subscription")
    private boolean emailSubscription;

    @Column(name = "push_subscription")
    private boolean pushSubscription;

}
