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
import com.dev.delta.entities.Unit;
import com.dev.delta.services.ArticleService;
import com.dev.delta.services.UnitService;

@Controller
public class ArticleController {
	/**
	 * articleService
	 */
	@Autowired
	private ArticleService articleService;

	@Autowired
	private UnitService unitService;

	/**
	 * getArticles
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/articles")
	public String getArticles(Model model) {
		List<Article> articles = articleService.getArticles();
		List<Unit> units = unitService.getUnits();

		model.addAttribute("articles", articles);
		model.addAttribute("units", units);
		return "article/articles";
	}

	/**
	 * addArticle
	 * 
	 * @param article
	 * @return
	 */
	@PostMapping("/addarticle")

	public String addArticle(Article article) {
		articleService.save(article);
		return "redirect:/articles";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/article/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Article article = articleService.findById(id).get();
		model.addAttribute("article", article);
		return "editArticle";
	}

	/**
	 * updateArticle
	 * 
	 * @param id
	 * @param article
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatearticle/{id}")
	public String updateArticle(@PathVariable("id") long id, @Validated Article article, BindingResult result,
			Model model) {

		articleService.save(article);
		return "redirect:/articles";
	}

	/**
	 * deleteArticle
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletearticle/{id}")
	@Transactional
	public String deleteArticle(@PathVariable("id") Long id) {
		articleService.delete(id);
		return "redirect:/articles";
	}

}
