package com.bartmont.pollutionapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    @Id
    @GeneratedValue
    private Long id;
    private String type;

    @OneToOne(cascade= CascadeType.ALL)
    private Value value;

    public Quote(){

    }

    public Quote(String type, Value value) {
        this.type = type;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
