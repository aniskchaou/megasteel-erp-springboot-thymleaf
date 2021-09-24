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

import com.dev.delta.entities.Part;
import com.dev.delta.entities.PartOrder;
import com.dev.delta.services.PartOrderService;
import com.dev.delta.services.PartService;

@Controller
public class PartOrderController {
	/**
	 * partOrderService
	 */
	@Autowired
	private PartOrderService partOrderService;

	@Autowired
	private PartService partService;
	

	/**
	 * getPartOrders
	 * @param model
	 * @return
	 */
	@GetMapping("/partorders")
	public String getPartOrders(Model model) {
		List<PartOrder> partOrders = partOrderService.getPartOrders();
		List<Part> parts = partService.getParts();
		model.addAttribute("partOrders", partOrders);	
		model.addAttribute("parts", parts);	
		return "part_order/part_orders";
	}

	/**
	 * addPartOrder
	 * @param partOrder
	 * @return
	 */
	@PostMapping("/addpartorder")

	public String addPartOrder(PartOrder partOrder) {
		partOrderService.save(partOrder);
		return "redirect:/partorders";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/partOrder/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		PartOrder partOrder = partOrderService.findById(id).get();
		model.addAttribute("partOrder", partOrder);
		return "editPartOrder";
	}

	/**
	 * updatePartOrder
	 * @param id
	 * @param partOrder
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatepartorder/{id}")
	public String updatePartOrder(@PathVariable("id") long id, @Validated PartOrder partOrder, BindingResult result,
			Model model) {

		partOrderService.save(partOrder);
		return "redirect:/partorders";
	}

	/**
	 * deletePartOrder
	 * @param id
	 * @return
	 */
	@GetMapping("/deletepartorder/{id}")
	@Transactional
	public String deletePartOrder(@PathVariable("id") int id) {
		partOrderService.delete(id);
		return "redirect:/partorders";
	}
}
