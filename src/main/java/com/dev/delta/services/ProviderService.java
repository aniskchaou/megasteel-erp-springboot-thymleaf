package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Provider;
import com.dev.delta.repositories.ProviderRepository;
@Service
public class ProviderService {
	/**
	 * providerRepository
	 */
	@Autowired
	private ProviderRepository providerRepository;
	

	/**
	 * getProviders
	 * @return
	 */
	public List<Provider> getProviders()
	{
		return providerRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return providerRepository.count();
	}

	/**
	 * save
	 * @param provider
	 */
	public void save(Provider provider)
	{
		providerRepository.save(provider);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Provider> findById(int id) {
		return providerRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		providerRepository.delete(providerRepository.findById(id).get());
	}
}
