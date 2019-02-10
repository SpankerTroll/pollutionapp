package com.bartmont.pollutionapp.Service;

import com.bartmont.pollutionapp.entity.Quote;
import com.bartmont.pollutionapp.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuoteService {
    @Autowired
    QuoteRepository quoteRepository;

    public List<Quote> getAllQuotes(){
        List<Quote> quotes = new ArrayList<>();
        quoteRepository.findAll()
                .forEach(quotes::add);
        return quotes;
    }

    public Quote getQuoteById(int id){
        return quoteRepository.findById(id).get();
    }

    public void addQuote(Quote quote){
        quoteRepository.save(quote);
    }

    public void updateQuote(int id, Quote quote){
        quoteRepository.save(quote);
    }

    public void deleteQuote(int id){

        quoteRepository.deleteById(id);
    }

}
