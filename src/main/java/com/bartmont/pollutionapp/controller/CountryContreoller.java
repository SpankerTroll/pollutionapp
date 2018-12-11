package com.bartmont.pollutionapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryContreoller {
    @Autowired
    private CountryService countryService;

    @RequestMapping("/Countrys")
    public List<Country> getAllCountrys() {
        return countryService.getAllCountrys();
    }

    @GetMapping("/Countrys/{id}")
    public Country getCountryById(@PathVariable int id){
        return countryService.getCountryById(id);
    }
}