<%@page import="java.util.*"%>
<%@page import="org.json.JSONArray"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Grafico de votaciones</title>
    <link rel="stylesheet" href="css/Estilos2.css" />
    <script src="js/Jquery3.1.1.js" type="text/javascript"></script>
    <link rel="shortcut icon" href="img/icono.ico">
    <link rel="stylesheet" href="css/bootstrap.min.css">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
</head>
<body onkeydown="return showKeyCode(event)">
    <div class="container-fluid">
			<div id="bar" class="row">
		        	<div id="contenedor" class="cold-xs-12">
                    	<center><img src="img/TribunalSupremoElectoral.jpg" alt="TSE" class="img-responsive"></center>
		            </div>
		        </div>  
    </div>
    <div class="container">
  <center>Al parecer no estás registrado en nuestro sistema, te invitamos a <a href="Registro.jsp">Registrarte</a><h1> Mira lo que esta pasando en nuestras votaciones</h1></center>
  	
  <div class="btn-group btn-group-justified selections">
  <div class="btn-group" role="group">
    <button type="button" class="btn btn-default selections" value="line">Line</button>
  </div>
  <div class="btn-group" role="group">
    <button type="button" class="btn btn-default selections" value="bar">Bar</button>
  </div>
  <div class="btn-group" role="group">
    <button type="button" class="btn btn-default selections" value="radar">Radar</button>
  </div>
      <div class="btn-group" role="group">
    <button type="button" class="btn btn-default selections" value="polarArea">Polar Area</button>
  </div>
  <div class="btn-group" role="group">
    <button type="button" class="btn btn-default selections" value="pie">Pie</button>
  </div>
  <div class="btn-group" role="group">
    <button type="button" class="btn btn-default selections" value="doughnut">Doughnut</button>
  </div>
    </div>
  
    <div class="container canvas">
        <canvas id="myChart"></canvas>
        </div>
            </div>
  <% 
    HttpSession sesion = request.getSession(true);
    if(sesion.getAttribute("votos")!=null){
  %>
  <input type="hidden" value="<%=sesion.getAttribute("votos")%>" name="votos">
  <%
      }
    if(sesion.getAttribute("candidatos")!=null){
    String json = (new JSONArray((ArrayList<String>)sesion.getAttribute("candidatos"))).toString();
    %>
    <input type="hidden" value="<%=json%>" name="candidatos">
    <%
        }
    %>
        <script src="js/bootstrap.js"></script>
        <script src="js/Chart.js"> </script>
        <script src="js/grafico.js"> </script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script><br><br>
	<footer>
            <div class="container-fluid">
                <div class="row">
                    <div class="cold-xs-12">
                        <center><img src="img/voto2015.png" alt="TSE" class="img-responsive"></center>
                    </div>
		</div>
            </div>
	</footer>

</body>
<script type="text/javascript">
    $(".selections").click(function()
       {
         var types = $(this).val();
            $.ajax({
                         type: "GET",
                         dataType:"json",
                         contentType: "application/json; charset=utf-8",
                         url: "/SistemaVotaciones/WebService",
                         success: function(datos) {
                             //Aca comienza lo del chart
                             var ctx = document.getElementById("myChart");
                             var votos = $("input[name='votos']").val();
                             var votoAlejandro = 20;
                          new Chart(ctx,{
                             type: types,
                             data: { 
                                 labels: $.each(datos[0].candidatos,function (index,contenido){
                                     console.log(contenido)
                                     })
                             ,
                                 datasets: [{
                                     label: votos + ' Votos',
                                     data: $.each(datos[0].votos,function (index,contenido){
                                     console.log(contenido)
                                     }),
                                     backgroundColor: [
                                         'rgba(255, 99, 132, 0.2)',
                                         'rgba(54, 162, 235, 0.2)',
                                         'rgba(255, 206, 86, 0.2)',
                                         'rgba(75, 192, 192, 0.2)',
                                         'rgba(153, 102, 255, 0.2)',
                                         'rgba(255, 159, 64, 0.2)',
                                         'rgba(255, 99, 132, 0.2)',
                                         'rgba(54, 162, 235, 0.2)',
                                         'rgba(255, 206, 86, 0.2)',
                                         'rgba(75, 192, 192, 0.2)',
                                         'rgba(153, 102, 255, 0.2)',
                                         'rgba(255, 159, 64, 0.2)',
                                         'rgba(255, 99, 132, 0.2)',
                                         'rgba(54, 162, 235, 0.2)',
                                         'rgba(255, 206, 86, 0.2)',
                                         'rgba(75, 192, 192, 0.2)',
                                         'rgba(153, 102, 255, 0.2)',
                                         'rgba(255, 159, 64, 0.2)',
                                         'rgba(255, 99, 132, 0.2)',
                                         'rgba(54, 162, 235, 0.2)',
                                         'rgba(255, 206, 86, 0.2)',
                                         'rgba(75, 192, 192, 0.2)',
                                         'rgba(153, 102, 255, 0.2)',
                                         'rgba(255, 159, 64, 0.2)'
                                     ],
                                     borderColor: [
                                         'rgba(255,99,132,1)',
                                         'rgba(54, 162, 235, 1)',
                                         'rgba(255, 206, 86, 1)',
                                         'rgba(75, 192, 192, 1)',
                                         'rgba(153, 102, 255, 1)',
                                         'rgba(255, 159, 64, 1)',
                                         'rgba(255,99,132,1)',
                                         'rgba(54, 162, 235, 1)',
                                         'rgba(255, 206, 86, 1)',
                                         'rgba(75, 192, 192, 1)',
                                         'rgba(153, 102, 255, 1)',
                                         'rgba(255, 159, 64, 1)',
                                         'rgba(255,99,132,1)',
                                         'rgba(54, 162, 235, 1)',
                                         'rgba(255, 206, 86, 1)',
                                         'rgba(75, 192, 192, 1)',
                                         'rgba(153, 102, 255, 1)',
                                         'rgba(255, 159, 64, 1)',
                                         'rgba(255,99,132,1)',
                                         'rgba(54, 162, 235, 1)',
                                         'rgba(255, 206, 86, 1)',
                                         'rgba(75, 192, 192, 1)',
                                         'rgba(153, 102, 255, 1)',
                                         'rgba(255, 159, 64, 1)',
                                         'rgba(255,99,132,1)',
                                         'rgba(54, 162, 235, 1)',
                                         'rgba(255, 206, 86, 1)',
                                         'rgba(75, 192, 192, 1)',
                                         'rgba(153, 102, 255, 1)',
                                         'rgba(255, 159, 64, 1)'
                                     ],
                                     borderWidth: 1
                                 }]
                             },
                             options: {
                                 scales: {
                                     yAxes: [{
                                         ticks: {
                                             beginAtZero:true
                                         }
                                     }]
                                 }
                             }
                         });
                         }
                     });
    });
    </script>
</html>