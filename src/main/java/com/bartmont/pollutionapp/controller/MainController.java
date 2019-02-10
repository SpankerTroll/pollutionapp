package com.bartmont.pollutionapp.controller;

import com.bartmont.pollutionapp.entity.City;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    String cityName;

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("city",new City());
        return "index";
    }

    @PostMapping("/City")
    public String city(@ModelAttribute City city){

        return "city";
    }
}
