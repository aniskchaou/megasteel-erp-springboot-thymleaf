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

import com.dev.delta.entities.Country;
import com.dev.delta.entities.Family;
import com.dev.delta.services.CountryService;
import com.dev.delta.services.FamilyService;

@Controller
public class CountryController {
	/**
	 * countryService
	 */
	@Autowired
	private CountryService countryService;

	@Autowired
	private FamilyService familyService;
	

	/**
	 * getCountrys
	 * @param model
	 * @return
	 */
	@GetMapping("/countries")
	public String getCountrys(Model model) {
		List<Country> countrys = countryService.getCountrys();
		List<Family> families=familyService.getFamilys();
		model.addAttribute("countries", countrys);	
		model.addAttribute("families",families);
		
		return "country/countries";
	}

	/**
	 * addCountry
	 * @param country
	 * @return
	 */
	@PostMapping("/addcountry")

	public String addCountry(Country country) {
		countryService.save(country);
		return "redirect:/countries";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/country/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Country country = countryService.findById(id).get();
		model.addAttribute("country", country);
		return "editActivities";
	}

	/**
	 * updateCountry
	 * @param id
	 * @param country
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatecountry/{id}")
	public String updateCountry(@PathVariable("id") long id, @Validated Country country, BindingResult result,
			Model model) {

		countryService.save(country);
		return "redirect:/countries";
	}

	/**
	 * deleteCountry
	 * @param id
	 * @return
	 */
	@GetMapping("/deletecountry/{id}")
	@Transactional
	public String deleteCountry(@PathVariable("id") int id) {
		countryService.delete(id);
		return "redirect:/countries";
	}
}
