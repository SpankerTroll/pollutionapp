package com.bartmont.pollutionapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Value {

    @Id
    private Long id;
    private String quote;

    public Value(Long id, String quote) {
        this.id = id;
        this.quote = quote;
    }

    public Value() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
