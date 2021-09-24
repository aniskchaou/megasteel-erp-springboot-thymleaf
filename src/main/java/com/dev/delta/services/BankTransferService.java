package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.BankTransfer;
import com.dev.delta.repositories.BankTransferRepository;

@Service
public class BankTransferService {

	/**
	 * bankTransferRepository
	 */
	@Autowired
	private BankTransferRepository bankTransferRepository;
	

	/**
	 * getBankTransfers
	 * @return
	 */
	public List<BankTransfer> getBankTransfers()
	{
		return bankTransferRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return bankTransferRepository.count();
	}

	/**
	 * save
	 * @param bankTransfer
	 */
	public void save(BankTransfer bankTransfer)
	{
		bankTransferRepository.save(bankTransfer);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<BankTransfer> findById(int id) {
		return bankTransferRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		bankTransferRepository.delete(bankTransferRepository.findById(id).get());
	}
}
