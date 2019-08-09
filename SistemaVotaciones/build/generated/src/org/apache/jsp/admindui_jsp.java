package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import modelo.*;

public final class admindui_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


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
      out.write("        <script src=\"js/Jquery3.1.1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"js/jquery.validate.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <!-- hojas de estilo-->\r\n");
      out.write("        <link href=\"css/font-awesome-4.4.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
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
      out.write("    ");

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
        
      out.write("\r\n");
      out.write("\t<header class=\"container-fluit\">\r\n");
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
      out.write("                                                    </div>  \r\n");
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
      out.write(" \t<section class=\"col-md-8 col-lg-9\">\r\n");
      out.write("            <fieldset>\r\n");
      out.write("                <form name=\"frmDatos\" action=\"ControladorDui\" method=\"post\">\r\n");
      out.write(" \t\t\t\t<h2 style=\"text-align:center;\">Panel de control</h2>\r\n");
      out.write(" \t\t\t\t<legend>Datos Personales</legend>\r\n");
      out.write(" \t\t\t\t\t<div class=\"row\">\r\n");
      out.write(" \t\t\t\t\t<div class=\"col-md-6 col-lg-6\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <label>DUI:</label><br>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control input-sm chat-input\"  name=\"txtDui\" id=\"dui\" placeholder=\"Escriba su DUI\" onkeyup=\"validacion('dui');\" size=\"50\" value=\"");
if(request.getParameter("edit")!=null){out.print(dui);}
      out.write("\" required>\r\n");
      out.write("                                            <span class=\"help-block\"></span> \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <label>Fecha de Vencimiento:</label><br>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control input-sm chat-input\"  name=\"txtFeV\" id=\"fecven\" placeholder=\"(DD-MM-AAAA)\" onkeyup=\"validacion('fecven');\" size=\"50\" value=\"");
if(request.getParameter("edit")!=null){out.print(fecha_ven);}
      out.write("\" required>\r\n");
      out.write("                                            <span class=\"help-block\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <label>Fecha de Expedicion:</label><br>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control input-sm chat-input\"  name=\"txtFExp\" id=\"fecexp\" placeholder=\"(DD-MM-AAAA)\" onkeyup=\"validacion('fecexp');\" size=\"50\" value=\"");
if(request.getParameter("edit")!=null){out.print(fecha_exp);}
      out.write("\" required>\r\n");
      out.write("                                            <span class=\"help-block\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <label>Nombres:</label><br>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control input-sm chat-input\"  name=\"txtNombre\" id=\"nombres\" placeholder=\"Escriba sus Nombres\" onkeyup=\"validacion('nombres');\" size=\"50\" value=\"");
if(request.getParameter("edit")!=null){out.print(nombres);}
      out.write("\" required>\r\n");
      out.write("                                            <span class=\"help-block\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <label>Apellidos:</label><br>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control input-sm chat-input\"  name=\"txtApellido\" id=\"apellidos\" placeholder=\"Escriba sus Apellidos\" onkeyup=\"validacion('apellidos');\" size=\"50\" value=\"");
if(request.getParameter("edit")!=null){out.print(apellido);}
      out.write("\" required>\r\n");
      out.write("                                            <span class=\"help-block\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <label>Genero:</label><br>\r\n");
      out.write("                                            <select id=\"genero\" name=\"slcGene\" class=\"form-control input-sm chat-input\" onchange=\"validacion('genero');\">\r\n");
      out.write("                                                <option value=\"");
if(request.getParameter("edit")!=null){out.print(genero);}
      out.write('"');
      out.write('>');

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
                                            
      out.write("</option>\r\n");
      out.write("                                                ");

                                        if(request.getAttribute("mosGene")!=null){
                                            ArrayList<Genero> l1=new ArrayList<Genero>();
                                            l1.addAll((Collection)request.getAttribute("mosGene"));
                                            for(Genero v:l1){
                                            
      out.write("\r\n");
      out.write("                                                <option value=\"");
      out.print(v.getGeneroId());
      out.write('"');
      out.write('>');
      out.print(v.getGenero());
      out.write("</option>\r\n");
      out.write("                                             ");

                                                 }
                                            }
                                             
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-md-6 col-lg-6\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <label>Fecha de Nacimiento:</label><br>\r\n");
      out.write("                                            <input type=\"date\" name=\"txtFecha\" class=\"form-control input-sm chat-input\"  name=\"fecnac\" id=\"fecnac\" placeholder=\"(DD-MM-AAAA)\" onkeyup=\"validacion('fecnac');\" size=\"50\" value=\"");
if(request.getParameter("edit")!=null){out.print(fecha_nac);}
      out.write("\" required>\r\n");
      out.write("                                            <span class=\"help-block\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <label>Departamento:</label>\r\n");
      out.write("                                            <select id=\"departamento\" name=\"slcDepa\" class=\"form-control input-sm chat-input\" onchange=\"validacion('departamento');\">\r\n");
      out.write("                                                <option value=\"");
if(request.getParameter("edit")!=null){out.print("value='"+departamento+"'");}
      out.write('"');
      out.write('>');
if(request.getParameter("edit")!=null){out.print(depa);}else{out.print("Selecccione un Departamento");}
      out.write("</option>\r\n");
      out.write(" \t\t\t\t\t\t ");

                                                    if(request.getAttribute("mosDepa")!=null){
                                                        ArrayList<Departamento> l1=new ArrayList<Departamento>();
                                                        l1.addAll((Collection)request.getAttribute("mosDepa"));
                                                        for(Departamento v:l1){
                                                
      out.write("\r\n");
      out.write("                                                    <option value=\"");
      out.print(v.getDepartamento_id());
      out.write('"');
      out.write('>');
      out.print(v.getDepartamento_nombre());
      out.write("</option>\r\n");
      out.write("                                                ");

                                                        }
                                                    }
                                                
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write(" \t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <label>Nombre Completo de la Madre:</label>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control input-sm chat-input\"  name=\"txtMadre\" id=\"madre\" placeholder=\"Escriba el nombre de la madre\" onkeyup=\"validacion('madre');\" size=\"50\" value=\"");
if(request.getParameter("edit")!=null){out.print(nom_madre);}
      out.write("\" required>\r\n");
      out.write("                                            <span class=\"help-block\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div> \r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <label>Nombre Completo del Padre:</label>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control input-sm chat-input\"  name=\"txtPadre\" id=\"padre\" placeholder=\"Escriba el nombre del padre\" onkeyup=\"validacion('padre');\" size=\"50\" value=\"");
if(request.getParameter("edit")!=null){out.print(nom_padre);}
      out.write("\" required>\r\n");
      out.write("                                            <span class=\"help-block\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write(" \t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <label>Estado Civil:</label>\r\n");
      out.write("                                            <select id=\"estado\" name=\"slcEsta\" class=\"form-control input-sm chat-input\" onchange=\"validacion('estado');\">\r\n");
      out.write("                                                <option value=\"");
if(request.getParameter("edit")!=null){out.print(estado);}
      out.write('"');
      out.write('>');
if(request.getParameter("edit")!=null){out.print(eshta);}else{out.print("Seleccione Estado Familiar");}
      out.write("</option>\r\n");
      out.write("                                                ");

                                                if(request.getAttribute("mosEsta")!=null){
                                                    ArrayList<EstadoFamiliar> l1=new ArrayList<EstadoFamiliar>();
                                                    l1.addAll((Collection)request.getAttribute("mosEsta"));
                                                    for(EstadoFamiliar v:l1){
                                                
      out.write("\r\n");
      out.write("                                                <option value=\"");
      out.print(v.getEstadoFamiliarId());
      out.write('"');
      out.write('>');
      out.print(v.getEstado());
      out.write("</option>\r\n");
      out.write("                                                ");

                                                    }
                                                   }                                                
                                                
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <label>Edad:</label>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control input-sm chat-input\"  name=\"txtEdad\" id=\"edad\" placeholder=\"Escriba la Edad\" onkeyup=\"validacion('edad');\" size=\"50\" value=\"");
if(request.getParameter("edit")!=null){out.print(edad);}
      out.write("\" required>\r\n");
      out.write("                                            <span class=\"help-block\"></span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write(" \t\t\t\t</div></div>\r\n");
      out.write("                                <input type=\"submit\" name=\"btnInsertar\" class=\"btn btn-primary\" value=\"Agregar\">\r\n");
      out.write("                                <input type=\"submit\" name=\"btnModificar\" class=\"btn btn-primary\" value=\"Modificar\"> \r\n");
      out.write("                        </form>\r\n");
      out.write(" \t\t</fieldset>\r\n");
      out.write("                       <br>\r\n");
      out.write("                       \r\n");
      out.write("                ");

                    if(request.getParameter("btnInsertar")!=null||request.getParameter("btnModificar")!=null||request.getParameter("btnEliminar")!=null){
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
            
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write(" \t\t</div>\r\n");
      out.write(" \t</div><br>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-xs-10 col-xs-offset-1 table-responsive\">\r\n");
      out.write("                <fieldset style=\"margin-top: 30px\">\r\n");
      out.write("                    <legend>Datos</legend>\r\n");
      out.write("                    <table class=\"table table-striped custab\" style=\".custab{ padding: 0px;margin: 0px;}\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th>DUI</th>\r\n");
      out.write("                                        <th>Fecha Vencimiento</th>\r\n");
      out.write("                                        <th>Fecha Expedicion</th>\r\n");
      out.write("                                        <th>Nombres</th>\r\n");
      out.write("                                        <th>Apellidos</th>\r\n");
      out.write("                                        <th>Genero</th>\r\n");
      out.write("                                        <th>Fecha Nacimiento</th>\r\n");
      out.write("                                        <th>Departamento</th>\r\n");
      out.write("                                        <th>Nombre Madre</th>\r\n");
      out.write("                                        <th>Nombre Padre</th>\r\n");
      out.write("                                        <th>Estado Civil</th>\r\n");
      out.write("                                        <th>Edad</th>\r\n");
      out.write("                                        <th class=\"text-center\">Action</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                    ");

                                        if(request.getAttribute("mosDui")!=null){
                                            ArrayList<Dui> l1=new ArrayList<Dui>();
                                            l1.addAll((Collection)request.getAttribute("mosDui"));
                                            for(Dui v:l1){
                                    
      out.write("\r\n");
      out.write("                                    <tr><td>");
      out.print(v.getDui());
      out.write("</td><td>");
      out.print(v.getFecha_vencimiento());
      out.write("</td><td>");
      out.print(v.getFecha_expedicion());
      out.write("</td><td>");
      out.print(v.getNombres());
      out.write("</td><td>");
      out.print(v.getApellidos());
      out.write("</td><td>");
      out.print(v.getGenero_id());
      out.write("</td><td>");
      out.print(v.getFecha_nacimiento());
      out.write("</td><td>");
      out.print(v.getDepartamento_id());
      out.write("</td><td>");
      out.print(v.getNombre_madre());
      out.write("</td><td>");
      out.print(v.getNombre_padre());
      out.write("</td><td>");
      out.print(v.getEstado_familiar());
      out.write("</td><td>");
      out.print(v.getEdad());
      out.write("</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <form name=\"frmEdit\" method=\"post\">\r\n");
      out.write("                                                        <button class='btn btn-info btn-xs'><span class=\"glyphicon glyphicon-edit\"></span> Edit</button> \r\n");
      out.write("                                                        <input type=\"hidden\" name=\"edit\">\r\n");
      out.write("                                                        <input type=\"hidden\" name=\"Dui\" value=\"");
      out.print(v.getDui());
      out.write("\" >\r\n");
      out.write("                                                        </form>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <form name=\"frmDelete\" action=\"ControladorDui\" method=\"post\">\r\n");
      out.write("                                                        <button class=\"btn btn-danger btn-xs\" onclick=\"if(!confirm('¿Desea eliminarar el registro?')) return false;\"><span class=\"glyphicon glyphicon-remove\"></span> Del</button>\r\n");
      out.write("                                                        <input type=\"hidden\" name=\"btnEliminar\">\r\n");
      out.write("                                                        <input type=\"hidden\" name=\"Dui\" value=\"");
      out.print(v.getDui());
      out.write("\" >\r\n");
      out.write("                                                        </form>\r\n");
      out.write("                                                    </td></tr>\r\n");
      out.write("                                                ");

                                            } 
                                        }
                                    
      out.write("\r\n");
      out.write("                        </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t<footer>\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"cold-xs-12\">\r\n");
      out.write("                        <center><img src=\"img/voto2015.png\" alt=\"TSE\" class=\"img-responsive\"></center>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("            </div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("        ");

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
