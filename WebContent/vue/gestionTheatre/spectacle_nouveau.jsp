<%@page import="metier.programmation.Artiste"%>
<%@page import="java.util.ArrayList"%>
<%@page import="metier.programmation.Theatre"%>
<%@page import="dao.Dao"%>
<%@page import="metier.programmation.Salle"%>
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
    <title>Nouveau spectacle</title>

<%@ include file="/WEB-INF/include/head.jsp"%>

    <!-- Breadcrumb Section Begin -->
    <div class="breacrumb-section">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="breadcrumb-text">
                        <a href="#"><i class="fa fa-home"></i>Administrer mon théâtre</a>
                        <span>Nouveau spectacle</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Breadcrumb Form Section Begin -->

    <!-- Register Section Begin -->
    <div class="register-login-section spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 offset-lg-3">
                
                	<!-- Debut du formulaire de creation du spectacle -->
                    <div class="register-form">
                        <h2>Mon spectacle</h2>
                        <form action="/nouveau_spectacle" method="post">
                        	<div class="group-input custom-file">
							    <input id="customFile" type="file" class="custom-file-input"  name="img">
							    <label id="customFileLabel"class="custom-file-label" for="customFile">Choisir une image</label>
					  		</div>
					  		
					  		<div class="group-input">
                                <label for="theme">Ajouter le genre</label>
                                <input type="text" name="theme">
                            </div>
                            
                            <div class="group-input">
                                <label for="titre">Ajouter le titre</label>
                                <input type="text" name="titre">
                            </div>
                            
                            <div class="group-input">
                                <label for="desc">Ajouter une description</label>
                                <textarea name="desc" cols="40" rows="5"></textarea>
                            </div>
                            
                            <div class="group-input">
                                <label for="acteurs">Comédiens</label>
                                <select multiple="multiple" name="acteurs">
                                <% for (Artiste artiste : Dao.getArtistes()) { %>
                                	<option value="<%=artiste.getId()%>">
                                		<%= artiste.getPrenom() %>
                                		<%= artiste.getNom() %>
                                	</option>
                                <% } %>
                                	
                                	<!-- <option value="2">Isabelle MERGAULT</option>
                                	<option value="3">Jean-Louis BARCELONA</option> -->
                                </select>
                            </div>                   
                            
                            <div class="group-input">
                                <label for="duree">Durée du spectacle</label>
                                <input type="number" name="duree" placeholder="en minutes">
                            </div>
                            
                            <div class="group-input">
                                <label for="prix">Prix du billet</label>
                                <input type="number" name="prix" placeholder="en euros">
                            </div>
                            
                             <label for="salle">Salle</label>
                             
                             <% Theatre t = Dao.getTheatres().get(0); %>
                             <% ArrayList<Salle> salles = t.getSalles(); %>
                             
                             <% for (Salle salle : salles) { %>
							<div class="form-check">
							    <input class="form-check-input" type="radio" name="salle" id="salle-1" value="1" checked>
							    <label class="form-check-label" for="salle-1"> <%= salle.getNom() %> </label>
							</div>
							<% } %>
							
                            <div class="mt-4 group-input">
                                <label for="daterpz">Quand ?</label>
                                <input type="datetime-local" name="daterpz1">
                              	 <!-- TODO afficher d'autres input datetime-local --> 
                            </div>
	
							<button type="submit" class="site-btn register-btn">ENREGISTRER</button>
                        </form>
                        
                        <!-- Fin du formulaire -->
                        
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Register Form Section End -->

<%@ include file="/WEB-INF/include/footer.jsp"%>