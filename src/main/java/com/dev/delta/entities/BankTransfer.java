package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BankTransfer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String date;
	String paymentName;
	@ManyToOne
	@JoinColumn(name="payment_from_id")
	BankAccount paymentFrom;
	@ManyToOne
	@JoinColumn(name="payment_to_id")
	BankAccount paymentTo ;
	String amount;
	
	
	public BankTransfer() {
		// TODO Auto-generated constructor stub
	}


	public BankTransfer(String date, String paymentName, BankAccount paymentFrom, BankAccount paymentTo, String amount) {
		super();
		this.date = date;
		this.paymentName = paymentName;
		this.paymentFrom = paymentFrom;
		this.paymentTo = paymentTo;
		this.amount = amount;
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


	public String getPaymentName() {
		return paymentName;
	}


	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}


	public BankAccount getPaymentFrom() {
		return paymentFrom;
	}


	public void setPaymentFrom(BankAccount paymentFrom) {
		this.paymentFrom = paymentFrom;
	}


	public BankAccount getPaymentTo() {
		return paymentTo;
	}


	public void setPaymentTo(BankAccount paymentTo) {
		this.paymentTo = paymentTo;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
}
