package com.dev.delta.entities;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String code;
	String firstName;
	String lastName;
	String dateBirth;
	String address;
	String dateRecuitement;
	String job;
	String children;

	
	
	

	public Employee(String code, String firstName, String lastName, String dateBirth, String address,
			String dateRecuitement, String job, String children) {
		super();
		this.code = code;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateBirth = dateBirth;
		this.address = address;
		this.dateRecuitement = dateRecuitement;
		this.job = job;
		this.children = children;
	}

	

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateRecuitement() {
		return dateRecuitement;
	}

	public void setDateRecuitement(String dateRecuitement) {
		this.dateRecuitement = dateRecuitement;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getChildren() {
		return children;
	}

	public void setChildren(String children) {
		this.children = children;
	}

}
