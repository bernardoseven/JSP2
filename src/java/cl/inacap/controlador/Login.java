/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.controlador;

import cl.inacap.dao.DAOUsuario;
import cl.inacap.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nicolas
 */
public class Login extends HttpServlet {

    
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

        //Crear objetos para guardar registros
        DAOUsuario daoUser = new DAOUsuario();
        Usuario user = new Usuario();

        //Variables 
        
        String email = request.getParameter("txtEmail");
        String clave = request.getParameter("txtPass");
        
  
        if (request.getParameter("opt").equals("LU"))  {
            if (daoUser.validarUsuario(email, clave)){
             user = daoUser.obtenerDatosUsuario(email);
             request.setAttribute("datosUser", user);
            request.getRequestDispatcher("home_usuario.jsp").forward(request, response);
            }else{
                request.setAttribute("msgErrorLoginUsuario", "Correo electronico y/o contraseña incorrecta.");
                 request.getRequestDispatcher("pagina_error.jsp").forward(request, response);
            }
        }else if(request.getParameter("opt").equals("LA")){
            
        if(request.getParameter("txtUsuario").equals("root") && request.getParameter("txtPass").equals("root")){
            request.getRequestDispatcher("home_admin.jsp").forward(request, response);
        }else{
            request.setAttribute("msgErrorLoginAdmin", "Credenciales invalidas.");
            request.getRequestDispatcher("pagina_error.jsp").forward(request, response);
        }
        
        }else {
request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }

    }  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

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
