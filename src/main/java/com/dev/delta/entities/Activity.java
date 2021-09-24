package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Activity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5564433948511196602L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@ManyToOne
	@JoinColumn(name="family_in_id")
	private Family familyIn;
	@ManyToOne
	@JoinColumn(name="family_out_id")
	private Family familyOut;
	private String articleNumber;
	private String machineNumber;

	public Activity() {
	}

	public Activity(String name, Family familyIn, Family familyOut, String articleNumber, String machineNumber) {
		super();
		this.name = name;
		this.familyIn = familyIn;
		this.familyOut = familyOut;
		this.articleNumber = articleNumber;
		this.machineNumber = machineNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Family getFamilyIn() {
		return familyIn;
	}

	public void setFamilyIn(Family familyIn) {
		this.familyIn = familyIn;
	}

	public Family getFamilyOut() {
		return familyOut;
	}

	public void setFamilyOut(Family familyOut) {
		this.familyOut = familyOut;
	}

	public String getArticleNumber() {
		return articleNumber;
	}

	public void setArticleNumber(String articleNumber) {
		this.articleNumber = articleNumber;
	}

	public String getMachineNumber() {
		return machineNumber;
	}

	public void setMachineNumber(String machineNumber) {
		this.machineNumber = machineNumber;
	}

}
