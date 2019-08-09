package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        <link href=\"css/form.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"js/jquery_v3.1.1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"js/jquery.validate.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"js/sweetalert.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Estilos.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styleVotante.css\">\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/icono.ico\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/icono.ico\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body onkeydown=\"return showKeyCode(event)\">\r\n");
      out.write("        <header class=\"container-fluid\">\r\n");
      out.write("                    <div id=\"bar\" class=\"row\">\r\n");
      out.write("                            <div id=\"contenedor\" class=\"cold-xs-8\">\r\n");
      out.write("                               \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"contenedor\" class=\"cold-xs-4\">\r\n");
      out.write("                                <form action=\"Login\" method=\"POST\" id=\"FRM_Login\">\r\n");
      out.write("                                    <table style=\"float:right;\">\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td><input type=\"text\"  name=\"usuario\" id=\"usuario\" maxlength=\"30\" size=\"25\" autofocus autocomplete=\"off\" class=\"form-control\" placeholder=\"Usuario\"></td><td>&nbsp;</td>\r\n");
      out.write("                                            <td><input type=\"password\" name=\"pass\" id=\"pass\" size=\"25\" class=\"form-control\" placeholder=\"Password\"></td>\r\n");
      out.write("                                            <td><input type=\"submit\" id=\"BTN_Login\" value=\"Iniciar sesión\" class=\"button button2\"></td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("    \t</header>\r\n");
      out.write("        <nav></nav>\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <section class=\"row\">\r\n");
      out.write("                <div class=\"col-md-8 col-lg-7\">\r\n");
      out.write("                        <div id=\"p1\">\r\n");
      out.write("                            <center>\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li><img src=\"img/img_1.jpg\" alt=\"\"></li>\r\n");
      out.write("                                        <li><img src=\"img/img_2.jpg\" alt=\"\"></li>\r\n");
      out.write("                                        <li><img src=\"img/img_3.jpg\" alt=\"\"></li>\r\n");
      out.write("                                        <li><img src=\"img/img_4.jpg\" alt=\"\"></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                            </center>\r\n");
      out.write("                            <style>\r\n");
      out.write("                                #p1{\r\n");
      out.write("\twidth:90%;\r\n");
      out.write("\tmargin:auto;\r\n");
      out.write("        margin-top: 60px;\r\n");
      out.write("\tbackground-color:transparent;\r\n");
      out.write("\tmax-width:1000px;\r\n");
      out.write("\toverflow:hidden;\r\n");
      out.write("\t}\r\n");
      out.write("#cn{\r\n");
      out.write("\twidth:400px;\r\n");
      out.write("\theight:110px;}\r\n");
      out.write("#p1 ul{\r\n");
      out.write("\tdisplay:flex;\r\n");
      out.write("\tpadding:0;\r\n");
      out.write("\twidth:400%;\r\n");
      out.write("\tanimation:cambio 20s infinite;\r\n");
      out.write("\tanimation-direction:alternate;\r\n");
      out.write("\tanimation-timing-function:ease-in;\r\n");
      out.write("\t}\r\n");
      out.write("\t@keyframes cambio{\r\n");
      out.write("\t\t0%{margin-left:0%;}\r\n");
      out.write("\t\t20%{margin-left:0%;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t25%{margin-left:-100%;}\r\n");
      out.write("\t\t45%{margin-left:-100%;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t50%{margin-left:-200%;}\r\n");
      out.write("\t\t70%{margin-left:-200%;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t75%{margin-left:-300%;}\r\n");
      out.write("\t\t100%{margin-left:-300%;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("#p1 li{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\tlist-style:none;\r\n");
      out.write("\t}\r\n");
      out.write("#p1 img{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\t}\r\n");
      out.write("                            </style>\r\n");
      out.write("                        </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("                <div class=\"col-md-3 col-lg-4\" style=\"background: #eee; border-radius: 1.5em; height: 345px; margin-top: 5%; padding: 42px; margin-right: 1%\">\r\n");
      out.write("                  <div class=\"col-md-6 col-lg-6\">\r\n");
      out.write("                      <figure><a href=\"https://www.facebook.com/tse.gob.sv\"><img src=\"img/fb.png\" class=\"img-circle\" style=\"height: 120px; width: 120px;\"></a></figure><br>\r\n");
      out.write("                      <figure><a href=\"https://twitter.com/tse_elsalvador\"><img src=\"img/tw.png\" class=\"img-circle\" style=\"height: 120px; width: 120px;\"></a></figure><br>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-md-6 col-lg-6\">\r\n");
      out.write("                      <figure><a href=\"http://www.youtube.com/user/tsecomunicaciones?feature=grec_index#p/a\"><img src=\"img/yt.png\" class=\"img-circle\" style=\"height: 120px; width: 120px;\"></a></figure><br>\r\n");
      out.write("                      <figure><a href=\"http://tsesv.blogspot.com/\"><img src=\"img/bg.png\" class=\"img-circle\" style=\"height: 120px; width: 120px;\"></a></figure>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-1 col-md-1\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("        </div>\r\n");
      out.write("        <aside></aside>\r\n");
      out.write("        <footer></footer>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
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
