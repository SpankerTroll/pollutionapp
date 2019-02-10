package com.bartmont.pollutionapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {

    @Id
    private int id;
    private String name;
    private boolean isCapital;

    public City(int id, String name, boolean isCapital) {
        this.id = id;
        this.name = name;
        this.isCapital = isCapital;
    }
    public City(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

}

