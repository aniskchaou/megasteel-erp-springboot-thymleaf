package com.dev.delta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductionOrder implements Serializable{

   
	private static final long serialVersionUID = 9155714314567020674L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String codeProduction;
    private String quantiteRealise;
    private String quantiteRestant;
    private String codeMachine;
    private String articleSortant;
    private String articleEntrant;
    private String etat;
    
    public ProductionOrder() {
		// TODO Auto-generated constructor stub
	}

	public ProductionOrder(String codeProduction, String quantiteRealise, String quantiteRestant, String codeMachine,
			String articleSortant, String articleEntrant, String etat) {
		super();
		this.codeProduction = codeProduction;
		this.quantiteRealise = quantiteRealise;
		this.quantiteRestant = quantiteRestant;
		this.codeMachine = codeMachine;
		this.articleSortant = articleSortant;
		this.articleEntrant = articleEntrant;
		this.etat = etat;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeProduction() {
		return codeProduction;
	}

	public void setCodeProduction(String codeProduction) {
		this.codeProduction = codeProduction;
	}

	public String getQuantiteRealise() {
		return quantiteRealise;
	}

	public void setQuantiteRealise(String quantiteRealise) {
		this.quantiteRealise = quantiteRealise;
	}

	public String getQuantiteRestant() {
		return quantiteRestant;
	}

	public void setQuantiteRestant(String quantiteRestant) {
		this.quantiteRestant = quantiteRestant;
	}

	public String getCodeMachine() {
		return codeMachine;
	}

	public void setCodeMachine(String codeMachine) {
		this.codeMachine = codeMachine;
	}

	public String getArticleSortant() {
		return articleSortant;
	}

	public void setArticleSortant(String articleSortant) {
		this.articleSortant = articleSortant;
	}

	public String getArticleEntrant() {
		return articleEntrant;
	}

	public void setArticleEntrant(String articleEntrant) {
		this.articleEntrant = articleEntrant;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
    
    
}
