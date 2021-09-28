package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.EventRepository;

@Service
public class EventDBService implements IDBService {

	@Autowired
	EventRepository eventRepository;

	@Override
	public void populate() {
		event.setDescription("");
		event.setEndDate("12-11-2021");
		event.setLocation("Paris");
		event.setName("holiday");
		event.setStartDate("12-11-2020");
		eventRepository.save(event);

	}

}
