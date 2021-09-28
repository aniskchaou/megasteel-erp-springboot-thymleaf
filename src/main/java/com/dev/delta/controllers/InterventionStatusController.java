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

import com.dev.delta.entities.InterventionStatus;
import com.dev.delta.services.InterventionStatusService;

@Controller
public class InterventionStatusController {

	/**
	 * InterventionStatusService
	 */
	@Autowired
	private InterventionStatusService InterventionStatusService;

	/**
	 * getInterventionStatuss
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/interventionstatus")
	public String getInterventionStatuss(Model model) {
		List<InterventionStatus> InterventionStatuss = InterventionStatusService.getinterventionStatuss();

		model.addAttribute("InterventionStatus", InterventionStatuss);

		return "Intervention_status/intervention_status";
	}

	/**
	 * addInterventionStatus
	 * 
	 * @param InterventionStatus
	 * @return
	 */
	@PostMapping("/addinterventionstatus")

	public String addInterventionStatus(InterventionStatus InterventionStatus) {
		InterventionStatusService.save(InterventionStatus);
		return "redirect:/interventionstatus";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/InterventionStatus/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		InterventionStatus InterventionStatus = InterventionStatusService.findById(id).get();
		model.addAttribute("InterventionStatus", InterventionStatus);
		return "editActivities";
	}

	/**
	 * updateInterventionStatus
	 * 
	 * @param id
	 * @param InterventionStatus
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateInterventionStatus/{id}")
	public String updateInterventionStatus(@PathVariable("id") long id,
			@Validated InterventionStatus InterventionStatus, BindingResult result, Model model) {

		InterventionStatusService.save(InterventionStatus);
		return "redirect:/InterventionStatuss";
	}

	/**
	 * deleteInterventionStatus
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteInterventionstatus/{id}")
	@Transactional
	public String deleteInterventionStatus(@PathVariable("id") Long id) {
		InterventionStatusService.delete(id);
		return "redirect:/interventionStatus";
	}
}
