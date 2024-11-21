package com.bookreview.booknook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name= "user")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @Column(name="user_id", length=45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(name = "user_name", length = 200, nullable = false)
    private String userName;

    @Column(name = "password", length = 200, nullable = false)
    private String password;

    @Column(name = "email", length = 10, nullable = false)
    private String email;

}
