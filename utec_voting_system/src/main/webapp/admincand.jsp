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
	<title>Panel de Personas</title>
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
<style type="text/css">
  input[type=text] {
    width: 100%;
  }
</style>
<body onkeydown="return showKeyCode(event)">
    <%!
        public int i;
        public String nombre;
        public String apellido;
        public int ii;
        public String partido;
    %>
    
    <%
        if(request.getParameter("edit")!=null){
            int id=Integer.parseInt(request.getParameter("ID"));
            ArrayList<CandidatoDiputado> l1=new ArrayList<CandidatoDiputado>();
            l1.addAll((Collection)request.getAttribute("mosCan"));
            for(CandidatoDiputado v:l1){
                if(v.getCandidato_id()==id){
                    i=v.getCandidato_id();
                    nombre=v.getCandidato_nombre();
                    apellido=v.getCandidato_apellido();
                    ii=v.getCandidatodiputado_partido();
                }
            }
        }
        if(request.getAttribute("mosPar")!=null){
                ArrayList<Partido> l1=new ArrayList<Partido>();
                l1.addAll((Collection)request.getAttribute("mosPar"));
                for(Partido v:l1){
                    if(v.getPartidoId()==ii){
                        partido=v.getPatidoNombre().toString();
                    }
                }}
        //if(request.getAttribute("mosCan")==null)response.sendRedirect("ControladorCandidato?btnMostrar=true");
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
        <div class="row" style="margin:20px">
        <nav class="col-md-4 col-lg-3">
        	 <div id="MainMenu">
  				<div class="list-group panel">
   				 	<a href="#demo1" class="list-group-item list-group-item-success strong" data-toggle="collapse" data-parent="#MainMenu" style="background-color:#dff0fb">Usuarios<i class="fa fa-caret-down"></i></a>
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

    				<a href="#demo2" class="list-group-item list-group-item-success strong" data-toggle="collapse" data-parent="#MainMenu" style="background-color:#dff0fb">Votos<i class="fa fa-caret-down"></i></a>
   					<div class="collapse" id="demo2">
      					<a href="#SubSubMenu2" class="list-group-item strong" data-toggle="collapse" data-parent="#SubSubMenu2"><i class="glyphicon glyphicon-thumbs-up"></i>tipo de votos<i class="fa fa-caret-down"></i></a>
   					</div>
   					<a href="#demo3" class="list-group-item list-group-item-success strong" data-toggle="collapse" data-parent="#MainMenu" style="background-color:#dff0fb">Administrador<i class="fa fa-caret-down"></i></a>
   					<div class="collapse" id="demo3">
      					<a href="#SubMenu3" class="list-group-item strong" data-toggle="collapse" data-parent="#SubMenu1"><i class="glyphicon glyphicon-thumbs-up"></i> Personalisar<i class="fa fa-caret-down"></i></a>
   					</div>
                                        <a href="#demo4" class="list-group-item list-group-item-success strong" data-toggle="collapse" data-parent="#MainMenu" style="background-color:#dff0fb">Mostrar Graficas<i class="fa fa-caret-down"></i></a>
                                        <div class="collapse" id="demo4">
                                            <a href="graficosVotaciones.jsp" target="_blank" class="list-group-item" data-parent="#SubMenu1"><i class="fa fa-file-pdf-o fa-1x" aria-hidden="true"></i>Graficas</i></a>
                                        </div>
  				</div>
		</div>
   	</nav>
 	<div class="col-md-4 col-lg-9">
            <fieldset>
                <form name="frmDatos" action="ControladorCandidato" method="POST">
                        <h2 style="text-align:center;">Panel de control</h2>
                            <legend>Ingresar Nuevo Candidato</legend>
                                    <!--<div class="form-group">
                                        <div>
                                            <label>ID de Candidato</label><br>
                                            <input type="text" class="form-control input-sm chat-input"  name="id" id="id" placeholder="Escriba ID del Candidato" onkeyup="validacion('id');" size="50" <%if(request.getParameter("edit")!=null){out.print("value="+i);}%> required>
                                            <span class="help-block"></span> 
                                        </div>
                                    </div>-->
                                    <div class="form-group">
                                        <div>
                                            <input type="hidden" name="txtId" <%if(request.getParameter("edit")!=null){out.print("value="+i);}%>/>
                                            <label>Nombres del Candidato:</label><br>
                                            <input type="text" class="form-control input-sm chat-input"  name="nombres" id="nombres" placeholder="Escriba el nombre del Candidato" onkeyup="validacion('nombres');" size="50" value="<%if(request.getParameter("edit")!=null){out.print(nombre);}%>"required>
                                            <span class="help-block"></span> 
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Apellidos del Candidato</label><br>
                                            <input type="text" class="form-control input-sm chat-input"  name="apellidos" id="apellidos" placeholder="Escriba el apellido del Candidato" onkeyup="validacion('apellidos');" size="50" value="<%if(request.getParameter("edit")!=null){out.print(apellido);}%>"required>
                                            <span class="help-block"></span> 
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>ID de Partido</label><br>
                                            <%//if(request.getParameter("edit")!=null){out.print("value="+ii);}%>
                                             <select  name="slcPart" class="form-control input-sm chat-input" onchange="validacion('estado');">
                                                <option value="<%if(request.getParameter("edit")!=null){out.print(ii);}%>"><%if(request.getParameter("edit")!=null){out.print(partido);}else{out.print("Seleccione Partido");}%></option>
                                                <%
                                                if(request.getAttribute("mosPar")!=null){
                                                    ArrayList<Partido> l1=new ArrayList<Partido>();
                                                    l1.addAll((Collection)request.getAttribute("mosPar"));
                                                    for(Partido v:l1){
                                                %>
                                                <option value="<%=v.getPartidoId()%>"><%=v.getPatidoNombre()%></option>
                                                <%
                                                    }
                                                   }                                                
                                                %>
                                            </select>
                                            <span class="help-block"></span> 
                                        </div>
                                    </div>				
                            <input type="submit" name="btnInsertar" class="btn btn-primary" value="Agregar">
                            <input type="submit" name="btnModificar" class="btn btn-primary" value="Modificar"> 
                            <!--<input type="reset" name="btnReset" value="Cancelar" class="btn btn-primary" onclick="alert('Datos Insertados!')">-->
                </form>
            </fieldset>
                 <br>
                <!--<form name="frmCandidato" action="ControladorCandidato" method="POST">
                    <input type="submit" name="btnMostrar" value="Mostrar Datos" class="btn btn-primary">
                </form>-->
            <fieldset style="margin-top: 30px">
                    <legend>Datos</legend>
                    <table class="table table-striped custab">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Nombres</th>
                                        <th>Apellidos</th>
                                        <th>ID Partido</th>
                                        <th class="text-center">Action</th>
                                    </tr>
                                </thead>
                                    <%
                                        if(request.getAttribute("mosCan")!=null){
                                            ArrayList<CandidatoDiputado> l1=new ArrayList<CandidatoDiputado>();
                                            l1.addAll((Collection)request.getAttribute("mosCan"));
                                            for(CandidatoDiputado v:l1){
                                    %>
                                                <tr><td><%=v.getCandidato_id()%></td><td><%=v.getCandidato_nombre()%></td><td><%=v.getCandidato_apellido()%></td><td><%=v.getCandidatodiputado_partido()%></td>
                                                    <td>
                                                        <form name="frmEdit"  method="post">
                                                        <button class='btn btn-info btn-xs'><span class="glyphicon glyphicon-edit"></span> Edit</button> 
                                                        <input type="hidden" name="edit">
                                                        <input type="hidden" name="ID" value="<%=v.getCandidato_id()%>" >
                                                        </form>
                                                    </td>
                                                    <td>
                                                        <form name="frmDelete" action="ControladorCandidato" method="post">
                                                        <button class="btn btn-danger btn-xs" onclick="if(!confirm('¿Desea eliminarar el registro?')) return false;"><span class="glyphicon glyphicon-remove"></span> Del</button>
                                                        <input type="hidden" name="btnEliminar">
                                                        <input type="hidden" name="ID" value="<%=v.getCandidato_id()%>" >
                                                        </form>
                                                    </td></tr>
                                                <%
                                            } 
                                        }
                                    %>
                        </table>
                </fieldset>
                <%
                    if(request.getParameter("btnInsertar")!=null||request.getParameter("btnModificar")!=null||request.getParameter("btnEliminar")!=null){
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
            %>
 	</div>
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