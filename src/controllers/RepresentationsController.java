package controllers;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import metier.programmation.Representation;
import metier.programmation.Spectacle;

/**
 * Servlet implementation class RepresentationsController
 */
@WebServlet(
	name = "RepresentationsController", 
	description = "Controller des représentations", 
	urlPatterns = {"/representation/*"}
)
public class RepresentationsController extends BaseController {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String pathInfo = request.getPathInfo();
		System.out.println("2================  dans RepresentationsController path= " + pathInfo);
		
		String[] pathParts = pathInfo.split("/");
		pathParts = Arrays.copyOfRange(pathParts, 1, pathParts.length);
		
		int spectacleId = Integer.parseInt(request.getParameter("spectacle"));
		Spectacle spectacle = Dao.findSpectacle(spectacleId); 
		
		if (pathParts.length == 2 && pathParts[1].equals("supprimer")) {
			int id = Integer.parseInt(pathParts[0]);
			Representation representation = spectacle.findRepresentation(id);
			if (representation != null) {
				int index = spectacle.getRepresentations().indexOf(representation);
				spectacle.getRepresentations().remove(index);
			}

			String url = request.getContextPath() + "/vue/gestionTheatre/spectacle_details.jsp?spectacle=" + spectacleId;
			response.sendRedirect(url);
		}
		else {
			handleError(request, response, "Gestion : Vous avez tripatouill&eacute; l'url!!! ");
		}
	}
}