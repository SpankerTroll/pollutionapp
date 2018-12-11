package com.bartmont.pollutionapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryContreoller {
    @RequestMapping("getCountrys")
    public List<Country> getCountrys() {
        List<Country> result = new ArrayList<>();

        result.add(new Country("Poland", "Warsaw", 1));
        result.add(new Country("Germany", "Berlin", 2));

        return result;
    }
}