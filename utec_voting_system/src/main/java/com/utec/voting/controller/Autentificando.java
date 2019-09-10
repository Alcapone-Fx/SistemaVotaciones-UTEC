package com.utec.voting.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.utec.voting.model.DAL_CandidatoDiputado;
import com.utec.voting.model.DAL_Departamento;
import com.utec.voting.model.DAL_EstadoFamiliar;
import com.utec.voting.model.DAL_Genero;
import com.utec.voting.model.DAL_VotoCandidato;
import com.utec.voting.model.DAL_VotoUsuario;
import com.utec.voting.model.DAL_dui;
import com.utec.voting.model.Usuario;
/**
 *
 * @author Kevin Orellana
 */
public class Autentificando extends HttpServlet {

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
		// aqui
		String usuario = request.getParameter("usuario");
		String pass = request.getParameter("pass");
		Usuario objUsuario = new Usuario(usuario, pass);
		ControladorUsuario cu = new ControladorUsuario();
		DAL_VotoCandidato voto = new DAL_VotoCandidato();
		DAL_CandidatoDiputado candidatos = new DAL_CandidatoDiputado();
		DAL_dui dui = new DAL_dui();
		DAL_VotoUsuario votousuario = new DAL_VotoUsuario();
		String usuario_dui = dui.mostrarDui(objUsuario);
		String departamento = dui.mostrarDepartamentoPerteneciente(usuario_dui);
		int sufragio = votousuario.knowSufragio(usuario_dui);
		DAL_dui ob = new DAL_dui();
		DAL_Departamento depa = new DAL_Departamento();
		DAL_EstadoFamiliar esta = new DAL_EstadoFamiliar();
		DAL_Genero gene = new DAL_Genero();

		// if(request.getParameter("btnM")!=null){

		if (cu.validar(objUsuario)) {
			String tipor = "1";
			String tipo = cu.tipo(objUsuario);
			if (tipo.equals(tipor)) {
				HttpSession sesion = request.getSession(true);
				sesion.setAttribute("usuario", usuario);
				sesion.setAttribute("departamento", departamento);
				request.setAttribute("mosDui", ob.mostrarDUI());
				request.setAttribute("mosDepa", depa.mostrarDepartamento());
				request.setAttribute("mosEsta", esta.mostrarEstado());
				request.setAttribute("mosGene", gene.mostrarGenero());
				response.sendRedirect("administracion.jsp");
			} else {
				HttpSession sesion = request.getSession(true);
				sesion.setAttribute("departamento", departamento);
				sesion.setAttribute("usuario", usuario);
				sesion.setAttribute("diputado", dui);
				sesion.setAttribute("dui", usuario_dui);
				sesion.setAttribute("knowsufragio", sufragio);
				response.sendRedirect("votante.jsp");
			}
		} else {
			HttpSession sesion = request.getSession(true);
			sesion.setAttribute("votos", voto.mostrar());
			sesion.setAttribute("candidatos", candidatos.mostrarCandidato());
			sesion.setAttribute("departamento", departamento);
			response.sendRedirect("graficosVotaciones.jsp");
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
