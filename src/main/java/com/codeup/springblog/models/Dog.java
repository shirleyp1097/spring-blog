package com.codeup.springblog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long age;
    private String name;
    private String resideState;




    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
