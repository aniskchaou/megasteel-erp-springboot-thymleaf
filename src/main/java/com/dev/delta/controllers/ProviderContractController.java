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
import com.dev.delta.entities.ProviderContract;
import com.dev.delta.services.ProviderContractService;
import com.dev.delta.services.ProviderService;

@Controller
public class ProviderContractController {

	/**
	 * providerContractrService
	 */
	@Autowired
	private ProviderContractService providerContractService;

	/**
	 * getProviders
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/providercontracts")
	public String getProviders(Model model) {
		List<ProviderContract> providerContractrs = providerContractService.getProviderContracts();
		model.addAttribute("providerContracts", providerContractrs);
		return "provider_contract/provider_contracts";
	}

	/**
	 * addProvider
	 * 
	 * @param providerContractr
	 * @return
	 */
	@PostMapping("/addprovidercontract")

	public String addProvider(ProviderContract providerContractr) {
		providerContractService.save(providerContractr);
		return "redirect:/providercontracts";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/providerContract/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		ProviderContract providerContractr = providerContractService.findById(id).get();
		model.addAttribute("providerontract", providerContractr);
		return "editProvider";
	}

	/**
	 * updateProvider
	 * 
	 * @param id
	 * @param providerContractr
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateprovidercontract/{id}")
	public String updateProvider(@PathVariable("id") long id, @Validated ProviderContract providerContractr,
			BindingResult result, Model model) {

		providerContractService.save(providerContractr);
		return "redirect:/providercontracts";
	}

	/**
	 * deleteProvider
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteprovidercontract/{id}")
	@Transactional
	public String deleteProvider(@PathVariable("id") Long id) {
		providerContractService.delete(id);
		return "redirect:/providercontracts";
	}
}
