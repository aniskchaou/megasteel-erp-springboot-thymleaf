package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurshaseOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8733818744161809777L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String date;
	String applicant;
	String quantity;

	public PurshaseOrder() {
		// TODO Auto-generated constructor stub
	}

	public PurshaseOrder(String date, String applicant, String quantity) {
		super();
		this.date = date;
		this.applicant = applicant;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getApplicant() {
		return applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
