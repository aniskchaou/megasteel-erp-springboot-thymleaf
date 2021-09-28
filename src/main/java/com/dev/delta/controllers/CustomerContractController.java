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

import com.dev.delta.entities.CustomerContract;
import com.dev.delta.services.CustomerContractService;

@Controller
public class CustomerContractController {
	/**
	 * customerContractService
	 */
	@Autowired
	private CustomerContractService customerContractService;

	/**
	 * getCustomerContracts
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/customercontracts")
	public String getCustomerContracts(Model model) {
		List<CustomerContract> customerContracts = customerContractService.getCustomerContracts();
		model.addAttribute("customerContracts", customerContracts);
		return "customer_contract/customer_contracts";
	}

	/**
	 * addCustomerContract
	 * 
	 * @param customerContract
	 * @return
	 */
	@PostMapping("/addcustomercontract")

	public String addCustomerContract(CustomerContract customerContract) {
		customerContractService.save(customerContract);
		return "redirect:/customercontracts";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/customerContract/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		CustomerContract customerContract = customerContractService.findById(id).get();
		model.addAttribute("customerContract", customerContract);
		return "editCustomerContract";
	}

	/**
	 * updateCustomerContract
	 * 
	 * @param id
	 * @param customerContract
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatecustomerContract/{id}")
	public String updateCustomerContract(@PathVariable("id") long id, @Validated CustomerContract customerContract,
			BindingResult result, Model model) {

		customerContractService.save(customerContract);
		return "redirect:/customer_contracts";
	}

	/**
	 * deleteCustomerContract
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletecustomercontract/{id}")
	@Transactional
	public String deleteCustomerContract(@PathVariable("id") Long id) {
		customerContractService.delete(id);
		return "redirect:/customerContracts";
	}

}
