package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Contact implements Serializable {

	private static final long serialVersionUID = -3129893792842559949L;
	
	protected String firstName;
	protected String lastName;
	protected String code;
	protected String tva;
	protected String adresse;
	protected String telephone;
	protected String fax;
	protected String email;

	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Contact(String firstName, String lastName, String code, String tva, String adresse, String telephone,
			String fax, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.code = code;
		this.tva = tva;
		this.adresse = adresse;
		this.telephone = telephone;
		this.fax = fax;
		this.email = email;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTva() {
		return tva;
	}

	public void setTva(String tva) {
		this.tva = tva;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
