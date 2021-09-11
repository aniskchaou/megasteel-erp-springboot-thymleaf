package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Breakdown implements Serializable {

	
	private static final long serialVersionUID = -7939640966733089292L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;	
	String occurance;
	
	public Breakdown() {
		// TODO Auto-generated constructor stub
	}

	public Breakdown(String name, String occurance) {
		super();
		this.name = name;
		this.occurance = occurance;
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

	public String getOccurance() {
		return occurance;
	}

	public void setOccurance(String occurance) {
		this.occurance = occurance;
	}
	
	
	
	
}
