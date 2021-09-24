package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class DeliveryVoucher implements Serializable {

	private static final long serialVersionUID = 6256509478379509425L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String codeCommande;
	@ManyToOne
	@JoinColumn(name="article_id")
	private Article article;
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;
	private String quantite;
	private String date;

	public DeliveryVoucher() {
		// TODO Auto-generated constructor stub
	}

	public DeliveryVoucher(String codeCommande, Article codeArticle, Client codeClient, String quantite, String date) {
		super();
		this.codeCommande = codeCommande;
		this.article = codeArticle;
		this.client = codeClient;
		this.quantite = quantite;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeCommande() {
		return codeCommande;
	}

	public void setCodeCommande(String codeCommande) {
		this.codeCommande = codeCommande;
	}



	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
