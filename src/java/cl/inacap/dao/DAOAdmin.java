/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.dao;

import cl.inacap.modelo.Chofer;
import cl.inacap.modelo.Ruta;
import cl.inacap.modelo.Solicitud;
import cl.inacap.modelo.Usuario;
import cl.inacap.modelo.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicolas
 */
public class DAOAdmin extends ConexBD {
    
    public void insertarChofer (Chofer chf){
        
        
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            
            //Preparar la consulta para la BD
            String strSQL="insert into chofer values (?,?,?)";
            PreparedStatement ps = con.prepareStatement(strSQL);
            
            //Rut
            ps.setLong(1, chf.getRut());
            //Nombre
           ps.setString(2, chf.getNombre());
           //Apellido
           ps.setString(3, chf.getApellido());
     
           
           
            
            //Ejecutar la sentencia
            ps.executeUpdate();
            
            
            //cerrar objetos
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
    }
    
    public void insertarVehiculo (Vehiculo vh){
        
        
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            
            //Preparar la consulta para la BD
            String strSQL="insert into vehiculo values (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(strSQL);
            
            //Patente
            ps.setString(1, vh.getPatente());
            //Marca
           ps.setString(2, vh.getMarca());
           //Modelo
           ps.setString(3, vh.getModelo());
           //Año
           ps.setInt(4, vh.getAnio());
           //Tipo de Vehiculo
           ps.setString(5, vh.getTipo());
     
           
           
            
            //Ejecutar la sentencia
            ps.executeUpdate();
            
            
            //cerrar objetos
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
    }
    
    public void insertarRuta (Ruta ruta){
        
        
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            
            //Preparar la consulta para la BD
            String strSQL="insert into ruta values (?,?,?)";
            PreparedStatement ps = con.prepareStatement(strSQL);
            
            //Rut
            ps.setLong(1, ruta.getRutChofer());
            //Nombre
           ps.setString(2, ruta.getPatenteVehiculo());
           //Apellido
           ps.setInt(3, ruta.getIdSolicitud());
     
           
           
            
            //Ejecutar la sentencia
            ps.executeUpdate();
            
            
            //cerrar objetos
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
    }
    
     public ArrayList <Solicitud> listarSolicitudes(){
        //Declaracion de objetos
        ArrayList <Solicitud> solicitudes = new ArrayList();
        Solicitud sol;
        
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            
            //Preparar la consulta para la BD
            String strSQL="select * from solicitud where estado = 'pendiente' ";
            PreparedStatement ps = con.prepareStatement(strSQL);
            
            //Ejecutar la consulta
            ResultSet res = ps.executeQuery();
            
            //Recorrer el objeto res
            while(res.next()){
                sol = new Solicitud();
                sol.setId_solicitud(res.getInt("id_solicitud"));
                sol.setRut_user(res.getLong("rut_usuario"));
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
     
     public ArrayList <Vehiculo> ListarVehiculos() {
         ArrayList <Vehiculo> vehiculos = new ArrayList();
         Vehiculo vh;
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            //Preparar la consulta para la BD
            String strSQL="select * from vehiculo";
            PreparedStatement ps = con.prepareStatement(strSQL);
            //Definir el parametro
           
            //Ejecutar la consulta
            ResultSet res = ps.executeQuery();
            //Recorre el resulset 
            while(res.next()){
                vh = new Vehiculo();
             vh.setPatente(res.getString("patente"));
             vh.setMarca(res.getString("marca"));
             vh.setModelo(res.getString("modelo"));
             vh.setAnio(res.getInt("anio"));
             vh.setTipo(res.getString("tipo"));
             
             vehiculos.add(vh);
            }
            res.close();
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vehiculos;
    }
     
     
     public Usuario buscarDatosUsuario(String  strRut){
         Usuario user=null;
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            //Preparar la consulta para la BD
            String strSQL="select * from usuario where rut = ?";
            PreparedStatement ps = con.prepareStatement(strSQL);
            //Definir el parametro
            ps.setLong(1, Long.parseLong(strRut));
            //Ejecutar la consulta
            ResultSet res = ps.executeQuery();
            //Recorre el resulset 
            if(res.next()){
            user = new Usuario();
            user.setRut(res.getLong("rut"));
                user.setNombre(res.getString("nombre"));
                user.setApellido(res.getString("apellido"));
                user.setComuna(res.getString("comuna"));
                user.setTelefono(res.getInt("telefono"));
                user.setEmail(res.getString("correo"));
               
            }
            res.close();
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
     
     public Chofer buscarDatosChofer(String  strRut){
         Chofer chf=null;
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            //Preparar la consulta para la BD
            String strSQL="select * from chofer where rut = ?";
            PreparedStatement ps = con.prepareStatement(strSQL);
            //Definir el parametro
            ps.setLong(1, Long.parseLong(strRut));
            //Ejecutar la consulta
            ResultSet res = ps.executeQuery();
            //Recorre el resulset 
            if(res.next()){
            chf = new Chofer();
                chf.setRut(res.getLong("rut"));
                chf.setNombre(res.getString("nombre"));
                chf.setApellido(res.getString("apellido"));
               
            }
            res.close();
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chf;
    }
     
     public Vehiculo buscarDatosVehiculo(String  strPatente){
         Vehiculo vh=null;
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            //Preparar la consulta para la BD
            String strSQL="select * from vehiculo where patente = ?";
            PreparedStatement ps = con.prepareStatement(strSQL);
            //Definir el parametro
            ps.setString(1, strPatente);
            //Ejecutar la consulta
            ResultSet res = ps.executeQuery();
            //Recorre el resulset 
            if(res.next()){
            vh = new Vehiculo();
            vh.setPatente(res.getString("patente"));
            vh.setMarca(res.getString("marca"));
            vh.setModelo(res.getString("modelo"));
            vh.setAnio(res.getInt("anio"));
            vh.setTipo(res.getString("tipo"));
               
            }
            res.close();
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vh;
    }
     
     public ArrayList <Chofer> listarChoferes(){
        //Declaracion de objetos
        ArrayList <Chofer> choferes = new ArrayList();
        Chofer chf;
        
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            
            //Preparar la consulta para la BD
            String strSQL="select * from chofer";
            PreparedStatement ps = con.prepareStatement(strSQL);
            
            //Ejecutar la consulta
            ResultSet res = ps.executeQuery();
            
            //Recorrer el objeto res
            while(res.next()){
                chf = new Chofer();
                chf.setRut(res.getLong("rut"));
                chf.setNombre(res.getString("nombre"));
                chf.setApellido(res.getString("apellido"));
                
               
                //Guardar datos en el Arraylist
               choferes.add(chf);
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
        
        
        return choferes;
    }
     
     public Solicitud buscarDatosSolicitud(String  idSolicitud){
         Solicitud sol=null;
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            //Preparar la consulta para la BD
            String strSQL="select * from solicitud where id_solicitud = ?";
            PreparedStatement ps = con.prepareStatement(strSQL);
            //Definir el parametro
            ps.setInt(1, Integer.parseInt(idSolicitud));
            //Ejecutar la consulta
            ResultSet res = ps.executeQuery();
            //Recorre el resulset 
            if(res.next()){
            sol=new Solicitud();
                sol.setId_solicitud(res.getInt("id_solicitud"));
                sol.setRut_user(res.getLong("rut_usuario"));
                sol.setTipo_vehiculo(res.getString("tipo_vehiculo"));
               
            }
            res.close();
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sol;
    }
     
    public void ActualizarEstadoSolicitud(String  idSolicitud){
        
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            //Preparar la consulta para la BD
            String strSQL="UPDATE solicitud SET estado='asignado' WHERE id_solicitud=?";
            PreparedStatement ps = con.prepareStatement(strSQL);
            //Definir el parametro
            ps.setInt(1, Integer.parseInt(idSolicitud));
            //Ejecutar la consulta
            ResultSet res = ps.executeQuery();
            //Recorre el resulset 
            
            res.close();
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public ArrayList <Usuario> ListarUsuarios() {
         ArrayList <Usuario> usuarios = new ArrayList();
         Usuario user;
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            //Preparar la consulta para la BD
            String strSQL="select * from usuario";
            PreparedStatement ps = con.prepareStatement(strSQL);
            //Definir el parametro
           
            //Ejecutar la consulta
            ResultSet res = ps.executeQuery();
            //Recorre el resulset 
            while(res.next()){
                user=new Usuario();
                user.setNombre(res.getString("nombre"));
                user.setApellido(res.getString("apellido"));
                user.setEmail(res.getString("correo"));
                user.setTelefono(res.getInt("telefono"));
             
             usuarios.add(user);
            }
            res.close();
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }
    
    public ArrayList <Vehiculo> ListarTaxis(){
        //Declaracion de objetos
        ArrayList <Vehiculo> taxis = new ArrayList();
        Vehiculo vh;
        
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            
            //Preparar la consulta para la BD
            String strSQL="select * from vehiculo where tipo = 'taxi' ";
            PreparedStatement ps = con.prepareStatement(strSQL);
            
             
            //Ejecutar la consulta
            ResultSet res = ps.executeQuery();
            
            //Recorrer el objeto res
            while(res.next()){
                vh = new Vehiculo();
               vh.setPatente(res.getString("patente"));
               vh.setMarca(res.getString("marca"));
               vh.setAnio(res.getInt("anio"));
                
                
               
                //Guardar datos en el Arraylist
               taxis.add(vh);
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
        
        
        return taxis;
    }
    
    public ArrayList <Vehiculo> ListarVan8 (){
        //Declaracion de objetos
        ArrayList <Vehiculo> van8 = new ArrayList();
        Vehiculo vh;
        
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            
            //Preparar la consulta para la BD
            String strSQL="select * from vehiculo where tipo = 'van_8' ";
            PreparedStatement ps = con.prepareStatement(strSQL);
            
             
            //Ejecutar la consulta
            ResultSet res = ps.executeQuery();
            
            //Recorrer el objeto res
            while(res.next()){
                vh = new Vehiculo();
               vh.setPatente(res.getString("patente"));
               vh.setMarca(res.getString("marca"));
               vh.setAnio(res.getInt("anio"));
                
                
               
                //Guardar datos en el Arraylist
               van8.add(vh);
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
        
        
        return van8;
    }
    
    public ArrayList <Vehiculo> ListarVan12(){
        //Declaracion de objetos
        ArrayList <Vehiculo> van12 = new ArrayList();
        Vehiculo vh;
        
        try {
            //Establecer la conexion
            Connection con = this.getConexion();
            
            //Preparar la consulta para la BD
            String strSQL="select * from vehiculo where tipo = 'van_12' ";
            PreparedStatement ps = con.prepareStatement(strSQL);
            
             
            //Ejecutar la consulta
            ResultSet res = ps.executeQuery();
            
            //Recorrer el objeto res
            while(res.next()){
                vh = new Vehiculo();
               vh.setPatente(res.getString("patente"));
               vh.setMarca(res.getString("marca"));
               vh.setAnio(res.getInt("anio"));
                
                
               
                //Guardar datos en el Arraylist
               van12.add(vh);
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
        
        
        return van12;
    }
}
