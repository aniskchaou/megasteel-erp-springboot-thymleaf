package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Article;
import com.dev.delta.entities.Unit;
import com.dev.delta.repositories.ArticleRepository;

@Service
public class ArticleDBService implements IDBService {

	@Autowired
	ArticleRepository articleRepository;
	
	@Override
	public void populate() {
		article.setCode("3E23E");
	    article.setDimension("9x9");  
	    article.setHeight("9");
	    article.setUnity(unit);
	    article.setWeight("56");
	    article.setWidth("23");
	   
	    articleRepository.save(article);
		
	}

	
}
