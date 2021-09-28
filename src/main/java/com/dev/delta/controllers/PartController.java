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

import com.dev.delta.entities.Part;
import com.dev.delta.services.PartService;

@Controller
public class PartController {
	/**
	 * partService
	 */
	@Autowired
	private PartService partService;

	/**
	 * getParts
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/parts")
	public String getParts(Model model) {
		List<Part> parts = partService.getParts();
		model.addAttribute("parts", parts);
		return "part/parts";
	}

	/**
	 * addPart
	 * 
	 * @param part
	 * @return
	 */
	@PostMapping("/addpart")

	public String addPart(Part part) {
		partService.save(part);
		return "redirect:/parts";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/part/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Part part = partService.findById(id).get();
		model.addAttribute("part", part);
		return "editPart";
	}

	/**
	 * updatePart
	 * 
	 * @param id
	 * @param part
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatepart/{id}")
	public String updatePart(@PathVariable("id") long id, @Validated Part part, BindingResult result, Model model) {

		partService.save(part);
		return "redirect:/parts";
	}

	/**
	 * deletePart
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletepart/{id}")
	@Transactional
	public String deletePart(@PathVariable("id") Long id) {
		partService.delete(id);
		return "redirect:/parts";
	}
}
