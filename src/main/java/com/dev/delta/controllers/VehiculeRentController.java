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

import com.dev.delta.entities.VehiculeRent;
import com.dev.delta.entities.Family;
import com.dev.delta.services.VehiculeRentService;
import com.dev.delta.services.FamilyService;

@Controller
public class VehiculeRentController {
	/**
	 * vehiculeRentService
	 */
	@Autowired
	private VehiculeRentService vehiculeRentService;

	@Autowired
	private FamilyService familyService;
	

	/**
	 * getVehiculeRents
	 * @param model
	 * @return
	 */
	@GetMapping("/vehiculerents")
	public String getVehiculeRents(Model model) {
		List<VehiculeRent> vehiculeRents = vehiculeRentService.getVehiculeRents();
		List<Family> families=familyService.getFamilys();
		model.addAttribute("vehiculerents", vehiculeRents);	
		model.addAttribute("families",families);
		
		return "vehicule_rent/vehicule_rents";
	}

	/**
	 * addVehiculeRent
	 * @param vehiculeRent
	 * @return
	 */
	@PostMapping("/addvehiculerent")

	public String addVehiculeRent(VehiculeRent vehiculeRent) {
		vehiculeRentService.save(vehiculeRent);
		return "redirect:/vehiculerents";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/vehiculeRent/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		VehiculeRent vehiculeRent = vehiculeRentService.findById(id).get();
		model.addAttribute("vehiculeRent", vehiculeRent);
		return "editActivities";
	}

	/**
	 * updateVehiculeRent
	 * @param id
	 * @param vehiculeRent
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatevehiculeRent/{id}")
	public String updateVehiculeRent(@PathVariable("id") long id, @Validated VehiculeRent vehiculeRent, BindingResult result,
			Model model) {

		vehiculeRentService.save(vehiculeRent);
		return "redirect:/vehiculerents";
	}

	/**
	 * deleteVehiculeRent
	 * @param id
	 * @return
	 */
	@GetMapping("/deletevehiculeRent/{id}")
	@Transactional
	public String deleteVehiculeRent(@PathVariable("id") int id) {
		vehiculeRentService.delete(id);
		return "redirect:/vehiculerents";
	}
}
