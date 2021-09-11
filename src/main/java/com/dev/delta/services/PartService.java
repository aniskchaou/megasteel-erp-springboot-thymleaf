package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.delta.entities.Part;
import com.dev.delta.repositories.PartRepository;

public class PartService {
	/**
	 * partRepository
	 */
	@Autowired
	private PartRepository partRepository;
	

	/**
	 * getParts
	 * @return
	 */
	public List<Part> getParts()
	{
		return partRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return partRepository.count();
	}

	/**
	 * save
	 * @param part
	 */
	public void save(Part part)
	{
		partRepository.save(part);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Part> findById(int id) {
		return partRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		partRepository.delete(partRepository.findById(id).get());
	}
}
