<!DOCTYPE html>
<%@include file="cache.jsp"%>
<%@page import="java.util.*" %>
<%@page import="com.utec.voting.model.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession sesion = request.getSession(true);
    Object nombre = sesion.getAttribute("usuario")==null ? null : sesion.getAttribute("usuario");
            if(nombre!=null){
        %>
<html>
<head>
<meta charset="utf-8">
	<title>Panel Administrador</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <script src="js/Jquery3.1.1.js" type="text/javascript"></script>
        <script src="js/jquery.validate.min.js" type="text/javascript"></script>
        
        <!-- hojas de estilo-->
        <link href="css/font-awesome-4.4.0/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/style.css">
        <link rel="shortcut icon" href="img/icono.ico">
        
        <script src="js/sweetalert.min.js" type="text/javascript"></script>
        <link href="css/sweetalert.css" rel="stylesheet" type="text/css"/>
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
       <nav class="col-md-4 col-lg-3">
        	 <div id="MainMenu">
  				<div class="list-group panel">
   				 	<a href="#demo1" class="list-group-item list-group-item-success strong" data-toggle="collapse" data-parent="#MainMenu" style="background-color:#dff0fb">Administrar<i class="fa fa-caret-down"></i></a>
                                            <div class="collapse" id="demo1">
                                                <a href="#SubMenu1" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1">DUI <i class="fa fa-caret-down"></i></a>
                                                        <div class="collapse list-group-submenu" id="SubMenu1">
                                                            <a href="ControladorDui" class="list-group-item" data-parent="#SubMenu1">Gestionar</a>
                                                        </div>
                                                    <a href="#SubMenu2" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1">Usuario <i class="fa fa-caret-down"></i></a>
                                                    <div class="collapse list-group-submenu" id="SubMenu2">
                                                        <a href="ControladorU" class="list-group-item" data-parent="#SubMenu1">Gestionar</a>
                                                    </div>
                                                    <a href="#SubMenu3" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1">Candidatos <i class="fa fa-caret-down"></i></a>
                                                    <div class="collapse list-group-submenu" id="SubMenu3">
                                                        <a href="ControladorCandidato" class="list-group-item" data-parent="#SubMenu1">Gestionar</a>
                                                    </div>
                                                    <a href="#SubMenu4" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1">Departamento <i class="fa fa-caret-down"></i></a>
                                                    <div class="collapse list-group-submenu" id="SubMenu4">
                                                        <a href="ControladorDepartamento" class="list-group-item" data-parent="#SubMenu1">Gestionar</a>
                                                    </div>
                                                        <a href="#SubMenu5" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1">Partido<i class="fa fa-caret-down"></i></a>
                                                    <div class="collapse list-group-submenu" id="SubMenu5">
                                                        <a href="ControladorP" class="list-group-item" data-parent="#SubMenu1">Gestionar</a>
                                                    </div>
                                                    <a href="#SubMenu6" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1">Tipo de Usuario<i class="fa fa-caret-down"></i></a>
                                                    <div class="collapse list-group-submenu" id="SubMenu6">
                                                        <a href="ControladorTipoUsuario" class="list-group-item" data-parent="#SubMenu1">Gestionar</a>
                                                    </div> 
                                </div>

                                        <a href="#demo2" class="list-group-item list-group-item-success strong" data-toggle="collapse" data-parent="#MainMenu" style="background-color:#dff0fb">Ayuda<i class="fa fa-caret-down"></i></a>
                                        <div class="collapse" id="demo2">
                                            <a href="pdf/manualP.jsp" target="_blank" class="list-group-item" data-parent="#SubMenu1"><i class="fa fa-book fa-1x" aria-hidden="true"></i>Manual del programador</a>
                                        </div>
                                        <a href="#demo3" class="list-group-item list-group-item-success strong" data-toggle="collapse" data-parent="#MainMenu" style="background-color:#dff0fb">Reportes<i class="fa fa-caret-down"></i></a>
                                        <div class="collapse" id="demo3">
                                            <a href="reportDipuMenorVoto.jsp" target="_blank" class="list-group-item" data-parent="#SubMenu1"><i class="fa fa-file-pdf-o fa-1x" aria-hidden="true"></i> Menos votados</i></a>
                                            <a href="reportes.jsp" target="_blank" class="list-group-item" data-parent="#SubMenu1"><i class="fa fa-file-pdf-o fa-1x" aria-hidden="true"></i> Cantidad de votos</i></a>
                                        </div>
                                        <a href="#demo4" class="list-group-item list-group-item-success strong" data-toggle="collapse" data-parent="#MainMenu" style="background-color:#dff0fb">Mostrar Graficas<i class="fa fa-caret-down"></i></a>
                                        <div class="collapse" id="demo4">
                                            <a href="graficosVotaciones.jsp" target="_blank" class="list-group-item" data-parent="#SubMenu1"><i class="fa fa-file-pdf-o fa-1x" aria-hidden="true"></i>Graficas</i></a>
                                        </div>
  				</div>
		</div>
   	</nav>
        <section class="col-md-8 col-lg-9" style="background-color:white">
        	<div style="background: #bbb; color: white; padding: 0.5%; border-radius: 5px 5px 0px 0px;">
        		<h2>¿Necesitas ayuda para administrar?</h2>
        	</div>
        	<div class="row">
        		<hgroup>
        			<h2>Primer Paso:</h2>
        		</hgroup>
        		<p>
        			Empieza dando click a la opcion que desea administrar. Y automaticamente desplegara una opcion
        		</p>
        		<img src="img/paso1.jpg" class="img-responsive">
        	</div>
        	<div class="row">
        		<hgroup>
        			<h2>Segundo Paso:</h2>
        		</hgroup>
        		<p>
        			En la segunda opcion debes dar un click en la opcion del menu que dice "Administrar". Ahi se mostrara el panel de administracion de usuarios y votantes
        		</p>
        		<img src="img/paso3.jpg" class="img-responsive">
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
                /**out.print("Por favor inicie sesion  ");
                out.print("<br><a href='index.jsp'>Iniciar sesion</a>");**/
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