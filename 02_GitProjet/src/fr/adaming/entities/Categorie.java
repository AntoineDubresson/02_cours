package fr.adaming.entities;

import java.util.ArrayList;
import java.util.List;

public class Categorie {

	// declaration des atributs
	private long idCategorie;
	private String nomCategorie;
	private String photo;
	private String description;

	// transformation de l'association uML en JAVA
	private List<Produit> listeProduit;

	// declaration des constructeurs
	public Categorie() {
		super();
	}

	public Categorie(long idCategorie, String nomCategorie, byte photo, String description) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.photo = photo;
		this.description = description;
	}

	// declarations des getters et setters
	public long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public byte getPhoto() {
		return photo;
	}

	public void setPhoto(byte photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Produit> getListeProduit() {
		return listeProduit;
	}

	public void setListeProduit(List<Produit> listeProduit) {
		this.listeProduit = listeProduit;
	}

}
