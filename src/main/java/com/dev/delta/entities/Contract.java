package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Contract implements Serializable {
	

	private static final long serialVersionUID = -410981207128641518L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String Company;
	String partner;
	String currency;
	String name;
	String activationDate;
	String endDate;
	
	public Contract() {
		// TODO Auto-generated constructor stub
	}

	public Contract(String company, String partner, String currency, String name, String activationDate,
			String endDate) {
		super();
		Company = company;
		this.partner = partner;
		this.currency = currency;
		this.name = name;
		this.activationDate = activationDate;
		this.endDate = endDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(String activationDate) {
		this.activationDate = activationDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
}
