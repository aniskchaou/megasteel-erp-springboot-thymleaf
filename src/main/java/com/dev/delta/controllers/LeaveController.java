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
import com.dev.delta.entities.Leave;
import com.dev.delta.entities.TypeLeave;
import com.dev.delta.services.EmployeeService;
import com.dev.delta.services.LeaveService;
import com.dev.delta.services.TypeLeaveService;

@Controller
public class LeaveController {
	/**
	 * leaveService
	 */
	@Autowired
	private LeaveService leaveService;

	@Autowired
	EmployeeService employeeService;

	@Autowired
	TypeLeaveService typeLeaveService;

	/**
	 * getLeaves
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/leaves")
	public String getLeaves(Model model) {
		List<Leave> leaves = leaveService.getLeaves();
		List<Employee> employees = employeeService.getEmployees();
		List<TypeLeave> typeLeaves = typeLeaveService.getTypeLeaves();
		model.addAttribute("leaves", leaves);
		model.addAttribute("employees", employees);
		model.addAttribute("typeLeaves", typeLeaves);
		return "leave/leaves";
	}

	/**
	 * addLeave
	 * 
	 * @param leave
	 * @return
	 */
	@PostMapping("/addleave")

	public String addLeave(Leave leave) {
		leaveService.save(leave);
		return "redirect:/leaves";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/leave/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Leave leave = leaveService.findById(id).get();
		model.addAttribute("leave", leave);
		return "editLeave";
	}

	/**
	 * updateLeave
	 * 
	 * @param id
	 * @param leave
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateleave/{id}")
	public String updateLeave(@PathVariable("id") long id, @Validated Leave leave, BindingResult result, Model model) {

		leaveService.save(leave);
		return "redirect:/leaves";
	}

	/**
	 * deleteLeave
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteleave/{id}")
	@Transactional
	public String deleteLeave(@PathVariable("id") Long id) {
		leaveService.delete(id);
		return "redirect:/leaves";
	}
}
