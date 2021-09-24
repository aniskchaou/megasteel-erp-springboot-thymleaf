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

import com.dev.delta.data.TypeLEaveDBService;
import com.dev.delta.entities.TypeLeave;
import com.dev.delta.services.TypeLeaveService;

@Controller
public class TypeLeaveController {

	/**
	 * typeTypeLeaveService
	 */
	@Autowired
	private TypeLeaveService typeLeaveService;

	

	/**
	 * getTypeLeaves
	 * @param model
	 * @return
	 */
	@GetMapping("/typeleaves")
	public String getTypeLeaves(Model model) {
		List<TypeLeave> typeTypeLeaves = typeLeaveService.getTypeLeaves();
		model.addAttribute("typeLeaves", typeTypeLeaves);	
		return "typeleave/typeleaves";
	}

	/**
	 * addTypeLeave
	 * @param typeTypeLeave
	 * @return
	 */
	@PostMapping("/addtypeTypeLeave")

	public String addTypeLeave(TypeLeave typeTypeLeave) {
		typeLeaveService.save(typeTypeLeave);
		return "redirect:/typeleaves";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/typeTypeLeave/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		TypeLeave typeTypeLeave = typeLeaveService.findById(id).get();
		model.addAttribute("typeTypeLeave", typeTypeLeave);
		return "editTypeLeave";
	}

	/**
	 * updateTypeLeave
	 * @param id
	 * @param typeTypeLeave
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatetypeleave/{id}")
	public String updateTypeLeave(@PathVariable("id") long id, @Validated TypeLeave typeTypeLeave, BindingResult result,
			Model model) {

		typeLeaveService.save(typeTypeLeave);
		return "redirect:/typeTypeLeaves";
	}

	/**
	 * deleteTypeLeave
	 * @param id
	 * @return
	 */
	@GetMapping("/deletetypetypeleave/{id}")
	@Transactional
	public String deleteTypeLeave(@PathVariable("id") int id) {
		typeLeaveService.delete(id);
		return "redirect:/typeleaves";
	}
}
