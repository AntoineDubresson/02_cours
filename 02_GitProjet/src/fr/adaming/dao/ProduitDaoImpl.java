package fr.adaming.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fr.adaming.entities.Produit;

public class ProduitDaoImpl implements IProduitDao {

	public final static String USERNAME = "root";
	public final static String MDP = "root";
	public final static String URL = "jdbc:mysql://localhost:3306/db_tp_ecommerce";
	private PreparedStatement ps = null;
	private Connection cx = null;

	@Override
	public void addProduitDao(Produit pIn) {

		try {
			// Driver
			Class.forName("com.mysql.jdbc.Driver");

			// Création de la connexion
			cx = DriverManager.getConnection(URL, USERNAME, MDP);

			// Création de la requete
			String req = "INSERT INTO produits (designation_p,decription_p,prix_p,quantite_p,selectionne_p,photo_p) VALUES (?,?,?,?,?,?)";

			// etape 4 création du bus
			ps = cx.prepareStatement(req);

			// etape5 on ajoute les valeurs aux "?"
			ps.setString(1, pIn.getDesignation());
			ps.setString(2, pIn.getDescripton());
			ps.setDouble(3, pIn.getPrix());
			ps.setInt(4, pIn.getQuantite());
			ps.setBoolean(5, pIn.isSelectionne());
			ps.setString(6, pIn.getPhoto());

			int verif = ps.executeUpdate();

			if (verif != 0) {
				System.out.println("L'ajout est ok!");
			} else {
				System.out.println("L'ajout est ko!");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (cx != null) {
					cx.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void deleteProduitDao(int id) {

		try {
			// Driver
			Class.forName("com.mysql.jdbc.Driver");

			// Création de la connexion
			cx = DriverManager.getConnection(URL, USERNAME, MDP);

			// Création de la requete
			String req = "DELETE FROM produits WHERE id_p = ?";

			// etape 4 création du bus
			ps = cx.prepareStatement(req);

			// etape5 on ajoute les valeurs aux "?"
			ps.setInt(1, id);

			int verif = ps.executeUpdate();

			if (verif != 0) {
				System.out.println("La suppression est ok!");
			} else {
				System.out.println("La suppression est ko!");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (cx != null) {
					cx.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void updateProduitDao(Produit pIn) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			cx = DriverManager.getConnection(URL, USERNAME, MDP);

			String req = "UPDATE produits SET designation_p = ?, description_p = ?, prix_p = ?, quantite_p=?, selectionne_p = ?, photo_p=? WHERE id_p = ? ";

			ps = cx.prepareStatement(req);

			ps.setString(1, pIn.getDesignation());
			ps.setString(2, pIn.getDescripton());
			ps.setDouble(3, pIn.getPrix());
			ps.setInt(4, pIn.getQuantite());
			ps.setBoolean(5, pIn.isSelectionne());
			ps.setString(6, pIn.getPhoto());
			ps.setInt(7, pIn.getIdProduit());

			int verif = ps.executeUpdate();

			if (verif != 0) {
				System.out.println("La modification est ok!");
			} else {
				System.out.println("La modification est ko!");
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (cx != null) {
					cx.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
