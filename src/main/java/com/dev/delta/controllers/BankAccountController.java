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
import com.dev.delta.entities.Family;
import com.dev.delta.services.BankAccountService;
import com.dev.delta.services.FamilyService;

@Controller
public class BankAccountController {

	/**
	 * bankAccountService
	 */
	@Autowired
	private BankAccountService bankAccountService;

	@Autowired
	private FamilyService familyService;
	

	/**
	 * getBankAccounts
	 * @param model
	 * @return
	 */
	@GetMapping("/bankaccounts")
	public String getBankAccounts(Model model) {
		List<BankAccount> bankAccounts = bankAccountService.getBankAccounts();
		List<Family> families=familyService.getFamilys();
		model.addAttribute("bankAccounts", bankAccounts);	
		model.addAttribute("families",families);
		
		return "bank_account/bank_accounts";
	}

	/**
	 * addBankAccount
	 * @param bankAccount
	 * @return
	 */
	@PostMapping("/addbankaccount")

	public String addBankAccount(BankAccount bankAccount) {
		bankAccountService.save(bankAccount);
		return "redirect:/bankaccounts";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/bankAccount/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		BankAccount bankAccount = bankAccountService.findById(id).get();
		model.addAttribute("bankAccount", bankAccount);
		return "editActivities";
	}

	/**
	 * updateBankAccount
	 * @param id
	 * @param bankAccount
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatebankAccount/{id}")
	public String updateBankAccount(@PathVariable("id") long id, @Validated BankAccount bankAccount, BindingResult result,
			Model model) {

		bankAccountService.save(bankAccount);
		return "redirect:/bankaccounts";
	}

	/**
	 * deleteBankAccount
	 * @param id
	 * @return
	 */
	@GetMapping("/deletebankAccount/{id}")
	@Transactional
	public String deleteBankAccount(@PathVariable("id") int id) {
		bankAccountService.delete(id);
		return "redirect:/bankaccounts";
	}
}
