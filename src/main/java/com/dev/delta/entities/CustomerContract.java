package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerContract implements Serializable {

	private static final long serialVersionUID = -175335630601303215L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String Company;
	String partner;
	String currency;
	String name;
	String activationDate;
	String endDate;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CustomerContract() {
		super();
	}

	public CustomerContract(String company, String partner, String currency, String name, String activationDate,
			String endDate) {
		super();
		Company = company;
		this.partner = partner;
		this.currency = currency;
		this.name = name;
		this.activationDate = activationDate;
		this.endDate = endDate;
	}

}
