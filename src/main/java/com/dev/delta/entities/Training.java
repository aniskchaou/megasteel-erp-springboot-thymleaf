package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Training {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String Session;
	String fromDate;
	String toDate;
	@ManyToOne
	@JoinColumn(name = "employee_id")
	Employee employee;

	public Training() {
		// TODO Auto-generated constructor stub
	}

	public Training(String session, String fromDate, String toDate, Employee employee) {
		super();
		Session = session;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.employee = employee;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSession() {
		return Session;
	}

	public void setSession(String session) {
		Session = session;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
