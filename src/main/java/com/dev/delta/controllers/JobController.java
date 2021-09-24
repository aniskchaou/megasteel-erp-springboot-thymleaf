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

import com.dev.delta.entities.Job;
import com.dev.delta.entities.Family;
import com.dev.delta.services.JobService;
import com.dev.delta.services.FamilyService;

@Controller
public class JobController {
	/**
	 * jobService
	 */
	@Autowired
	private JobService jobService;

	@Autowired
	private FamilyService familyService;
	

	/**
	 * getJobs
	 * @param model
	 * @return
	 */
	@GetMapping("/jobs")
	public String getJobs(Model model) {
		List<Job> jobs = jobService.getJobs();
		List<Family> families=familyService.getFamilys();
		model.addAttribute("jobs", jobs);	
		model.addAttribute("families",families);
		
		return "job/jobs";
	}

	/**
	 * addJob
	 * @param job
	 * @return
	 */
	@PostMapping("/addjob")

	public String addJob(Job job) {
		jobService.save(job);
		return "redirect:/jobs";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/job/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Job job = jobService.findById(id).get();
		model.addAttribute("job", job);
		return "editActivities";
	}

	/**
	 * updateJob
	 * @param id
	 * @param job
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatejob/{id}")
	public String updateJob(@PathVariable("id") long id, @Validated Job job, BindingResult result,
			Model model) {

		jobService.save(job);
		return "redirect:/jobs";
	}

	/**
	 * deleteJob
	 * @param id
	 * @return
	 */
	@GetMapping("/deletejob/{id}")
	@Transactional
	public String deleteJob(@PathVariable("id") int id) {
		jobService.delete(id);
		return "redirect:/jobs";
	}
}
