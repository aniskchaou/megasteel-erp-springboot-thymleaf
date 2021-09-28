package com.dev.delta.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.entities.VAT;
import com.dev.delta.services.VATService;;

@Controller
public class VATController {
	/**
	 * vatService
	 */
	@Autowired
	private VATService vatService;

	/**
	 * getVats
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/vats")
	public String getVats(Model model) {
		List<VAT> vats = vatService.getVats();
		model.addAttribute("vats", vats);
		model.addAttribute("vat", new VAT());
		return "vat/vats";
	}

	/**
	 * addVat
	 * 
	 * @param vat
	 * @return
	 */
	@PostMapping("/addvat")

	public String addVat(VAT vat, BindingResult result, Model model) {

		vatService.save(vat);
		return "redirect:/vats";

	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/vat/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		VAT vat = vatService.findById(id).get();
		model.addAttribute("vat", vat);
		return "editVat";
	}

	/**
	 * updateVat
	 * 
	 * @param id
	 * @param vat
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatevat/{id}")
	public String updateVat(@PathVariable("id") long id, @Validated VAT vat, BindingResult result, Model model) {

		vatService.save(vat);
		return "redirect:/vats";
	}

	/**
	 * deleteVat
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletevat/{id}")
	@Transactional
	public String deleteVat(@PathVariable("id") Long id) {
		vatService.delete(id);
		return "redirect:/vats";
	}

}
