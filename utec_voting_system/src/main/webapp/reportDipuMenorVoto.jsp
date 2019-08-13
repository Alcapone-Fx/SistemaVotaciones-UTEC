<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession sesion = request.getSession(true);
    Object nombre = sesion.getAttribute("usuario")==null ? null : sesion.getAttribute("usuario");
            if(nombre!=null){
        %>
<html>
    <body>
<%@page import="net.sf.jasperreports.engine.JasperRunManager"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.File"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.utec.voting.model.Conexion"%>
<%
    Conexion ob = new Conexion();
    Connection con= ob.getConnection();
    File rf= new File(application.getRealPath("reportes/reportDipuMenorVoto1.jasper"));
    Map parameters = new HashMap();
    parameters.put(null, null);
    byte[] bytes = JasperRunManager.runReportToPdf(rf.getPath(), parameters, con);
    response.setContentType("application/pdf");
    response.setHeader ("Content-disposition", "inline; filename=informeDemo.pdf");
    response.setHeader ("Cache-Control", "max-age=30");
    response.setHeader ("Pragma", "No-cache");
    response.setDateHeader ("Expires", 0);
    response.setContentLength(bytes.length);
    ServletOutputStream outp= response.getOutputStream();
    outp.write(bytes, 0, bytes.length);
    outp.flush();
    outp.close();
%>
</body>
        <%
            }else{
                out.print("<script>location.replace('index.jsp')</script>");
            }
        %>
</html>