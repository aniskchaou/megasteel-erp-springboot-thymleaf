package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.CityRepository;

@Service
public class CityDBService implements IDBService{

	@Autowired
	CityRepository cityRepository;
	
	@Override
	public void populate() {
		city.setCountry(country);
		city.setName("Paris");
		cityRepository.save(city);
		
	}

}
