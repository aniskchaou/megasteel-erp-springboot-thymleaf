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
import com.dev.delta.entities.City;
import com.dev.delta.entities.Country;
import com.dev.delta.entities.Departement;
import com.dev.delta.entities.Employee;
import com.dev.delta.entities.Family;
import com.dev.delta.services.JobApplicationService;
import com.dev.delta.services.CityService;
import com.dev.delta.services.CountryService;
import com.dev.delta.services.DepartementService;
import com.dev.delta.services.EmployeeService;
import com.dev.delta.services.FamilyService;

@Controller
public class JobApplicationController {

	/**
	 * jobApplicationService
	 */
	@Autowired
	private JobApplicationService jobApplicationService;

	@Autowired
	private DepartementService departementService;

	@Autowired
	private CityService cityService;

	@Autowired
	private CountryService countryService;

	@Autowired
	private EmployeeService employeeService;

	/**
	 * getJobApplications
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/jobapplications")
	public String getJobApplications(Model model) {
		List<JobApplication> jobApplications = jobApplicationService.getJobApplications();
		List<Employee> employees = employeeService.getEmployees();
		List<City> cities = cityService.getCitys();
		List<Country> countries = countryService.getCountrys();
		List<Departement> departements = departementService.getDepartements();
		model.addAttribute("jobapplication", jobApplications);
		model.addAttribute("cities", cities);
		model.addAttribute("countries", countries);
		model.addAttribute("departements", departements);
		model.addAttribute("employees", employees);

		return "job_application/job_applications";
	}

	/**
	 * addJobApplication
	 * 
	 * @param jobApplication
	 * @return
	 */
	@PostMapping("/addjobapplication")

	public String addJobApplication(JobApplication jobApplication) {
		jobApplicationService.save(jobApplication);
		return "redirect:/jobapplications";
	}

	/**
	 * findById
	 * 
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
	 * 
	 * @param id
	 * @param jobApplication
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatejobApplication/{id}")
	public String updateJobApplication(@PathVariable("id") long id, @Validated JobApplication jobApplication,
			BindingResult result, Model model) {

		jobApplicationService.save(jobApplication);
		return "redirect:/jobapplication";
	}

	/**
	 * deleteJobApplication
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletejobapplication/{id}")
	@Transactional
	public String deleteJobApplication(@PathVariable("id") Long id) {
		jobApplicationService.delete(id);
		return "redirect:/jobapplication";
	}
}
