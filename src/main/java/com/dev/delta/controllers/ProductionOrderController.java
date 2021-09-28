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

import com.dev.delta.entities.Article;
import com.dev.delta.entities.Family;
import com.dev.delta.entities.Machine;
import com.dev.delta.entities.ProductionOrder;
import com.dev.delta.services.ArticleService;
import com.dev.delta.services.FamilyService;
import com.dev.delta.services.MachineService;
import com.dev.delta.services.ProductionOrderService;

@Controller
public class ProductionOrderController {

	/**
	 * productionOrderService
	 */
	@Autowired
	private ProductionOrderService productionOrderService;

	@Autowired
	private ArticleService articleService;

	@Autowired
	private MachineService machineService;

	/**
	 * getProductionOrders
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/productionorders")
	public String getProductionOrders(Model model) {
		List<ProductionOrder> productionOrders = productionOrderService.getProductionOrders();
		List<Machine> machines = machineService.getMachines();
		List<Article> articles = articleService.getArticles();
		model.addAttribute("productionOrders", productionOrders);
		model.addAttribute("machines", machines);
		model.addAttribute("articles", articles);

		return "production_order/production_orders";
	}

	/**
	 * addProductionOrder
	 * 
	 * @param productionOrder
	 * @return
	 */
	@PostMapping("/addproductionorder")

	public String addProductionOrder(ProductionOrder productionOrder) {
		productionOrderService.save(productionOrder);
		return "redirect:/productionorders";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/productionOrder/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		ProductionOrder productionOrder = productionOrderService.findById(id).get();
		model.addAttribute("productionOrder", productionOrder);
		return "editActivities";
	}

	/**
	 * updateProductionOrder
	 * 
	 * @param id
	 * @param productionOrder
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateproductionOrder/{id}")
	public String updateProductionOrder(@PathVariable("id") long id, @Validated ProductionOrder productionOrder,
			BindingResult result, Model model) {

		productionOrderService.save(productionOrder);
		return "redirect:/productionorders";
	}

	/**
	 * deleteProductionOrder
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteproductionorder/{id}")
	@Transactional
	public String deleteProductionOrder(@PathVariable("id") Long id) {
		productionOrderService.delete(id);
		return "redirect:/productionorders";
	}
}
