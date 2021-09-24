package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.VehiculeRent;
import com.dev.delta.repositories.VehiculeRentRepository;

@Service
public class VehiculeRentService {

	/**
	 * vehiculeRentRepository
	 */
	@Autowired
	private VehiculeRentRepository vehiculeRentRepository;
	

	/**
	 * getVehiculeRents
	 * @return
	 */
	public List<VehiculeRent> getVehiculeRents()
	{
		return vehiculeRentRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return vehiculeRentRepository.count();
	}

	/**
	 * save
	 * @param vehiculeRent
	 */
	public void save(VehiculeRent vehiculeRent)
	{
		vehiculeRentRepository.save(vehiculeRent);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<VehiculeRent> findById(int id) {
		return vehiculeRentRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		vehiculeRentRepository.delete(vehiculeRentRepository.findById(id).get());
	}
}
