/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.controlador;

import cl.inacap.dao.DAOAdmin;
import cl.inacap.modelo.Chofer;
import cl.inacap.modelo.Ruta;
import cl.inacap.modelo.Solicitud;
import cl.inacap.modelo.Usuario;
import cl.inacap.modelo.Vehiculo;
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
public class ControlAdmin extends HttpServlet {

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
       
        
       //Objetos
         ArrayList <Solicitud> lstSol = new ArrayList();
         ArrayList <Chofer> lstChf= new ArrayList();
         ArrayList <Vehiculo> lstVh= new ArrayList();
         ArrayList <Vehiculo> taxi= new ArrayList();
         ArrayList <Vehiculo> van8= new ArrayList();
         ArrayList <Vehiculo> van12= new ArrayList();
         ArrayList <Usuario> lstUser= new ArrayList();
        Vehiculo vh = new Vehiculo();
        Chofer chf = new Chofer();
        Solicitud sol = new Solicitud();
        Ruta ruta = new Ruta();
        DAOAdmin daoAdmin = new DAOAdmin();
        Usuario user = new Usuario();
        
        if(request.getParameter("opt").equals("NCh")){
            
            if((request.getParameter("txtRut").equals("")) && (request.getParameter("txtNombre").equals("")) && request.getParameter("txtApellido").equals("")){
                
                 //Informar al index del error.
            request.setAttribute("msgErrNuevoChf", "No se ha realizado el registro. Revise que los datos ingresados sean correctos o que los campos no esten vacios");
            request.getRequestDispatcher("pagina_error.jsp").forward(request, response);
               
            }else{
                //Rut
           chf.setRut(Long.parseLong(request.getParameter("txtRut")));
           //Nombre
           chf.setNombre(request.getParameter("txtNombre"));
           //Apellido
           chf.setApellido(request.getParameter("txtApellido"));
           
           daoAdmin.insertarChofer(chf);
           
           request.setAttribute("msgRegistroChoferOk", "El chofer se ha registrado correctamente");
           
           request.getRequestDispatcher("registro_ok.jsp").forward(request, response);
            }
            
        }else if(request.getParameter("opt").equals("NVh")){
            
            vh.setPatente(request.getParameter("txtPatente"));
            vh.setMarca(request.getParameter("txtMarca"));
            vh.setModelo(request.getParameter("txtModelo"));
            vh.setAnio(Integer.parseInt(request.getParameter("txtAnio")));
            vh.setTipo(request.getParameter("cboTipoVehiculo"));
            
            daoAdmin.insertarVehiculo(vh);
            
            request.setAttribute("msgRegistroVehiculoOk", "El vehiculo se ha registrado correctamente");
            
            request.getRequestDispatcher("registro_ok.jsp").forward(request, response);
            
        }else if(request.getParameter("opt").equals("LS")){
             lstSol = daoAdmin.listarSolicitudes();
             
             lstChf=daoAdmin.listarChoferes();
             
             taxi=daoAdmin.ListarTaxis();
             van8=daoAdmin.ListarVan8();
             van12=daoAdmin.ListarVan12();
             
             lstVh=daoAdmin.ListarVehiculos();
             
             
        //Definir un atributo del request para enviar los empleados
        request.setAttribute("solicitudes", lstSol );
        request.setAttribute("choferes", lstChf );
        request.setAttribute("taxis", taxi );
        request.setAttribute("van8", van8 );
        request.setAttribute("van12", van12 );
        request.setAttribute("vehiculos", lstVh );
        //Realizar el forwarding
        request.getRequestDispatcher("responder_solicitud.jsp").forward(request, response);
            
        }else if(request.getParameter("opt").equals("RSU")){
             String idSolicitud = request.getParameter("cboIdSolicitud");
             String strRutChofer = request.getParameter("cboRutChofer");
             String strPatente = request.getParameter("cboPatenteVehiculo");
             
             
             sol=daoAdmin.buscarDatosSolicitud(idSolicitud);
             sol.getId_solicitud();
             sol.getRut_user();
             sol.getTipo_vehiculo();
            
            request.setAttribute("datosSolicitud", sol);
            
            
            String strRutUser= String.valueOf(sol.getRut_user());
            
            user=daoAdmin.buscarDatosUsuario(strRutUser);
            user.getRut();           
            user.getNombre();
            user.getApellido();
            user.getComuna();
            user.getTelefono();
            user.getEmail();
            
            request.setAttribute("datosUsuario", user);
            
            chf=daoAdmin.buscarDatosChofer(strRutChofer);
            chf.getRut();
            chf.getNombre();
            chf.getApellido();
            
            request.setAttribute("datosChofer", chf);
            
            vh=daoAdmin.buscarDatosVehiculo(strPatente);
            vh.getPatente();
            vh.getMarca();
            vh.getModelo();
            vh.getAnio();
            vh.getTipo();
            request.setAttribute("datosVehiculo", vh);
            
            
            
           
            
            request.getRequestDispatcher("asignar_solicitud.jsp").forward(request, response);
        }else if(request.getParameter("opt").equals("ResS")){
            
            //Rut
           ruta.setRutChofer(Long.parseLong(request.getParameter("txtRutChofer")));
           //Nombre
           ruta.setPatenteVehiculo(request.getParameter("txtPatente"));
           //Apellido
           ruta.setIdSolicitud(Integer.parseInt(request.getParameter("idSolicitud")));
           
           
           
           daoAdmin.insertarRuta(ruta);
           
           String idSolicitud=request.getParameter("idSolicitud");
           daoAdmin.ActualizarEstadoSolicitud(idSolicitud);
            
            request.setAttribute("msgSolicitudAsignada", "La solictud se ha asignado correctamente");
            
            
            request.getRequestDispatcher("solicitud_procesada.jsp").forward(request, response);
        }else if(request.getParameter("opt").equals("volverSolicitudes")){
            lstSol = daoAdmin.listarSolicitudes();
             
             lstChf=daoAdmin.listarChoferes();
             
             lstVh=daoAdmin.ListarVehiculos();
        //Definir un atributo del request para enviar los empleados
        request.setAttribute("solicitudes", lstSol );
        request.setAttribute("choferes", lstChf );
        request.setAttribute("vehiculos", lstVh );
        //Realizar el forwarding
        request.getRequestDispatcher("responder_solicitud.jsp").forward(request, response);
            
        }else if(request.getParameter("opt").equals("LC")){
            lstChf=daoAdmin.listarChoferes();
            
            request.setAttribute("choferes", lstChf);
            
            request.getRequestDispatcher("listar_choferes.jsp").forward(request, response);
        }else if(request.getParameter("opt").equals("LV")){
            
            lstVh=daoAdmin.ListarVehiculos();
            
            request.setAttribute("vehiculos", lstVh);
            
            request.getRequestDispatcher("listar_vehiculos.jsp").forward(request, response);
        }else if(request.getParameter("opt").equals("LU")){
            
            lstUser=daoAdmin.ListarUsuarios();
            
            request.setAttribute("usuarios", lstUser);
            
            request.getRequestDispatcher("listar_usuarios.jsp").forward(request, response);
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
