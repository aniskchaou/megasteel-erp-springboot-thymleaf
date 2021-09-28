package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class JobApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	String jobTitle;
	@ManyToOne
	@JoinColumn(name = "country_id")
	Country country;

	@ManyToOne
	@JoinColumn(name = "city_id")
	City city;

	@ManyToOne
	@JoinColumn(name = "departement_id")
	Departement department;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	Employee responsible;

	String nbPeopleHired;

	String email;

	public JobApplication() {
		// TODO Auto-generated constructor stub
	}

	public JobApplication(String jobTitle, Country country, City city, Departement department, Employee responsible,
			String nbPeopleHired, String email) {
		super();
		this.jobTitle = jobTitle;
		this.country = country;
		this.city = city;
		this.department = department;
		this.responsible = responsible;
		this.nbPeopleHired = nbPeopleHired;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Departement getDepartment() {
		return department;
	}

	public void setDepartment(Departement department) {
		this.department = department;
	}

	public Employee getResponsible() {
		return responsible;
	}

	public void setResponsible(Employee responsible) {
		this.responsible = responsible;
	}

	public String getNbPeopleHired() {
		return nbPeopleHired;
	}

	public void setNbPeopleHired(String nbPeopleHired) {
		this.nbPeopleHired = nbPeopleHired;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
