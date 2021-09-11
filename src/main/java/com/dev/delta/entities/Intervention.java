package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Intervention implements Serializable {

	private static final long serialVersionUID = 3699493582958529929L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String reference;
	String date;
	String cost;
	String duration;
	String state;
	Machine machine;

	public Machine getMachine() {
		return machine;
	}

	public void setMachine(Machine machine) {
		this.machine = machine;
	}

	public Intervention() {
		// TODO Auto-generated constructor stub
	}

	public Intervention(Long id, String reference, String date, String cost, String duration, String state,
			Machine machine) {
		super();
		this.id = id;
		this.reference = reference;
		this.date = date;
		this.cost = cost;
		this.duration = duration;
		this.state = state;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
