package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class CustomerContract extends Contract implements Serializable {

	
	private static final long serialVersionUID = -175335630601303215L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public CustomerContract(String company, String partner, String currency, String name, String activationDate,
			String endDate) {
		super(company, partner, currency, name, activationDate, endDate);
		// TODO Auto-generated constructor stub
	}

	
}
