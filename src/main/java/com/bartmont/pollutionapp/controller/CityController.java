package com.bartmont.pollutionapp.controller;

import com.bartmont.pollutionapp.Service.CityService;
import com.bartmont.pollutionapp.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping("/Citys")
    public List<City> getAllCitys() {
        return cityService.getAllCitys();
    }

    @GetMapping("/Citys/{id}")
    public City getCitybyId(@PathVariable int id){
        return cityService.getCityById(id);
    }

    @PostMapping("/Citys")
    public void addCity (@RequestBody City city){
        cityService.addCity(city);
    }

    @PutMapping("/Citys/{id}")
    public void updateCity(@PathVariable int id, @RequestBody City city){
        cityService.updateCity(id,city);
    }

    @DeleteMapping("/Citys/{id}")
    public void deleteCity(@PathVariable int id){
        cityService.deleteCity(id);
    }
}