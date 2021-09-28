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

import com.dev.delta.entities.Family;
import com.dev.delta.entities.Machine;
import com.dev.delta.services.FamilyService;
import com.dev.delta.services.MachineService;

@Controller
public class MachineController {
	/**
	 * machineService
	 */
	@Autowired
	private MachineService machineService;

	@Autowired
	private FamilyService familyService;

	/**
	 * getMachines
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/machines")
	public String getMachines(Model model) {
		List<Machine> machines = machineService.getMachines();
		List<Family> families = familyService.getFamilys();
		model.addAttribute("machines", machines);
		model.addAttribute("families", families);
		return "machine/machines";
	}

	/**
	 * addMachine
	 * 
	 * @param machine
	 * @return
	 */
	@PostMapping("/addmachine")

	public String addMachine(Machine machine) {
		machineService.save(machine);
		return "redirect:/machines";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/machine/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Machine machine = machineService.findById(id).get();
		model.addAttribute("machine", machine);
		return "editMachine";
	}

	/**
	 * updateMachine
	 * 
	 * @param id
	 * @param machine
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatemachine/{id}")
	public String updateMachine(@PathVariable("id") long id, @Validated Machine machine, BindingResult result,
			Model model) {

		machineService.save(machine);
		return "redirect:/machines";
	}

	/**
	 * deleteMachine
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletemachine/{id}")
	@Transactional
	public String deleteMachine(@PathVariable("id") Long id) {
		machineService.delete(id);
		return "redirect:/machines";
	}
}
