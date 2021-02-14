package servlets.ident;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao;
import metier.users.Administrateur;
import metier.users.Password;

/*
 * ATTENTION : Ce programme fonde l'identification sur le nom et le pw
 * PB : le nom peut ne pas etre unique => il faut utiliser un login unique !!!
 * Ceci n'est que pour l'exercice !!!
 */
@WebServlet("/identification")
public class Identification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * Mise en session du login
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// recuperation des donnees 
		String email		= request.getParameter ("login");
		String pw		 	= request.getParameter ("pw");
		
		System.out.println("Identification - post - le nom : " + email);
		
		// verification de l'existence dans la liste des abonnes
		Administrateur administrateur = Dao.getAdministrateur(email, new Password(pw));
		// System.out.println("Identification : " + administrateur);
		
		
		// Mise en session du nom et prenom 
		HttpSession session = request.getSession(true);
		if (administrateur != null) {
			
			Administrateur administrateurSession = new Administrateur(administrateur.getIdAbonne());
			administrateurSession.setNom(administrateur.getNom());
			administrateurSession.setPrenom(administrateur.getPrenom());
			
			// System.out.println("Identification : " + abonneSession);
			
			session.setAttribute("administrateur", administrateurSession);
			response.sendRedirect(request.getContextPath());
			// 		http://localhost:8085/<<rootDuProjet>>
		}
		else {
			session.setAttribute("administrateur", null);
			
			request.setAttribute("message", "Mauvaise identification !!!");
			String chemin = this.getServletContext().getInitParameter("pageError");
			
			
			RequestDispatcher disp = request.getRequestDispatcher(chemin);
			disp.forward(request, response);
		}

	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Je suis dans creer Get");
		request.setAttribute("message", "Url invalide !!");
		RequestDispatcher disp = request.getRequestDispatcher(this.getServletContext().getInitParameter("pageError"));
		disp.forward(request, response);
	}
}