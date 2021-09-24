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

import com.dev.delta.entities.StorageArea;
import com.dev.delta.services.StorageAreaService;

@Controller
public class StorageAreaController  {
	/**
	 * storageAreaService
	 */
	@Autowired
	private StorageAreaService storageAreaService;

	

	/**
	 * getStorageAreas
	 * @param model
	 * @return
	 */
	@GetMapping("/storageareas")
	public String getStorageAreas(Model model) {
		List<StorageArea> storageAreas = storageAreaService.getStorageAreas();
		model.addAttribute("storageAreas", storageAreas);	
		return "storage_area/storage_areas";
	}

	/**
	 * addStorageArea
	 * @param storageArea
	 * @return
	 */
	@PostMapping("/addstoragearea")

	public String addStorageArea(StorageArea storageArea) {
		storageAreaService.save(storageArea);
		return "redirect:/storageareas";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/storagearea/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		StorageArea storageArea = storageAreaService.findById(id).get();
		model.addAttribute("storageArea", storageArea);
		return "editStoragearea";
	}

	/**
	 * updateStorageArea
	 * @param id
	 * @param storageArea
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatestoragearea/{id}")
	public String updateStorageArea(@PathVariable("id") long id, @Validated StorageArea storageArea, BindingResult result,
			Model model) {

		storageAreaService.save(storageArea);
		return "redirect:/storageareas";
	}

	/**
	 * deleteStorageArea
	 * @param id
	 * @return
	 */
	@GetMapping("/deletestoragearea/{id}")
	@Transactional
	public String deleteStorageArea(@PathVariable("id") int id) {
		storageAreaService.delete(id);
		return "redirect:/storageareas";
	}
	 
}
