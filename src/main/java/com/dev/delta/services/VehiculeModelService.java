package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.VehiculeModel;
import com.dev.delta.repositories.VehiculeModelRepository;

@Service
public class VehiculeModelService {

	/**
	 * vehiculeModelRepository
	 */
	@Autowired
	private VehiculeModelRepository vehiculeModelRepository;
	

	/**
	 * getVehiculeModels
	 * @return
	 */
	public List<VehiculeModel> getVehiculeModels()
	{
		return vehiculeModelRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return vehiculeModelRepository.count();
	}

	/**
	 * save
	 * @param vehiculeModel
	 */
	public void save(VehiculeModel vehiculeModel)
	{
		vehiculeModelRepository.save(vehiculeModel);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<VehiculeModel> findById(int id) {
		return vehiculeModelRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		vehiculeModelRepository.delete(vehiculeModelRepository.findById(id).get());
	}
}
