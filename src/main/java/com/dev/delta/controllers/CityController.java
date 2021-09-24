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

import com.dev.delta.entities.City;
import com.dev.delta.entities.Family;
import com.dev.delta.services.CityService;
import com.dev.delta.services.FamilyService;

@Controller
public class CityController {

	/**
	 * cityService
	 */
	@Autowired
	private CityService cityService;

	@Autowired
	private FamilyService familyService;
	

	/**
	 * getCitys
	 * @param model
	 * @return
	 */
	@GetMapping("/cities")
	public String getCitys(Model model) {
		List<City> citys = cityService.getCitys();
		List<Family> families=familyService.getFamilys();
		model.addAttribute("cities", citys);	
		model.addAttribute("families",families);
		
		return "city/cities";
	}

	/**
	 * addCity
	 * @param city
	 * @return
	 */
	@PostMapping("/addcity")

	public String addCity(City city) {
		cityService.save(city);
		return "redirect:/cities";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/city/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		City city = cityService.findById(id).get();
		model.addAttribute("city", city);
		return "editActivities";
	}

	/**
	 * updateCity
	 * @param id
	 * @param city
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatecity/{id}")
	public String updateCity(@PathVariable("id") long id, @Validated City city, BindingResult result,
			Model model) {

		cityService.save(city);
		return "redirect:/cities";
	}

	/**
	 * deleteCity
	 * @param id
	 * @return
	 */
	@GetMapping("/deletecity/{id}")
	@Transactional
	public String deleteCity(@PathVariable("id") int id) {
		cityService.delete(id);
		return "redirect:/cities";
	}
}
