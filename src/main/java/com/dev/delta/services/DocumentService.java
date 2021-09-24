package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Document;
import com.dev.delta.repositories.DocumentRepository;

@Service
public class DocumentService {
	/**
	 * documentRepository
	 */
	@Autowired
	private DocumentRepository documentRepository;
	

	/**
	 * getDocuments
	 * @return
	 */
	public List<Document> getDocuments()
	{
		return documentRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return documentRepository.count();
	}

	/**
	 * save
	 * @param document
	 */
	public void save(Document document)
	{
		documentRepository.save(document);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Document> findById(int id) {
		return documentRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		documentRepository.delete(documentRepository.findById(id).get());
	}
}
