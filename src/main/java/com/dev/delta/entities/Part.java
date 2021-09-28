package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Part implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7550985641609794710L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String reference;
	String name;

	public Part() {
		// TODO Auto-generated constructor stub
	}

	public Part(String reference, String name) {
		super();
		this.reference = reference;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
