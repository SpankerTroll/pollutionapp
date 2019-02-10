package com.bartmont.pollutionapp.controller;

import com.bartmont.pollutionapp.Service.QuoteService;
import com.bartmont.pollutionapp.entity.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class QuoteRemoteController {

    @Autowired
    private QuoteService quoteService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/Quotess")
    public Quote getRanndomQuote() {
        return restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random",Quote.class);
    }

    @RequestMapping("/Quotes2")
    public List<Quote> getAllQuotes() {
        return quoteService.getAllQuotes();
    }

    @RequestMapping("/Quotes3")
    public void addQuote (){

        for(int i=0;i<1000;i++) {
            try {
                quoteService.addQuote(restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class));
            }
            catch (Exception e){
                continue;
            }
        }

    }
}
