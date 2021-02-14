    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="<%= request.getContextPath() %>/vue/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/vue/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/vue/css/themify-icons.css" type="text/css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/vue/css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/vue/css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/vue/css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/vue/css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/vue/css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/vue/css/style.css" type="text/css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/vue/css/mystyle.css" type="text/css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/vue/css/styleAm.css" type="text/css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/vue/css/cssAm.css" type="text/css">
    
    <link rel="icon" type="image/png" href="<%= request.getContextPath() %>/vue/img/theatre/logomini.svg" />
</head>

<body>
    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

    <!-- Header Section Begin -->
    <header class="header-section">
        <div class="header-top">
            <div class="container">
                <div class="ht-right">
                	<% if (request.getSession().getAttribute("administrateur") != null) { %>
                	 <a href="<%= request.getContextPath() %>/session/deconnexion" class="login-panel"><i class="fa fa-user"></i>D�connexion</a>
               	 	<% } else { %>
                	 <a href="<%= request.getContextPath() %>/session/connexion" class="login-panel"><i class="fa fa-user"></i>Connexion</a>
                  	<% } %>
                    <div class="lan-selector">
                        <select class="language_drop" name="countries" id="countries" style="width:300px;">
                            <option value='yt' data-image="<%= request.getContextPath() %>/vue/img/flag-1.jpg" data-imagecss="flag yt"
                                data-title="English">Fran�ais</option>
                            <option value='yu' data-image="<%= request.getContextPath() %>/vue/img/flag-2.jpg" data-imagecss="flag yu"
                                data-title="Bangladesh">English </option>
                        </select>
                    </div>
                    <div class="top-social">
                        <a href="#"><i class="ti-facebook"></i></a>
                        <a href="#"><i class="ti-twitter-alt"></i></a>
                        <a href="#"><i class="ti-linkedin"></i></a>
                        <a href="#"><i class="ti-pinterest"></i></a>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="inner-header">
                <div class="row">
                    <div class="col-lg-2 col-md-2">
                        <div class="logo">
                            <a href="<%= request.getContextPath() %>/Accueil">
                                <img src="<%= request.getContextPath() %>/vue/img/theatre/logo/logo.svg" width="250px" alt="">
                            </a>
                        </div>
                    </div>
                   <div class="col-lg-7 col-md-7">
                        <div class="advanced-search">
                            <button type="button" class="category-btn" style="visibility:hidden">Categories</button>
                            <div class="input-group">
                                <input type="text" placeholder="Rechercher une s�ance....">
                                <button type="button"><i class="ti-search"></i></button>
                            </div>
                        </div>
                    </div>
                            <li class="cart-icon" style="list-style: none">
                                <button type="submit" class="primary-btn" height="70%"> 
                                    <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-cart4" viewBox="0 0 16 16">
  									<path d="M0 2.5A.5.5 0 0 1 .5 2H2a.5.5 0 0 1 .485.379L2.89 4H14.5a.5.5 0 0 1 .485.621l-1.5 6A.5.5 0 0 1 13 11H4a.5.5 0 0 1-.485-.379L1.61 3H.5a.5.5 0 0 1-.5-.5zM3.14 5l.5 2H5V5H3.14zM6 5v2h2V5H6zm3 0v2h2V5H9zm3 0v2h1.36l.5-2H12zm1.11 3H12v2h.61l.5-2zM11 8H9v2h2V8zM8 8H6v2h2V8zM5 8H3.89l.5 2H5V8zm0 5a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0zm9-1a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0z"/>
									</svg>
                                    <!--<span>3</span>-->
                                </button>
                            </li>
                    </div>
                </div>
            </div>
        <div class="nav-item">
            <div class="container">
                <div class="nav-depart">
                    <div class="depart-btn">
                        <i class="ti-menu"></i>
                        <span>Genres</span>
                        <ul class="depart-hover">
                            <li class="active"><a href="#">Vaudeville</a></li>
                            <li><a href="#">Drames</a></li>
                            <li><a href="#">M�lodrames</a></li>
                            <li><a href="#">Com�die</a></li>
                            <li><a href="#">Enfance</a></li>
                            <li><a href="#">F�erie</a></li>
                            <li><a href="#">Futurisme</a></li>
                            <li><a href="#">Trag�dies</a></li>
                        </ul>
                    </div>
                </div>
                <nav class="nav-menu mobile-menu">
                    <ul>
                        <li><a href="Accueil">Accueil</a></li>
                        <li><a href="<%= request.getContextPath()%>/vue/gestionTheatre/adminTheatre.jsp">Th��tre</a></li>
                        <li><a href="#">Com�diens</a>
                        </li>
                        <li><a href="#">Spectacles</a>
						 <ul class="dropdown">
                                <li><a href="#">Rechercher </a></li>
                                <li><a href="#">Mes favoris</a></li>
                      
                            </ul> </li>
                        
                      						<li><a href="./contact.html">Contact</a>
						 <ul class="dropdown">
                                <li><a  href="#">Qui sommes-nous ?</a></li>
                             
                      
                            </ul></li>
                    </ul>
                </nav>
                <div id="mobile-menu-wrap"></div>
            </div>
        </div>
    </header>
    <!-- Header End -->