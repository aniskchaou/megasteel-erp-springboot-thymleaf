package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.delta.entities.Client;
import com.dev.delta.repositories.ClientRepository;

public class ClientService {

	/**
	 * clientRepository
	 */
	@Autowired
	private ClientRepository clientRepository;
	

	/**
	 * getClients
	 * @return
	 */
	public List<Client> getClients()
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
	public void save(Client client)
	{
		clientRepository.save(client);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Client> findById(int id) {
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
