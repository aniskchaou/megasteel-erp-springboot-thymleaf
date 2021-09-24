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

import com.dev.delta.entities.ProductionEntryVoucher;
import com.dev.delta.services.ProductionEntryVoucherService;

@Controller
public class ProductionEntryVoucherController {
	/**
	 * productionEntryVoucherService
	 */
	@Autowired
	private ProductionEntryVoucherService productionEntryVoucherService;

	

	/**
	 * getProductionEntryVouchers
	 * @param model
	 * @return
	 */
	@GetMapping("/productionEntryVouchers")
	public String getProductionEntryVouchers(Model model) {
		List<ProductionEntryVoucher> productionEntryVouchers = productionEntryVoucherService.getProductionEntryVouchers();
		model.addAttribute("productionEntryVouchers", productionEntryVouchers);	
		return "productionEntryVouchers";
	}

	/**
	 * addProductionEntryVoucher
	 * @param productionEntryVoucher
	 * @return
	 */
	@PostMapping("/addproductionEntryVoucher")

	public String addProductionEntryVoucher(ProductionEntryVoucher productionEntryVoucher) {
		productionEntryVoucherService.save(productionEntryVoucher);
		return "redirect:/productionEntryVouchers";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/productionEntryVoucher/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		ProductionEntryVoucher productionEntryVoucher = productionEntryVoucherService.findById(id).get();
		model.addAttribute("productionEntryVoucher", productionEntryVoucher);
		return "editProductionEntryVoucher";
	}

	/**
	 * updateProductionEntryVoucher
	 * @param id
	 * @param productionEntryVoucher
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateproductionEntryVoucher/{id}")
	public String updateProductionEntryVoucher(@PathVariable("id") long id, @Validated ProductionEntryVoucher productionEntryVoucher, BindingResult result,
			Model model) {

		productionEntryVoucherService.save(productionEntryVoucher);
		return "redirect:/productionEntryVouchers";
	}

	/**
	 * deleteProductionEntryVoucher
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteproductionEntryVoucher/{id}")
	@Transactional
	public String deleteProductionEntryVoucher(@PathVariable("id") int id) {
		productionEntryVoucherService.delete(id);
		return "redirect:/productionEntryVouchers";
	}
}
