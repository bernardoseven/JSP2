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
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nicolas
 */
public class RegistroUsuario extends HttpServlet {

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
    
    Usuario user = new Usuario();
    DAOUsuario daoUser = new DAOUsuario();
    
    //Variables para contraseñas
    String pass1 = request.getParameter("txtPass1");
    String pass2 = request.getParameter("txtPass2");
    
       
       
       if (pass1.equals(pass2) ){
           //Recuperar los parametros desde la peticion
           //Rut
           user.setRut(Long.parseLong(request.getParameter("txtRut")));
           //Nombre
           user.setNombre(request.getParameter("txtNombre"));
           //Apellido
           user.setApellido(request.getParameter("txtApellido"));
           //Comuna
           user.setComuna(request.getParameter("cboComuna"));
           //Telefono
           user.setTelefono(Integer.parseInt(request.getParameter("txtTelefono")));
           //Correo
           user.setEmail(request.getParameter("txtEmail"));
           //Clave
           user.setClave(request.getParameter("txtPass1"));
           
           //Invocar al metodo que inserta los registros
           daoUser.insertarUsuario(user);
           
           request.setAttribute("msgRegistroUsuarioOk", "El registro de usuario se ha realizado correctamente.");
           
           request.getRequestDispatcher("registro_ok.jsp").forward(request, response);
       }else{
           
             //Informar al index del error.
            request.setAttribute("msg", "Las contraseñas no son iguales.");
            request.getRequestDispatcher("registro_usuario.jsp").forward(request, response);
            
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
