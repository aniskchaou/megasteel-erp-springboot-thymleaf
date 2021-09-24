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

import com.dev.delta.entities.JobApplication;
import com.dev.delta.entities.Family;
import com.dev.delta.services.JobApplicationService;
import com.dev.delta.services.FamilyService;

@Controller
public class JobApplicationController {

	/**
	 * jobApplicationService
	 */
	@Autowired
	private JobApplicationService jobApplicationService;

	@Autowired
	private FamilyService familyService;
	

	/**
	 * getJobApplications
	 * @param model
	 * @return
	 */
	@GetMapping("/jobapplications")
	public String getJobApplications(Model model) {
		List<JobApplication> jobApplications = jobApplicationService.getJobApplications();
		List<Family> families=familyService.getFamilys();
		model.addAttribute("jobapplication", jobApplications);	
		model.addAttribute("families",families);
		
		return "job_application/job_applications";
	}

	/**
	 * addJobApplication
	 * @param jobApplication
	 * @return
	 */
	@PostMapping("/addjobApplication")

	public String addJobApplication(JobApplication jobApplication) {
		jobApplicationService.save(jobApplication);
		return "redirect:/jobapplications";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/jobApplication/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		JobApplication jobApplication = jobApplicationService.findById(id).get();
		model.addAttribute("jobApplication", jobApplication);
		return "editActivities";
	}

	/**
	 * updateJobApplication
	 * @param id
	 * @param jobApplication
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatejobApplication/{id}")
	public String updateJobApplication(@PathVariable("id") long id, @Validated JobApplication jobApplication, BindingResult result,
			Model model) {

		jobApplicationService.save(jobApplication);
		return "redirect:/jobapplication";
	}

	/**
	 * deleteJobApplication
	 * @param id
	 * @return
	 */
	@GetMapping("/deletejobApplication/{id}")
	@Transactional
	public String deleteJobApplication(@PathVariable("id") int id) {
		jobApplicationService.delete(id);
		return "redirect:/jobapplication";
	}
}
