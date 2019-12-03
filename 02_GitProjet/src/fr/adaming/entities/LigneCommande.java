package fr.adaming.entities;

public class LigneCommande {

	// declaration des attributs

	private int quantite;
	private int prix;

	// transformation de l'association uML en JAVA
	private Panier pan;
	private Produit prod;
	private Commande cmd;

	// declarations des constructeurs
	public LigneCommande() {
		super();
	}

	public LigneCommande(int quantite, int prix) {
		super();
		this.quantite = quantite;
		this.prix = prix;
	}

	// declaration des getters et setters
	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

}
