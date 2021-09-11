
package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PartOrder implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1077493635909532153L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	Part part;
	String Date;
	String quantity;
	String unit;
	
	public PartOrder() {
		// TODO Auto-generated constructor stub
	}

	public PartOrder(Part part, String date, String quantity, String unit) {
		super();
		this.part = part;
		Date = date;
		this.quantity = quantity;
		this.unit = unit;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Part getPart() {
		return part;
	}

	public void setPart(Part part) {
		this.part = part;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
	

}
