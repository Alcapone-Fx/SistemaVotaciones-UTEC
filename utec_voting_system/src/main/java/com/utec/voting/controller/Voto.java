package com.utec.voting.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utec.voting.model.DAL_Voto;
import com.utec.voting.model.DAL_VotoCandidato;
import com.utec.voting.model.DAL_VotoUsuario;

/**
 *
 * @author Kevin Orellana
 */
public class Voto extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            String votos = request.getParameter("voto");
            String[] l1 = votos.split(",");
            DAL_Voto obv = new DAL_Voto();
            DAL_VotoUsuario votousuario = new DAL_VotoUsuario();
            int ultimovoto = obv.mostrarUltimoVoto() + 1;
            obv.ingresarVoto(ultimovoto);
            votousuario.insertarVotoUsuario(ultimovoto, request.getParameter("dui"));
            votousuario.updateSufragio(request.getParameter("dui"));
            DAL_VotoCandidato votocandidato = new DAL_VotoCandidato();
            
            for (String voto: l1) {
                votocandidato.insertarVotoCandidatoDiputado(Integer.parseInt(voto), ultimovoto);
            }
           
            
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
