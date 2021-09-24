package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.TypeTermination;
import com.dev.delta.repositories.TypeTerminaisonRepository;

@Service
public class TypeTerminationService {

	/**
	 * typeTerminationRepository
	 */
	@Autowired
	private TypeTerminaisonRepository typeTerminationRepository;
	

	/**
	 * getTypeTerminations
	 * @return
	 */
	public List<TypeTermination> getTypeTerminations()
	{
		return typeTerminationRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return typeTerminationRepository.count();
	}

	/**
	 * save
	 * @param typeTermination
	 */
	public void save(TypeTermination typeTermination)
	{
		typeTerminationRepository.save(typeTermination);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<TypeTermination> findById(int id) {
		return typeTerminationRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		typeTerminationRepository.delete(typeTerminationRepository.findById(id).get());
	}
}
