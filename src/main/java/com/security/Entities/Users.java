package com.security.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity @Table(name = "user")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;
    @Column(unique = true)
    private String username;
    private String password;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "role_id",referencedColumnName = "id")
    private Roles role;
}
