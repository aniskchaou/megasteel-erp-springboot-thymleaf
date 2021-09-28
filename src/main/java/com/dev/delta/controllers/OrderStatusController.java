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

import com.dev.delta.entities.Family;
import com.dev.delta.entities.OrderState;
import com.dev.delta.services.OrderStatusService;
import com.dev.delta.services.FamilyService;

@Controller
public class OrderStatusController {

	/**
	 * orderStatusService
	 */
	@Autowired
	private OrderStatusService orderStatusService;

	@Autowired
	private FamilyService familyService;

	/**
	 * getOrderStatuss
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/orderstatus")
	public String getOrderStatuss(Model model) {
		List<OrderState> orderStatuss = orderStatusService.getOrderStates();
		List<Family> families = familyService.getFamilys();
		model.addAttribute("orderstatus", orderStatuss);
		model.addAttribute("families", families);

		return "order_status/order_status";
	}

	/**
	 * addOrderStatus
	 * 
	 * @param orderStatus
	 * @return
	 */
	@PostMapping("/addorderstatus")

	public String addOrderStatus(OrderState orderStatus) {
		orderStatusService.save(orderStatus);
		return "redirect:/orderstatus";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/orderStatus/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		OrderState orderStatus = orderStatusService.findById(id).get();
		model.addAttribute("orderStatus", orderStatus);
		return "editActivities";
	}

	/**
	 * updateOrderStatus
	 * 
	 * @param id
	 * @param orderStatus
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateorderStatus/{id}")
	public String updateOrderStatus(@PathVariable("id") long id, @Validated OrderState orderStatus,
			BindingResult result, Model model) {

		orderStatusService.save(orderStatus);
		return "redirect:/orderstatus";
	}

	/**
	 * deleteOrderStatus
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteorderStatus/{id}")
	@Transactional
	public String deleteOrderStatus(@PathVariable("id") Long id) {
		orderStatusService.delete(id);
		return "redirect:/orderstatus";
	}
}
