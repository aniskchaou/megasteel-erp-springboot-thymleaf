package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.City;
import com.dev.delta.repositories.CityRepository;

@Service
public class CityService {

	/**
	 * cityRepository
	 */
	@Autowired
	private CityRepository cityRepository;

	/**
	 * getCitys
	 * 
	 * @return
	 */
	public List<City> getCitys() {
		return cityRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return cityRepository.count();
	}

	/**
	 * save
	 * 
	 * @param city
	 */
	public void save(City city) {
		cityRepository.save(city);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<City> findById(int id) {
		return cityRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		cityRepository.delete(cityRepository.findById(id).get());
	}
}
