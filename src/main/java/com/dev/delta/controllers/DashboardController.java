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
import com.dev.delta.entities.Messaging;
import com.dev.delta.entities.Notification;
import com.dev.delta.repositories.MessagingRepository;
import com.dev.delta.repositories.NotificationRepository;
import com.dev.delta.services.ActivityService;

@Controller
public class DashboardController  {
	
	@Autowired
	NotificationRepository notificationRepository;
	
	@Autowired
	MessagingRepository messagingRepository;
	
	
	@GetMapping("/")
	public String home(Model model) {
		List<Messaging> messages=messagingRepository.findAll();
		List<Notification> notifications=notificationRepository.findAll();
		model.addAttribute("messages",messages);
		model.addAttribute("notifications",notifications);
		return "dashboard/dashboard";
	}
	
	@GetMapping("/dashboard")
	public String dashboard() {
		return "redirect:/";
	}

}
