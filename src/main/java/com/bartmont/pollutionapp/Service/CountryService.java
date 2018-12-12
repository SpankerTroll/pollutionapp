package com.bartmont.pollutionapp.Service;

import com.bartmont.pollutionapp.classes.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CountryService {

    private List<Country> result = new ArrayList<>(Arrays.asList(
            new Country("Poland","Warsaw",1),
            new Country("Germany","Berlin",2)
    ));

    public List<Country> getAllCountrys(){
        return result;
    }
    public Country getCountryById(int id){
        return result.stream().filter(t -> t.getId()==id).findFirst().get();
    }
    public void addCountry(Country country){
        result.add(country);
    }
    public void updateCountry(int id, Country country){
        for(int i=0;i<result.size();i++){
            Country c = result.get(i);
            if(c.getId()==id){
                result.set(i,country);
                return;
            }
        }
    }
    public void deleteCountry(int id){
        for(int i=0;i<result.size();i++){
            Country c = result.get(i);
            if(c.getId()==id){
                result.remove(i);
                return;
            }
        }
    }
}
