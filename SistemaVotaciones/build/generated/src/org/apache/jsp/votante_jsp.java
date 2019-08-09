package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import modelo.*;

public final class votante_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    HttpSession sesion = request.getSession(true);
    out.print(sesion.getAttribute("departamento") + " " + sesion.getAttribute("usuario") + " " + sesion.getAttribute("diputado") + " " + sesion.getAttribute("dui") + " " + sesion.getAttribute("knowsufragio"));
    Object nombre = sesion.getAttribute("usuario")==null ? null : sesion.getAttribute("usuario"); 
            if(nombre!=null){
        
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("                <title>Vista Votante</title>\n");
      out.write("                <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("                <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("                <link rel=\"stylesheet\" href=\"css/styleVotante.css\">\n");
      out.write("                <link rel=\"shortcut icon\" href=\"img/icono.ico\">\n");
      out.write("                <link rel=\"stylesheet\" href=\"css/font-awesome-4.4.0/css/font-awesome.min.css\">\n");
      out.write("        </head>\n");
      out.write("<body onkeydown=\"return showKeyCode(event)\">\n");
      out.write("\t<header class=\"container-fluit\">\n");
      out.write("\t\t\t<div id=\"bar\" class=\"row\">\n");
      out.write("                            <form method=\"POST\" action=\"LogOut\">\n");
      out.write("                                <a href=\"LogOut?btnCerrar=true\"><i class=\"fa fa-power-off fa-2x fa-3x\" aria-hidden=\"true\" style=\"float: left; margin-top:-4px; margin-left: 20px;\"></i></a>\n");
      out.write("                                    <input type=\"hidden\"  name=\"btnCerrar\">\n");
      out.write("                            </form>\n");
      out.write("                            <div id=\"contenedor\" class=\"cold-xs-12\">\n");
      out.write("                            <center><img src=\"img/TribunalSupremoElectoral.jpg\" alt=\"TSE\" class=\"img-responsive\"></center>\n");
      out.write("\t\t            </div>\n");
      out.write("                        </div>\n");
      out.write("        </header>\n");
      out.write("\t<div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\" style=\"margin:15px\">\n");
      out.write("        <nav class=\"col-lg-3\">\n");
      out.write("        \t <div id=\"MainMenu\">\n");
      out.write("                    <div class=\"list-group panel\">\n");
      out.write("                      <a href=\"#demo1\" class=\"list-group-item list-group-item-success strong\" data-toggle=\"collapse\" data-parent=\"#MainMenu\" style=\"background-color:#dff0fb\">Votaciones <i class=\"fa fa-caret-down\"></i></a>\n");
      out.write("                      <div class=\"collapse\" id=\"demo1\">\n");
      out.write("                        <a href=\"votar.jsp\" class=\"list-group-item strong\" data-parent=\"#SubMenu1\">Votar <i class=\"fa fa-caret-down\"></i></a>\n");
      out.write("                        <div class=\"collapse list-group-submenu\" id=\"SubMenu1\">\n");
      out.write("                          <a href=\"#\" class=\"list-group-item\" data-parent=\"#SubMenu1\">Subitem 1</a>\n");
      out.write("                          <a href=\"#\" class=\"list-group-item\" data-parent=\"#SubMenu1\">Subitem 2 b</a>\n");
      out.write("                          <a href=\"#\" class=\"list-group-item\" data-parent=\"#SubMenu1\">Subitem 3 c</a>     \n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"graficosVotaciones.jsp\" class=\"list-group-item\" data-parent=\"#SubMenu1\">Ver votaciones</a>\n");
      out.write("                          \n");
      out.write("                        <a href=\"#\" class=\"list-group-item\">Subitem 3</a>\n");
      out.write("                      </div>\n");
      out.write("                            <a href=\"#demo2\" class=\"list-group-item list-group-item-success strong\" data-toggle=\"collapse\" data-parent=\"#MainMenu\" style=\"background-color:#dff0fb\">Ayuda<i class=\"fa fa-caret-down\"></i></a>\n");
      out.write("                        <div class=\"collapse\" id=\"demo2\">\n");
      out.write("                            <a href=\"pdf/manual.jsp\" target=\"_blank\" class=\"list-group-item strong\" data-parent=\"#SubSubMenu2\"><i class=\"fa fa-book fa-1x\" aria-hidden=\"true\"> Manual del Usuario</i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <section class=\"col-lg-9\" style=\"background-color:white\">\n");
      out.write("        \t<div id=\"contenedor\" class=\"cold-xs-12\">\n");
      out.write("        \t\t<img src=\"img/traneventos_2.png\" alt=\"TSE\" class=\"img-responsive\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<section class=\"slider-container\">\n");
      out.write("\t\t\t\t<ul id=\"slider\" class=\"slider-wrapper\">\n");
      out.write("\t\t\t\t\t<li class=\"slide-current\">\n");
      out.write("\t\t\t\t\t\t<img src=\"img/img_1.jpg\" alt=\"TSE\" class=\"img-respondive\">\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<img src=\"img/img_2.jpg\" alt=\"TSE\" class=\"img-respondive\">\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<img src=\"img/img_3.jpg\" alt=\"TSE\" class=\"img-respondive\">\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<img src=\"img/img_4.jpg\" alt=\"TSE\" class=\"img-respondive\">\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t<ul id=\"slider-controls\" class=\"slider-controls\"></ul>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<div id=\"contenedor\" class=\"cold-xs-12\">\n");
      out.write("        \t\t\t<img src=\"img/traneventos.png\" alt=\"TSE\" class=\"img-responsive\">\n");
      out.write("        \t\t\t<br>\n");
      out.write("\t\t                <center><img src=\"img/grafica_1.png\" alt=\"TSE\" class=\"img-responsive\"></center>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("        </div>\n");
      out.write("        <aside></aside><br><br>\n");
      out.write("\t<footer>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"cold-xs-12\">\n");
      out.write("                        <center><img src=\"img/voto2015.png\" alt=\"TSE\" class=\"img-responsive\"></center>\n");
      out.write("                    </div>\n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("\t</footer>\n");
      out.write(" </div>\n");
      out.write("        ");

            }else{
                out.print("<script>location.replace('index.jsp')</script>");
            }
        
      out.write("\n");
      out.write("\t<!-- Latest compiled and minified JavaScript -->\n");
      out.write("\t<script src=\"http://code.jquery.com/jquery-latest.js\"></script>\n");
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
