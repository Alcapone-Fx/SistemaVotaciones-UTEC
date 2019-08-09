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
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/style.css">
        <link rel="shortcut icon" href="img/icono.ico">
        
        <script src="js/sweetalert.min.js" type="text/javascript"></script>
        <link href="css/sweetalert.css" rel="stylesheet" type="text/css"/>
</head>
<body onkeydown="return showKeyCode(event)">
    <%!
        public String dui;
        public String fecha_ven;
        public String fecha_exp;
        public String nombres;
        public String apellido;
        public int genero;
        public String fecha_nac;
        public int departamento;
        public String depa;
        public String nom_madre;
        public String nom_padre;
        public int estado; 
        public int edad;
        public String eshta;
    %>
    <%
             if(request.getParameter("edit")!=null){
                String id= request.getParameter("Dui").toString();
                ArrayList<Dui> l1=new ArrayList<Dui>();
                l1.addAll((Collection)request.getAttribute("mosDui"));
                for(Dui v:l1){
                    if(v.getDui().equals(id)){
                        dui=v.getDui();
                        fecha_ven=v.getFecha_vencimiento();
                        fecha_exp=v.getFecha_expedicion();
                        nombres=v.getNombres();
                        apellido=v.getApellidos();
                        genero=v.getGenero_id();
                        fecha_nac=v.getFecha_nacimiento();
                        departamento=v.getDepartamento_id();
                        nom_madre=v.getNombre_madre();
                        nom_padre=v.getNombre_padre();
                        estado=v.getEstado_familiar();
                        edad=v.getEdad();
                    }     
                }
               if(request.getAttribute("mosDepa")!=null){
                   ArrayList<Departamento> l2 = new ArrayList<Departamento>();
                   l2.addAll((Collection) request.getAttribute("mosDepa"));
                   for (Departamento v : l2) {
                       if(v.getDepartamento_id()==departamento){
                           depa=v.getDepartamento_nombre().toString();
                       }
                   }}
               if(request.getAttribute("mosEsta")!=null){
                    ArrayList<EstadoFamiliar> l3 = new ArrayList<EstadoFamiliar>();
                            l3.addAll((Collection) request.getAttribute("mosEsta"));
                            for (EstadoFamiliar v : l3) {
                                if(v.getEstadoFamiliarId()==estado)
                                {
                                    eshta = v.getEstado().toString();
                                }
                            }
                        }
            }//solo esoo
             //if(request.getAttribute("mosDui")==null)response.sendRedirect("ControladorDui?btnM=true");//y ya (Y)okok 
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
                <form name="frmDatos" action="ControladorDui" method="post">
 				<h2 style="text-align:center;">Panel de control</h2>
 				<legend>Datos Personales</legend>
 					<div class="row">
 					<div class="col-md-6 col-lg-6">
                                    <div class="form-group">
                                        <div>
                                            <label>DUI:</label><br>
                                            <input type="text" class="form-control input-sm chat-input"  name="txtDui" id="dui" placeholder="Escriba su DUI" onkeyup="validacion('dui');" size="50" value="<%if(request.getParameter("edit")!=null){out.print(dui);}%>" required>
                                            <span class="help-block"></span> 
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Fecha de Vencimiento:</label><br>
                                            <input type="text" class="form-control input-sm chat-input"  name="txtFeV" id="fecven" placeholder="(DD-MM-AAAA)" onkeyup="validacion('fecven');" size="50" value="<%if(request.getParameter("edit")!=null){out.print(fecha_ven);}%>" required>
                                            <span class="help-block"></span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Fecha de Expedicion:</label><br>
                                            <input type="text" class="form-control input-sm chat-input"  name="txtFExp" id="fecexp" placeholder="(DD-MM-AAAA)" onkeyup="validacion('fecexp');" size="50" value="<%if(request.getParameter("edit")!=null){out.print(fecha_exp);}%>" required>
                                            <span class="help-block"></span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Nombres:</label><br>
                                            <input type="text" class="form-control input-sm chat-input"  name="txtNombre" id="nombres" placeholder="Escriba sus Nombres" onkeyup="validacion('nombres');" size="50" value="<%if(request.getParameter("edit")!=null){out.print(nombres);}%>" required>
                                            <span class="help-block"></span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Apellidos:</label><br>
                                            <input type="text" class="form-control input-sm chat-input"  name="txtApellido" id="apellidos" placeholder="Escriba sus Apellidos" onkeyup="validacion('apellidos');" size="50" value="<%if(request.getParameter("edit")!=null){out.print(apellido);}%>" required>
                                            <span class="help-block"></span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Genero:</label><br>
                                            <select id="genero" name="slcGene" class="form-control input-sm chat-input" onchange="validacion('genero');">
                                                <option value="<%if(request.getParameter("edit")!=null){out.print(genero);}%>"><%
                                                if(request.getParameter("edit")!=null){
                                                    if(genero==1)
                                                    {
                                                        out.print("M");
                                                    }
                                                    else if(genero==2)
                                                    {
                                                        out.print("F");
                                                    }
                                                }
                                                else{
                                                    out.print("Selecciona tu genero");
                                                }
                                            %></option>
                                                <%
                                        if(request.getAttribute("mosGene")!=null){
                                            ArrayList<Genero> l1=new ArrayList<Genero>();
                                            l1.addAll((Collection)request.getAttribute("mosGene"));
                                            for(Genero v:l1){
                                            %>
                                                <option value="<%=v.getGeneroId()%>"><%=v.getGenero()%></option>
                                             <%
                                                 }
                                            }
                                             %>
                                            </select>
                                        </div>
                                    </div>
                                    </div>
                                    <div class="col-md-6 col-lg-6">
                                    <div class="form-group">
                                        <div>
                                            <label>Fecha de Nacimiento:</label><br>
                                            <input type="date" name="txtFecha" class="form-control input-sm chat-input"  name="fecnac" id="fecnac" placeholder="(DD-MM-AAAA)" onkeyup="validacion('fecnac');" size="50" value="<%if(request.getParameter("edit")!=null){out.print(fecha_nac);}%>" required>
                                            <span class="help-block"></span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Departamento:</label>
                                            <select id="departamento" name="slcDepa" class="form-control input-sm chat-input" onchange="validacion('departamento');">
                                                <option value="<%if(request.getParameter("edit")!=null){out.print("value='"+departamento+"'");}%>"><%if(request.getParameter("edit")!=null){out.print(depa);}else{out.print("Selecccione un Departamento");}%></option>
 						 <%
                                                    if(request.getAttribute("mosDepa")!=null){
                                                        ArrayList<Departamento> l1=new ArrayList<Departamento>();
                                                        l1.addAll((Collection)request.getAttribute("mosDepa"));
                                                        for(Departamento v:l1){
                                                %>
                                                    <option value="<%=v.getDepartamento_id()%>"><%=v.getDepartamento_nombre()%></option>
                                                <%
                                                        }
                                                    }
                                                %>
                                            </select>
                                        </div>
                                    </div>
 					<div class="form-group">
                                        <div>
                                            <label>Nombre Completo de la Madre:</label>
                                            <input type="text" class="form-control input-sm chat-input"  name="txtMadre" id="madre" placeholder="Escriba el nombre de la madre" onkeyup="validacion('madre');" size="50" value="<%if(request.getParameter("edit")!=null){out.print(nom_madre);}%>" required>
                                            <span class="help-block"></span>
                                        </div>
                                    </div> 
                                    <div class="form-group">
                                        <div>
                                            <label>Nombre Completo del Padre:</label>
                                            <input type="text" class="form-control input-sm chat-input"  name="txtPadre" id="padre" placeholder="Escriba el nombre del padre" onkeyup="validacion('padre');" size="50" value="<%if(request.getParameter("edit")!=null){out.print(nom_padre);}%>" required>
                                            <span class="help-block"></span>
                                        </div>
                                    </div>
 					<div class="form-group">
                                        <div>
                                            <label>Estado Civil:</label>
                                            <select id="estado" name="slcEsta" class="form-control input-sm chat-input" onchange="validacion('estado');">
                                                <option value="<%if(request.getParameter("edit")!=null){out.print(estado);}%>"><%if(request.getParameter("edit")!=null){out.print(eshta);}else{out.print("Seleccione Estado Familiar");}%></option>
                                                <%
                                                if(request.getAttribute("mosEsta")!=null){
                                                    ArrayList<EstadoFamiliar> l1=new ArrayList<EstadoFamiliar>();
                                                    l1.addAll((Collection)request.getAttribute("mosEsta"));
                                                    for(EstadoFamiliar v:l1){
                                                %>
                                                <option value="<%=v.getEstadoFamiliarId()%>"><%=v.getEstado()%></option>
                                                <%
                                                    }
                                                   }                                                
                                                %>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label>Edad:</label>
                                            <input type="text" class="form-control input-sm chat-input"  name="txtEdad" id="edad" placeholder="Escriba la Edad" onkeyup="validacion('edad');" size="50" value="<%if(request.getParameter("edit")!=null){out.print(edad);}%>" required>
                                            <span class="help-block"></span>
                                        </div>
                                    </div>
 				</div></div>
                                <input type="submit" name="btnInsertar" class="btn btn-primary" value="Agregar">
                                <input type="submit" name="btnModificar" class="btn btn-primary" value="Modificar"> 
                        </form>
 		</fieldset>
                       <br>
                       
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
        </section>
 		</div>
 	</div><br>
        <div class="row">
            <div class="col-xs-10 col-xs-offset-1 table-responsive">
                <fieldset style="margin-top: 30px">
                    <legend>Datos</legend>
                    <table class="table table-striped custab" style=".custab{ padding: 0px;margin: 0px;}">
                                <thead>
                                    <tr>
                                        <th>DUI</th>
                                        <th>Fecha Vencimiento</th>
                                        <th>Fecha Expedicion</th>
                                        <th>Nombres</th>
                                        <th>Apellidos</th>
                                        <th>Genero</th>
                                        <th>Fecha Nacimiento</th>
                                        <th>Departamento</th>
                                        <th>Nombre Madre</th>
                                        <th>Nombre Padre</th>
                                        <th>Estado Civil</th>
                                        <th>Edad</th>
                                        <th class="text-center">Action</th>
                                    </tr>
                                </thead>
                                    <%
                                        if(request.getAttribute("mosDui")!=null){
                                            ArrayList<Dui> l1=new ArrayList<Dui>();
                                            l1.addAll((Collection)request.getAttribute("mosDui"));
                                            for(Dui v:l1){
                                    %>
                                    <tr><td><%=v.getDui()%></td><td><%=v.getFecha_vencimiento()%></td><td><%=v.getFecha_expedicion()%></td><td><%=v.getNombres()%></td><td><%=v.getApellidos()%></td><td><%=v.getGenero_id()%></td><td><%=v.getFecha_nacimiento()%></td><td><%=v.getDepartamento_id()%></td><td><%=v.getNombre_madre()%></td><td><%=v.getNombre_padre()%></td><td><%=v.getEstado_familiar()%></td><td><%=v.getEdad()%></td>
                                                    <td>
                                                        <form name="frmEdit" method="post">
                                                        <button class='btn btn-info btn-xs'><span class="glyphicon glyphicon-edit"></span> Edit</button> 
                                                        <input type="hidden" name="edit">
                                                        <input type="hidden" name="Dui" value="<%=v.getDui()%>" >
                                                        </form>
                                                    </td>
                                                    <td>
                                                        <form name="frmDelete" action="ControladorDui" method="post">
                                                        <button class="btn btn-danger btn-xs" onclick="if(!confirm('¿Desea eliminarar el registro?')) return false;"><span class="glyphicon glyphicon-remove"></span> Del</button>
                                                        <input type="hidden" name="btnEliminar">
                                                        <input type="hidden" name="Dui" value="<%=v.getDui()%>" >
                                                        </form>
                                                    </td></tr>
                                                <%
                                            } 
                                        }
                                    %>
                        </table>
            </div>
        </div>
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