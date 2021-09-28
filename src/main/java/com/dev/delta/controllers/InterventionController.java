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

import com.dev.delta.entities.Intervention;
import com.dev.delta.entities.InterventionStatus;
import com.dev.delta.entities.Machine;
import com.dev.delta.services.InterventionService;
import com.dev.delta.services.InterventionStatusService;
import com.dev.delta.services.MachineService;

@Controller
public class InterventionController {
	/**
	 * interventionService
	 */
	@Autowired
	private InterventionService interventionService;

	@Autowired
	private MachineService machineService;

	@Autowired
	private InterventionStatusService interventionStatusService;

	/**
	 * getInterventions
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/interventions")
	public String getInterventions(Model model) {
		List<Intervention> interventions = interventionService.getInterventions();
		List<Machine> machines = machineService.getMachines();
		List<InterventionStatus> interventionStatus = interventionStatusService.getinterventionStatuss();
		model.addAttribute("interventions", interventions);
		model.addAttribute("machines", machines);
		model.addAttribute("interventionStatus", interventionStatus);
		return "intervention/interventions";
	}

	/**
	 * addIntervention
	 * 
	 * @param intervention
	 * @return
	 */
	@PostMapping("/addintervention")

	public String addIntervention(Intervention intervention) {
		interventionService.save(intervention);
		return "redirect:/interventions";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/intervention/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Intervention intervention = interventionService.findById(id).get();
		model.addAttribute("intervention", intervention);
		return "editIntervention";
	}

	/**
	 * updateIntervention
	 * 
	 * @param id
	 * @param intervention
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateintervention/{id}")
	public String updateIntervention(@PathVariable("id") long id, @Validated Intervention intervention,
			BindingResult result, Model model) {

		interventionService.save(intervention);
		return "redirect:/interventions";
	}

	/**
	 * deleteIntervention
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteintervention/{id}")
	@Transactional
	public String deleteIntervention(@PathVariable("id") Long id) {
		interventionService.delete(id);
		return "redirect:/interventions";
	}
}
