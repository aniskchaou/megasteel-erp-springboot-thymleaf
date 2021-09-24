package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notification implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5418669828625216897L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    String type;
	String name;
	String date;
	
	
	public Notification() {
		// TODO Auto-generated constructor stub
	}


	public Notification(String type, String name, String date) {
		super();
		this.type = type;
		this.name = name;
		this.date = date;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
