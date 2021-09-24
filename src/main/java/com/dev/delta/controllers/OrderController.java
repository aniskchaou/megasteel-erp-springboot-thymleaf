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

import com.dev.delta.entities.Order;
import com.dev.delta.services.OrderService;

@Controller
public class OrderController {

	/**
	 * orderService
	 */
	@Autowired
	private OrderService orderService;

	

	/**
	 * getOrders
	 * @param model
	 * @return
	 */
	@GetMapping("/orders")
	public String getOrders(Model model) {
		List<Order> orders = orderService.getOrders();
		model.addAttribute("orders", orders);	
		return "order/orders";
	}

	/**
	 * addOrder
	 * @param order
	 * @return
	 */
	@PostMapping("/addorder")

	public String addOrder(Order order) {
		orderService.save(order);
		return "redirect:/orders";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/order/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Order order = orderService.findById(id).get();
		model.addAttribute("order", order);
		return "editOrder";
	}

	/**
	 * updateOrder
	 * @param id
	 * @param order
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateorder/{id}")
	public String updateOrder(@PathVariable("id") long id, @Validated Order order, BindingResult result,
			Model model) {

		orderService.save(order);
		return "redirect:/orders";
	}

	/**
	 * deleteOrder
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteorder/{id}")
	@Transactional
	public String deleteOrder(@PathVariable("id") int id) {
		orderService.delete(id);
		return "redirect:/orders";
	}
}
