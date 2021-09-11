package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "leaves")
public class Leave implements Serializable {

	
	private static final long serialVersionUID = 7062244464670450228L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String employee;
	String firstName;
	String lastName;
	String startDate;
	String endDate;
	String requestedDays;
	String remainingDays;
	String TypeLeave;

	public Leave() {
		// TODO Auto-generated constructor stub
	}

	public Leave(String code, String firstName, String lastName, String startDate, String endDate,
			String requestedDays, String remainingDays, String typeLeave) {
		super();
		this.employee = code;
		this.firstName = firstName;
		this.lastName = lastName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.requestedDays = requestedDays;
		this.remainingDays = remainingDays;
		TypeLeave = typeLeave;
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

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getRequestedDays() {
		return requestedDays;
	}

	public void setRequestedDays(String requestedDays) {
		this.requestedDays = requestedDays;
	}

	public String getRemainingDays() {
		return remainingDays;
	}

	public void setRemainingDays(String remainingDays) {
		this.remainingDays = remainingDays;
	}

	public String getTypeLeave() {
		return TypeLeave;
	}

	public void setTypeLeave(String typeLeave) {
		TypeLeave = typeLeave;
	}

}
