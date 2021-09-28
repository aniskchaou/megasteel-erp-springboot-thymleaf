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

import com.dev.delta.entities.ExternalProvider;
import com.dev.delta.services.ExternalProviderService;

@Controller
public class ExternalProviderController {
	/**
	 * externalProviderService
	 */
	@Autowired
	private ExternalProviderService externalProviderService;

	/**
	 * getExternalProviders
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/externalproviders")
	public String getExternalProviders(Model model) {
		List<ExternalProvider> externalProviders = externalProviderService.getExternalProviders();
		model.addAttribute("externalProviders", externalProviders);
		return "external_provider/external_providers";
	}

	/**
	 * addExternalProvider
	 * 
	 * @param externalProvider
	 * @return
	 */
	@PostMapping("/addexternalprovider")

	public String addExternalProvider(ExternalProvider externalProvider) {
		externalProviderService.save(externalProvider);
		return "redirect:/externalproviders";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/externalprovider/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		ExternalProvider externalProvider = externalProviderService.findById(id).get();
		model.addAttribute("externalProvider", externalProvider);
		return "editExternalProvider";
	}

	/**
	 * updateExternalProvider
	 * 
	 * @param id
	 * @param externalProvider
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateexternalprovider/{id}")
	public String updateExternalProvider(@PathVariable("id") long id, @Validated ExternalProvider externalProvider,
			BindingResult result, Model model) {

		externalProviderService.save(externalProvider);
		return "redirect:/externalproviders";
	}

	/**
	 * deleteExternalProvider
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteexternalprovider/{id}")
	@Transactional
	public String deleteExternalProvider(@PathVariable("id") Long id) {
		externalProviderService.delete(id);
		return "redirect:/externalproviders";
	}
}
