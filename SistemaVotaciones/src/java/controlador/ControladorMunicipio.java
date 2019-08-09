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
public class ControladorMunicipio extends HttpServlet {

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
            DAL_Municipio ob=new DAL_Municipio();
            Municipio m;
            request.setAttribute("mosMun", ob.mostrarMunicipio());
            //Insertar Municipio
            if(request.getParameter("btnInsertar")!=null){
                m = new Municipio(Integer.parseInt(request.getParameter("id")), request.getParameter("municipio"));
                if(ob.ingresarMunicipio(m)){
                    request.setAttribute("msj", 1);
                }else{
                    request.setAttribute("msj", "Error");
                }
                request.setAttribute("mosMun", ob.mostrarMunicipio());
            }
            //Eliminar Municipio
            if(request.getParameter("btnEliminar")!=null){
                m = new Municipio(Integer.parseInt(request.getParameter("ID")), "");
                if(ob.eliminarMunicipio(m)){
                    request.setAttribute("msj", 2);
                }else{
                    request.setAttribute("msj", "Error");
                }
                request.setAttribute("mosMun", ob.mostrarMunicipio());
            }
            //Modificar Municipio
            if(request.getParameter("btnModificar")!=null){
                m = new Municipio(Integer.parseInt(request.getParameter("id")), request.getParameter("municipio"));
                if(ob.modificarMunicipio(m)){
                    request.setAttribute("msj", 3);
                }else{
                    request.setAttribute("msj", "Error");
                }
                request.setAttribute("mosMun", ob.mostrarMunicipio());
            }
            
            res=request.getRequestDispatcher("adminmuni.jsp");
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
