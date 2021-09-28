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

import com.dev.delta.entities.Machine;
import com.dev.delta.entities.PreventiveMaintenance;
import com.dev.delta.services.MachineService;
import com.dev.delta.services.PreventiveMaintenanceService;

@Controller
public class PreventiveMaintenanceController {
	/**
	 * preventiveMaintenanceService
	 */
	@Autowired
	private PreventiveMaintenanceService preventiveMaintenanceService;

	@Autowired
	private MachineService machineService;

	/**
	 * getPreventiveMaintenances
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/preventivemaintenances")
	public String getPreventiveMaintenances(Model model) {
		List<PreventiveMaintenance> preventiveMaintenances = preventiveMaintenanceService.getPreventiveMaintenances();
		List<Machine> machines = machineService.getMachines();
		model.addAttribute("preventiveMaintenances", preventiveMaintenances);
		model.addAttribute("machines", machines);
		return "preventive_maintenance/preventive_maintenances";
	}

	/**
	 * addPreventiveMaintenance
	 * 
	 * @param preventiveMaintenance
	 * @return
	 */
	@PostMapping("/addpreventivemaintenance")

	public String addPreventiveMaintenance(PreventiveMaintenance preventiveMaintenance) {
		preventiveMaintenanceService.save(preventiveMaintenance);
		return "redirect:/preventivemaintenances";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/preventivemaintenance/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		PreventiveMaintenance preventiveMaintenance = preventiveMaintenanceService.findById(id).get();
		model.addAttribute("preventiveMaintenance", preventiveMaintenance);
		return "editPreventivemaintenance";
	}

	/**
	 * updatePreventiveMaintenance
	 * 
	 * @param id
	 * @param preventiveMaintenance
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatepreventivemaintenance/{id}")
	public String updatePreventiveMaintenance(@PathVariable("id") long id,
			@Validated PreventiveMaintenance preventiveMaintenance, BindingResult result, Model model) {

		preventiveMaintenanceService.save(preventiveMaintenance);
		return "redirect:/preventivemaintenances";
	}

	/**
	 * deletePreventiveMaintenance
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletepreventivemaintenance/{id}")
	@Transactional
	public String deletePreventiveMaintenance(@PathVariable("id") Long id) {
		preventiveMaintenanceService.delete(id);
		return "redirect:/preventivemaintenances";
	}
}
