package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Messaging;
import com.dev.delta.repositories.MessagingRepository;

@Service
public class MessagingDBService implements IDBService {

	@Autowired
	MessagingRepository messagingRepository;

	@Override
	public void populate() {

		messaging.setDate("22-10");
		messaging.setMessage("Hello Admin...");
		messaging.setReceiver("Admin");
		messaging.setSender("John Doe");
		messaging.setTitle("Request");

		messaging2.setDate("22-10");
		messaging2.setMessage("Hello Admin...");
		messaging2.setReceiver("Admin");
		messaging2.setSender("John Doe");
		messaging2.setTitle("Request");

		messagingRepository.save(messaging);
		messagingRepository.save(messaging2);
	}

}
