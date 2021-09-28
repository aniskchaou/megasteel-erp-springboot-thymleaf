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

import com.dev.delta.entities.Vehicule;
import com.dev.delta.entities.VehiculeModel;
import com.dev.delta.services.VehiculeModelService;
import com.dev.delta.services.VehiculeService;

@Controller
public class VehiculeController {
	/**
	 * vehiculeService
	 */
	@Autowired
	private VehiculeService vehiculeService;

	@Autowired
	private VehiculeModelService vehiculeModelService;

	/**
	 * getVehicules
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/vehicules")
	public String getVehicules(Model model) {
		List<Vehicule> vehicules = vehiculeService.getVehicules();
		List<VehiculeModel> vehiculeModels = vehiculeModelService.getVehiculeModels();
		model.addAttribute("vehicules", vehicules);
		model.addAttribute("vehiculeModels", vehiculeModels);
		return "vehicule/vehicules";
	}

	/**
	 * addVehicule
	 * 
	 * @param vehicule
	 * @return
	 */
	@PostMapping("/addvehicule")

	public String addVehicule(Vehicule vehicule) {
		vehiculeService.save(vehicule);
		return "redirect:/vehicules";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/vehicule/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Vehicule vehicule = vehiculeService.findById(id).get();
		model.addAttribute("vehicule", vehicule);
		return "editVehicule";
	}

	/**
	 * updateVehicule
	 * 
	 * @param id
	 * @param vehicule
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatevehicule/{id}")
	public String updateVehicule(@PathVariable("id") long id, @Validated Vehicule vehicule, BindingResult result,
			Model model) {

		vehiculeService.save(vehicule);
		return "redirect:/vehicules";
	}

	/**
	 * deleteVehicule
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletevehicule/{id}")
	@Transactional
	public String deleteVehicule(@PathVariable("id") Long id) {
		vehiculeService.delete(id);
		return "redirect:/vehicules";
	}

}
