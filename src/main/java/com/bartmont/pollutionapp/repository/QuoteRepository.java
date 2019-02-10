package com.bartmont.pollutionapp.repository;

import com.bartmont.pollutionapp.entity.Quote;
import org.springframework.data.repository.CrudRepository;

public interface QuoteRepository extends CrudRepository<Quote, Integer> {
}
