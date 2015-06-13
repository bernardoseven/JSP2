/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nicolas
 */
public class ConexBD {
    
    //Usuario y Password de la Base de Datos
     private String user="pruebas";
    private String pass="gandalf111";
    
    //Conexion a la Base de Datos
    private String urlOracle="jdbc:oracle:thin:@localhost:1521:XE";
    
    public Connection getConexion() throws ClassNotFoundException, SQLException{
       
        //Oracle
        Class.forName("oracle.jdbc.OracleDriver");
        
        //Establecer la conexion
        Connection con = DriverManager.getConnection(urlOracle, user,pass);
        return con;
        
    }
}
