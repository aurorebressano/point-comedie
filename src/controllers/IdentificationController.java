package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao;
import metier.users.Administrateur;
import metier.users.Password;

/**
 * Servlet implementation class IdentificationController
 * 
 * Controller pour la gestion Identification
 */
@WebServlet(
	name = "IdentificationController", 
	description = "Controller d'identification", 
	urlPatterns = {"/session/*"}
)
public class IdentificationController extends BaseController {

	private static final long 	serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// recuperation du choix
		String path = request.getPathInfo();
		System.out.println("2================  dans IdentificationController path=" + path );

		if (path.equals("/connexion")) 				doConnexion(request, response);
		else if (path.equals("/deconnexion")) 		doDeconnexion(request, response);
		else {
			handleError(request, response, "Gestion : Vous avez tripatouill&eacute; l'url!!! ");
		}
	}
	
	private void doConnexion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email		= "root@test.fr"; // request.getParameter ("login");
		String pw		 	= "4321"; // request.getParameter ("pw");

		System.out.println("Identification - post - le nom : " + email + " le mdp : " + pw);
		System.out.println(Dao.getAdministrateurs());
		
		// verification de l'existence dans la liste des abonnes
		Administrateur administrateur = Dao.getAdministrateur(email, new Password(pw));
		
		// Mise en session du nom et prenom 
		HttpSession session = request.getSession(true);
		if (administrateur != null) {
			Administrateur administrateurSession = new Administrateur(administrateur.getIdAbonne());
			administrateurSession.setNom(administrateur.getNom());
			administrateurSession.setPrenom(administrateur.getPrenom());
			
			session.setAttribute("administrateur", administrateurSession);
			response.sendRedirect(request.getContextPath() + "/vue/gestionTheatre/adminTheatre.jsp");
		}
		else {
			session.setAttribute("administrateur", null);
			handleError(request, response, "Mauvaise identification !!!");
		}
	}
	
	private void doDeconnexion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		session.setAttribute("administrateur", null);
		response.sendRedirect(request.getContextPath());
	}
}
