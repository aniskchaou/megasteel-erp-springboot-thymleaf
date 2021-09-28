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
import com.dev.delta.entities.Job;
import com.dev.delta.services.EmployeeService;
import com.dev.delta.services.JobService;

@Controller
public class EmployeeController {

	/**
	 * employeeService
	 */
	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private JobService jobService;

	/**
	 * getEmployees
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/employees")
	public String getEmployees(Model model) {
		List<Employee> employees = employeeService.getEmployees();
		List<Job> jobs = jobService.getJobs();
		model.addAttribute("employees", employees);
		model.addAttribute("jobs", jobs);
		return "employee/employees";
	}

	/**
	 * addEmployee
	 * 
	 * @param employee
	 * @return
	 */
	@PostMapping("/addemployee")

	public String addEmployee(Employee employee) {
		employeeService.save(employee);
		return "redirect:/employees";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/employee/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Employee employee = employeeService.findById(id).get();
		model.addAttribute("employee", employee);
		return "editEmployee";
	}

	/**
	 * updateEmployee
	 * 
	 * @param id
	 * @param employee
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateemployee/{id}")
	public String updateEmployee(@PathVariable("id") long id, @Validated Employee employee, BindingResult result,
			Model model) {

		employeeService.save(employee);
		return "redirect:/employees";
	}

	/**
	 * deleteEmployee
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteemployee/{id}")
	@Transactional
	public String deleteEmployee(@PathVariable("id") Long id) {
		employeeService.delete(id);
		return "redirect:/employees";
	}
}
