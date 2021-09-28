package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProviderContract {

	private static final long serialVersionUID = 3642847517267695020L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String partner;
	private String currency;
	private String name;
	private String activationDate;
	private String endDate;

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

	public ProviderContract() {
		// TODO Auto-generated constructor stub
	}

	public ProviderContract(String partner, String currency, String name, String activationDate, String endDate) {
		super();
		this.partner = partner;
		this.currency = currency;
		this.name = name;
		this.activationDate = activationDate;
		this.endDate = endDate;
	}

}
