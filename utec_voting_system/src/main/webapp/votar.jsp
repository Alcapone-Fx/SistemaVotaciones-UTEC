<!DOCTYPE html>
<%@include file="cache.jsp"%>
<%@page import="java.util.*" %>
<%@page import="com.utec.voting.model.*"%>
<%@page import="org.json.JSONArray"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession sesion = request.getSession(true);
    Object nombre = sesion.getAttribute("usuario")==null ? null : sesion.getAttribute("usuario");
            if(nombre!=null){
        %>
<%-- 
    Document   : votar
    Created on : 09-20-2016, 12:09:11 AM
    Author     : Eduardo Mejia
--%>
<html>

<meta http-equiv="content-type" content="text/html;charset=UTF-8" /><!-- /Added by HTTrack -->
<head>
<meta charset="utf-8">
<title>Simulador de votación</title>

<link href="css/votos.css" rel="stylesheet" type="text/css">
</head>

<body id="body">
<header>
<%
        if(sesion.getAttribute("knowsufragio").equals(0)){
       if(sesion.getAttribute("departamento").equals("1")){
            %>
                <h1><span>Simulador</span> de votación por Santa Ana</h1>
           <%
       }else if(sesion.getAttribute("departamento").equals("2")){
            %>
                <h1><span>Simulador</span> de votación por Ahuachapan</h1>
           <%
       }else if(sesion.getAttribute("departamento").equals("3")){
            %>
                <h1><span>Simulador</span> de votación por Sosonate</h1>
           <%
       }else if(sesion.getAttribute("departamento").equals("4")){
            %>
                <h1><span>Simulador</span> de votación por Chalatenango</h1>
           <%
       }else if(sesion.getAttribute("departamento").equals("5")){
            %>
                <h1><span>Simulador</span> de votación por San Salvador</h1>
           <%
       }else if(sesion.getAttribute("departamento").equals("6")){
            %>
                <h1><span>Simulador</span> de votación por Cuscatlan</h1>
           <%
       }else if(sesion.getAttribute("departamento").equals("7")){
            %>
                <h1><span>Simulador</span> de votación por Cabañas</h1>
           <%
       }else if(sesion.getAttribute("departamento").equals("8")){
            %>
                <h1><span>Simulador</span> de votación por La Libertad</h1>
           <%
       }else if(sesion.getAttribute("departamento").equals("9")){
            %>
                <h1><span>Simulador</span> de votación por San Vicente</h1>
           <%
       }else if(sesion.getAttribute("departamento").equals("10")){
            %>
                <h1><span>Simulador</span> de votación por Usulutan</h1>
           <%
       }else if(sesion.getAttribute("departamento").equals("11")){
            %>
                <h1><span>Simulador</span> de votación por La Paz</h1>
           <%
       }else if(sesion.getAttribute("departamento").equals("12")){
            %>
                <h1><span>Simulador</span> de votación por San Miguel</h1>
           <%
       }else if(sesion.getAttribute("departamento").equals("13")){
            %>
                <h1><span>Simulador</span> de votación por Morazan</h1>
           <%
       }else if(sesion.getAttribute("departamento").equals("14")){
            %>
                <h1><span>Simulador</span> de votación por La Union</h1>
           <%
       }
%>
<br><br><br>
<h4>ELECCIÓN DE DIPUTADOS Y DIPUTADAS A LA ASAMBLEA LEGISLATIVA 2016</h4>
<br>
</header>
    <div id="mensaje" class="bien">
        <h3></h3>
        <a id="nuevo" href="#">NUEVA PAPELETA<br> INTENTELO DE NUEVO</a> 
        <a id="cerrar" href="#">CERRAR NOTIFICACIÓN</a>
    </div>

<div id="papeleta">	
	<span id="explicar"></span>
	<nav id="btns" class="flotar">
        <a id="contar" href="#"><span>0</span>DE 24 POSIBLES MARCAS POR ROSTRO</a>
        <button class="btn-success">VOTAR</button>

	</nav>
<%
       DAL_CandidatoDiputado ob = new DAL_CandidatoDiputado();
       DAL_Partido obp = new DAL_Partido();
        for(Partido p:obp.mostrarPartido())
        {
        if(p.getPartidoId()==1){
            out.println("<ul id='part-a'>");
            }
            else if(p.getPartidoId()==2){
            out.println("<ul id='part-b'>");
            }
            else if(p.getPartidoId()==3){
            out.println("<ul id='part-c'>");
            }
            else if(p.getPartidoId()==4){
            out.println("<ul id='part-d'>");
            }
            else if(p.getPartidoId()==5)
            {
                out.println("<ul id='part-e'>");
            }
            else
                    {
                        out.println("<ul id='part-f'>");
                    }
            out.println("<li class='bandera'><span>" + p.getPatidoNombre() +"</span></li>");
            for(CandidatoDiputado c:ob.mostrarCandidatosEspecificos((String)sesion.getAttribute("departamento")))
                {
                    if(p.getPartidoId()==c.getCandidatodiputado_partido())
                    {
                        out.println("<li class='rostro woman'><ol id='" + c.getCandidato_id()+  "' class='ejerciendovotoCandidato' style='width: 100%;height: 100%;'> </ol><span style='margin-top:-60px;'>" + c.getCandidato_apellido()+"</span></li>");
                    }
                }
            out.println("</ul>");
        }
}
else{
%>
<script type="text/javascript">
    window.location.replace("http://localhost:8080/SistemaVotaciones/sufragio.jsp");
</script>
<%
}
%>

</div>
<input type="hidden" id="dui" value="<%=(String)sesion.getAttribute("dui")%>">
<footer class="flotar">
	
</footer>
<!-- Con estps hacemos el efecto de papeleta marcada -->
<script src="js/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        var voto = [];
       $('ol').click(function(){
          voto[voto.length] = $(this).attr('id');

       });
       $('nav').click(function (){
          var votos = voto.toString();
          var dui = document.getElementById("dui").value;
          $.ajax({
                         type: "GET",
                         contentType: "application/json",
                         url: "/SistemaVotaciones/Voto",
                         data : {voto: votos, dui: dui},
                         //data : JSON.stringify({voto: voto.toString(), dui: dui}),
                         success: function(data){
                             alert("Gracias por su voto, bye!");
                             window.location.replace("http://localhost:8080/SistemaVotaciones/LogOut?btnCerrar=true");
                         }
          });
          if(window.top==window) {
    // You're not in a frame, so you reload the site.
            //alert("Tu voto fue procesado correctamente, gracias por utilizar el servicio de votaciones online");
            //window.location.replace("http://localhost:8080/SistemaVotaciones/votante.jsp")
    //  //Reloads after three seconds
        }
       });
   });
</script>
<script src="js/jquery.lazylinepainter-1.4.1.min.js"></script> 
<script src="js/raphael.js"></script> 
<!-- Hasta acá -->
<script src="js/ion.sound.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/core.js"></script>
</body>
        <%
            }else{
                out.print("<script>location.replace('index.jsp')</script>");
            }
        %>
	<!-- Latest compiled and minified JavaScript -->
	<script src="js/bootstrap.js"></script>

	<!-- Scripts -->
	<script src="js/main.js"></script>
</body>
</html>