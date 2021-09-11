package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.delta.entities.PreventiveMaintenance;
import com.dev.delta.repositories.PreventiveMaintenancerepository;

public class PreventiveMaintenanceService {
	/**
	 * preventiveMaintenanceRepository
	 */
	@Autowired
	private PreventiveMaintenancerepository preventiveMaintenanceRepository;
	

	/**
	 * getPreventiveMaintenances
	 * @return
	 */
	public List<PreventiveMaintenance> getPreventiveMaintenances()
	{
		return preventiveMaintenanceRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return preventiveMaintenanceRepository.count();
	}

	/**
	 * save
	 * @param preventiveMaintenance
	 */
	public void save(PreventiveMaintenance preventiveMaintenance)
	{
		preventiveMaintenanceRepository.save(preventiveMaintenance);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<PreventiveMaintenance> findById(int id) {
		return preventiveMaintenanceRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		preventiveMaintenanceRepository.delete(preventiveMaintenanceRepository.findById(id).get());
	}
}
