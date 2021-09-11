package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class StorageArea implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6074168016757958946L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;

	public StorageArea() {
		// TODO Auto-generated constructor stub
	}

	public StorageArea(String name) {
		super();
		this.name = name;
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
