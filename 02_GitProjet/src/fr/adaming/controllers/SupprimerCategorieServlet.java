package fr.adaming.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.adaming.entities.Categorie;
import fr.adaming.service.CategorieServiceImpl;
import fr.adaming.service.ICategorieService;

@WebServlet(name = "supprimerCat", urlPatterns = { "/suppC" })
public class SupprimerCategorieServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Transformation de l'association UML en JAVA
		ICategorieService cService = new CategorieServiceImpl();

		// recupérer les parametres de la requete
		int idCat = Integer.parseInt(req.getParameter("pId"));

		// instancier une catégorie avec ses valeurs récupérées de la requete
		Categorie cIn = new Categorie();

		// stockage de l'id récupéré
		cIn.setIdCategorie(idCat);

		// appel de la méthode add de service
		cService.deleteCategorieService(idCat);

	}

}
