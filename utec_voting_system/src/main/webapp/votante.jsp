<!DOCTYPE html>
<%@include file="cache.jsp"%>
<%@page import="java.util.*" %>
<%@page import="com.utec.voting.model.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession sesion = request.getSession(true);
    //out.print(sesion.getAttribute("departamento") + " " + sesion.getAttribute("usuario") + " " + sesion.getAttribute("diputado") + " " + sesion.getAttribute("dui") + " " + sesion.getAttribute("knowsufragio"));
    Object nombre = sesion.getAttribute("usuario")==null ? null : sesion.getAttribute("usuario"); 
            if(nombre!=null){
        %>
<html>
    <head>
        <meta charset="utf-8">
                <title>Vista Votante</title>
                <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
                <link rel="stylesheet" href="css/bootstrap.css">
                <link rel="stylesheet" href="css/styleVotante.css">
                <link rel="shortcut icon" href="img/icono.ico">
                <link rel="stylesheet" href="css/font-awesome-4.4.0/css/font-awesome.min.css">
        </head>
<body onkeydown="return showKeyCode(event)">
	<header class="container-fluit">
			<div id="bar" class="row">
                            <form method="POST" action="LogOut">
                                <a href="LogOut?btnCerrar=true"><i class="fa fa-power-off fa-2x fa-3x" aria-hidden="true" style="float: left; margin-top:-4px; margin-left: 20px;"></i></a>
                                    <input type="hidden"  name="btnCerrar">
                            </form>
                            <div id="contenedor" class="cold-xs-12">
                            <center><img src="img/TribunalSupremoElectoral.jpg" alt="TSE" class="img-responsive"></center>
		            </div>
                        </div>
        </header>
	<div class="container-fluid">
        <div class="row" style="margin:15px">
        <nav class="col-lg-3">
        	 <div id="MainMenu">
                    <div class="list-group panel">
                      <a href="#demo1" class="list-group-item list-group-item-success strong" data-toggle="collapse" data-parent="#MainMenu" style="background-color:#dff0fb">Votaciones <i class="fa fa-caret-down"></i></a>
                      <div class="collapse" id="demo1">
                        <a href="votar.jsp" class="list-group-item strong" data-parent="#SubMenu1">Votar <i class="fa fa-caret-down"></i></a>
                        <div class="collapse list-group-submenu" id="SubMenu1">
                          <a href="#" class="list-group-item" data-parent="#SubMenu1">Subitem 1</a>
                          <a href="#" class="list-group-item" data-parent="#SubMenu1">Subitem 2 b</a>
                          <a href="#" class="list-group-item" data-parent="#SubMenu1">Subitem 3 c</a>     
                        </div>
                        <a href="graficosVotaciones.jsp" class="list-group-item" data-parent="#SubMenu1">Ver votaciones</a>
                          
                        <!--<a href="#" class="list-group-item">Subitem 3</a>-->
                      </div>
                            <a href="#demo2" class="list-group-item list-group-item-success strong" data-toggle="collapse" data-parent="#MainMenu" style="background-color:#dff0fb">Ayuda<i class="fa fa-caret-down"></i></a>
                        <div class="collapse" id="demo2">
                            <a href="pdf/manual.jsp" target="_blank" class="list-group-item strong" data-parent="#SubSubMenu2"><i class="fa fa-book fa-1x" aria-hidden="true"> Manual del Usuario</i></a>
                        </div>
                    </div>
                </div>
        </nav>

        <section class="col-lg-9" style="background-color:white">
        	<div id="contenedor" class="cold-xs-12">
        		<img src="img/traneventos_2.png" alt="TSE" class="img-responsive">
			</div>
			<br>
			<section class="slider-container">
				<ul id="slider" class="slider-wrapper">
					<li class="slide-current">
						<img src="img/img_1.jpg" alt="TSE" class="img-respondive">
					</li>

					<li>
						<img src="img/img_2.jpg" alt="TSE" class="img-respondive">
					</li>

					<li>
						<img src="img/img_3.jpg" alt="TSE" class="img-respondive">
					</li>

					<li>
						<img src="img/img_4.jpg" alt="TSE" class="img-respondive">
					</li>
				</ul>

				<ul id="slider-controls" class="slider-controls"></ul>
			</section>
			<div id="contenedor" class="cold-xs-12">
        			<img src="img/traneventos.png" alt="TSE" class="img-responsive">
        			<br>
		                <center><img src="img/grafica_1.png" alt="TSE" class="img-responsive"></center>
				</div>
		</section>
        </div>
        <aside></aside><br><br>
	<footer>
            <div class="container-fluid">
                <div class="row">
                    <div class="cold-xs-12">
                        <center><img src="img/voto2015.png" alt="TSE" class="img-responsive"></center>
                    </div>
		</div>
            </div>
	</footer>
 </div>
        <%
            }else{
                out.print("<script>location.replace('index.jsp')</script>");
            }
        %>
	<!-- Latest compiled and minified JavaScript -->
	<script src="http://code.jquery.com/jquery-latest.js"></script>
	<script src="js/bootstrap.js"></script>

	<!-- Scripts -->
	<script src="js/main.js"></script>
</body>
</html>