package com.utec.voting.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utec.voting.model.CandidatoDiputado;
import com.utec.voting.model.DAL_CandidatoDiputado;
import com.utec.voting.model.DAL_Partido;

/**
*
* @author Kevin Orellana
*/
@WebServlet(name = "ControladorCandidato", urlPatterns = {"/ControladorCandidato"})
public class ControladorCandidato extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
            DAL_CandidatoDiputado ob=new DAL_CandidatoDiputado();
            DAL_Partido pa=new DAL_Partido();
            CandidatoDiputado c;
            
            //if(request.getParameter("btnMostrar")!=null){
                request.setAttribute("mosCan", ob.mostrarCandidato());
                request.setAttribute("mosPar", pa.mostrarPartido());
            //}
            if(request.getParameter("btnInsertar")!=null){
                c = new CandidatoDiputado(0, request.getParameter("nombres"), request.getParameter("apellidos"), Integer.parseInt(request.getParameter("slcPart")));
                if(ob.ingresarCandidato(c)){
                   request.setAttribute("msj", 1);
                }else{
                    request.setAttribute("msj", "Error");
                }
                request.setAttribute("mosCan", ob.mostrarCandidato());     
            }
            
            if(request.getParameter("btnEliminar")!=null){
                c = new CandidatoDiputado(Integer.parseInt(request.getParameter("ID")), "", "", 0);
                if(ob.eliminarCandidato(c)){
                    request.setAttribute("msj", 2);
                }else{
                    request.setAttribute("msj", "Error");
                }
                request.setAttribute("mosCan", ob.mostrarCandidato());
            }
            
            if(request.getParameter("btnModificar")!=null){
                c = new CandidatoDiputado(Integer.parseInt(request.getParameter("txtId")), request.getParameter("nombres"), request.getParameter("apellidos"), Integer.parseInt(request.getParameter("slcPart")));
                if(ob.modificarCandidato(c)){
                    request.setAttribute("msj", 3);
                }else{
                    request.setAttribute("msj", "Error");
                }
                request.setAttribute("mosCan", ob.mostrarCandidato());
            }
            res=request.getRequestDispatcher("admincand.jsp");
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
