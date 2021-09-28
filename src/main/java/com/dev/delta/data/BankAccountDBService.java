package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.BankAccountRepository;

@Service
public class BankAccountDBService implements IDBService {

	@Autowired
	BankAccountRepository bankAccountRepository;

	@Override
	public void populate() {
		bankAccount.setAccountName("Crystal Steel");
		bankAccount.setAccountNumber("4485 8593 6224 7038");
		bankAccount.setBankName("Deutsch Bank");
		bankAccount.setDescription("");
		bankAccount.setStatus("Active");
		bankAccountRepository.save(bankAccount);
	}

}
