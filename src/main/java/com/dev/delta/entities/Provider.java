package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Admin
 *
 */
@Entity
public class Provider implements Serializable {

	private static final long serialVersionUID = 5425958403589355069L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
	private String name;
	private String address;
	@ManyToOne
	@JoinColumn(name = "vat_id")
	private VAT vat;
	private String phone;

	private String responsable;
	private String fax;

	public Provider() {
		// TODO Auto-generated constructor stub
	}

	public Provider(String code, String name, String address, VAT vat, String phone, String responsable, String fax) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.vat = vat;
		this.phone = phone;
		this.responsable = responsable;
		this.fax = fax;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public VAT getVat() {
		return vat;
	}

	public void setVat(VAT vat) {
		this.vat = vat;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

}
