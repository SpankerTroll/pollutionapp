package com.bartmont.pollutionapp.controller;

import com.bartmont.pollutionapp.Service.ResultService;
import com.bartmont.pollutionapp.entity.City;
import com.bartmont.pollutionapp.entity.Polutions;
import com.bartmont.pollutionapp.entity.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;


@Controller
public class MainController {

    static Logger logger = Logger.getLogger(MainController.class.getName());

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
        String cityName = city.getName();

        return resultService.getValue(cityName);
    }

    @PostMapping("/City")
    public String city(@ModelAttribute City city){

        String cityName = city.getName();
        if(Character.isLowerCase(cityName.charAt(0))){
            char ch = cityName.charAt(0);
            int temp = (int)ch;
            temp-=32;
            ch = (char)temp;
            city.setName( ch + cityName.substring(1));
        }


        if(Float.valueOf(resultService.getValue(city.getName()))== -999.0f){
            city.setPm25("No data");
            city.setPm25f(0.0f);
            //logger.info("if");
        }
        else {
            city.setPm25(resultService.getValue(city.getName()));
            city.setPm25f(Float.valueOf(resultService.getValue(city.getName())));
            //logger.info("else");
        }
        return "city";
    }
}
