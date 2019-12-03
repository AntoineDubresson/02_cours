package fr.adaming.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.adaming.entities.Produit;
import fr.adaming.service.IProduitService;
import fr.adaming.service.ProduitServiceImpl;


@WebServlet(name = "updProduitServlet", urlPatterns = { "/updProduit" })
public class updateProduitServlet extends HttpServlet{

	IProduitService pService = new ProduitServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Produit pIn = new Produit(Integer.parseInt(req.getParameter("pId")),req.getParameter("pDesignation"), req.getParameter("pDescription"),
				Double.parseDouble(req.getParameter("pPrix")), Integer.parseInt(req.getParameter("pQuantite")),
				Boolean.parseBoolean(req.getParameter("pSelectionne")), req.getParameter("pPhoto"));
		
		pService.updateProduitService(pIn);
		
	}
}
