package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Country;
import com.dev.delta.repositories.CountryRepository;

@Service
public class CountryService {

	/**
	 * countryRepository
	 */
	@Autowired
	private CountryRepository countryRepository;

	/**
	 * getCountrys
	 * 
	 * @return
	 */
	public List<Country> getCountrys() {
		return countryRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return countryRepository.count();
	}

	/**
	 * save
	 * 
	 * @param country
	 */
	public void save(Country country) {
		countryRepository.save(country);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<Country> findById(int id) {
		return countryRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		countryRepository.delete(countryRepository.findById(id).get());
	}
}
