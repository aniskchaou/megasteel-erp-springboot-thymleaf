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

import com.dev.delta.entities.VehiculeModel;
import com.dev.delta.entities.Family;
import com.dev.delta.services.VehiculeModelService;
import com.dev.delta.services.FamilyService;

@Controller
public class VehiculeModelController {

	/**
	 * vehiculeModelService
	 */
	@Autowired
	private VehiculeModelService vehiculeModelService;

	@Autowired
	private FamilyService familyService;

	/**
	 * getVehiculeModels
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/vehiculemodels")
	public String getVehiculeModels(Model model) {
		List<VehiculeModel> vehiculeModels = vehiculeModelService.getVehiculeModels();
		List<Family> families = familyService.getFamilys();
		model.addAttribute("vehiculeModels", vehiculeModels);
		model.addAttribute("families", families);

		return "vehicule_model/vehicule_models";
	}

	/**
	 * addVehiculeModel
	 * 
	 * @param vehiculeModel
	 * @return
	 */
	@PostMapping("/addvehiculemodel")

	public String addVehiculeModel(VehiculeModel vehiculeModel) {
		vehiculeModelService.save(vehiculeModel);
		return "redirect:/vehiculemodels";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/vehiculeModel/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		VehiculeModel vehiculeModel = vehiculeModelService.findById(id).get();
		model.addAttribute("vehiculeModel", vehiculeModel);
		return "editActivities";
	}

	/**
	 * updateVehiculeModel
	 * 
	 * @param id
	 * @param vehiculeModel
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatevehiculeModel/{id}")
	public String updateVehiculeModel(@PathVariable("id") long id, @Validated VehiculeModel vehiculeModel,
			BindingResult result, Model model) {

		vehiculeModelService.save(vehiculeModel);
		return "redirect:/vehiculemodels";
	}

	/**
	 * deleteVehiculeModel
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletevehiculemodel/{id}")
	@Transactional
	public String deleteVehiculeModel(@PathVariable("id") Long id) {
		vehiculeModelService.delete(id);
		return "redirect:/vehiculemodels";
	}
}
