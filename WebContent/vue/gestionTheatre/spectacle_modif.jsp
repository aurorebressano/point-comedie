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

<% Spectacle spectacle = Dao.getSpectacles().get(0); %>
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
						<div class="row">
							<div class="col-sm-4 single-banner">
							<% ArrayList<Artiste> artistes = spectacle.getArtistes(); %>
							<% for (Artiste artiste : artistes) { %>
								<img
									src="<%= request.getContextPath() %><%= artiste.getCheminImage() %>"
									alt="">
								<p>
								<%= artiste.getPrenom() %> 
								<%= artiste.getNom() %>
								</p>
							<% } %>
							</div>
						</div>
						
					</div>
					
					<!-- Prix du billet -->
					<% Representations representations = spectacle.getRepresentations(); %>
					<div class="modif-price">
						<h2>
							Tarif : <span class="price"><%= representations.get(0).getPrix() %>€</span>
						</h2>
						<a href="#"> Modifier </a>
					</div>
					
					<!-- Liste des représentations -->
					<div class="blog-list">
						<h2>Quand ?</h2>
						<ul class="row">
							<li class="col-sm-4 single-banner">
							<% for (Representation representation : representations) { %>
								  <% LocalDate date = representation.getPlanning().toLocalDate(); %>
								  <% DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy"); %>
								  <% String text = date.format(formatter); %>
								  <% LocalDate parsedDate = LocalDate.parse(text, formatter); %>
									<h3><%= parsedDate %></h3>
									<p>20h</p>
									<p>
										Tandem scène nationale <span>- Douai</span>
									</p>
									<p>Salle Reybaz</p>
									<a href="#"> Supprimer </a>
							<% } %>
							</li>
							<li class="col-sm-4 single-banner">
								<h3>02 mars 2021</h3>
								<p>20h</p>
								<p>
									Tandem scène nationale <span>- Douai</span>
								</p>
								<p>Salle Reybaz</p>
								<a href="#"> Supprimer </a>
							</li>
							<li class="col-sm-4 single-banner">
								<h3>03 mars 2021</h3>
								<p>19h30</p>
								<p>
									Tandem scène nationale <span>- Douai</span>
								</p>
								<p>Salle Reybaz</p>
								<a href="#"> Supprimer </a>
							</li>
						</ul>
					</div>
					
					<!-- Tags et réseaux sociaux -->
					<div class="tag-share">
						<div class="details-tag">
							<ul>
								<li><i class="fa fa-tags"></i></li>
								<li>Classique</li>
								<li>Boulevard</li>
								<li>Comédie</li>
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
<!-- Blog Details Section End -->

<%@ include file="/WEB-INF/include/footer.jsp"%>