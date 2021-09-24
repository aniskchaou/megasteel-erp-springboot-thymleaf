package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.ExternalProvider;
import com.dev.delta.repositories.ExternalProviderRepository;
@Service
public class ExternalProviderService {
	/**
	 * externalProviderRepository
	 */
	@Autowired
	private ExternalProviderRepository externalProviderRepository;
	

	/**
	 * getExternalProviders
	 * @return
	 */
	public List<ExternalProvider> getExternalProviders()
	{
		return externalProviderRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return externalProviderRepository.count();
	}

	/**
	 * save
	 * @param externalProvider
	 */
	public void save(ExternalProvider externalProvider)
	{
		externalProviderRepository.save(externalProvider);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<ExternalProvider> findById(int id) {
		return externalProviderRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		externalProviderRepository.delete(externalProviderRepository.findById(id).get());
	}
}