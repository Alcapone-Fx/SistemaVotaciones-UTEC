/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.*;
/**
 *
 * @author KevinManuel
 */
public class ControladorPartido extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             RequestDispatcher res=null;
            DAL_Partido ob=new DAL_Partido();
            Partido p;
            /*if(request.getParameter("btnMostrar")!=null){*/
            request.setAttribute("mosPart", ob.mostrarPartido());
            /*}*/
            //Insertar Partido
            if(request.getParameter("btnInsertar")!=null){
                p = new Partido(0,request.getParameter("txtPartido"));
                if(ob.insertarPartido(p)){
                    request.setAttribute("msj", 1);
                }else{
                    request.setAttribute("msj", "Error");
                }
                request.setAttribute("mosPart", ob.mostrarPartido());
            }
            //Eliminar Partido
            if(request.getParameter("btnDelete")!=null){
                p = new Partido(Integer.parseInt(request.getParameter("txtID")),"");
                if(ob.eliminarPartido(p)){
                    request.setAttribute("msj", 2);
                }else{
                    request.setAttribute("msj", "Error");
                }
                request.setAttribute("mosPart", ob.mostrarPartido());
            }
            //Modificar Partido
            if(request.getParameter("btnModificar")!=null){
                p = new Partido(Integer.parseInt(request.getParameter("txtId")),request.getParameter("txtPartido"));
                if(ob.modificarPartido(p)){
                    request.setAttribute("msj", 3);
                }else{
                    request.setAttribute("msj", "Error");
                }
                request.setAttribute("mosPart", ob.mostrarPartido());
            }
            
            res=request.getRequestDispatcher("adminpart.jsp");
            res.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
