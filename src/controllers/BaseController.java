package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract public class BaseController extends HttpServlet {
	protected void handleError(HttpServletRequest request, HttpServletResponse response, String message) throws ServletException, IOException {
		request.setAttribute("message", message);
		String errorPage = this.getServletContext().getInitParameter("/vue/erreur/error.jsp");
		request
			.getRequestDispatcher(errorPage)
			.forward(request,response);
	}
}