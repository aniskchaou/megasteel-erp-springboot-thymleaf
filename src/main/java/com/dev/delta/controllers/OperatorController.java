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

import com.dev.delta.entities.Operator;
import com.dev.delta.services.OperatorService;

@Controller
public class OperatorController {
	/**
	 * operatorService
	 */
	@Autowired
	private OperatorService operatorService;

	/**
	 * getOperators
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/operators")
	public String getOperators(Model model) {
		List<Operator> operators = operatorService.getOperators();
		model.addAttribute("operators", operators);
		return "operator/operators";
	}

	/**
	 * addOperator
	 * 
	 * @param operator
	 * @return
	 */
	@PostMapping("/addoperator")

	public String addOperator(Operator operator) {
		operatorService.save(operator);
		return "redirect:/operators";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/operator/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Operator operator = operatorService.findById(id).get();
		model.addAttribute("operator", operator);
		return "editOperator";
	}

	/**
	 * updateOperator
	 * 
	 * @param id
	 * @param operator
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateoperator/{id}")
	public String updateOperator(@PathVariable("id") long id, @Validated Operator operator, BindingResult result,
			Model model) {

		operatorService.save(operator);
		return "redirect:/operators";
	}

	/**
	 * deleteOperator
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteoperator/{id}")
	@Transactional
	public String deleteOperator(@PathVariable("id") Long id) {
		operatorService.delete(id);
		return "redirect:/operators";
	}
}
