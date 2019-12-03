package fr.adaming.service;

import fr.adaming.entities.Produit;

public interface IProduitService {

	public void addProduitService(Produit pIn);
	
	public void deleteProduitService(int id);
	
	public void updateProduitService(Produit pIn);
}
