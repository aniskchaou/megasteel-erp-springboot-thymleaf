package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.InterventionStatus;
import com.dev.delta.repositories.InterventionStateRepository;


@Service
public class InterventionStatusService {

	/**
	 * interventionStatusRepository
	 */
	@Autowired
	private InterventionStateRepository interventionStatusRepository;
	

	/**
	 * getinterventionStatuss
	 * @return
	 */
	public List<InterventionStatus> getinterventionStatuss()
	{
		return interventionStatusRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return interventionStatusRepository.count();
	}

	/**
	 * save
	 * @param interventionStatus
	 */
	public void save(InterventionStatus interventionStatus)
	{
		interventionStatusRepository.save(interventionStatus);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<InterventionStatus> findById(int id) {
		return interventionStatusRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		interventionStatusRepository.delete(interventionStatusRepository.findById(id).get());
	}
}
