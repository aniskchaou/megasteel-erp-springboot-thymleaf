package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Document {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	@ManyToOne
	@JoinColumn(name="type_document_id")
	TypeDocument type;
	
	public Document() {
		// TODO Auto-generated constructor stub
	}

	public Document(String name, TypeDocument type) {
		super();
		this.name = name;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeDocument getType() {
		return type;
	}

	public void setType(TypeDocument type) {
		this.type = type;
	}
	
	
}
