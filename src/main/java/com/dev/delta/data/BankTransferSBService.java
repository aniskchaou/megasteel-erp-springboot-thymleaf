package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.BankTransferRepository;

@Service
public class BankTransferSBService implements IDBService {

	@Autowired
	BankTransferRepository bankTransferRepository;
	
	@Override
	public void populate() {
		bankTransfer.setAmount("34");
		bankTransfer.setDate("12-6-2020");
		bankTransfer.setPaymentFrom(bankAccount);
		bankTransfer.setPaymentName("payment");
		bankTransfer.setPaymentTo(bankAccount);
		bankTransferRepository.save(bankTransfer);
	}

}
