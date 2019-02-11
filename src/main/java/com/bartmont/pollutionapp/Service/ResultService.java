package com.bartmont.pollutionapp.Service;


import com.bartmont.pollutionapp.entity.Polutions;
import com.bartmont.pollutionapp.entity.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ResultService {

    @Autowired
    private RestTemplate restTemplate;

    public String getValue(String cityName){
        String URL ="https://api.openaq.org/v1/measurements?city="+cityName+"&limit=1&parameter=pm25";
        Polutions polutions = restTemplate.getForObject(URL,Polutions.class);
        Results results = polutions.getResults()[0];
        return results.getValue();
    }



}
