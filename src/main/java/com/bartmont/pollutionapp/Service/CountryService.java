package com.bartmont.pollutionapp.Service;

import com.bartmont.pollutionapp.entity.Country;
import com.bartmont.pollutionapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;


    public List<Country> getAllCountrys(){
        List<Country> countries = new ArrayList<>();
        countryRepository.findAll()
                .forEach(countries::add);
        return countries;
    }

    public Country getCountryById(int id){
        //return countries.stream().filter(t -> t.getId()==id).findFirst().get();
        return countryRepository.findById(id).get();
    }

    public void addCountry(Country country){
        //countries.add(country);
        countryRepository.save(country);
    }

    public void updateCountry(int id, Country country){
        /*for(int i = 0; i< countries.size(); i++){
            Country c = countries.get(i);
            if(c.getId()==id){
                countries.set(i,country);
                return;
            } */
        countryRepository.save(country);
        }

    public void deleteCountry(int id){
        /*for(int i = 0; i< countries.size(); i++){
            Country c = countries.get(i);
            if(c.getId()==id){
                countries.remove(i);
                return;
            }
        }*/
        countryRepository.deleteById(id);
    }
}
