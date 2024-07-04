package com.persistence.xefi.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Eleve")
public class Eleve {
	
	@Id	
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private  Long id;
	
	@Column(length = 50)
	private  String Nom;
	
	@Column(length = 50)
	private  String Prenom;
	
	
	public Eleve() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	

}

