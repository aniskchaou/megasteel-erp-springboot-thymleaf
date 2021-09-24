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

import com.dev.delta.entities.WareHouse;
import com.dev.delta.entities.Family;
import com.dev.delta.services.WareHouseService;
import com.dev.delta.services.FamilyService;

@Controller
public class WareHouseController {
	/**
	 * wareHouseService
	 */
	@Autowired
	private WareHouseService wareHouseService;

	@Autowired
	private FamilyService familyService;
	

	/**
	 * getWareHouses
	 * @param model
	 * @return
	 */
	@GetMapping("/warehouses")
	public String getWareHouses(Model model) {
		List<WareHouse> wareHouses = wareHouseService.getWareHouses();
		List<Family> families=familyService.getFamilys();
		model.addAttribute("warehouses", wareHouses);	
		model.addAttribute("families",families);
		
		return "wareHouse/warehouses";
	}

	/**
	 * addWareHouse
	 * @param wareHouse
	 * @return
	 */
	@PostMapping("/addwareHouse")

	public String addWareHouse(WareHouse wareHouse) {
		wareHouseService.save(wareHouse);
		return "redirect:/warehouses";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/wareHouse/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		WareHouse wareHouse = wareHouseService.findById(id).get();
		model.addAttribute("wareHouse", wareHouse);
		return "editActivities";
	}

	/**
	 * updateWareHouse
	 * @param id
	 * @param wareHouse
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatewareHouse/{id}")
	public String updateWareHouse(@PathVariable("id") long id, @Validated WareHouse wareHouse, BindingResult result,
			Model model) {

		wareHouseService.save(wareHouse);
		return "redirect:/warehouses";
	}

	/**
	 * deleteWareHouse
	 * @param id
	 * @return
	 */
	@GetMapping("/deletewareHouse/{id}")
	@Transactional
	public String deleteWareHouse(@PathVariable("id") int id) {
		wareHouseService.delete(id);
		return "redirect:/warehouses";
	}
}
