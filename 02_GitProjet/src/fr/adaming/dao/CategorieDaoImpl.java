package fr.adaming.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fr.adaming.entities.Categorie;

public class CategorieDaoImpl implements ICategorieDao {

	// declaration des constantes de connexion
	public final static String USERNAME = "root";
	public final static String MDP = "root";
	public final static String URL = "jdbc:mysql://localhost:3306/db_tp_ecommerce";

	// declaration des variables globales (atributs)
	private PreparedStatement ps = null;
	private Connection cx = null;

	@Override
	public void addCategorieDao(Categorie cIn) {
		try {
			// 1 chargement du pilote
			Class.forName("com.mysql.jdbc.Driver");

			// 2 ouvrire une connexion � la base de donn�es
			cx = DriverManager.getConnection(URL, USERNAME, MDP);

			// 3 construction de la requete SQL, � l'int de String SQL?
			String req = "INSERT INTO categories (nom_c, photo_c, description_c) VALUES (?,?,?)";

			// Etape 4 et 5 : envoyer la requete et r�cup�rer le r�sultat
			// 4a: cr�ation d'un bus pour envoyer la requete sql � la bd
			ps = cx.prepareStatement(req);

			// 4b : passage des valeurs aux param�tres de la requete
			ps.setString(1, cIn.getNomCategorie());
			ps.setString(2, cIn.getPhoto());
			ps.setString(3, cIn.getDescription());

			// 4c et 5 : envoyer concretement la requete et r�cup�ration du
			// r�sultats

			int verif = ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
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
	public void deleteCategorieDao(int id) {
		try {
			// 1 chargement du pilote
			Class.forName("com.mysql.jdbc.Driver");

			// 2 ouvrire une connexion � la base de donn�es
			cx = DriverManager.getConnection(URL, USERNAME, MDP);

			// 3 construction de la requete SQL, � l'int de String SQL?
			String req = "DELETE FROM categories WHERE id_c=?";

			// Etape 4 et 5 : envoyer la requete et r�cup�rer le r�sultat
			// 4a: cr�ation d'un bus pour envoyer la requete sql � la bd
			ps = cx.prepareStatement(req);

			// 4b : passage des valeurs aux param�tres de la requete
			ps.setInt(1, id);

			// 4c et 5 : envoyer concretement la requete et r�cup�ration du
			// r�sultats

			int verif = ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
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
	public void updateCategorieDao(Categorie cIn) {
		try {
			// 1 chargement du pilote
			Class.forName("com.mysql.jdbc.Driver");

			// 2 ouvrire une connexion � la base de donn�es
			cx = DriverManager.getConnection(URL, USERNAME, MDP);

			// 3 construction de la requete SQL, � l'int de String SQL?
			String req = "UPDATE categories SET nom_c=?, photo_c=?, description_c=? WHERE id_c=?";

			// Etape 4 et 5 : envoyer la requete et r�cup�rer le r�sultat
			// 4a: cr�ation d'un bus pour envoyer la requete sql � la bd
			ps = cx.prepareStatement(req);

			// 4b : passage des valeurs aux param�tres de la requete
			ps.setString(1, cIn.getNomCategorie());
			ps.setString(2, cIn.getPhoto());
			ps.setString(3, cIn.getDescription());
			ps.setInt(4, cIn.getIdCategorie());

			// 4c et 5 : envoyer concretement la requete et r�cup�ration du
			// r�sultats
			int verif = ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
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
