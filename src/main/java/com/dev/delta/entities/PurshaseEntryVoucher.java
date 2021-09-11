package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurshaseEntryVoucher implements Serializable {

	
	private static final long serialVersionUID = 2820707866128952939L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Article article;
	private String date;
	private String quantity;
	private String unit;
	
	public PurshaseEntryVoucher() {
		// TODO Auto-generated constructor stub
	}

	public PurshaseEntryVoucher(Article article, String date, String quantity, String unit) {
		super();
		this.article = article;
		this.date = date;
		this.quantity = quantity;
		this.unit = unit;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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
