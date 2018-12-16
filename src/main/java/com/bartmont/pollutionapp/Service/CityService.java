package com.bartmont.pollutionapp.Service;

import com.bartmont.pollutionapp.entity.City;
import com.bartmont.pollutionapp.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> getAllCitys(){
        List<City> citys = new ArrayList<>();
        cityRepository.findAll()
                .forEach(citys::add);
        return citys;
    }

    public City getCityById(int id){
        return cityRepository.findById(id).get();
    }

    public void addCity(City city){
        cityRepository.save(city);
    }

    public void updateCity(int id, City city){
        /*for(int i = 0; i< countries.size(); i++){
            Country c = countries.get(i);
            if(c.getId()==id){
                countries.set(i,country);
                return;
            } */
        cityRepository.save(city);
        }

    public void deleteCity(int id){
        /*for(int i = 0; i< countries.size(); i++){
            Country c = countries.get(i);
            if(c.getId()==id){
                countries.remove(i);
                return;
            }
        }*/
        cityRepository.deleteById(id);
    }
}
