package com.dev.delta.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.entities.Event;
import com.dev.delta.entities.Family;
import com.dev.delta.services.EventService;
import com.dev.delta.services.FamilyService;

@Controller
public class EventController {

	/**
	 * eventService
	 */
	@Autowired
	private EventService eventService;

	@Autowired
	private FamilyService familyService;

	/**
	 * getEvents
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/events")
	public String getEvents(Model model) {
		List<Event> events = eventService.getEvents();
		List<Family> families = familyService.getFamilys();
		model.addAttribute("events", events);
		model.addAttribute("families", families);

		return "event/events";
	}

	/**
	 * addEvent
	 * 
	 * @param event
	 * @return
	 */
	@PostMapping("/addevent")

	public String addEvent(Event event) {
		eventService.save(event);
		return "redirect:/events";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/event/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Event event = eventService.findById(id).get();
		model.addAttribute("event", event);
		return "editActivities";
	}

	/**
	 * updateEvent
	 * 
	 * @param id
	 * @param event
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateevent/{id}")
	public String updateEvent(@PathVariable("id") long id, @Validated Event event, BindingResult result, Model model) {

		eventService.save(event);
		return "redirect:/events";
	}

	/**
	 * deleteEvent
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteevent/{id}")
	@Transactional
	public String deleteEvent(@PathVariable("id") Long id) {
		eventService.delete(id);
		return "redirect:/events";
	}
}
