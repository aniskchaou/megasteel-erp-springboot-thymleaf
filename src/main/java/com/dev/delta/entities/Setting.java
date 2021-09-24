package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Setting implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6488958945076070889L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	public Setting() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
