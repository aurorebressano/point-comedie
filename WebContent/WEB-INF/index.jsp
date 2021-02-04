<%@ page import="dao.DemoArray" %>
<%@ page import="metier.programmation.RepresentationDemo" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/include/head.jsp" %>

    <!-- Hero Section Begin -->
    <section class="hero-section">
        <div class="hero-items owl-carousel">
            <div class="single-hero-items set-bg" data-setbg="<%= request.getContextPath() %>/vue/img/theatre/retouches/fabienmaurin.jpg">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-5">
                            <span>Drames, comédie</span>
                            <h1>Dernières places</h1>
                            <p>De merveilleuses représentations de théâtre
                                à voir et revoir en famille</p>
                            <a href="#" class="primary-btn">Réserver</a>
                        </div>
                    </div>
                    <div class="off-card">
                        <h2>Offre <span>-50%!</span></h2>
                    </div>
                </div>
            </div>
            <div class="single-hero-items set-bg" data-setbg="<%= request.getContextPath() %>/vue/img/theatre/cyruscrossan.jpg">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-5">
                            <span>Enfance, Fantastique</span>
                            <h1>Dernières places</h1>
                            <p>La culture à portée de tous
                                pour le plaisir de vos sens</p>
                            <a href="#" class="primary-btn">Réserver</a>
                        </div>
                    </div>
                    <div class="off-card">
                        <h2>Offre <span>-50%!</span></h2>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Hero Section End -->

    <!-- Banner Section Begin -->
    <div class="banner-section spad">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-4">
                    <div class="single-banner">
                        <img src="<%= request.getContextPath() %>/vue/img/theatre/kylehead.jpg" alt="">
                        <div class="inner-text">
                            <h4>Comédie</h4>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="single-banner">
                        <img src="<%= request.getContextPath() %>/vue/img/theatre/mathisjrdl.jpg" alt="">
                        <div class="inner-text">
                            <h4>Monde</h4>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="single-banner">
                        <img src="<%= request.getContextPath() %>/vue/img/theatre/acteurs/pepesegura.jpg" alt="">
                        <div class="inner-text">
                            <h4>Drame</h4>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Banner Section End -->

    <!-- Women Banner Section Begin -->
    <section class="women-banner spad">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-3">
                    <div class="product-large set-bg" data-setbg="<%= request.getContextPath() %>/vue/img/theatre/retouches/hulkiokantabak.jpg">
                        <h2>Le spectacle</h2>
                        <a href="#">Qu'il vous faut</a>
                    </div>
                </div>
                <div class="col-lg-8 offset-lg-1">
                    <div class="filter-control">
                        <ul>
                            <li class="active">Féérie</li>
                            <li>Vaudeville</li>
                            <li>Futurisme</li>
                            <li>Mélodrames</li>
                        </ul>
                    </div>
                    <div class="product-slider owl-carousel">
                    
                    
                    <% for (RepresentationDemo representation : DemoArray.repres) 
						{%>
                        <div class="product-item">
                            <div class="pi-pic">
                                <img src="<%= request.getContextPath() + representation.getImage() %>" alt="Image: <%= representation.getTitre() %>">
                                <div class="sale">Dernières places</div>
                                <div class="icon">
                                    <i class="icon_heart_alt"></i>
                                </div>
                                <ul>
                                    <li class="w-icon active">
                                    	<button class="addtocart-buttons" id="idRepresEnvoye" name="idRepresEnvoye" value= "<%= representation.getId() %>">
                                    		<svg xmlns="http://www.w3.org/2000/svg" width="20" height="35" fill="currentColor" class="bi bi-cart-plus" viewBox="0 0 16 16" id="addcart">
                                    			<path d="M9 5.5a.5.5 0 0 0-1 0V7H6.5a.5.5 0 0 0 0 1H8v1.5a.5.5 0 0 0 1 0V8h1.5a.5.5 0 0 0 0-1H9V5.5z"/><path d="M.5 1a.5.5 0 0 0 0 1h1.11l.401 1.607 1.498 7.985A.5.5 0 0 0 4 12h1a2 2 0 1 0 0 4 2 2 0 0 0 0-4h7a2 2 0 1 0 0 4 2 2 0 0 0 0-4h1a.5.5 0 0 0 .491-.408l1.5-8A.5.5 0 0 0 14.5 3H2.89l-.405-1.621A.5.5 0 0 0 2 1H.5zm3.915 10L3.102 4h10.796l-1.313 7h-8.17zM6 14a1 1 0 1 1-2 0 1 1 0 0 1 2 0zm7 0a1 1 0 1 1-2 0 1 1 0 0 1 2 0z"/>
										  	</svg>
										</button>
									</li>
                                    <li class="quick-view"><a><%= representation.getVille() %></a></li>
                                    <li class="w-icon"><a><%= representation.getDate() %></a></li>
                                </ul>
                            </div>
                            <div class="pi-text">
                                <div class="catagory-name"><%= representation.getTheme() %></div>
                                <a href="#">
                                    <h5><%= representation.getTitre() %></h5>
                                </a>
                            </div>
                        </div> 
                        <% } %>
                   
                </div>
            </div>
        </div>
    </section>
    <!-- Women Banner Section End -->

    <!-- Deal Of The Week Section Begin-->
    <section class="deal-of-week set-bg spad" data-setbg="<%= request.getContextPath() %>/vue/img/theatre/tamarag_rpx.jpg">
        <div class="container">
            <div class="col-lg-6 text-center">
                <div class="section-title">
                    <h2>A ne pas manquer !</h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed<br /> do ipsum dolor sit amet,
                        consectetur adipisicing elit </p>
                </div>
                <div class="countdown-timer" id="countdown">
                    <div class="cd-item">
                        <span>56</span>
                        <p>Days</p>
                    </div>
                    <div class="cd-item">
                        <span>12</span>
                        <p>Hrs</p>
                    </div>
                    <div class="cd-item">
                        <span>40</span>
                        <p>Mins</p>
                    </div>
                    <div class="cd-item">
                        <span>52</span>
                        <p>Secs</p>
                    </div>
                </div>
                <a href="#" class="primary-btn">Shop Now</a>
            </div>
        </div>
    </section>
    <!-- Deal Of The Week Section End -->

    <input type="text" name="guarantee" value="Panier" style="display:none">
    <br><br><br><br>

    <!-- Instagram Section Begin -->
    <div class="instagram-photo">
        <div class="insta-item set-bg" data-setbg="<%= request.getContextPath() %>/vue/img/theatre/acteurs/kimson-doan.jpg">
            <div class="inside-text">
                <i class="ti-instagram"></i>
                <h5><a href="#">colorlib_Collection</a></h5>
            </div>
        </div>
        <div class="insta-item set-bg" data-setbg="<%= request.getContextPath() %>/vue/img/theatre/acteurs/christopher-campbel.jpg">
            <div class="inside-text">
                <i class="ti-instagram"></i>
                <h5><a href="#">colorlib_Collection</a></h5>
            </div>
        </div>
        <div class="insta-item set-bg" data-setbg="<%= request.getContextPath() %>/vue/img/theatre/acteurs/ludvig-wiese.jpg">
            <div class="inside-text">
                <i class="ti-instagram"></i>
                <h5><a href="#">colorlib_Collection</a></h5>
            </div>
        </div>
        <div class="insta-item set-bg" data-setbg="<%= request.getContextPath() %>/vue/img/theatre/acteurs/michael-dam.jpg">
            <div class="inside-text">
                <i class="ti-instagram"></i>
                <h5><a href="#">colorlib_Collection</a></h5>
            </div>
        </div>
        <div class="insta-item set-bg" data-setbg="<%= request.getContextPath() %>/vue/img/theatre/acteurs/jurica-koletic.jpg">
            <div class="inside-text">
                <i class="ti-instagram"></i>
                <h5><a href="#">colorlib_Collection</a></h5>
            </div>
        </div>
        <div class="insta-item set-bg" data-setbg="<%= request.getContextPath() %>/vue/img/theatre/acteurs/stefan-stefancik.jpg">
            <div class="inside-text">
                <i class="ti-instagram"></i>
                <h5><a href="#">colorlib_Collection</a></h5>
            </div>
        </div>
    </div>
    <!-- Instagram Section End -->

<!-- Latest Blog Section Begin -->
<section class="latest-blog spad">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">

				<div class="benefit-items">
					<div class="row">
						<div class="col-lg-4">
							<div class="single-benefit">
								<div class="sb-icon">
									<img src="<%= request.getContextPath() %>/vue/img/icon-1.png"
										alt="">
								</div>
								<div class="sb-text">
									<h6>Free Shipping</h6>
									<p>For all order over 99$</p>
								</div>
							</div>
						</div>
						<div class="col-lg-4">
							<div class="single-benefit">
								<div class="sb-icon">
									<img src="<%= request.getContextPath() %>/vue/img/icon-2.png"
										alt="">
								</div>
								<div class="sb-text">
									<h6>Delivery On Time</h6>
									<p>If good have problems</p>
								</div>
							</div>
						</div>
						<div class="col-lg-4">
							<div class="single-benefit">
								<div class="sb-icon">
									<img src="<%= request.getContextPath() %>/vue/img/icon-1.png"
										alt="">
								</div>
								<div class="sb-text">
									<h6>Secure Payment</h6>
									<p>100% secure payment</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
</section>

<!-- Latest Blog Section End -->
</form>
<%@include file="/WEB-INF/include/footer.jsp" %>