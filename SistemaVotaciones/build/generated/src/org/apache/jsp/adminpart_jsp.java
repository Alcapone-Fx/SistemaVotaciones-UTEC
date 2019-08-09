package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import modelo.*;

public final class adminpart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 public String id= "";
        public String namePartido= "";
         
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

      out.write("<!DOCTYPE html>\r\n");

response.setHeader( "Pragma", "no-cache" );
response.addHeader( "Cache-Control", "must-revalidate" );
response.addHeader( "Cache-Control", "no-cache" );
response.addHeader( "Cache-Control", "no-store" );
response.setDateHeader("Expires", 0);

      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    HttpSession sesion = request.getSession(true);
    Object nombre = sesion.getAttribute("usuario")==null ? null : sesion.getAttribute("usuario");
            if(nombre!=null){
        
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("\t<title>Panel de Personas</title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"js/Jquery3.1.1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"js/jquery.validate.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <!-- hojas de estilo-->\r\n");
      out.write("        <link href=\"css/font-awesome-4.4.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome-4.4.0/css/font-awesome.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/icono.ico\">\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"js/sweetalert.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body onkeydown=\"return showKeyCode(event)\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("         ");

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
             
      out.write("\r\n");
      out.write("    <header class=\"container-fluit\">\r\n");
      out.write("\t\t\t<div id=\"bar\" class=\"row\">\r\n");
      out.write("                            <form method=\"POST\" action=\"LogOut\">\r\n");
      out.write("                                <a href=\"LogOut?btnCerrar=true\"><i class=\"fa fa-power-off fa-2x fa-3x\" aria-hidden=\"true\" style=\"float: left; margin-top:-4px; margin-left: 20px;\"></i></a>\r\n");
      out.write("                                    <input type=\"hidden\"  name=\"btnCerrar\">\r\n");
      out.write("                            </form>\r\n");
      out.write("                            <div id=\"contenedor\" class=\"cold-xs-12\">\r\n");
      out.write("                            <center><img src=\"img/TribunalSupremoElectoral.jpg\" alt=\"TSE\" class=\"img-responsive\"></center>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("        </header>\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row\" style=\"margin:15px\">\r\n");
      out.write("       <nav class=\"col-md-4 col-lg-3\">\r\n");
      out.write("        \t <div id=\"MainMenu\">\r\n");
      out.write("  \t\t\t\t<div class=\"list-group panel\">\r\n");
      out.write("   \t\t\t\t \t<a href=\"#demo1\" class=\"list-group-item list-group-item-success strong\" data-toggle=\"collapse\" data-parent=\"#MainMenu\" style=\"background-color:#dff0fb\">Administrar<i class=\"fa fa-caret-down\"></i></a>\r\n");
      out.write("                                            <div class=\"collapse\" id=\"demo1\">\r\n");
      out.write("                                                <a href=\"#SubMenu1\" class=\"list-group-item strong\" data-toggle=\"collapse\" data-parent=\"#SubMenu1\">DUI <i class=\"fa fa-caret-down\"></i></a>\r\n");
      out.write("                                                        <div class=\"collapse list-group-submenu\" id=\"SubMenu1\">\r\n");
      out.write("                                                            <a href=\"ControladorDui\" class=\"list-group-item\" data-parent=\"#SubMenu1\">Gestionar</a>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    <a href=\"#SubMenu2\" class=\"list-group-item strong\" data-toggle=\"collapse\" data-parent=\"#SubMenu1\">Usuario <i class=\"fa fa-caret-down\"></i></a>\r\n");
      out.write("                                                    <div class=\"collapse list-group-submenu\" id=\"SubMenu2\">\r\n");
      out.write("                                                        <a href=\"ControladorU\" class=\"list-group-item\" data-parent=\"#SubMenu1\">Gestionar</a>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <a href=\"#SubMenu3\" class=\"list-group-item strong\" data-toggle=\"collapse\" data-parent=\"#SubMenu1\">Candidatos <i class=\"fa fa-caret-down\"></i></a>\r\n");
      out.write("                                                    <div class=\"collapse list-group-submenu\" id=\"SubMenu3\">\r\n");
      out.write("                                                        <a href=\"ControladorCandidato\" class=\"list-group-item\" data-parent=\"#SubMenu1\">Gestionar</a>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <a href=\"#SubMenu4\" class=\"list-group-item strong\" data-toggle=\"collapse\" data-parent=\"#SubMenu1\">Departamento <i class=\"fa fa-caret-down\"></i></a>\r\n");
      out.write("                                                    <div class=\"collapse list-group-submenu\" id=\"SubMenu4\">\r\n");
      out.write("                                                        <a href=\"ControladorDepartamento\" class=\"list-group-item\" data-parent=\"#SubMenu1\">Gestionar</a>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                        <a href=\"#SubMenu5\" class=\"list-group-item strong\" data-toggle=\"collapse\" data-parent=\"#SubMenu1\">Partido<i class=\"fa fa-caret-down\"></i></a>\r\n");
      out.write("                                                    <div class=\"collapse list-group-submenu\" id=\"SubMenu5\">\r\n");
      out.write("                                                        <a href=\"ControladorP\" class=\"list-group-item\" data-parent=\"#SubMenu1\">Gestionar</a>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <a href=\"#SubMenu6\" class=\"list-group-item strong\" data-toggle=\"collapse\" data-parent=\"#SubMenu1\">Tipo de Usuario<i class=\"fa fa-caret-down\"></i></a>\r\n");
      out.write("                                                    <div class=\"collapse list-group-submenu\" id=\"SubMenu6\">\r\n");
      out.write("                                                        <a href=\"ControladorTipoUsuario\" class=\"list-group-item\" data-parent=\"#SubMenu1\">Gestionar</a>\r\n");
      out.write("                                                    </div> \r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                        <a href=\"#demo2\" class=\"list-group-item list-group-item-success strong\" data-toggle=\"collapse\" data-parent=\"#MainMenu\" style=\"background-color:#dff0fb\">Ayuda<i class=\"fa fa-caret-down\"></i></a>\r\n");
      out.write("                                        <div class=\"collapse\" id=\"demo2\">\r\n");
      out.write("                                            <a href=\"pdf/manualP.jsp\" target=\"_blank\" class=\"list-group-item\" data-parent=\"#SubMenu1\"><i class=\"fa fa-book fa-1x\" aria-hidden=\"true\"></i>Manual del programador</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <a href=\"#demo3\" class=\"list-group-item list-group-item-success strong\" data-toggle=\"collapse\" data-parent=\"#MainMenu\" style=\"background-color:#dff0fb\">Reportes<i class=\"fa fa-caret-down\"></i></a>\r\n");
      out.write("                                        <div class=\"collapse\" id=\"demo3\">\r\n");
      out.write("                                            <a href=\"reportDipuMenorVoto.jsp\" target=\"_blank\" class=\"list-group-item\" data-parent=\"#SubMenu1\"><i class=\"fa fa-file-pdf-o fa-1x\" aria-hidden=\"true\"></i> Menos votados</i></a>\r\n");
      out.write("                                            <a href=\"reportes.jsp\" target=\"_blank\" class=\"list-group-item\" data-parent=\"#SubMenu1\"><i class=\"fa fa-file-pdf-o fa-1x\" aria-hidden=\"true\"></i> Cantidad de votos</i></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <a href=\"#demo4\" class=\"list-group-item list-group-item-success strong\" data-toggle=\"collapse\" data-parent=\"#MainMenu\" style=\"background-color:#dff0fb\">Mostrar Graficas<i class=\"fa fa-caret-down\"></i></a>\r\n");
      out.write("                                        <div class=\"collapse\" id=\"demo4\">\r\n");
      out.write("                                            <a href=\"graficosVotaciones.jsp\" target=\"_blank\" class=\"list-group-item\" data-parent=\"#SubMenu1\"><i class=\"fa fa-file-pdf-o fa-1x\" aria-hidden=\"true\"></i>Graficas</i></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("  \t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("   \t</nav>\r\n");
      out.write("            <section class=\"col-md-8 col-lg-9\">\r\n");
      out.write("                <fieldset>\r\n");
      out.write("                    <form name=\"frmDatos\" action=\"ControladorP\" method=\"post\">\r\n");
      out.write("                        <h2 style=\"text-align:center;\">Panel de control</h2>\r\n");
      out.write("                            <legend>Ingresar Nuevo Partido</legend>                                                \r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <label>Partido:</label><br>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control input-sm chat-input\"  name=\"txtPartido\" id=\"partido\" placeholder=\"Escriba el Nombre del Partido\" onkeyup=\"validacion('partido');\" size=\"50\" value=\"");
if(request.getParameter("btnEdit")!=null){out.print(namePartido);}
      out.write("\" \r\n");
      out.write("                                             required>\r\n");
      out.write("                                            <span class=\"help-block\"></span>\r\n");
      out.write("                                            <input type=\"hidden\" name=\"txtId\" ");
if(request.getParameter("btnEdit")!=null){out.print("value='"+id+"'");}
      out.write(" >\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!--<div class=\"form-group\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <label>ID del Partido</label><br>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control input-sm chat-input\"  name=\"txtId\" id=\"id\" placeholder=\"Escriba ID del Partido\" onkeyup=\"validacion('id');\" size=\"50\" ");
if(request.getParameter("btnEdit")!=null){out.print("value='"+id+"' readonly");}
      out.write(" required>\r\n");
      out.write("                                            <input type=\"hidden\" name=\"txtIdPro\"\r\n");
      out.write("                                            <span class=\"help-block\"></span> \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>-->\r\n");
      out.write("                                <input type=\"submit\" name=\"btnInsertar\" class=\"btn btn-primary\" value=\"Agregar\">\r\n");
      out.write("                                <input type=\"submit\" name=\"btnModificar\" class=\"btn btn-primary\" value=\"Modificar\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                </fieldset>\r\n");
      out.write("                <fieldset style=\"margin-top: 30px\">\r\n");
      out.write("                    <legend>\r\n");
      out.write("                        <!--<form name=\"frmMostrar\" action=\"ControladorP\" method=\"post\">\r\n");
      out.write("                                     <input type=\"submit\" name=\"btnMostrar\" class=\"btn btn-primary\" value=\"Mostrar Datos\">\r\n");
      out.write("                            </form></legend>-->\r\n");
      out.write("                    <table class=\"table table-striped custab\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th>ID</th>\r\n");
      out.write("                                        <th>Partido</th>\r\n");
      out.write("                                        <th class=\"text-center\" colspan=\"2\">Action</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                    ");

                                        if(request.getAttribute("mosPart")!=null){
                                            ArrayList<Partido> l1=new ArrayList<Partido>();
                                            l1.addAll((Collection)request.getAttribute("mosPart"));
                                            for(Partido v:l1){
                                    
      out.write("\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td>");
      out.print(v.getPartidoId());
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print(v.getPatidoNombre());
      out.write("</td>\r\n");
      out.write("                                                <form name=\"frmEdit\" action=\"\" method=\"post\">\r\n");
      out.write("                                                    <td class=\"text-center\"><button class='btn btn-info btn-xs'><span class=\"glyphicon glyphicon-edit\"></span> Edit</button> \r\n");
      out.write("                                                        <input type=\"hidden\" name=\"btnEdit\" value=\"Edit\" >\r\n");
      out.write("                                                        <input type=\"hidden\" name=\"txtID\" value=\"");
      out.print(v.getPartidoId());
      out.write("\" >\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                               <form name=\"frmDelete\" action=\"ControladorP\" method=\"post\">\r\n");
      out.write("                                                    <td class=\"text-center\">\r\n");
      out.write("                                                        <button class=\"btn btn-danger btn-xs\" onclick=\"if(!confirm('¿Desea eliminarar el registro?')) return false;\"><span class=\"fa fa-trash-o fa-lg\"></span> Del</button>\r\n");
      out.write("                                                        <input type=\"hidden\" name=\"btnDelete\" value=\"Delete\" >\r\n");
      out.write("                                                        <input type=\"hidden\" name=\"txtID\" value=\"");
      out.print(v.getPartidoId());
      out.write("\" >\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                ");

                                            } 
                                        }    
                                
      out.write("\r\n");
      out.write("                                </table>\r\n");
      out.write("                </fieldset> \r\n");
      out.write("            </section>\r\n");
      out.write("        </div>\r\n");
      out.write("</div><br><br>\r\n");
      out.write("\t<footer>\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"cold-xs-12\">\r\n");
      out.write("                        <center><img src=\"img/voto2015.png\" alt=\"TSE\" class=\"img-responsive\"></center>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("            </div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("        <!--- Mensajes en pantalla-->\r\n");
      out.write("       ");

                    if(request.getParameter("btnInsertar")!=null||request.getParameter("btnModificar")!=null||request.getParameter("btnDelete")!=null){
                        if(request.getAttribute("msj")!=null){
                            String msj=request.getAttribute("msj").toString();String suces="", ms1="Error!";
                                if(msj.equals("1")||msj.equals("2")||msj.equals("3")){
                                    msj="¡Realizado!";
                
      out.write("\r\n");
      out.write("                <script>\r\n");
      out.write("                    swal(\"Felicidades!\", \"");
      out.print(msj);
      out.write("\", \"success\");\r\n");
      out.write("                </script>\r\n");
      out.write("                ");

                        }else{
                            msj="¡Error!";
                
      out.write("\r\n");
      out.write("                <script>\r\n");
      out.write("                    swal(\"Error!\", \"");
      out.print(msj);
      out.write("\", \"error\");\r\n");
      out.write("                </script>\r\n");
      out.write("                ");

                        }
                    }
                }

            }else{
                out.print("<script>location.replace('index.jsp')</script>");
            }
        
      out.write("\r\n");
      out.write("\t<!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("\t<script src=\"http://code.jquery.com/jquery-latest.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Scripts -->\r\n");
      out.write("\t<script src=\"js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
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
