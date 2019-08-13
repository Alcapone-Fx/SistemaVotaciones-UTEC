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
	<title>Vista Votante</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="css/bootstrap.css">
        <link rel="shortcut icon" href="img/icono.ico">
    </head>
<body onkeydown="return showKeyCode(event)">
	<header class="container-fluit">
			<div id="bar" class="row">
                            <div id="contenedor" class="cold-xs-12">
                            <center><img src="img/TribunalSupremoElectoral.jpg" alt="TSE" class="img-responsive"></center>
		            </div>
                        </div>
        </header>
        <div align="center">
            <form method="POST" action="LogOut">
                <input type="submit" value="Log Out" name="btnCerrar">
            </form>
        </div>
	<div class="container-fluid">
            <div class="row" style="margin:20px">
                <nav class="col-md-4 col-lg-3">
        	 <div id="MainMenu">
  				<div class="list-group panel">
   				 	<a href="#demo1" class="list-group-item list-group-item-success strong" data-toggle="collapse" data-parent="#MainMenu" style="background-color:#dff0fb">Usuarios<i class="fa fa-caret-down"></i></a>
                                            <div class="collapse" id="demo1">
                                                <a href="#SubMenu1" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1">Administrar <i class="fa fa-caret-down"></i></a>
                                                <div class="collapse list-group-submenu" id="SubMenu1">
                                                    <a href="#SubMenu" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1">DUI <i class="fa fa-caret-down"></i></a>
                                                        <div class="collapse list-group-submenu" id="SubMenu">
                                                            <a href="admindui.jsp" class="list-group-item" data-parent="#SubMenu1">Gestionar</a>
                                                        </div>
                                                    <a href="#SubMenu2" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1">Usuario <i class="fa fa-caret-down"></i></a>
                                                    <div class="collapse list-group-submenu" id="SubMenu2">
                                                        <a href="adminusu.jsp" class="list-group-item" data-parent="#SubMenu1">Gestionar</a>
                                                    </div>
                                                    <a href="#SubMenu3" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1">Votante <i class="fa fa-caret-down"></i></a>
                                                    <div class="collapse list-group-submenu" id="SubMenu3">
                                                        <a href="adminvot.jsp" class="list-group-item" data-parent="#SubMenu1">Gestionar</a>
                                                    </div>
                                                    <a href="#SubMenu4" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1">Candidatos <i class="fa fa-caret-down"></i></a>
                                                    <div class="collapse list-group-submenu" id="SubMenu4">
                                                        <a href="admincand.jsp" class="list-group-item" data-parent="#SubMenu1">Gestionar</a>
                                                    </div>
                                                    
                                                    <a href="#SubMenu5" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1">Departamento <i class="fa fa-caret-down"></i></a>
                                                    <div class="collapse list-group-submenu" id="SubMenu5">
                                                        <a href="admindep.jsp" class="list-group-item" data-parent="#SubMenu1">Gestionar</a>
                                                    </div>
                                                    <a href="#SubMenu6" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1">Direccion <i class="fa fa-caret-down"></i></a>
                                                    <div class="collapse list-group-submenu" id="SubMenu6">
                                                        <a href="admindirec.jsp" class="list-group-item" data-parent="#SubMenu1">Gestionar</a>
                                                    </div>
                                                    <a href="#SubMenu7" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1">Estado Familiar<i class="fa fa-caret-down"></i></a>
                                                    <div class="collapse list-group-submenu" id="SubMenu7">
                                                        <a href="adminestado.jsp" class="list-group-item" data-parent="#SubMenu1">Gestionar</a>
                                                    </div>
                                                    <a href="#SubMenu8" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1">Municipio<i class="fa fa-caret-down"></i></a>
                                                    <div class="collapse list-group-submenu" id="SubMenu8">
                                                        <a href="adminmuni.jsp" class="list-group-item" data-parent="#SubMenu1">Gestionar</a>
                                                    </div>
                                                        <a href="#SubMenu9" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1">Partido<i class="fa fa-caret-down"></i></a>
                                                    <div class="collapse list-group-submenu" id="SubMenu9">
                                                        <a href="adminpart.jsp" class="list-group-item" data-parent="#SubMenu1">Gestionar</a>
                                                    </div>
                                                    <a href="#SubMenu10" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1">Tipo de Usuario<i class="fa fa-caret-down"></i></a>
                                                    <div class="collapse list-group-submenu" id="SubMenu10">
                                                        <a href="admintusu.jsp" class="list-group-item" data-parent="#SubMenu1">Gestionar</a>
                                                    </div>
                                                </div> 
                                </div>

    				<a href="#demo2" class="list-group-item list-group-item-success strong" data-toggle="collapse" data-parent="#MainMenu" style="background-color:#dff0fb">Votos<i class="fa fa-caret-down"></i></a>
   					<div class="collapse" id="demo2">
      					<a href="#SubSubMenu2" class="list-group-item strong" data-toggle="collapse" data-parent="#SubSubMenu2"><i class="glyphicon glyphicon-thumbs-up"></i>tipo de votos<i class="fa fa-caret-down"></i></a>
   					</div>
   					<a href="#demo3" class="list-group-item list-group-item-success strong" data-toggle="collapse" data-parent="#MainMenu" style="background-color:#dff0fb">Administrador<i class="fa fa-caret-down"></i></a>
   					<div class="collapse" id="demo3">
      					<a href="#SubMenu3" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1"><i class="glyphicon glyphicon-thumbs-up"></i> Personalisar<i class="fa fa-caret-down"></i></a>
   					</div>
  				</div>
		</div>
   	</nav>
        	<div class="col-md-4">
                    <fieldset>
                        <form name="frmDatos" action="#" method="post">
                            <div class="container-fluid">
				<h3>Información de la Cuenta</h3>
                                <hr color="black" size="3px" >
                                    <div class="alert alert-danger text-center" style="display:none;" id="error">
                                        <strong>Debe completar todos los campos</strong>
                                    </div>
                                    <div class="alert alert-success text-center" style="display:none;" id="exito">
                                        <strong>Su registro ha sido guardado</strong>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>DUI:</label><br>
                                            <input type="text" class="form-control input-sm chat-input"  name="dui" id="dui" placeholder="Escriba su DUI" onkeyup="validacion('dui');" size="50" required>
                                            <span class="help-block"></span> 
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Nombres:</label><br>
                                            <input type="text" class="form-control input-sm chat-input"  name="nombres" id="nombres" placeholder="Escriba sus Nombres" onkeyup="validacion('nombres');" size="50" required>
                                            <span class="help-block"></span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Apellidos:</label><br>
                                            <input type="text" class="form-control input-sm chat-input"  name="apellidos" id="apellidos" placeholder="Escriba sus Apellidos" onkeyup="validacion('apellidos');" size="50" required>
                                            <span class="help-block"></span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Genero:</label><br>
                                            <select id="genero" class="form-control input-sm chat-input" onchange="validacion('genero');">
                                                <option value="">Seleccione uno</option>
                                                <option value="Hombre">Masculino</option>
                                                <option value="Mujer">Femenino</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Fecha de Nacimiento:</label><br>
                                            <input type="date" name="fecha" class="form-control input-sm chat-input"  name="fecnac" id="fecnac" placeholder="(DD-MM-AAAA)" onkeyup="validacion('fecnac');" size="50" required>
                                            <span class="help-block"></span>
                                        </div>
                                    </div> 
                                    <div class="form-group">
                                        <div>
                                            <label>Fecha de Expiración:</label><br>
                                            <input type="text" class="form-control input-sm chat-input"  name="fecexp" id="fecexp" placeholder="(DD-MM-AAAA)" onkeyup="validacion('fecexp');" size="50" required>
                                            <span class="help-block"></span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Residencia:</label> 
                                            <input type="text" class="form-control input-sm chat-input"  name="residencia" id="residencia" placeholder="Escriba su Residencia" onkeyup="validacion('residencia');" size="50" required>
                                            <span class="help-block"></span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Municipio:</label>
                                            <input type="text" class="form-control input-sm chat-input"  name="municipio" id="municipio" placeholder="Escriba el Municipio" onkeyup="validacion('municipio');" size="50" required>
                                            <span class="help-block"></span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Departamento:</label>
                                            <select id="departamento" class="form-control input-sm chat-input" onchange="validacion('departamento');">
                                                <option value="">Selecciona una</option>
 						<option value="Santa Ana"> Santa Ana</option>
 						<option value="Ahuachapan"> Ahuachapan</option>
 						<option value="Sonsonate">Sonsonate </option>
 						<option value="Chalatenango"> Chalatenango</option>
 						<option value="San Salvador"> San Salvador</option>
 						<option value="Cuscatlan">Cuscatlan</option>
 						<option value="CabaÃ±as">CabaÃ±as</option>
 						<option value="La Libertad">La Libertad</option>
 						<option value="San Vicente">San Vicente</option>
 						<option value="Usulutan">Usulutan</option>
 						<option value="La Paz">La Paz</option>
 						<option value="San Miguel">San Miguel</option>
 						<option value="Morazan">Morazan</option>
 						<option value="La Union">La Union</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Estado Civil:</label>
                                            <select id="estado" class="form-control input-sm chat-input" onchange="validacion('estado');">
                                                <option value="">Seleccione uno</option>
                                                <option value="Soltero">Soltero/a</option>
                                                <option value="sonso">Casado/a</option>
                                                <option value="liber">Viudo/a</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Nombre Completo de la Madre:</label>
                                            <input type="text" class="form-control input-sm chat-input"  name="madre" id="madre" placeholder="Escriba el nombre de la madre" onkeyup="validacion('madre');" size="50" required>
                                            <span class="help-block"></span>
                                        </div>
                                    </div> 
                                    <div class="form-group">
                                        <div>
                                            <label>Nombre Completo del Padre:</label>
                                            <input type="text" class="form-control input-sm chat-input"  name="padre" id="padre" placeholder="Escriba el nombre del padre" onkeyup="validacion('padre');" size="50" required>
                                            <span class="help-block"></span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Correo:</label><br>
                                            <input type="text" class="form-control input-sm chat-input"  name="email" id="email" placeholder="Escriba de Correo" onkeyup="validacion('email');" size="50" required>
                                            <span class="help-block"></span>
                                        </div>
                                    </div>
                                    <div class="col-xs-12">
                                        <button type="button" class="btn btn-primary" onclick='verificar();'>Enviar</button>
                                        <button type="button" class="btn btn-primary" onclick='verificar();'>Cancelar</button>  
                                    </div>
                            </div>	
        		</form>
                    </fieldset>
        	</div>		
            </div>
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
