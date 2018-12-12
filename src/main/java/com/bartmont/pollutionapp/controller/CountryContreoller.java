package com.bartmont.pollutionapp.controller;

import com.bartmont.pollutionapp.Service.CountryService;
import com.bartmont.pollutionapp.classes.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/Countrys")
    public void addCountry (@RequestBody Country country){
        countryService.addCountry(country);
    }

    @PutMapping("/Countrys/{id}")
    public void updateCountry(@PathVariable int id, @RequestBody Country country){
        countryService.updateCountry(id,country);
    }

    @DeleteMapping("/Countrys/{id}")
    public void deleteCountry(@PathVariable int id){
        countryService.deleteCountry(id);
    }
}