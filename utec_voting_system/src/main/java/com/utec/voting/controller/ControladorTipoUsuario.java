package com.utec.voting.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utec.voting.model.DAL_TipoUsuario;
import com.utec.voting.model.TipoUsuario;

/**
*
* @author Kevin Orellana
*/
public class ControladorTipoUsuario extends HttpServlet {

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
            DAL_TipoUsuario ob=new DAL_TipoUsuario();
            TipoUsuario tu;
           
                request.setAttribute("mosTU", ob.mostrarTipousuario());
            
            if(request.getParameter("btnInsertar")!=null){
                tu = new TipoUsuario(0, request.getParameter("tpusuario"));
                if(ob.insertarTipoUsuario(tu)){
                    request.setAttribute("msj", 1);
                }else{
                    request.setAttribute("msj", "Error");
                }
                request.setAttribute("mosTU", ob.mostrarTipousuario()); 
            }
            
            if(request.getParameter("btnEliminar")!=null){
                tu = new TipoUsuario(Integer.parseInt(request.getParameter("ID")), "");
		if(ob.eliminarTipoUsuario(tu)){
                    request.setAttribute("msj", 2);
                }else{
                    request.setAttribute("msj", "Error");
                }
		request.setAttribute("mosTU", ob.mostrarTipousuario()); 
            }
            
            if(request.getParameter("btnModificar")!=null){
                tu = new TipoUsuario(Integer.parseInt(request.getParameter("txtId")), request.getParameter("tpusuario"));
                if(ob.modificarTipoUsuario(tu)){
                    request.setAttribute("msj", 3);
                }else{
                    request.setAttribute("msj", "Error");
                }
                request.setAttribute("mosTU", ob.mostrarTipousuario());
            }
            res= request.getRequestDispatcher("admintusu.jsp");
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