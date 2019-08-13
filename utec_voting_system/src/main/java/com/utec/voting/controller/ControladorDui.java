package com.utec.voting.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utec.voting.model.DAL_Departamento;
import com.utec.voting.model.DAL_EstadoFamiliar;
import com.utec.voting.model.DAL_Genero;
import com.utec.voting.model.DAL_dui;
import com.utec.voting.model.Dui;

/**
*
* @author Kevin Orellana
*/
public class ControladorDui extends HttpServlet {

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
            DAL_dui ob=new DAL_dui();
            DAL_Departamento depa = new DAL_Departamento();
            DAL_EstadoFamiliar esta = new DAL_EstadoFamiliar();
            DAL_Genero gene = new DAL_Genero();
            Dui d;
                    request.setAttribute("mosDui", ob.mostrarDUI());
                    request.setAttribute("mosDepa", depa.mostrarDepartamento());
                    request.setAttribute("mosEsta", esta.mostrarEstado());
                    request.setAttribute("mosGene", gene.mostrarGenero());
            
            /*if(request.getParameter("btnM")!=null){
                    request.setAttribute("mosDepa", depa.mostrarDepartamento());
                    request.setAttribute("mosEsta", esta.mostrarEstado());
                    request.setAttribute("mosGene", gene.mostrarGenero());
            }*/
            
            //Insertar 
            if(request.getParameter("btnInsertar")!=null){
                d = new Dui(request.getParameter("txtDui"), request.getParameter("txtFeV"), request.getParameter("txtFExp"), request.getParameter("txtNombre"), request.getParameter("txtApellido"), Integer.parseInt(request.getParameter("slcGene")), request.getParameter("txtFecha"), Integer.parseInt(request.getParameter("slcDepa")), request.getParameter("txtMadre"), request.getParameter("txtPadre"), Integer.parseInt(request.getParameter("slcEsta")), Integer.parseInt(request.getParameter("txtEdad")));
                if(ob.insertarDui(d)){
                    request.setAttribute("msj", 1);
                }else{
                    request.setAttribute("msj", "Error");
                }
                request.setAttribute("mosDui", ob.mostrarDUI()); 
            }
            
            if(request.getParameter("btnEliminar")!=null){
                d = new Dui(request.getParameter("Dui"),"","","","",0,"",0,"","",0,0);
                if(ob.eliminarDui(d)){
                    request.setAttribute("msj", 1);
                }else{
                    request.setAttribute("msj", "Error");
                }
                request.setAttribute("mosDui", ob.mostrarDUI()); 
            }
            if(request.getParameter("btnModificar")!=null){
                d = new Dui(request.getParameter("txtDui"), request.getParameter("txtFeV"), request.getParameter("txtFExp"), request.getParameter("txtNombre"), request.getParameter("txtApellido"), Integer.parseInt(request.getParameter("slcGene")), request.getParameter("txtFecha"), Integer.parseInt(request.getParameter("slcDepa")), request.getParameter("txtMadre"), request.getParameter("txtPadre"), Integer.parseInt(request.getParameter("slcEsta")), Integer.parseInt(request.getParameter("txtEdad")));
                if(ob.modificarDui(d)){
                    request.setAttribute("msj", 1);
                }else{
                    request.setAttribute("msj", "Error");
                }
                request.setAttribute("mosDui", ob.mostrarDUI()); 
            }
            
            res=request.getRequestDispatcher("admindui.jsp");
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
