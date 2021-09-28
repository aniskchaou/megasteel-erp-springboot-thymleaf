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

import com.dev.delta.entities.TypeDocument;
import com.dev.delta.entities.Family;
import com.dev.delta.services.TypeDocumentService;
import com.dev.delta.services.FamilyService;

@Controller
public class TypeDocumentController {

	/**
	 * typeDocumentService
	 */
	@Autowired
	private TypeDocumentService typeDocumentService;

	@Autowired
	private FamilyService familyService;

	/**
	 * getTypeDocuments
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/typedocuments")
	public String getTypeDocuments(Model model) {
		List<TypeDocument> typeDocuments = typeDocumentService.getTypeDocuments();
		List<Family> families = familyService.getFamilys();
		model.addAttribute("typedocuments", typeDocuments);
		model.addAttribute("families", families);

		return "type_document/type_documents";
	}

	/**
	 * addTypeDocument
	 * 
	 * @param typeDocument
	 * @return
	 */
	@PostMapping("/addtypedocument")

	public String addTypeDocument(TypeDocument typeDocument) {
		typeDocumentService.save(typeDocument);
		return "redirect:/typedocuments";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/typeDocument/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		TypeDocument typeDocument = typeDocumentService.findById(id).get();
		model.addAttribute("typeDocuments", typeDocument);
		return "editActivities";
	}

	/**
	 * updateTypeDocument
	 * 
	 * @param id
	 * @param typeDocument
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatetypeDocument/{id}")
	public String updateTypeDocument(@PathVariable("id") long id, @Validated TypeDocument typeDocument,
			BindingResult result, Model model) {

		typeDocumentService.save(typeDocument);
		return "redirect:/typedocuments";
	}

	/**
	 * deleteTypeDocument
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletetypedocument/{id}")
	@Transactional
	public String deleteTypeDocument(@PathVariable("id") Long id) {
		typeDocumentService.delete(id);
		return "redirect:/typedocuments";
	}
}
