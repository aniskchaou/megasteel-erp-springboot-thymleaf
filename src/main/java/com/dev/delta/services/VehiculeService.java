package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Vehicule;
import com.dev.delta.repositories.VehiculeRepository;
@Service
public class VehiculeService {
	/**
	 * cvehiculeRepository
	 */
	@Autowired
	private VehiculeRepository cvehiculeRepository;
	

	/**
	 * getVehicules
	 * @return
	 */
	public List<Vehicule> getVehicules()
	{
		return cvehiculeRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return cvehiculeRepository.count();
	}

	/**
	 * save
	 * @param cvehicule
	 */
	public void save(Vehicule cvehicule)
	{
		cvehiculeRepository.save(cvehicule);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Vehicule> findById(int id) {
		return cvehiculeRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		cvehiculeRepository.delete(cvehiculeRepository.findById(id).get());
	}
}
