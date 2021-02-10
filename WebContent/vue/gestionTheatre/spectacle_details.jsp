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
<section class="blog-details spad">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="blog-details-inner">
					<div class="blog-detail-title">
					
					<!-- Titre, genre et durée -->
						<h1>A la recherche du temps perdu</h1>
						<p>
							Comédie <span>- 55 minutes</span>
						</p>
					</div>
					
					<!-- Image et description -->
					<div class="blog-pic single-banner">
						<img
							src="<%= request.getContextPath() %>/vue/img/theatre/nathan-dumlao-LPRrEJU2GbQ-unsplash.jpg"
							alt="">
					</div>
					<div class="blog-detail-desc">
						<p>Quand Virgil Tanasse s'intéresse à  Marcel Proust, cela
							donne un spectacle d'une beauté et d'une élégance rares. « A
							la recherche du temps perdu » est une rêverie poétique et
							mélancolique sur le temps, les souvenirs et l'art.</p>

						<p>Le passage sur la Madeleine est un moment d'une beauté
							époustouflante, mais la magie opère, particulièrement, quand le
							thème de la création artistique est abordé.</p>
					</div>
					<div class="blog-quote">
						<p>
							“ Qu’est-ce qu’une œuvre d’art sinon cette façon de contraindre
							l’émotion à se plier aux règles de l’esprit ? ” <span>Philippe
								SPITERI</span>
						</p>
					</div>
					<div class="blog-detail-desc">
						<p>Le lien se resserre, alors entre l’œuvre magistrale de
							Proust et cet objet théâtral. Théâtre littéraire, promenade de la
							pensée, parcours poétique, ce seul en scène est totalement
							inclassable et le poser, le temps d’un instant au Théâtre de la
							Contrescarpe, dans le quartier de La Sorbonne, est une très bonne
							idée. Tout de blanc vêtu, le comédien David Legrad nous fait une
	
							démonstration malicieuse de la pensée avec un texte dense et
							difficile et un travail sur le rythme, remarquable.</p>
						<p>Que ce soit par son corps ou sa voix, les ruptures sont très
							belles. Parfois très immobile ou se déplaçant comme un chat, il
							nuance subtilement le ton et passe par un phrasé très posé à des
							envolés beaucoup plus aériennes.</p>
						<p>« À la recherche du temps perdu » est une pièce tout en
							élégance et sensualité qui s’écoute autant qu’elle se voit. La
							beauté des mots associée à la mise en scène et la scénographie
							donne une sensation très particulière proche du rêve éveillé.</p>
					</div>
					
					<!-- Liste des artistes -->
					<div class="blog-actors">
						<h2>Distribution</h2>
						<div class="row">
							<div class="col-sm-4 single-banner">
								<img
									src="<%= request.getContextPath() %>/vue/img/theatre/actrice1.jpg"
									alt="">
								<p>Isabelle MERGAULT</p>
							</div>
							<div class="col-sm-4 single-banner">
								<img
									src="<%= request.getContextPath() %>/vue/img/theatre/acteur1.jpg"
									alt="">
								<p>Philippe SPITERI</p>
							</div>
							<div class="col-sm-4 single-banner">
								<img
									src="<%= request.getContextPath() %>/vue/img/theatre/acteur2.jpg"
									alt="">
								<p>Jean-Louis BARCELONA</p>
							</div>
						</div>
					</div>

					<!-- Prix du billet -->
					<div class="blog-price">
						<h2>
							Tarif : <span class="price">15€</span>
						</h2>
					</div>
					
					<!-- Liste des représentations -->
					<div class="blog-list">
						<h2>Quand ?</h2>
						<ul class="row">
							<li class="col-sm-4 single-banner">
								<h3>01 mars 2021</h3>
								<p>20h</p>
								<p>
									Tandem scène nationale <span>- Douai</span>
								</p>
								<p>Salle Reybaz</p>
							</li>
							<li class="col-sm-4 single-banner">
								<h3>02 mars 2021</h3>
								<p>20h</p>
								<p>
									Tandem scène nationale <span>- Douai</span>
								</p>
								<p>Salle Reybaz</p>
							</li>
							<li class="col-sm-4 single-banner">
								<h3>03 mars 2021</h3>
								<p>19h30</p>
								<p>
									Tandem scène nationale <span>- Douai</span>
								</p>
								<p>Salle Reybaz</p>
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