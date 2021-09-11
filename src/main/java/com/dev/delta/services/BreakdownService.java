package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.delta.entities.Breakdown;
import com.dev.delta.repositories.BreakDownRepository;

public class BreakdownService  {

	/**
	 * breakDownRepository
	 */
	@Autowired
	private BreakDownRepository breakDownRepository;
	

	/**
	 * getBreakDowns
	 * @return
	 */
	public List<Breakdown> getBreakDowns()
	{
		return breakDownRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return breakDownRepository.count();
	}

	/**
	 * save
	 * @param breakDown
	 */
	public void save(Breakdown breakDown)
	{
		breakDownRepository.save(breakDown);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Breakdown> findById(int id) {
		return breakDownRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		breakDownRepository.delete(breakDownRepository.findById(id).get());
	}
}
