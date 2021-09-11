package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.delta.entities.ProductionEntryVoucher;
import com.dev.delta.repositories.ProductionEntryVoucherRepository;

public class ProductionEntryVoucherService {
	/**
	 * clientRepository
	 */
	@Autowired
	private ProductionEntryVoucherRepository clientRepository;
	

	/**
	 * getProductionEntryVouchers
	 * @return
	 */
	public List<ProductionEntryVoucher> getProductionEntryVouchers()
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
	public void save(ProductionEntryVoucher client)
	{
		clientRepository.save(client);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<ProductionEntryVoucher> findById(int id) {
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
