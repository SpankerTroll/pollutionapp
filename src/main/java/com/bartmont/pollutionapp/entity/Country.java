package com.bartmont.pollutionapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
    @Id
    private int id;
    private String name;
    private String capitalName;

    public Country(String name, String capitalName, int id) {
        this.name = name;
        this.capitalName = capitalName;
        this.id = id;
    }

    public Country() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
