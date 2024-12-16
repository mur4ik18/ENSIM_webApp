package com.ccp.tp3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    private Date creation;
    private String content;
    private String name;


    public Long getId() {
        return id;
    }

    public Date getCreation() {
        return creation;
    }

    public String getContent() {
        return content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
