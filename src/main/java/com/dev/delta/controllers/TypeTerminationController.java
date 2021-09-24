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

import com.dev.delta.entities.TypeTermination;
import com.dev.delta.entities.Family;
import com.dev.delta.services.TypeTerminationService;
import com.dev.delta.services.FamilyService;

@Controller
public class TypeTerminationController {
	/**
	 * typeTerminationService
	 */
	@Autowired
	private TypeTerminationService typeTerminationService;

	@Autowired
	private FamilyService familyService;
	

	/**
	 * getTypeTerminations
	 * @param model
	 * @return
	 */
	@GetMapping("/typeterminations")
	public String getTypeTerminations(Model model) {
		List<TypeTermination> typeTerminations = typeTerminationService.getTypeTerminations();
		List<Family> families=familyService.getFamilys();
		model.addAttribute("typeTerminations", typeTerminations);	
		model.addAttribute("families",families);
		
		return "type_termination/type_terminations";
	}

	/**
	 * addTypeTermination
	 * @param typeTermination
	 * @return
	 */
	@PostMapping("/addtypeTermination")

	public String addTypeTermination(TypeTermination typeTermination) {
		typeTerminationService.save(typeTermination);
		return "redirect:/typeterminations";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/typeTermination/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		TypeTermination typeTermination = typeTerminationService.findById(id).get();
		model.addAttribute("typeTermination", typeTermination);
		return "editActivities";
	}

	/**
	 * updateTypeTermination
	 * @param id
	 * @param typeTermination
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatetypeTermination/{id}")
	public String updateTypeTermination(@PathVariable("id") long id, @Validated TypeTermination typeTermination, BindingResult result,
			Model model) {

		typeTerminationService.save(typeTermination);
		return "redirect:/typeterminations";
	}

	/**
	 * deleteTypeTermination
	 * @param id
	 * @return
	 */
	@GetMapping("/deletetypeTermination/{id}")
	@Transactional
	public String deleteTypeTermination(@PathVariable("id") int id) {
		typeTerminationService.delete(id);
		return "redirect:/typeterminations";
	}
}
