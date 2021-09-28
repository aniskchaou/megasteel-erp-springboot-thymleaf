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

import com.dev.delta.entities.ProviderOrder;
import com.dev.delta.services.ProviderOrderService;

@Controller
public class ProviderOrderController {
	/**
	 * providerOrderService
	 */
	@Autowired
	private ProviderOrderService providerOrderService;

	/**
	 * getProviderOrders
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/providerorders")
	public String getProviderOrders(Model model) {
		List<ProviderOrder> providerOrders = providerOrderService.getProviderOrders();
		model.addAttribute("providerOrders", providerOrders);
		return "provider_order/provider_orders";
	}

	/**
	 * addProviderOrder
	 * 
	 * @param providerOrder
	 * @return
	 */
	@PostMapping("/addproviderorder")

	public String addProviderOrder(ProviderOrder providerOrder) {
		providerOrderService.save(providerOrder);
		return "redirect:/providerorders";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/providerorder/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		ProviderOrder providerOrder = providerOrderService.findById(id).get();
		model.addAttribute("providerOrder", providerOrder);
		return "editProviderOrder";
	}

	/**
	 * updateProviderOrder
	 * 
	 * @param id
	 * @param providerOrder
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateproviderorder/{id}")
	public String updateProviderOrder(@PathVariable("id") long id, @Validated ProviderOrder providerOrder,
			BindingResult result, Model model) {

		providerOrderService.save(providerOrder);
		return "redirect:/providerorders";
	}

	/**
	 * deleteProviderOrder
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteproviderorder/{id}")
	@Transactional
	public String deleteProviderOrder(@PathVariable("id") Long id) {
		providerOrderService.delete(id);
		return "redirect:/providerorders";
	}
}
