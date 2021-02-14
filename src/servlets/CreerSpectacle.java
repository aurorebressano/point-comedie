package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao;
import metier.programmation.Artiste;
import metier.programmation.Representations;
import metier.programmation.Spectacle;

/**
 * Servlet implementation class CreerSpectacle
 */
@WebServlet("/nouveau_spectacle")
public class CreerSpectacle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Dao.getSpectacles().size() + 1;
		Spectacle spectacle = new Spectacle(
			id,
			request.getParameter("titre"),
			request.getParameter("desc"),
			request.getParameter("theme"),
			Integer.parseInt(request.getParameter("duree")),
			Double.parseDouble(request.getParameter("prix")),
			null,
			new ArrayList<Artiste>(),
			new Representations()
		);
		
		Dao.getSpectacles().add(spectacle);
		
		String url = request.getContextPath() + "/vue/gestionTheatre/spectacle_details.jsp?spectacle=" + id;
		response.sendRedirect(url);
	}

}
