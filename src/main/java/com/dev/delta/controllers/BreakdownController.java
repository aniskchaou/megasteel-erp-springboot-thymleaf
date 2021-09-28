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

import com.dev.delta.entities.Breakdown;
import com.dev.delta.services.BreakdownService;

@Controller
public class BreakdownController {

	/**
	 * breakdownService
	 */
	@Autowired
	private BreakdownService breakdownService;

	/**
	 * getBreakdowns
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/breakdowns")
	public String getBreakdowns(Model model) {
		List<Breakdown> breakdowns = breakdownService.getBreakDowns();
		model.addAttribute("breakdowns", breakdowns);
		return "breakdown/breakdowns";
	}

	/**
	 * addBreakdown
	 * 
	 * @param breakdown
	 * @return
	 */
	@PostMapping("/addbreakdown")

	public String addBreakdown(Breakdown breakdown) {
		breakdownService.save(breakdown);
		return "redirect:/breakdowns";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/breakdown/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Breakdown breakdown = breakdownService.findById(id).get();
		model.addAttribute("breakdown", breakdown);
		return "editBreakdown";
	}

	/**
	 * updateBreakdown
	 * 
	 * @param id
	 * @param breakdown
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatebreakdown/{id}")
	public String updateBreakdown(@PathVariable("id") long id, @Validated Breakdown breakdown, BindingResult result,
			Model model) {

		breakdownService.save(breakdown);
		return "redirect:/breakdowns";
	}

	/**
	 * deleteBreakdown
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletebreakdown/{id}")
	@Transactional
	public String deleteBreakdown(@PathVariable("id") Long id) {
		breakdownService.delete(id);
		return "redirect:/breakdowns";
	}

}
