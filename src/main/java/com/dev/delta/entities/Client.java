package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Client implements Serializable {

	
	private static final long serialVersionUID = -148902353718836564L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	protected String firstName;
	protected String lastName;
	protected String code;
	protected String tva;
	protected String adresse;
	protected String telephone;
	protected String fax;
	protected String email;

	
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

	@Override
	public String toString() {
		return "Client [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getCode()="
				+ getCode() + ", getTva()=" + getTva() + ", getAdresse()=" + getAdresse() + ", getTelephone()="
				+ getTelephone() + ", getFax()=" + getFax() + ", getEmail()=" + getEmail() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
