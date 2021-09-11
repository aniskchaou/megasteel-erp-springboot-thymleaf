package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.delta.entities.CustomerContract;
import com.dev.delta.repositories.CustomerContractRepository;

public class CustomerContractService  {

	/**
	 * customerContractRepository
	 */
	@Autowired
	private CustomerContractRepository customerContractRepository;
	

	/**
	 * getCustomerContracts
	 * @return
	 */
	public List<CustomerContract> getCustomerContracts()
	{
		return customerContractRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return customerContractRepository.count();
	}

	/**
	 * save
	 * @param customerContract
	 */
	public void save(CustomerContract customerContract)
	{
		customerContractRepository.save(customerContract);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<CustomerContract> findById(int id) {
		return customerContractRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		customerContractRepository.delete(customerContractRepository.findById(id).get());
	}
}
