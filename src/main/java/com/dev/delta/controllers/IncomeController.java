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

import com.dev.delta.entities.Income;
import com.dev.delta.entities.Family;
import com.dev.delta.services.IncomeService;
import com.dev.delta.services.FamilyService;

@Controller
public class IncomeController {

	/**
	 * incomeService
	 */
	@Autowired
	private IncomeService incomeService;

	@Autowired
	private FamilyService familyService;

	/**
	 * getIncomes
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/incomes")
	public String getIncomes(Model model) {
		List<Income> incomes = incomeService.getIncomes();
		List<Family> families = familyService.getFamilys();
		model.addAttribute("incomes", incomes);
		model.addAttribute("families", families);

		return "income/incomes";
	}

	/**
	 * addIncome
	 * 
	 * @param income
	 * @return
	 */
	@PostMapping("/addincome")

	public String addIncome(Income income) {
		incomeService.save(income);
		return "redirect:/incomes";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/income/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Income income = incomeService.findById(id).get();
		model.addAttribute("income", income);
		return "editActivities";
	}

	/**
	 * updateIncome
	 * 
	 * @param id
	 * @param income
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateincome/{id}")
	public String updateIncome(@PathVariable("id") long id, @Validated Income income, BindingResult result,
			Model model) {

		incomeService.save(income);
		return "redirect:/incomes";
	}

	/**
	 * deleteIncome
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteincome/{id}")
	@Transactional
	public String deleteIncome(@PathVariable("id") Long id) {
		incomeService.delete(id);
		return "redirect:/incomes";
	}
}
