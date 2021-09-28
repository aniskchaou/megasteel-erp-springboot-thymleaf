package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.StorageArea;
import com.dev.delta.repositories.StorageAreaRepository;

@Service
public class StorageAreaService {
	/**
	 * clientRepository
	 */
	@Autowired
	private StorageAreaRepository clientRepository;

	/**
	 * getStorageAreas
	 * 
	 * @return
	 */
	public List<StorageArea> getStorageAreas() {
		return clientRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return clientRepository.count();
	}

	/**
	 * save
	 * 
	 * @param client
	 */
	public void save(StorageArea client) {
		clientRepository.save(client);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<StorageArea> findById(int id) {
		return clientRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		clientRepository.delete(clientRepository.findById(id).get());
	}
}
