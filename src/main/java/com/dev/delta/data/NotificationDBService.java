package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.NotificationRepository;

@Service
public class NotificationDBService implements IDBService {

	@Autowired
	NotificationRepository notificationRepository;

	@Override
	public void populate() {
		notification.setDate("22-10");
		notification.setName("New Article is Created by Admin");
		notification.setType("Article");
		;

		notification2.setDate("22-10");
		notification2.setName("New Article is Created by Admin");
		notification2.setType("Article");
		;

		notificationRepository.save(notification);
		notificationRepository.save(notification2);
	}

}
