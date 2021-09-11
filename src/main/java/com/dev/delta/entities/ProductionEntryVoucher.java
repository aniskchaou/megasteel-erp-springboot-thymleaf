package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductionEntryVoucher implements Serializable {


	private static final long serialVersionUID = -6422688175398528003L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
    private String codeProductionOrder;
    private String quantity;
    private String duration;
    private String date;
    private String unit;
    private String remaningQuantity;
    
    public ProductionEntryVoucher() {
		// TODO Auto-generated constructor stub
	}

	public ProductionEntryVoucher(String code, String codeProductionOrder, String quantity, String duration,
			String date, String unit, String remaningQuantity) {
		super();
		this.code = code;
		this.codeProductionOrder = codeProductionOrder;
		this.quantity = quantity;
		this.duration = duration;
		this.date = date;
		this.unit = unit;
		this.remaningQuantity = remaningQuantity;
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

	public String getCodeProductionOrder() {
		return codeProductionOrder;
	}

	public void setCodeProductionOrder(String codeProductionOrder) {
		this.codeProductionOrder = codeProductionOrder;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getRemaningQuantity() {
		return remaningQuantity;
	}

	public void setRemaningQuantity(String remaningQuantity) {
		this.remaningQuantity = remaningQuantity;
	}
    
    
}
