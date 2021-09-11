package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.delta.entities.Intervention;
import com.dev.delta.repositories.InterventionRepository;

public class InterventionService {
	/**
	 * interventionRepository
	 */
	@Autowired
	private InterventionRepository interventionRepository;
	

	/**
	 * getInterventions
	 * @return
	 */
	public List<Intervention> getInterventions()
	{
		return interventionRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return interventionRepository.count();
	}

	/**
	 * save
	 * @param intervention
	 */
	public void save(Intervention intervention)
	{
		interventionRepository.save(intervention);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Intervention> findById(int id) {
		return interventionRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		interventionRepository.delete(interventionRepository.findById(id).get());
	}
}
