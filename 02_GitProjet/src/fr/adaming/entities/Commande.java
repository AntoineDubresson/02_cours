package fr.adaming.entities;

import java.util.Date;
import java.util.List;

public class Commande {

	// declarations des attributs
	private long idCommande;
	private Date dateCommande;

	// declarations des constructeurs
	public Commande() {
		super();
	}

	public Commande(long idCommande, Date dateCommande) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
	}

	// transformation de l'association uML en JAVA
	private Client cl;
	private List<LigneCommande> listeLigneCommande;

	// declarations des getters et setters
	public long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(long idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Client getCl() {
		return cl;
	}

	public void setCl(Client cl) {
		this.cl = cl;
	}

}
