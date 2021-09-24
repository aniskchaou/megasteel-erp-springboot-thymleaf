package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Family;
import com.dev.delta.repositories.FamilyRepository;
@Service
public class FamilyService {
	/**
	 * clientRepository
	 */
	@Autowired
	private FamilyRepository clientRepository;
	

	/**
	 * getFamilys
	 * @return
	 */
	public List<Family> getFamilys()
	{
		return clientRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return clientRepository.count();
	}

	/**
	 * save
	 * @param client
	 */
	public void save(Family client)
	{
		clientRepository.save(client);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Family> findById(int id) {
		return clientRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		clientRepository.delete(clientRepository.findById(id).get());
	}
}
