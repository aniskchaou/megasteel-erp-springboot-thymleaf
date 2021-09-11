package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Family implements Serializable {

	private static final long serialVersionUID = 347743496254679488L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String articleNumber;
	private String machineNumber;

	public Family() {
		// TODO Auto-generated constructor stub
	}

	public Family(String name, String articleNumber, String machineNumber) {
		super();
		this.name = name;
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
