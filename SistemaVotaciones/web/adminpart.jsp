<!DOCTYPE html>
<%@include file="cache.jsp"%>
<%@page import="java.util.*" %>
<%@page import="modelo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession sesion = request.getSession(true);
    Object nombre = sesion.getAttribute("usuario")==null ? null : sesion.getAttribute("usuario");
            if(nombre!=null){
        %>
<html>
<head>
<meta charset="utf-8">
	<title>Panel de Personas</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        
        <script src="js/Jquery3.1.1.js" type="text/javascript"></script>
        <script src="js/jquery.validate.min.js" type="text/javascript"></script>
        
        <!-- hojas de estilo-->
        <link href="css/font-awesome-4.4.0/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/font-awesome-4.4.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/style.css">
        <link rel="shortcut icon" href="img/icono.ico">
        
        <script src="js/sweetalert.min.js" type="text/javascript"></script>
        <link href="css/sweetalert.css" rel="stylesheet" type="text/css"/>
</head>
<body onkeydown="return showKeyCode(event)">
    <%! public String id= "";
        public String namePartido= "";
         %>
         <%
             if(request.getParameter("btnEdit")!=null){
               id= request.getParameter("txtID");
                ArrayList<Partido> l1=new ArrayList<Partido>();
                l1.addAll((Collection)request.getAttribute("mosPart"));
                for(Partido v:l1){
                    if(v.getPartidoId()==Integer.parseInt(id)){
                        namePartido=v.getPatidoNombre();
                    }
                }
             }
             %>
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
            <section class="col-md-8 col-lg-9">
                <fieldset>
                    <form name="frmDatos" action="ControladorP" method="post">
                        <h2 style="text-align:center;">Panel de control</h2>
                            <legend>Ingresar Nuevo Partido</legend>                                                
                                    <div class="form-group">
                                        <div>
                                            <label>Partido:</label><br>
                                            <input type="text" class="form-control input-sm chat-input"  name="txtPartido" id="partido" placeholder="Escriba el Nombre del Partido" onkeyup="validacion('partido');" size="50" value="<%if(request.getParameter("btnEdit")!=null){out.print(namePartido);}%>" 
                                             required>
                                            <span class="help-block"></span>
                                            <input type="hidden" name="txtId" <%if(request.getParameter("btnEdit")!=null){out.print("value='"+id+"'");}%> >
                                        </div>
                                    </div>
                                    <!--<div class="form-group">
                                        <div>
                                            <label>ID del Partido</label><br>
                                            <input type="text" class="form-control input-sm chat-input"  name="txtId" id="id" placeholder="Escriba ID del Partido" onkeyup="validacion('id');" size="50" <%if(request.getParameter("btnEdit")!=null){out.print("value='"+id+"' readonly");}%> required>
                                            <input type="hidden" name="txtIdPro"
                                            <span class="help-block"></span> 
                                        </div>
                                    </div>-->
                                <input type="submit" name="btnInsertar" class="btn btn-primary" value="Agregar">
                                <input type="submit" name="btnModificar" class="btn btn-primary" value="Modificar">
                    </form>
                </fieldset>
                <fieldset style="margin-top: 30px">
                    <legend>
                        <!--<form name="frmMostrar" action="ControladorP" method="post">
                                     <input type="submit" name="btnMostrar" class="btn btn-primary" value="Mostrar Datos">
                            </form></legend>-->
                    <table class="table table-striped custab">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Partido</th>
                                        <th class="text-center" colspan="2">Action</th>
                                    </tr>
                                </thead>
                                    <%
                                        if(request.getAttribute("mosPart")!=null){
                                            ArrayList<Partido> l1=new ArrayList<Partido>();
                                            l1.addAll((Collection)request.getAttribute("mosPart"));
                                            for(Partido v:l1){
                                    %>
                                                <tr>
                                                    <td><%=v.getPartidoId()%></td>
                                                    <td><%=v.getPatidoNombre()%></td>
                                                <form name="frmEdit" action="" method="post">
                                                    <td class="text-center"><button class='btn btn-info btn-xs'><span class="glyphicon glyphicon-edit"></span> Edit</button> 
                                                        <input type="hidden" name="btnEdit" value="Edit" >
                                                        <input type="hidden" name="txtID" value="<%=v.getPartidoId()%>" >
                                                    </td>
                                                </form>
                                               <form name="frmDelete" action="ControladorP" method="post">
                                                    <td class="text-center">
                                                        <button class="btn btn-danger btn-xs" onclick="if(!confirm('¿Desea eliminarar el registro?')) return false;"><span class="fa fa-trash-o fa-lg"></span> Del</button>
                                                        <input type="hidden" name="btnDelete" value="Delete" >
                                                        <input type="hidden" name="txtID" value="<%=v.getPartidoId()%>" >
                                                    </td>
                                                </form>
                                                </tr>
                                                <%
                                            } 
                                        }    
                                %>
                                </table>
                </fieldset> 
            </section>
        </div>
</div><br><br>
	<footer>
            <div class="container-fluid">
                <div class="row">
                    <div class="cold-xs-12">
                        <center><img src="img/voto2015.png" alt="TSE" class="img-responsive"></center>
                    </div>
		</div>
            </div>
	</footer>
        <!--- Mensajes en pantalla-->
       <%
                    if(request.getParameter("btnInsertar")!=null||request.getParameter("btnModificar")!=null||request.getParameter("btnDelete")!=null){
                        if(request.getAttribute("msj")!=null){
                            String msj=request.getAttribute("msj").toString();String suces="", ms1="Error!";
                                if(msj.equals("1")||msj.equals("2")||msj.equals("3")){
                                    msj="¡Realizado!";
                %>
                <script>
                    swal("Felicidades!", "<%=msj%>", "success");
                </script>
                <%
                        }else{
                            msj="¡Error!";
                %>
                <script>
                    swal("Error!", "<%=msj%>", "error");
                </script>
                <%
                        }
                    }
                }

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