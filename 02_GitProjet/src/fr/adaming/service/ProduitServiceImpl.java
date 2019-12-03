package fr.adaming.service;

import fr.adaming.dao.IProduitDao;
import fr.adaming.dao.ProduitDaoImpl;
import fr.adaming.entities.Produit;

public class ProduitServiceImpl implements IProduitService{

	IProduitDao pDao = new ProduitDaoImpl();
	
	
	@Override
	public void addProduitService(Produit pIn) {
		pDao.addProduitDao(pIn);
		
	}

	@Override
	public void deleteProduitService(int id) {
		pDao.deleteProduitDao(id);
		
	}

	@Override
	public void updateProduitService(Produit pIn) {
		pDao.updateProduitDao(pIn);
		
	}

}
