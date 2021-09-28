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

import com.dev.delta.entities.BankAccount;
import com.dev.delta.entities.BankTransfer;
import com.dev.delta.entities.Family;
import com.dev.delta.services.BankAccountService;
import com.dev.delta.services.BankTransferService;
import com.dev.delta.services.FamilyService;

@Controller
public class BankTransferController {

	/**
	 * bankTransferService
	 */
	@Autowired
	private BankTransferService bankTransferService;

	@Autowired
	private BankAccountService bankAccountService;

	/**
	 * getBankTransfers
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/banktransfers")
	public String getBankTransfers(Model model) {
		List<BankTransfer> bankTransfers = bankTransferService.getBankTransfers();
		List<BankAccount> bankAccounts = bankAccountService.getBankAccounts();
		model.addAttribute("banktransfers", bankTransfers);
		model.addAttribute("bankAccounts", bankAccounts);

		return "bank_transfer/bank_transfers";
	}

	/**
	 * addBankTransfer
	 * 
	 * @param bankTransfer
	 * @return
	 */
	@PostMapping("/addbanktransfer")

	public String addBankTransfer(BankTransfer bankTransfer) {
		bankTransferService.save(bankTransfer);
		return "redirect:/banktransfers";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/bankTransfer/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		BankTransfer bankTransfer = bankTransferService.findById(id).get();
		model.addAttribute("bankTransfer", bankTransfer);
		return "editActivities";
	}

	/**
	 * updateBankTransfer
	 * 
	 * @param id
	 * @param bankTransfer
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatebanktransfer/{id}")
	public String updateBankTransfer(@PathVariable("id") long id, @Validated BankTransfer bankTransfer,
			BindingResult result, Model model) {

		bankTransferService.save(bankTransfer);
		return "redirect:/banktransfers";
	}

	/**
	 * deleteBankTransfer
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletebanktransfer/{id}")
	@Transactional
	public String deleteBankTransfer(@PathVariable("id") Long id) {
		bankTransferService.delete(id);
		return "redirect:/banktransfers";
	}
}
