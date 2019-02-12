package com.bartmont.pollutionapp.controller;

import com.bartmont.pollutionapp.Service.ResultService;
import com.bartmont.pollutionapp.entity.City;
import com.bartmont.pollutionapp.entity.Polutions;
import com.bartmont.pollutionapp.entity.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {


    @Autowired
    private ResultService resultService;

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("city",new City());
        return "index";
    }

    @RequestMapping("/adding")
    @ResponseBody
    public String pm25(@ModelAttribute City city){
        return resultService.getValue(city.getName());
    }

    @PostMapping("/City")
    public String city(@ModelAttribute City city){
        city.setPm25(resultService.getValue(city.getName()));
        city.setPm25f(Float.valueOf(resultService.getValue(city.getName())));
        return "city";
    }
}
