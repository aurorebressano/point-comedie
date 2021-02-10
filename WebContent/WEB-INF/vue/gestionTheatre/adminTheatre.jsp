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
		
		<img alt="devanture du théâtre" src="<%= request.getContextPath()%>/vue/img/theatre/arras_theatre_1500x1000_px_01-400x350.jpg">
		<p>
			 Le TANDEM Scène nationale privilégie le croisement des arts et la découverte des courants artistiques incontournables de la scène européenne et internationale 
			 (60 propositions pour 150 représentations par saison) et mène un programme ambitieux d’actions culturelles.
		</p>	
		
	</article>
	
	<article class="salles">
		<h2> Salles </h2>
			<ul>
				<li>Malraux : <span>500 places</span></li>
				<li>Obey : <span> 140 places</span></li>
				<li>Grand studio : <span>Résidences d'artistes</span></li>
				<li>Paul Desmarets : <span>Cinéma</span></li>
				<li>Reybaz : <span>80 places</span></li>
				<li>Grande salle : <span>250 places</span></li>
				<li>Salle des concerts : <span>400 places</span></li>
			</ul>
	</article>

	<!-- formulaire pour accéder aux spectacles -->
	<article class="prog">

		<h2>Ma programmation</h2>

		<input type="text" name="spectacle" placeholder="Entrez le titre du spectacle" value="A la recherche du temps perdu">
		<a href="<%= request.getContextPath() %>/vue/spectacle_nouveau.jsp"> créer </a> 
		
		<div class="buttons">
			<a href="<%= request.getContextPath() %>/vue/spectacle_details.jsp"> afficher </a>
			<a href="<%= request.getContextPath() %>/vue/spectacle_modif.jsp"> modifier </a> 
		</div>
		
	</article>
	
	</section>
	
</main>

<%@ include file="/WEB-INF/include/footer.jsp"%>