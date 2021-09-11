package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {

}
