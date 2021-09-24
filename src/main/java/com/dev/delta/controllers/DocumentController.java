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

import com.dev.delta.entities.Document;
import com.dev.delta.entities.Family;
import com.dev.delta.services.DocumentService;
import com.dev.delta.services.FamilyService;

@Controller
public class DocumentController {
	/**
	 * documentService
	 */
	@Autowired
	private DocumentService documentService;

	@Autowired
	private FamilyService familyService;
	

	/**
	 * getDocuments
	 * @param model
	 * @return
	 */
	@GetMapping("/documents")
	public String getDocuments(Model model) {
		List<Document> documents = documentService.getDocuments();
		List<Family> families=familyService.getFamilys();
		model.addAttribute("documents", documents);	
		model.addAttribute("families",families);
		
		return "document/documents";
	}

	/**
	 * addDocument
	 * @param document
	 * @return
	 */
	@PostMapping("/adddocument")

	public String addDocument(Document document) {
		documentService.save(document);
		return "redirect:/documents";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/document/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Document document = documentService.findById(id).get();
		model.addAttribute("document", document);
		return "editActivities";
	}

	/**
	 * updateDocument
	 * @param id
	 * @param document
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatedocument/{id}")
	public String updateDocument(@PathVariable("id") long id, @Validated Document document, BindingResult result,
			Model model) {

		documentService.save(document);
		return "redirect:/documents";
	}

	/**
	 * deleteDocument
	 * @param id
	 * @return
	 */
	@GetMapping("/deletedocument/{id}")
	@Transactional
	public String deleteDocument(@PathVariable("id") int id) {
		documentService.delete(id);
		return "redirect:/documents";
	}
}
