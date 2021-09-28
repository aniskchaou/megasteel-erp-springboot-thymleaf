package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.ProviderContract;
import com.dev.delta.repositories.ProviderContractRepository;

@Service
public class ProviderContractService {
	/**
	 * providerContractRepository
	 */
	@Autowired
	private ProviderContractRepository providerContractRepository;

	/**
	 * getProviderContracts
	 * 
	 * @return
	 */
	public List<ProviderContract> getProviderContracts() {
		return providerContractRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return providerContractRepository.count();
	}

	/**
	 * save
	 * 
	 * @param providerContract
	 */
	public void save(ProviderContract providerContract) {
		providerContractRepository.save(providerContract);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<ProviderContract> findById(int id) {
		return providerContractRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		providerContractRepository.delete(providerContractRepository.findById(id).get());
	}
}
