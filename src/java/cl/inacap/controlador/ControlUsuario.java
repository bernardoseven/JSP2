/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.controlador;

import cl.inacap.dao.DAOUsuario;
import cl.inacap.modelo.Chofer;
import cl.inacap.modelo.Ruta;
import cl.inacap.modelo.Solicitud;
import cl.inacap.modelo.Usuario;
import cl.inacap.modelo.Vehiculo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nicolas
 */
@WebServlet(name = "ControlUsuario", urlPatterns = {"/ControlUsuario"})
public class ControlUsuario extends HttpServlet {

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
        Solicitud sol = new Solicitud();
        Chofer chf = new Chofer();
        Vehiculo vh = new Vehiculo();
        Ruta ruta = new Ruta();
        ArrayList <Solicitud> lstSol = new ArrayList();
        
        String email=request.getParameter("email");
        
        if (request.getParameter("opt").equals("FC")){
            
            user=daoUser.obtenerDatosUsuario(email);
            request.setAttribute("datosUser", user);
            request.getRequestDispatcher("formulario_contacto.jsp").forward(request, response);
            
        }else if(request.getParameter("opt").equals("EFC")){
            
            user=daoUser.obtenerDatosUsuario(email);
            
            request.setAttribute("msgFormularioContactoEnviado", "La solicitud de contacto se ha enviado corectamente. Pronto nos contactaremos.");
            request.setAttribute("datosUser", user);
            request.getRequestDispatcher("solicitud_procesada.jsp").forward(request, response);
        }else if(request.getParameter("opt").equals("SS")){
            
            user=daoUser.obtenerDatosUsuario(email);
            request.setAttribute("datosUser", user);
            request.getRequestDispatcher("solicitud_servicio.jsp").forward(request, response);
            
        }else if(request.getParameter("opt").equals("ESS")){
            
                user=daoUser.obtenerDatosUsuario(email);
            long rut=user.getRut();
            
            sol.setRut_user(rut);
            sol.setTipo_vehiculo(request.getParameter("cboTipoVehiculo"));
            sol.setEstado("pendiente");
            
            daoUser.registrarSolicitud(sol);
            
            
            request.setAttribute("msgSolicitudServicio", "La solicitud de servicio se ha enviado corectamente. Revise la seccion de "
                    + "asignacion de moviles para conocer el estado de sus solicitudes.");
            request.setAttribute("datosUser", user);
            request.getRequestDispatcher("solicitud_procesada.jsp").forward(request, response);
            
        }else if(request.getParameter("opt").equals("H")){
            user=daoUser.obtenerDatosUsuario(email);
            request.setAttribute("datosUser", user);
            request.getRequestDispatcher("home_usuario.jsp").forward(request, response);
            
        }else if(request.getParameter("opt").equals("AM")){
           user=daoUser.obtenerDatosUsuario(email);
           
            lstSol=daoUser.ListarSolicitudesUsuario(email);
            
            request.setAttribute("solicitudes", lstSol);
            request.setAttribute("datosUser", user);
            
            request.getRequestDispatcher("asignacion_movil.jsp").forward(request, response);
        }else if(request.getParameter("opt").equals("detalle")){
            
            
            user=daoUser.obtenerDatosUsuario(request.getParameter("email"));
            chf=daoUser.obtenerDatosChofer(request.getParameter("cboIdSolicitud"));
            vh=daoUser.obtenerDatosVehiculo(request.getParameter("cboIdSolicitud"));
            String idSolicitud=request.getParameter("cboIdSolicitud");
            
            request.setAttribute("chofer", chf);
            request.setAttribute("vehiculo", vh);
            request.setAttribute("idSolicitud", idSolicitud);
            request.setAttribute("datosUser", user);
            
            
            
            request.getRequestDispatcher("detalle.jsp").forward(request, response);
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
