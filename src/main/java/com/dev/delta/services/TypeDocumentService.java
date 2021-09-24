package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.TypeDocument;
import com.dev.delta.repositories.TypeDocumentRepository;

@Service
public class TypeDocumentService {
	/**
	 * typeDocumentRepository
	 */
	@Autowired
	private TypeDocumentRepository typeDocumentRepository;
	

	/**
	 * getTypeDocuments
	 * @return
	 */
	public List<TypeDocument> getTypeDocuments()
	{
		return typeDocumentRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return typeDocumentRepository.count();
	}

	/**
	 * save
	 * @param typeDocument
	 */
	public void save(TypeDocument typeDocument)
	{
		typeDocumentRepository.save(typeDocument);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<TypeDocument> findById(int id) {
		return typeDocumentRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		typeDocumentRepository.delete(typeDocumentRepository.findById(id).get());
	}
}
