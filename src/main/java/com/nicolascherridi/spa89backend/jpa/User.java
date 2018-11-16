package com.nicolascherridi.spa89backend.jpa;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private short id;

}
