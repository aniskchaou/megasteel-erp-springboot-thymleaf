package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class VehiculeRent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@ManyToOne
	@JoinColumn(name="customer_id")
	Client Customer;
	@ManyToOne
	@JoinColumn(name="model_id")
	VehiculeModel Model;
	String plateNumber;
	String contractNumber;
	String rentStart;
	String rentEnd;
	String Mileage;
	
	public VehiculeRent() {
		// TODO Auto-generated constructor stub
	}



	public VehiculeRent(Client customer, VehiculeModel model, String plateNumber, String contractNumber,
			String rentStart, String rentEnd, String mileage) {
		super();
		Customer = customer;
		Model = model;
		this.plateNumber = plateNumber;
		this.contractNumber = contractNumber;
		this.rentStart = rentStart;
		this.rentEnd = rentEnd;
		Mileage = mileage;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getCustomer() {
		return Customer;
	}

	public void setCustomer(Client customer) {
		Customer = customer;
	}

	public VehiculeModel getModel() {
		return Model;
	}

	public void setModel(VehiculeModel model) {
		Model = model;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public String getRentStart() {
		return rentStart;
	}

	public void setRentStart(String rentStart) {
		this.rentStart = rentStart;
	}

	public String getRentEnd() {
		return rentEnd;
	}

	public void setRentEnd(String rentEnd) {
		this.rentEnd = rentEnd;
	}

	public String getMileage() {
		return Mileage;
	}

	public void setMileage(String mileage) {
		Mileage = mileage;
	}
	
	
	
}
