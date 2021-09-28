package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class JobApplicant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String lastName;
	String FirstName;
	String EmailFixed;
	String phoneMobile;
	String phoneApplied;

	String jobStatus;

	public JobApplicant() {
		// TODO Auto-generated constructor stub
	}

	public JobApplicant(String lastName, String firstName, String emailFixed, String phoneMobile, String phoneApplied,
			String jobStatus) {
		super();
		this.lastName = lastName;
		FirstName = firstName;
		EmailFixed = emailFixed;
		this.phoneMobile = phoneMobile;
		this.phoneApplied = phoneApplied;
		this.jobStatus = jobStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getEmailFixed() {
		return EmailFixed;
	}

	public void setEmailFixed(String emailFixed) {
		EmailFixed = emailFixed;
	}

	public String getPhoneMobile() {
		return phoneMobile;
	}

	public void setPhoneMobile(String phoneMobile) {
		this.phoneMobile = phoneMobile;
	}

	public String getPhoneApplied() {
		return phoneApplied;
	}

	public void setPhoneApplied(String phoneApplied) {
		this.phoneApplied = phoneApplied;
	}

	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

}
