package com.bartmont.pollutionapp.controller;

import com.bartmont.pollutionapp.Service.QuoteService;
import com.bartmont.pollutionapp.entity.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuoteController {
    @Autowired
    private QuoteService quoteService;

    @RequestMapping("/Quotes")
    public List<Quote> getAllQuotes() {
        return quoteService.getAllQuotes();
    }

    @GetMapping("/Quotes/{id}")
    public Quote getQuoteById(@PathVariable int id){
        return quoteService.getQuoteById(id);
    }

    @PostMapping("/Quotes")
    public void addQuote (@RequestBody Quote quote){
        quoteService.addQuote(quote);
    }

    @PutMapping("/Quotes/{id}")
    public void updateQuote(@PathVariable int id, @RequestBody Quote quote){
        quoteService.updateQuote(id,quote);
    }

    @DeleteMapping("/Quotes/{id}")
    public void deleteQuote(@PathVariable int id){
        quoteService.deleteQuote(id);
    }
}
