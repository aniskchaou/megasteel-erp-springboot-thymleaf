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
	@ManyToOne
	@JoinColumn(name = "employee_id")
	Employee employee;
	String firstName;
	String lastName;
	String startDate;
	String endDate;
	String requestedDays;
	String remainingDays;
	@ManyToOne
	@JoinColumn(name = "type_leave_id")
	TypeLeave TypeLeave;

	public Leave() {
		// TODO Auto-generated constructor stub
	}

	public Leave(Employee code, String firstName, String lastName, String startDate, String endDate,
			String requestedDays, String remainingDays, TypeLeave typeLeave) {
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

	public TypeLeave getTypeLeave() {
		return TypeLeave;
	}

	public void setTypeLeave(TypeLeave typeLeave) {
		TypeLeave = typeLeave;
	}

}
