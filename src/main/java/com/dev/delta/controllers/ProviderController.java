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

import com.dev.delta.entities.Provider;
import com.dev.delta.entities.VAT;
import com.dev.delta.services.ProviderService;
import com.dev.delta.services.VATService;

@Controller
public class ProviderController {
	/**
	 * providerService
	 */
	@Autowired
	private ProviderService providerService;

	@Autowired
	private VATService vatService;

	/**
	 * getProviders
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/providers")
	public String getProviders(Model model) {
		List<Provider> providers = providerService.getProviders();
		List<VAT> vats = vatService.getVats();
		model.addAttribute("vats", vats);
		model.addAttribute("providers", providers);
		return "provider/providers";
	}

	/**
	 * addProvider
	 * 
	 * @param provider
	 * @return
	 */
	@PostMapping("/addprovider")

	public String addProvider(Provider provider) {
		providerService.save(provider);
		return "redirect:/providers";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/provider/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Provider provider = providerService.findById(id).get();
		model.addAttribute("provider", provider);
		return "editProvider";
	}

	/**
	 * updateProvider
	 * 
	 * @param id
	 * @param provider
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateprovider/{id}")
	public String updateProvider(@PathVariable("id") long id, @Validated Provider provider, BindingResult result,
			Model model) {

		providerService.save(provider);
		return "redirect:/providers";
	}

	/**
	 * deleteProvider
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteprovider/{id}")
	@Transactional
	public String deleteProvider(@PathVariable("id") Long id) {
		providerService.delete(id);
		return "redirect:/providers";
	}
}
