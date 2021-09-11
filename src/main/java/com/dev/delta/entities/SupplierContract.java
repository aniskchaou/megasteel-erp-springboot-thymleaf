package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SupplierContract extends Contract {

	
	private static final long serialVersionUID = 3642847517267695020L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SupplierContract() {
		// TODO Auto-generated constructor stub
	}

	public SupplierContract(String company, String partner, String currency, String name, String activationDate,
			String endDate) {
		super(company, partner, currency, name, activationDate, endDate);
		// TODO Auto-generated constructor stub
	}
	
	

}
