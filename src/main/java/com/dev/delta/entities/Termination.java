package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Termination implements Serializable {

	
	private static final long serialVersionUID = -3947162495320645969L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@ManyToOne
	@JoinColumn(name="employee_id")
	Employee employee;
	String firstName;
	String lastName;
	String date;
	@ManyToOne
	@JoinColumn(name="type_termination")
	TypeTermination cause;

	public Termination() {
		// TODO Auto-generated constructor stub
	}

	public Termination(Employee employee, String firstName, String lastName, String date, 
			TypeTermination cause) {
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
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

	public TypeTermination getCause() {
		return cause;
	}

	public void setCause(TypeTermination cause) {
		this.cause = cause;
	}

}
