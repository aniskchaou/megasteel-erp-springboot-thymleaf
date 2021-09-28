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

import com.dev.delta.entities.PurshaseEntryVoucher;
import com.dev.delta.services.PurshaseEntryVoucherService;

@Controller
public class PurshaseEntryVoucherController {
	/**
	 * purshaseEntryVoucherService
	 */
	@Autowired
	private PurshaseEntryVoucherService purshaseEntryVoucherService;

	/**
	 * getPurshaseEntryVouchers
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/purshaseentryvouchers")
	public String getPurshaseEntryVouchers(Model model) {
		List<PurshaseEntryVoucher> purshaseEntryVouchers = purshaseEntryVoucherService.getPurshaseEntryVouchers();
		model.addAttribute("purshaseEntryVouchers", purshaseEntryVouchers);
		return "purshase_entry/purshase_entry_vouchers";
	}

	/**
	 * addPurshaseEntryVoucher
	 * 
	 * @param purshaseEntryVoucher
	 * @return
	 */
	@PostMapping("/addpurshaseEntryVoucher")

	public String addPurshaseEntryVoucher(PurshaseEntryVoucher purshaseEntryVoucher) {
		purshaseEntryVoucherService.save(purshaseEntryVoucher);
		return "redirect:/purshaseEntryVouchers";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/purshaseEntryVoucher/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		PurshaseEntryVoucher purshaseEntryVoucher = purshaseEntryVoucherService.findById(id).get();
		model.addAttribute("purshaseEntryVoucher", purshaseEntryVoucher);
		return "editPurshaseEntryVoucher";
	}

	/**
	 * updatePurshaseEntryVoucher
	 * 
	 * @param id
	 * @param purshaseEntryVoucher
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatepurshaseEntryVoucher/{id}")
	public String updatePurshaseEntryVoucher(@PathVariable("id") long id,
			@Validated PurshaseEntryVoucher purshaseEntryVoucher, BindingResult result, Model model) {

		purshaseEntryVoucherService.save(purshaseEntryVoucher);
		return "redirect:/purshaseEntryVouchers";
	}

	/**
	 * deletePurshaseEntryVoucher
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletepurshaseentryvoucher/{id}")
	@Transactional
	public String deletePurshaseEntryVoucher(@PathVariable("id") Long id) {
		purshaseEntryVoucherService.delete(id);
		return "redirect:/purshaseEntryVouchers";
	}

}
