package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PreventiveMaintenance implements Serializable{

	
	private static final long serialVersionUID = 1362871185337709251L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String reference;
	String type;
	String duration;
	@ManyToOne
	@JoinColumn(name="machine_id")
	Machine machine;
	
	public PreventiveMaintenance() {
		// TODO Auto-generated constructor stub
	}

	

	public PreventiveMaintenance(String reference, String type, String duration, Machine machine) {
		super();
		this.reference = reference;
		this.type = type;
		this.duration = duration;
		this.machine = machine;
	}



	public Machine getMachine() {
		return machine;
	}



	public void setMachine(Machine machine) {
		this.machine = machine;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	


}
