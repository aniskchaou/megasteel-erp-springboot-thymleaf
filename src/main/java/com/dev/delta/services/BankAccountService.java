package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.BankAccount;
import com.dev.delta.repositories.BankAccountRepository;

@Service
public class BankAccountService {
	/**
	 * bankAccountRepository
	 */
	@Autowired
	private BankAccountRepository bankAccountRepository;

	/**
	 * getBankAccounts
	 * 
	 * @return
	 */
	public List<BankAccount> getBankAccounts() {
		return bankAccountRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return bankAccountRepository.count();
	}

	/**
	 * save
	 * 
	 * @param bankAccount
	 */
	public void save(BankAccount bankAccount) {
		bankAccountRepository.save(bankAccount);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<BankAccount> findById(int id) {
		return bankAccountRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		bankAccountRepository.delete(bankAccountRepository.findById(id).get());
	}
}
