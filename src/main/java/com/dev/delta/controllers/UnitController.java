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

import com.dev.delta.entities.Unit;
import com.dev.delta.entities.Family;
import com.dev.delta.services.UnitService;
import com.dev.delta.services.FamilyService;

@Controller
public class UnitController {

	/**
	 * unitService
	 */
	@Autowired
	private UnitService unitService;

	@Autowired
	private FamilyService familyService;

	/**
	 * getUnits
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/units")
	public String getUnits(Model model) {
		List<Unit> units = unitService.getUnits();
		List<Family> families = familyService.getFamilys();
		model.addAttribute("units", units);
		model.addAttribute("families", families);

		return "unit/units";
	}

	/**
	 * addUnit
	 * 
	 * @param unit
	 * @return
	 */
	@PostMapping("/addunit")

	public String addUnit(Unit unit) {
		unitService.save(unit);
		return "redirect:/units";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/unit/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Unit unit = unitService.findById(id).get();
		model.addAttribute("unit", unit);
		return "editActivities";
	}

	/**
	 * updateUnit
	 * 
	 * @param id
	 * @param unit
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateunit/{id}")
	public String updateUnit(@PathVariable("id") long id, @Validated Unit unit, BindingResult result, Model model) {

		unitService.save(unit);
		return "redirect:/units";
	}

	/**
	 * deleteUnit
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteunit/{id}")
	@Transactional
	public String deleteUnit(@PathVariable("id") Long id) {
		unitService.delete(id);
		return "redirect:/units";
	}
}
