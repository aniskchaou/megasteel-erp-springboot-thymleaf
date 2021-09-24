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

import com.dev.delta.entities.Article;
import com.dev.delta.entities.Client;
import com.dev.delta.entities.DeliveryVoucher;
import com.dev.delta.entities.Family;
import com.dev.delta.services.ArticleService;
import com.dev.delta.services.ClientService;
import com.dev.delta.services.DeliveryVoucherService;
@Controller
public class DeliveryVoucherController{
	/**
	 * deliveryVoucherService
	 */
	@Autowired
	private DeliveryVoucherService deliveryVoucherService;

	@Autowired
	private ClientService clientService;
	
	@Autowired
	private ArticleService articleService;

	/**
	 * getDeliveryVouchers
	 * @param model
	 * @return
	 */
	@GetMapping("/deliveryvouchers")
	public String getDeliveryVouchers(Model model) {
		List<DeliveryVoucher> deliveryVouchers = deliveryVoucherService.getDeliveryVouchers();
		List<Client> clients=clientService.getClients();
		List<Article> articles=articleService.getArticles();
		model.addAttribute("deliveryVouchers", deliveryVouchers);	
		model.addAttribute("clients", clients);
		model.addAttribute("articles", articles);
		return "delivery_voucher/delivery_vouchers";
	}

	/**
	 * addDeliveryVoucher
	 * @param deliveryVoucher
	 * @return
	 */
	@PostMapping("/adddeliveryvoucher")

	public String addDeliveryVoucher(DeliveryVoucher deliveryVoucher) {
		deliveryVoucherService.save(deliveryVoucher);
		return "redirect:/deliveryvouchers";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/deliveryvoucher/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		DeliveryVoucher deliveryVoucher = deliveryVoucherService.findById(id).get();
		model.addAttribute("deliveryVoucher", deliveryVoucher);
		return "editDeliveryvoucher";
	}

	/**
	 * updateDeliveryVoucher
	 * @param id
	 * @param deliveryVoucher
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatedeliveryvoucher/{id}")
	public String updateDeliveryVoucher(@PathVariable("id") long id, @Validated DeliveryVoucher deliveryVoucher, BindingResult result,
			Model model) {

		deliveryVoucherService.save(deliveryVoucher);
		return "redirect:/deliveryvouchers";
	}

	/**
	 * deleteDeliveryVoucher
	 * @param id
	 * @return
	 */
	@GetMapping("/deletedeliveryvoucher/{id}")
	@Transactional
	public String deleteDeliveryVoucher(@PathVariable("id") int id) {
		deliveryVoucherService.delete(id);
		return "redirect:/deliveryvouchers";
	}
	
	
}
