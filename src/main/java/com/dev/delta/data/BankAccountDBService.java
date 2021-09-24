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
		bankAccount.setAccountName("");
		bankAccount.setAccountNumber("9798698698687");
		bankAccount.setBankName("JP MOgan Chase");
		bankAccount.setDescription("");
		bankAccount.setStatus("pending");
		bankAccountRepository.save(bankAccount);
	}

}
