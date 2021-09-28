package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Termination;
import com.dev.delta.repositories.TerminationRepository;

@Service
public class TerminationService {
	/**
	 * terminationRepository
	 */
	@Autowired
	private TerminationRepository terminationRepository;

	/**
	 * getTerminations
	 * 
	 * @return
	 */
	public List<Termination> getTerminations() {
		return terminationRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return terminationRepository.count();
	}

	/**
	 * save
	 * 
	 * @param termination
	 */
	public void save(Termination termination) {
		terminationRepository.save(termination);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<Termination> findById(int id) {
		return terminationRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		terminationRepository.delete(terminationRepository.findById(id).get());
	}
}
