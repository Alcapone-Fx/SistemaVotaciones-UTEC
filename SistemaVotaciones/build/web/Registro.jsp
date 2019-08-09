<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Test</title>
	<link rel="stylesheet" href="css/Estilos2.css" />
    <script src="js/Jquery3.1.1.js" type="text/javascript"></script>

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="shortcut icon" href="img/icono.ico">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
</head>
<body onkeydown="return showKeyCode(event)">
	<header>
		<div class="container-fluid">
                    <div id="bar" class="row">
                        <div id="contenedor" class="cold-xs-12">
                            <center><img src="img/TribunalSupremoElectoral.jpg" alt="TSE" class="img-responsive"></center>
		        </div>
		    </div>
		</div>
	</header>
	<div class="container-fluid">
            <section class="row">
        	<article class="col-xs-4"></article>
                    <article class="col-xs-4">
                        <fieldset>
                            <form name="frmDatos" action="#" method="post">
                                <div class="form-group"> 
                                    <h3>Datos Importantes</h3> <a href="index.jsp">Ya estoy registrado</a>
                                    <hr color="black" size="2px" >
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
                                            <label>Correo:</label><br>
                                            <input type="text" class="form-control input-sm chat-input"  name="email" id="email" placeholder="Escriba de Correo" onkeyup="validacion('email');" size="50" required>
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
                                            <input type="text" class="form-control input-sm chat-input"  name="fecnac" id="fecnac" placeholder="(DD-MM-AAAA)" onkeyup="validacion('fecnac');" size="50" required>
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
                                            <label>Municipio:</label>
                                            <input type="text" class="form-control input-sm chat-input"  name="municipio" id="municipio" placeholder="Escriba el Municipio" onkeyup="validacion('municipio');" size="50" required>
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
                                            <label>Estado Civil:</label>
                                            <select id="estado" class="form-control input-sm chat-input" onchange="validacion('estado');">
                                                <option value="">Seleccione uno</option>
                                                <option value="Soltero">Soltero/a</option>
                                                <option value="sonso">Casado/a</option>
                                                <option value="liber">Viudo/a</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-xs-12">
                                        <button type="button" class="btn btn-primary" onclick='verificar();'>Registrarme</button>
                                        <button type="button" class="btn btn-primary" onclick='verificar();'>Cancelar</button>  
                                    </div>
                                </div>
                            </form>
                        </fieldset>  
                    </article>                               
            </section>
        </div>
        <aside class="col-xs-4">
	</aside><br><br>
	<footer>
            <div class="container-fluid">
                <div class="row">
                    <div class="cold-xs-12">
                        <center><img src="img/voto2015.png" alt="TSE" class="img-responsive"></center>
                    </div>
		</div>
            </div>
	</footer>
	<script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>
</body>
</html>