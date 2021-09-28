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

import com.dev.delta.entities.PaySlip;
import com.dev.delta.services.PaySlipService;

@Controller
public class PaySlipController {
	/**
	 * paySlipService
	 */
	@Autowired
	private PaySlipService paySlipService;

	/**
	 * getPaySlips
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/payslips")
	public String getPaySlips(Model model) {
		List<PaySlip> paySlips = paySlipService.getPaySlips();
		model.addAttribute("paySlips", paySlips);
		return "pay_slip/pay_slips";
	}

	/**
	 * addPaySlip
	 * 
	 * @param paySlip
	 * @return
	 */
	@PostMapping("/addpayslip")

	public String addPaySlip(PaySlip paySlip) {
		paySlipService.save(paySlip);
		return "redirect:/payslips";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/paySlip/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		PaySlip paySlip = paySlipService.findById(id).get();
		model.addAttribute("paySlip", paySlip);
		return "editPaySlip";
	}

	/**
	 * updatePaySlip
	 * 
	 * @param id
	 * @param paySlip
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatepaySlip/{id}")
	public String updatePaySlip(@PathVariable("id") long id, @Validated PaySlip paySlip, BindingResult result,
			Model model) {

		paySlipService.save(paySlip);
		return "redirect:/payslips";
	}

	/**
	 * deletePaySlip
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletepaylip/{id}")
	@Transactional
	public String deletePaySlip(@PathVariable("id") Long id) {
		paySlipService.delete(id);
		return "redirect:/payslips";
	}
}
