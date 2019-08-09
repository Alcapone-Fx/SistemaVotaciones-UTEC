package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import modelo.*;
import org.json.JSONArray;

public final class votar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/cache.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");

response.setHeader( "Pragma", "no-cache" );
response.addHeader( "Cache-Control", "must-revalidate" );
response.addHeader( "Cache-Control", "no-cache" );
response.addHeader( "Cache-Control", "no-store" );
response.setDateHeader("Expires", 0);

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    HttpSession sesion = request.getSession(true);
    Object nombre = sesion.getAttribute("usuario")==null ? null : sesion.getAttribute("usuario");
            if(nombre!=null){
        
      out.write('\n');
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\" /><!-- /Added by HTTrack -->\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>Simulador de votación</title>\n");
      out.write("\n");
      out.write("<link href=\"css/votos.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"body\">\n");
      out.write("<header>\n");

        if(sesion.getAttribute("knowsufragio").equals(0)){
       if(sesion.getAttribute("departamento").equals("1")){
            
      out.write("\n");
      out.write("                <h1><span>Simulador</span> de votación por Santa Ana</h1>\n");
      out.write("           ");

       }else if(sesion.getAttribute("departamento").equals("2")){
            
      out.write("\n");
      out.write("                <h1><span>Simulador</span> de votación por Ahuachapan</h1>\n");
      out.write("           ");

       }else if(sesion.getAttribute("departamento").equals("3")){
            
      out.write("\n");
      out.write("                <h1><span>Simulador</span> de votación por Sosonate</h1>\n");
      out.write("           ");

       }else if(sesion.getAttribute("departamento").equals("4")){
            
      out.write("\n");
      out.write("                <h1><span>Simulador</span> de votación por Chalatenango</h1>\n");
      out.write("           ");

       }else if(sesion.getAttribute("departamento").equals("5")){
            
      out.write("\n");
      out.write("                <h1><span>Simulador</span> de votación por San Salvador</h1>\n");
      out.write("           ");

       }else if(sesion.getAttribute("departamento").equals("6")){
            
      out.write("\n");
      out.write("                <h1><span>Simulador</span> de votación por Cuscatlan</h1>\n");
      out.write("           ");

       }else if(sesion.getAttribute("departamento").equals("7")){
            
      out.write("\n");
      out.write("                <h1><span>Simulador</span> de votación por Cabañas</h1>\n");
      out.write("           ");

       }else if(sesion.getAttribute("departamento").equals("8")){
            
      out.write("\n");
      out.write("                <h1><span>Simulador</span> de votación por La Libertad</h1>\n");
      out.write("           ");

       }else if(sesion.getAttribute("departamento").equals("9")){
            
      out.write("\n");
      out.write("                <h1><span>Simulador</span> de votación por San Vicente</h1>\n");
      out.write("           ");

       }else if(sesion.getAttribute("departamento").equals("10")){
            
      out.write("\n");
      out.write("                <h1><span>Simulador</span> de votación por Usulutan</h1>\n");
      out.write("           ");

       }else if(sesion.getAttribute("departamento").equals("11")){
            
      out.write("\n");
      out.write("                <h1><span>Simulador</span> de votación por La Paz</h1>\n");
      out.write("           ");

       }else if(sesion.getAttribute("departamento").equals("12")){
            
      out.write("\n");
      out.write("                <h1><span>Simulador</span> de votación por San Miguel</h1>\n");
      out.write("           ");

       }else if(sesion.getAttribute("departamento").equals("13")){
            
      out.write("\n");
      out.write("                <h1><span>Simulador</span> de votación por Morazan</h1>\n");
      out.write("           ");

       }else if(sesion.getAttribute("departamento").equals("14")){
            
      out.write("\n");
      out.write("                <h1><span>Simulador</span> de votación por La Union</h1>\n");
      out.write("           ");

       }

      out.write("\n");
      out.write("<br><br><br>\n");
      out.write("<h4>ELECCIÓN DE DIPUTADOS Y DIPUTADAS A LA ASAMBLEA LEGISLATIVA 2016</h4>\n");
      out.write("<br>\n");
      out.write("</header>\n");
      out.write("    <div id=\"mensaje\" class=\"bien\">\n");
      out.write("        <h3></h3>\n");
      out.write("        <a id=\"nuevo\" href=\"#\">NUEVA PAPELETA<br> INTENTELO DE NUEVO</a> \n");
      out.write("        <a id=\"cerrar\" href=\"#\">CERRAR NOTIFICACIÓN</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("<div id=\"papeleta\">\t\n");
      out.write("\t<span id=\"explicar\"></span>\n");
      out.write("\t<nav id=\"btns\" class=\"flotar\">\n");
      out.write("        <a id=\"contar\" href=\"#\"><span>0</span>DE 24 POSIBLES MARCAS POR ROSTRO</a>\n");
      out.write("        <button class=\"btn-success\">VOTAR</button>\n");
      out.write("\n");
      out.write("\t</nav>\n");

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

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    window.location.replace(\"http://localhost:8080/SistemaVotaciones/sufragio.jsp\");\n");
      out.write("</script>\n");

}

      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<input type=\"hidden\" id=\"dui\" value=\"");
      out.print((String)sesion.getAttribute("dui"));
      out.write("\">\n");
      out.write("<footer class=\"flotar\">\n");
      out.write("\t\n");
      out.write("</footer\n");
      out.write("<!-- Con estps hacemos el efecto de papeleta marcada -->\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function(){\n");
      out.write("        var voto = [];\n");
      out.write("       $('ol').click(function(){\n");
      out.write("          voto[voto.length] = $(this).attr('id');\n");
      out.write("\n");
      out.write("       });\n");
      out.write("       $('nav').click(function (){\n");
      out.write("          var votos = voto.toString();\n");
      out.write("          var dui = document.getElementById(\"dui\").value;\n");
      out.write("          $.ajax({\n");
      out.write("                         type: \"GET\",\n");
      out.write("                         contentType: \"application/json\",\n");
      out.write("                         url: \"/SistemaVotaciones/Voto\",\n");
      out.write("                         data : {voto: votos, dui: dui},\n");
      out.write("                         //data : JSON.stringify({voto: voto.toString(), dui: dui}),\n");
      out.write("                         success: function(data){\n");
      out.write("                             alert(\"Envío exitoso\");\n");
      out.write("                         }\n");
      out.write("          });\n");
      out.write("          if(window.top==window) {\n");
      out.write("    // You're not in a frame, so you reload the site.\n");
      out.write("            //alert(\"Tu voto fue procesado correctamente, gracias por utilizar el servicio de votaciones online\");\n");
      out.write("            //window.location.replace(\"http://localhost:8080/SistemaVotaciones/votante.jsp\")\n");
      out.write("    //  //Reloads after three seconds\n");
      out.write("        }\n");
      out.write("       });\n");
      out.write("</script>\n");
      out.write("<script src=\"js/jquery.lazylinepainter-1.4.1.min.js\"></script> \n");
      out.write("<script src=\"js/raphael.js\"></script> \n");
      out.write("<!-- Hasta acá -->\n");
      out.write("<script src=\"js/ion.sound.js\"></script>\n");
      out.write("<script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("<script src=\"js/core.js\"></script>\n");
      out.write("</body>\n");
      out.write("        ");

            }else{
                out.print("<script>location.replace('index.jsp')</script>");
            }
        
      out.write("\n");
      out.write("\t<!-- Latest compiled and minified JavaScript -->\n");
      out.write("\t<script src=\"js/bootstrap.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Scripts -->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
