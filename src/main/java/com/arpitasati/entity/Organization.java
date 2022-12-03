package com.arpitasati.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String organizationName;
    @OneToOne
    private User owner;
    @OneToMany
    private List<User> admins;
    @OneToMany
    private List<User> users;
}
