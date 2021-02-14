<%@page import="metier.programmation.Salle"%>
<%@page import="dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Administrer mon théâtre</title>
</head>

<%@ include file="/WEB-INF/include/head.jsp"%>

<main>

	<!-- Breadcrumb article Begin -->
	<div class="breacrumb-article">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="breadcrumb-text">
						<a href="#"><i class="fa fa-home"></i>Accueil</a>
						<span>Administrer mon théâtre</span>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Breadcrumb Form article Begin -->
	
	<section id="admin">

	<h1>Administrer mon théâtre</h1>
	
	<!-- Détails du théâtre : image, résumé et salles -->
	<article class="theatre">
		
		<img alt="devanture du théâtre" src="<%= request.getContextPath()%><%= Dao.getTheatres().get(0).getCheminImage() %>">
		<!-- "<%= request.getContextPath()%>/vue/img/theatre/arras_theatre_1500x1000_px_01-400x350.jpg" -->
		<p>
			 <%= Dao.getTheatres().get(0).getResume() %>
		</p>	
		
	</article>
	
	<article class="salles">
		<h2> Salles </h2>
			<ul>
				<% for (Salle salle : Dao.getSalles()) { %>
					<li><%= salle.getNom() %> : <span><%= salle.getJauge() %> places</span>
					</li>
					<% }%>
			</ul>
	</article>

	<!-- formulaire pour accéder aux spectacles -->
	<article class="prog">
		<h2>Ma programmation</h2>

		<form action="<%= request.getContextPath() %>/vue/gestionTheatre/spectacle_details.jsp" method="GET">
			<input type="text" name="spectacle" placeholder="Entrez l'ID du spectacle">
			<button type="submit"> afficher </button>
			
			<div class="buttons">
				<a href="<%= request.getContextPath() %>/vue/gestionTheatre/spectacle_nouveau.jsp"> créer </a> 
			</div>
		</form>
	</article>
	
	</section>
	
</main>

<%@ include file="/WEB-INF/include/footer.jsp"%>