package fr.adaming.service;

import fr.adaming.dao.CategorieDaoImpl;
import fr.adaming.dao.ICategorieDao;
import fr.adaming.entities.Categorie;

public class CategorieServiceImpl implements ICategorieService{

	
	private ICategorieDao cDao=new CategorieDaoImpl();

	@Override
	public void addCategorieService(Categorie cIn) {
		cDao.addCategorieDao(cIn);
		
	}

	@Override
	public void deleteCategorieService(int id) {
		cDao.deleteCategorieDao(id);
		
	}

	@Override
	public void updateCategorieService(Categorie cIn) {
		cDao.updateCategorieDao(cIn);
		
	}
	
	
	
	
	
	
	
	
	
	
	

		
	}
