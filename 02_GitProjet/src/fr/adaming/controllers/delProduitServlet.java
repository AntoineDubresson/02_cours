package fr.adaming.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.adaming.service.IProduitService;
import fr.adaming.service.ProduitServiceImpl;


@WebServlet(name = "delProduitServlet", urlPatterns = { "/delProduit" })
public class delProduitServlet extends HttpServlet{

	IProduitService pService = new ProduitServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		pService.deleteProduitService(Integer.parseInt(req.getParameter("pId")));
	}
	
}
