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

import com.dev.delta.entities.Activity;
import com.dev.delta.entities.Family;
import com.dev.delta.entities.Messaging;
import com.dev.delta.entities.Notification;
import com.dev.delta.repositories.MessagingRepository;
import com.dev.delta.repositories.NotificationRepository;
import com.dev.delta.services.ActivityService;
import com.dev.delta.services.FamilyService;
@Controller
public class ActivityController  {

	/**
	 * activityService
	 */
	@Autowired
	private ActivityService activityService;

	@Autowired
	private FamilyService familyService;
	

	@Autowired
	NotificationRepository notificationRepository;
	
	@Autowired
	MessagingRepository messagingRepository;
	
	
	/**
	 * getActivitys
	 * @param model
	 * @return
	 */
	@GetMapping("/activities")
	public String getActivitys(Model model) {
		List<Activity> activitys = activityService.getActivitys();
		List<Family> families=familyService.getFamilys();
		model.addAttribute("activities", activitys);	
		model.addAttribute("families",families);
		
		List<Messaging> messages=messagingRepository.findAll();
		List<Notification> notifications=notificationRepository.findAll();
		     Long  messagesNumber=messagingRepository.count();
		     Long  notificationNumber=notificationRepository.count();
		model.addAttribute("messages",messages);
		model.addAttribute("notifications",notifications);
		model.addAttribute("message_nb",messagesNumber);
		model.addAttribute("notification_nb",notificationNumber);
		
		return "activity/activities";
	}

	/**
	 * addActivity
	 * @param activity
	 * @return
	 */
	@PostMapping("/addactivity")

	public String addActivity(Activity activity) {
		activityService.save(activity);
		return "redirect:/activities";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/activity/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Activity activity = activityService.findById(id).get();
		model.addAttribute("activity", activity);
		return "editActivities";
	}

	/**
	 * updateActivity
	 * @param id
	 * @param activity
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateactivity/{id}")
	public String updateActivity(@PathVariable("id") long id, @Validated Activity activity, BindingResult result,
			Model model) {

		activityService.save(activity);
		return "redirect:/activities";
	}

	/**
	 * deleteActivity
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteactivity/{id}")
	@Transactional
	public String deleteActivity(@PathVariable("id") int id) {
		activityService.delete(id);
		return "redirect:/activities";
	}

}
