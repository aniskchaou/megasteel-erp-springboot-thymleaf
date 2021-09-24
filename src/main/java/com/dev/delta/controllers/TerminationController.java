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

import com.dev.delta.entities.Employee;
import com.dev.delta.entities.Termination;
import com.dev.delta.entities.TypeTermination;
import com.dev.delta.services.EmployeeService;
import com.dev.delta.services.TerminationService;
import com.dev.delta.services.TypeTerminationService;

@Controller
public class TerminationController {
	/**
	 * terminationService
	 */
	@Autowired
	private TerminationService terminationService;

	@Autowired
	private EmployeeService employeeService ;  

	@Autowired
	private TypeTerminationService typeTerminationService;
	/**
	 * getTerminations
	 * @param model
	 * @return
	 */
	@GetMapping("/terminations")
	public String getTerminations(Model model) {
		List<Termination> terminations = terminationService.getTerminations();
		List<Employee> employees=employeeService.getEmployees();
		List<TypeTermination> typeTerminations=typeTerminationService.getTypeTerminations();
		model.addAttribute("terminations", terminations);	
		model.addAttribute("employees", employees);
		model.addAttribute("typeTerminations", typeTerminations);
		return "termination/terminations";
		
	}

	/**
	 * addTermination
	 * @param termination
	 * @return
	 */
	@PostMapping("/addtermination")

	public String addTermination(Termination termination) {
		terminationService.save(termination);
		return "redirect:/terminations";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/termination/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Termination termination = terminationService.findById(id).get();
		model.addAttribute("termination", termination);
		return "editTermination";
	}

	/**
	 * updateTermination
	 * @param id
	 * @param termination
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatetermination/{id}")
	public String updateTermination(@PathVariable("id") long id, @Validated Termination termination, BindingResult result,
			Model model) {

		terminationService.save(termination);
		return "redirect:/terminations";
	}

	/**
	 * deleteTermination
	 * @param id
	 * @return
	 */
	@GetMapping("/deletetermination/{id}")
	@Transactional
	public String deleteTermination(@PathVariable("id") int id) {
		terminationService.delete(id);
		return "redirect:/terminations";
	}

}
