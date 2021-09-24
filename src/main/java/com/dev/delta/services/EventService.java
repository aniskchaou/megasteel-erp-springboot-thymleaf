package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Event;
import com.dev.delta.repositories.EventRepository;

@Service
public class EventService {
	/**
	 * eventRepository
	 */
	@Autowired
	private EventRepository eventRepository;
	

	/**
	 * getEvents
	 * @return
	 */
	public List<Event> getEvents()
	{
		return eventRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return eventRepository.count();
	}

	/**
	 * save
	 * @param event
	 */
	public void save(Event event)
	{
		eventRepository.save(event);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Event> findById(int id) {
		return eventRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		eventRepository.delete(eventRepository.findById(id).get());
	}
}
