package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

	Optional<Article> findById(int id);

}
