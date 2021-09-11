package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PaySlip implements Serializable {

	private static final long serialVersionUID = 4435248681448370014L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@ManyToOne
	Employee employee;
	String firstName;
	String lastName;
	String workedHours;
	String leaves;
	String attendanceBonus;
	String grossSalary;
	String delayHours;

	public PaySlip() {
		// TODO Auto-generated constructor stub
	}

	public PaySlip(Employee employee, String firstName, String lastName, String workedHours, String leave,
			String attendanceBonus, String grossSalary, String delayHours) {
		super();
		this.employee = employee;
		this.firstName = firstName;
		this.lastName = lastName;
		this.workedHours = workedHours;
		this.leaves = leave;
		this.attendanceBonus = attendanceBonus;
		this.grossSalary = grossSalary;
		this.delayHours = delayHours;
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

	public String getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(String workedHours) {
		this.workedHours = workedHours;
	}

	public String getLeave() {
		return leaves;
	}

	public void setLeave(String leave) {
		this.leaves = leave;
	}

	public String getAttendanceBonus() {
		return attendanceBonus;
	}

	public void setAttendanceBonus(String attendanceBonus) {
		this.attendanceBonus = attendanceBonus;
	}

	public String getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(String grossSalary) {
		this.grossSalary = grossSalary;
	}

	public String getDelayHours() {
		return delayHours;
	}

	public void setDelayHours(String delayHours) {
		this.delayHours = delayHours;
	}

}
