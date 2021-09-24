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

import com.dev.delta.entities.Training;
import com.dev.delta.entities.Family;
import com.dev.delta.services.TrainingService;
import com.dev.delta.services.FamilyService;

@Controller
public class TrainingController {

	/**
	 * trainingService
	 */
	@Autowired
	private TrainingService trainingService;

	@Autowired
	private FamilyService familyService;
	

	/**
	 * getTrainings
	 * @param model
	 * @return
	 */
	@GetMapping("/trainings")
	public String getTrainings(Model model) {
		List<Training> trainings = trainingService.getTrainings();
		List<Family> families=familyService.getFamilys();
		model.addAttribute("trainings", trainings);	
		model.addAttribute("families",families);
		
		return "training/trainings";
	}

	/**
	 * addTraining
	 * @param training
	 * @return
	 */
	@PostMapping("/addtraining")

	public String addTraining(Training training) {
		trainingService.save(training);
		return "redirect:/trainings";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/training/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Training training = trainingService.findById(id).get();
		model.addAttribute("training", training);
		return "editActivities";
	}

	/**
	 * updateTraining
	 * @param id
	 * @param training
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatetraining/{id}")
	public String updateTraining(@PathVariable("id") long id, @Validated Training training, BindingResult result,
			Model model) {

		trainingService.save(training);
		return "redirect:/trainings";
	}

	/**
	 * deleteTraining
	 * @param id
	 * @return
	 */
	@GetMapping("/deletetraining/{id}")
	@Transactional
	public String deleteTraining(@PathVariable("id") int id) {
		trainingService.delete(id);
		return "redirect:/trainings";
	}
}
