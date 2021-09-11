package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Termination implements Serializable {

	
	private static final long serialVersionUID = -3947162495320645969L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String employee;
	String firstName;
	String lastName;
	String date;
	String cause;

	public Termination() {
		// TODO Auto-generated constructor stub
	}

	public Termination(String employee, String firstName, String lastName, String date, String cause) {
		super();
		this.employee = employee;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.cause = cause;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

}
