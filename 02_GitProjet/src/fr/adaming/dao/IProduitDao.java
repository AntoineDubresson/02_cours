package fr.adaming.dao;

import fr.adaming.entities.Produit;

public interface IProduitDao {

	public void addProduitDao(Produit pIn);
	
	public void deleteProduitDao(int id);
	
	public void updateProduitDao(Produit pIn);
	
}
