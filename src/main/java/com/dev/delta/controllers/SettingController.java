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

import com.dev.delta.entities.Setting;
import com.dev.delta.entities.Family;
import com.dev.delta.services.SettingService;
import com.dev.delta.services.FamilyService;

@Controller
public class SettingController {

	/**
	 * settingService
	 */
	@Autowired
	private SettingService settingService;

	@Autowired
	private FamilyService familyService;
	

	/**
	 * getSettings
	 * @param model
	 * @return
	 */
	@GetMapping("/settings")
	public String getSettings(Model model) {
		List<Setting> settings = settingService.getSettings();
		List<Family> families=familyService.getFamilys();
		model.addAttribute("settings", settings);	
		model.addAttribute("families",families);
		
		return "setting/settings";
	}

	/**
	 * addSetting
	 * @param setting
	 * @return
	 */
	@PostMapping("/addsetting")

	public String addSetting(Setting setting) {
		settingService.save(setting);
		return "redirect:/settings";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/setting/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Setting setting = settingService.findById(id).get();
		model.addAttribute("setting", setting);
		return "editActivities";
	}

	/**
	 * updateSetting
	 * @param id
	 * @param setting
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatesetting/{id}")
	public String updateSetting(@PathVariable("id") long id, @Validated Setting setting, BindingResult result,
			Model model) {

		settingService.save(setting);
		return "redirect:/settings";
	}

	/**
	 * deleteSetting
	 * @param id
	 * @return
	 */
	@GetMapping("/deletesetting/{id}")
	@Transactional
	public String deleteSetting(@PathVariable("id") int id) {
		settingService.delete(id);
		return "redirect:/settings";
	}
}
