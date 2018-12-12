package com.bartmont.pollutionapp.classes;

public class Country {
    private String name;
    private String capitalName;
    private int id;

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
