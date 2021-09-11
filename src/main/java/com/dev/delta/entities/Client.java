package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Client extends Contact implements Serializable {

	
	private static final long serialVersionUID = -148902353718836564L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(String firstName, String lastName, String code, String tva, String adresse, String telephone,
			String fax, String email) {
		super(firstName, lastName, code, tva, adresse, telephone, fax, email);
		// TODO Auto-generated constructor stub
	}

}
