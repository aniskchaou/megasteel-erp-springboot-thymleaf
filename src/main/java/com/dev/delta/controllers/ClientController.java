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

import com.dev.delta.entities.Client;
import com.dev.delta.entities.VAT;
import com.dev.delta.services.ClientService;
import com.dev.delta.services.VATService;
@Controller
public class ClientController {
	/**
	 * clientService
	 */
	@Autowired
	private ClientService clientService;

	@Autowired
	private VATService vATService;
	

	/**
	 * getClients
	 * @param model
	 * @return
	 */
	@GetMapping("/clients")
	public String getClients(Model model) {
		List<Client> clients = clientService.getClients();
		List<VAT> vats=vATService.getVats();
		model.addAttribute("clients", clients);	
		model.addAttribute("vats", vats);
		return "client/clients";
	}

	/**
	 * addClient
	 * @param client
	 * @return
	 */
	@PostMapping("/addclient")

	public String addClient(Client client) {
		System.out.println(client.toString());
		clientService.save(client);
		return "redirect:/clients";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/client/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Client client = clientService.findById(id).get();
		model.addAttribute("client", client);
		return "editClient";
	}

	/**
	 * updateClient
	 * @param id
	 * @param client
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateclient/{id}")
	public String updateClient(@PathVariable("id") long id, @Validated Client client, BindingResult result,
			Model model) {

		clientService.save(client);
		return "redirect:/clients";
	}

	/**
	 * deleteClient
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteclient/{id}")
	@Transactional
	public String deleteClient(@PathVariable("id") int id) {
		clientService.delete(id);
		return "redirect:/clients";
	}
}
