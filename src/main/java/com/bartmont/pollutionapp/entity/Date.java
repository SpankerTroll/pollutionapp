package com.bartmont.pollutionapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Date
{
    @Id
    @GeneratedValue
    private Long id;

    private String utc;

    private String local;

    public String getUtc ()
    {
        return utc;
    }

    public void setUtc (String utc)
    {
        this.utc = utc;
    }

    public String getLocal ()
    {
        return local;
    }

    public void setLocal (String local)
    {
        this.local = local;
    }

}
