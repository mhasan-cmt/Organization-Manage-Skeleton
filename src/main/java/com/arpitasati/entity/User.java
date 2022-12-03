package com.arpitasati.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String email;
    private String username;
    @OneToMany
    List<Organization> organizationList;
    private String password;
    public enum Role {
        OWNER, ADMIN, USER
    }
}
