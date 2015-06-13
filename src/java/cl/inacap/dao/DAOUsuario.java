/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.dao;

import cl.inacap.modelo.Chofer;
import cl.inacap.modelo.Solicitud;
import cl.inacap.modelo.Usuario;
import cl.inacap.modelo.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicolas
 */
public class DAOUsuario extends ConexBD {
    
  
    
    public void insertarUsuario(Usuario user){
        
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            
            //Preparar la consulta para la BD
            String strSQL="insert into usuario values (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(strSQL);
            
            //Rut
            ps.setLong(1, user.getRut());
            //Nombre
           ps.setString(2, user.getNombre());
           //Apellido
           ps.setString(3, user.getApellido());
           //Comuna
           ps.setString(4, user.getComuna());
           //Telefono
           ps.setInt(5, user.getTelefono());
           //Correo
           ps.setString(6, user.getEmail());
           //Contraseña
           ps.setString(7, user.getClave());
           
            
            //Ejecutar la sentencia
            int cantFilas=ps.executeUpdate();
            LOG.log(Level.INFO, "Cantidad de filas insertadas: " + cantFilas);
            
            //cerrar objetos
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static final Logger LOG = Logger.getLogger(DAOUsuario.class.getName());
    
   
  public boolean validarUsuario(String email, String clave) {
        try {
            Connection con = this.getConexion();
            String sql = "SELECT * FROM usuario WHERE correo = ? AND clave = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, clave);
            ResultSet rs = ps.executeQuery();
            
            return rs.next();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
  }
  
  
  public Usuario obtenerDatosUsuario(String email){
         Usuario user = null;
      try {
           
         
            Connection con = this.getConexion();
             String strSQL="select * from usuario where correo = ?";
            PreparedStatement ps = con.prepareStatement(strSQL);
            //Definir el parametro
            ps.setString(1, email);
            //Ejecutar la consulta
            ResultSet res = ps.executeQuery();
        
        if(res.next()){
             user = new Usuario();
             user.setRut(res.getLong("rut"));
              user.setNombre(res.getString("nombre"));              
              user.setApellido(res.getString("apellido"));
              user.setComuna(res.getString("comuna"));
              user.setEmail(res.getString("correo"));
              user.setTelefono(Integer.parseInt(res.getString("telefono")));
            
        }
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
      return user;
        
  }

      public void registrarSolicitud(Solicitud solc){
        
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            
            //Preparar la consulta para la BD
            String strSQL="insert into solicitud values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(strSQL);
            
           
            ps.setLong(1, solc.getId_solicitud());
           ps.setLong(2, solc.getRut_user());
           //tipo de vehiculo
           ps.setString(3, solc.getTipo_vehiculo());
           ps.setString(4, solc.getEstado());
           
            
            //Ejecutar la sentencia
            int cantFilas=ps.executeUpdate();
            LOG.log(Level.INFO, "Cantidad de filas insertadas: " + cantFilas);
            
            //cerrar objetos
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public ArrayList <Solicitud> ListarSolicitudesUsuario(String email){
        //Declaracion de objetos
        ArrayList <Solicitud> solicitudes = new ArrayList();
        Solicitud sol;
        
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            
            //Preparar la consulta para la BD
            String strSQL="select id_solicitud, tipo_vehiculo from usuario u, solicitud s where u.rut = s.rut_usuario and estado = 'asignado' and u.correo = ?";
            PreparedStatement ps = con.prepareStatement(strSQL);
            
             ps.setString(1, email);
            //Ejecutar la consulta
            ResultSet res = ps.executeQuery();
            
            //Recorrer el objeto res
            while(res.next()){
                sol = new Solicitud();
                sol.setId_solicitud(res.getInt("id_solicitud"));
                sol.setTipo_vehiculo(res.getString("tipo_vehiculo"));
                
                
               
                //Guardar datos en el Arraylist
               solicitudes.add(sol);
            }
            //Cerrar las conexiones
            res.close();
            ps.close();
            con.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, "No se pudo registrar el driver", ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, "Error en acceso a Base de Datos", ex);
        }
        
        
        return solicitudes;
    }
       
     public Chofer obtenerDatosChofer(String idSolicitud){
         Chofer chf = null;
      try {
           
         
            Connection con = this.getConexion();
             String strSQL="select * from chofer c, ruta r where c.rut = r.rut_chofer and id_solicitud = ?";
            PreparedStatement ps = con.prepareStatement(strSQL);
            //Definir el parametro
            ps.setInt(1, Integer.parseInt(idSolicitud));
            //Ejecutar la consulta
            ResultSet res = ps.executeQuery();
        
        if(res.next()){
             chf = new Chofer();
             chf.setNombre(res.getString("nombre"));
             chf.setApellido(res.getString("apellido"));
            
        }
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
      return chf;
        
  } 
     
     public Vehiculo obtenerDatosVehiculo(String idSolicitud){
         Vehiculo vh = null;
      try {
           
         
            Connection con = this.getConexion();
             String strSQL="select * from vehiculo v, ruta r where v.patente = r.patente_vehiculo and id_solicitud = ?";
            PreparedStatement ps = con.prepareStatement(strSQL);
            //Definir el parametro
            ps.setInt(1, Integer.parseInt(idSolicitud));
            //Ejecutar la consulta
            ResultSet res = ps.executeQuery();
        
        if(res.next()){
             vh = new Vehiculo();
             vh.setMarca(res.getString("marca"));
             vh.setModelo(res.getString("modelo"));
             vh.setAnio(res.getInt("anio"));
            
        }
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
      return vh;
        
  }
    
}

