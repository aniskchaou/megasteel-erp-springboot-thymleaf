package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Article;
import com.dev.delta.repositories.ArticleRepository;

@Service
public class ArticleService {

	/**
	 * articleRepository
	 */
	@Autowired
	private ArticleRepository articleRepository;
	

	/**
	 * getArticles
	 * @return
	 */
	public List<Article> getArticles()
	{
		return articleRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return articleRepository.count();
	}

	/**
	 * save
	 * @param article
	 */
	public void save(Article article)
	{
		articleRepository.save(article);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Article> findById(int id) {
		return articleRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(long id) {
		articleRepository.delete(articleRepository.findById(id).get());
	}
}
