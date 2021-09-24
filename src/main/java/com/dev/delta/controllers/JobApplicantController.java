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

import com.dev.delta.entities.JobApplicant;
import com.dev.delta.entities.Family;
import com.dev.delta.services.JobApplicantService;
import com.dev.delta.services.FamilyService;

@Controller
public class JobApplicantController {

	/**
	 * jobApplicantService
	 */
	@Autowired
	private JobApplicantService jobApplicantService;

	@Autowired
	private FamilyService familyService;
	

	/**
	 * getJobApplicants
	 * @param model
	 * @return
	 */
	@GetMapping("/jobapplicants")
	public String getJobApplicants(Model model) {
		List<JobApplicant> jobApplicants = jobApplicantService.getJobApplicants();
		List<Family> families=familyService.getFamilys();
		model.addAttribute("jobapplicant", jobApplicants);	
		model.addAttribute("families",families);
		
		return "job_applicant/job_applicants";
	}

	/**
	 * addJobApplicant
	 * @param jobApplicant
	 * @return
	 */
	@PostMapping("/addjobapplicants")

	public String addJobApplicant(JobApplicant jobApplicant) {
		jobApplicantService.save(jobApplicant);
		return "redirect:/jobapplicants";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/jobApplicant/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		JobApplicant jobApplicant = jobApplicantService.findById(id).get();
		model.addAttribute("jobApplicant", jobApplicant);
		return "editActivities";
	}

	/**
	 * updateJobApplicant
	 * @param id
	 * @param jobApplicant
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatejobApplicant/{id}")
	public String updateJobApplicant(@PathVariable("id") long id, @Validated JobApplicant jobApplicant, BindingResult result,
			Model model) {

		jobApplicantService.save(jobApplicant);
		return "redirect:/jobapplicant";
	}

	/**
	 * deleteJobApplicant
	 * @param id
	 * @return
	 */
	@GetMapping("/deletejobApplicant/{id}")
	@Transactional
	public String deleteJobApplicant(@PathVariable("id") int id) {
		jobApplicantService.delete(id);
		return "redirect:/jobapplicant";
	}
}
