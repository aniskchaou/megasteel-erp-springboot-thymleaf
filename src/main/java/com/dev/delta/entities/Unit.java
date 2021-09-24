package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Unit implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -650987126632857849L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	String desription;

	public Unit() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Unit(String name, String desription) {
		super();
		this.name = name;
		this.desription = desription;
	}



	public String getDesription() {
		return desription;
	}

	public void setDesription(String desription) {
		this.desription = desription;
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


}
