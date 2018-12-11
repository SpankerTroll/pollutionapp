package com.bartmont.pollutionapp.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CountryService {

    private List<Country> result = Arrays.asList(
            new Country("Poland","Warsaw",1),
            new Country("Germany","Berlin",2)
    );

    public List<Country> getAllCountrys(){
        return result;
    }
    public Country getCountryById(int id){
        return result.stream().filter(t -> t.getId()==id).findFirst().get();
    }
}
