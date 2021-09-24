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

import com.dev.delta.entities.PurshaseOrder;
import com.dev.delta.services.PurshaseOrderService;

@Controller
public class PurshaseOrderController {
	/**
	 * purshaseOrderService
	 */
	@Autowired
	private PurshaseOrderService purshaseOrderService;

	

	/**
	 * getPurshaseOrders
	 * @param model
	 * @return
	 */
	@GetMapping("/purshaseorders")
	public String getPurshaseOrders(Model model) {
		List<PurshaseOrder> purshaseOrders = purshaseOrderService.getPurshaseOrders();
		model.addAttribute("purshaseOrders", purshaseOrders);	
		return "purshase_order/purshase_orders";
	}

	/**
	 * addPurshaseOrder
	 * @param purshaseOrder
	 * @return
	 */
	@PostMapping("/addpurshaseorder")

	public String addPurshaseOrder(PurshaseOrder purshaseOrder) {
		purshaseOrderService.save(purshaseOrder);
		return "redirect:/purshaseorders";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/purshaseorder/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		PurshaseOrder purshaseOrder = purshaseOrderService.findById(id).get();
		model.addAttribute("purshaseOrder", purshaseOrder);
		return "editPurshaseorder";
	}

	/**
	 * updatePurshaseOrder
	 * @param id
	 * @param purshaseOrder
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatepurshaseorder/{id}")
	public String updatePurshaseOrder(@PathVariable("id") long id, @Validated PurshaseOrder purshaseOrder, BindingResult result,
			Model model) {

		purshaseOrderService.save(purshaseOrder);
		return "redirect:/purshaseorders";
	}

	/**
	 * deletePurshaseOrder
	 * @param id
	 * @return
	 */
	@GetMapping("/deletepurshaseorder/{id}")
	@Transactional
	public String deletePurshaseOrder(@PathVariable("id") int id) {
		purshaseOrderService.delete(id);
		return "redirect:/purshaseorders";
	}

}
