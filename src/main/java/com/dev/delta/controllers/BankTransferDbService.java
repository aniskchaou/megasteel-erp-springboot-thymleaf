package com.dev.delta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.data.IDBService;
import com.dev.delta.repositories.BankTransferRepository;
@Service
public class BankTransferDbService implements IDBService{
   
	@Autowired
	BankTransferRepository bankTransferRepository ; 
	
	@Override
	public void populate() {
		bankTransfer.setAmount("21");
		bankTransfer.setDate("11-2-2020");
		bankTransfer.setPaymentFrom(bankAccount);
		bankTransfer.setPaymentTo(bankAccount);
		bankTransfer.setPaymentName("pay");
		
		bankTransferRepository.save(bankTransfer);
		
	}

}
