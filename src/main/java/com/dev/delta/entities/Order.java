package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order implements Serializable {

	private static final long serialVersionUID = 6176907605898914351L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String orderNumber;
	private String dateCreation;
	private String dateLimit;
	private String state;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(String orderNumber, String dateCreation, String dateLimit, String state) {
		super();
		this.orderNumber = orderNumber;
		this.dateCreation = dateCreation;
		this.dateLimit = dateLimit;
		this.state = state;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getDateLimit() {
		return dateLimit;
	}

	public void setDateLimit(String dateLimit) {
		this.dateLimit = dateLimit;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
