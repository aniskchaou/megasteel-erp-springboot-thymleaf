package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.ClientRepository;

@Service
public class ClientDBService implements IDBService {

	@Autowired
	ClientRepository ClientRepository;

	@Override
	public void populate() {

		client.setCode("H8787");
		client.setAdresse("sdsd");
		client.setEmail("nqzrfer");
		client.setFax("78987");
		client.setFirstName("GYOY8");
		client.setLastName("kn lh");
		client.setTelephone("7898769");
		client.setTva("24");

		ClientRepository.save(client);

	}

}
