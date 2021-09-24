package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.CountryRepository;
@Service
public class CountryDBService implements IDBService{

	@Autowired
	CountryRepository countryRepository;
	
	@Override
	public void populate() {
		country.setName("France");
		countryRepository.save(country);
		
	}

}
