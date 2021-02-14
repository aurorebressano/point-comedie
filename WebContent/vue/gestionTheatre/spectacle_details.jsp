<%@page import="metier.programmation.Theatre"%>
<%@page import="metier.programmation.Salle"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="metier.programmation.Representation"%>
<%@page import="metier.programmation.Representations"%>
<%@page import="java.util.ArrayList"%>
<%@page import="metier.programmation.Artiste"%>
<%@page import="metier.programmation.Spectacle"%>
<%@page import="dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
<meta charset="UTF-8">
<meta name="description" content="Fashi Template">
<meta name="keywords" content="Fashi, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Spectacle | Détails</title>

<%@ include file="/WEB-INF/include/head.jsp"%>

<!-- Breadcrumb Section Begin -->
<div class="breacrumb-section">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="breadcrumb-text">
					<a href="#"><i class="fa fa-home"></i>Spectacles</a> <span>Spectacle | Détails</span>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Breadcrumb Form Section Begin -->

<!-- Blog Details Section Begin -->

<% Spectacle spectacle = Dao.findSpectacle(Integer.parseInt(request.getParameter("spectacle"))); %>
<% if (spectacle == null) { %>
<div class="alert alert-danger">Ce spectacle n'existe pas !</div>
<a class="button" href="<%= request.getContextPath()%>/vue/gestionTheatre/adminTheatre.jsp">Retour</a>
<% } else { %>

<% if (request.getParameter("nouveauPrix") != null) { %>
	<% spectacle.setPrix(Double.parseDouble(request.getParameter("nouveauPrix"))); %>
<% } %>
<section class="blog-details spad">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="blog-details-inner">
				
					<!-- Titre, genre et durée -->
					<div class="blog-detail-title">
						<h1><%= spectacle.getTitre() %></h1>
						<p>
							<%= spectacle.getTheme() %> <span>- <%= spectacle.getDuree() %> minutes</span>
						</p>
					</div>
					
					<!-- Image et description -->
					<div class="blog-pic single-banner">
						<img
							src="<%= request.getContextPath() %><%= spectacle.getCheminImage() %>"
							alt="">
					</div>
					<div class="blog-detail-desc">
						<p>
							<%= spectacle.getResume() %>
						</p>
					</div>
					
					<!-- Liste des artistes -->
					<div class="blog-actors">
						<h2>Distribution</h2>
							<ul class="row">
							<% ArrayList<Artiste> artistes = spectacle.getArtistes(); %>
							<% for (Artiste artiste : artistes) { %>
								<li class="col-sm-4 single-banner">
									<img
										src="<%= request.getContextPath() %><%= artiste.getCheminImage() %>"
										alt="">
									<p>
									<%= artiste.getPrenom() %> 
									<%= artiste.getNom() %>
									</p>
								</li>
							<% } %>
							</ul>
					</div>
						
				</div>
				
				<div class="blog-details-inner">
					
					<!-- Prix du billet -->
					<% Representations representations = spectacle.getRepresentations(); %>
					<div class="modif-price">
						<h2>
							Tarif : <span class="price"><%= spectacle.getPrix() %>€</span>
						</h2>
						<form action="<%= request.getContextPath() %>/vue/gestionTheatre/spectacle_details.jsp" method="GET">
							<input type="number" step="0.01" name="nouveauPrix">
							<input type="hidden" name="spectacle" value="<%= spectacle.getId() %>">
							<button class="button" type="submit">modifier</button>
						</form>
					</div>
					
					<!-- Liste des représentations -->
					<div class="blog-list">
						<h2>Quand ?</h2>
						<ul class="row">
							<% for (Representation representation : representations) { %>
							<% Theatre theatre = Dao.getTheatres().get(0); %>
							<% Salle salle = Dao.getSallesByTheatre(theatre).get(3); %>
								<li class="col-sm-4 single-banner">
										<h3><%= representation.getPlanning().toLocalDate() %></h3>
										<p><%= representation.getPlanning().toLocalTime() %></p>
										<p>
											<%= theatre.getNom() %> <!-- <span>- Douai</span> -->
										</p>
										<p>Salle <%= salle.getNom() %></p>
										<a href="<%= request.getContextPath() %>/representation/<%= representation.getId() %>/supprimer?spectacle=<%= spectacle.getId() %>"> Supprimer </a>
										</li>
							<% } %>
						</ul>
					</div>
				</div>
				
				<div class="blog-details-inner">	
					<!-- Tags et réseaux sociaux -->
					<div class="tag-share">
						<div class="details-tag">
							<ul>
								<li><i class="fa fa-tags"></i></li>
								<li><%= spectacle.getTheme() %></li>
							</ul>
						</div>
						<div class="blog-share">
							<span>Share:</span>
							<div class="social-links">
								<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
									class="fa fa-twitter"></i></a> <a href="#"><i
									class="fa fa-google-plus"></i></a> <a href="#"><i
									class="fa fa-instagram"></i></a> <a href="#"><i
									class="fa fa-youtube-play"></i></a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<% } %>
<!-- Blog Details Section End -->

<%@ include file="/WEB-INF/include/footer.jsp"%>