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
import com.dev.delta.services.FamilyService;

@Controller
public class FamilyController {
	/**
	 * familyService
	 */
	@Autowired
	private FamilyService familyService;

	

	/**
	 * getFamilys
	 * @param model
	 * @return
	 */
	@GetMapping("/families")
	public String getFamilys(Model model) {
		List<Family> familys = familyService.getFamilys();
		model.addAttribute("families", familys);	
		return "family/families";
	}

	/**
	 * addFamily
	 * @param family
	 * @return
	 */
	@PostMapping("/addfamily")

	public String addFamily(Family family) {
		familyService.save(family);
		return "redirect:/families";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/family/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Family family = familyService.findById(id).get();
		model.addAttribute("family", family);
		return "editFamily";
	}

	/**
	 * updateFamily
	 * @param id
	 * @param family
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatefamily/{id}")
	public String updateFamily(@PathVariable("id") long id, @Validated Family family, BindingResult result,
			Model model) {

		familyService.save(family);
		return "redirect:/families";
	}

	/**
	 * deleteFamily
	 * @param id
	 * @return
	 */
	@GetMapping("/deletefamily/{id}")
	@Transactional
	public String deleteFamily(@PathVariable("id") int id) {
		familyService.delete(id);
		return "redirect:/families";
	}
}
