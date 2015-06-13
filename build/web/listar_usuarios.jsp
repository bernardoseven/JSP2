<%-- 
    Document   : listar_usuarios
    Created on : 11-12-2014, 12:38:55 PM
    Author     : Nicolas
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="cl.inacap.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Usuarios</title>
    </head>
    <%ArrayList <Usuario> lstUser = (ArrayList)request.getAttribute("usuarios");%>
    <body>
        
        <div class="container well">
            
         <ul class="nav nav-tabs">
         <li ><a href="home_admin.jsp">Home</a></li>
         <li  ><a href="nuevo_chofer.jsp">Agregar Chofer</a></li>
         <li><a href="nuevo_vehiculo.jsp">Agregar Vehiculo</a></li>      
         <li class="active"><a href="#">Usuarios Registrados</a></li> 
         <li><a href="ControlAdmin?opt=LC">Reportes de Choferes</a></li>
         <li ><a href="ControlAdmin?opt=LV">Reportes de Vehiculos</a></li>
         <li><a href="ControlAdmin?opt=LS">Responder solicitudes de transporte</a></li>
         <li><a href="index.jsp">Cerrar Sesion</a></li>
         
         </ul>
         </div>
        
        
        <div class="container well">
            
        <h1>Usuarios Registrados en la BD</h1>
        
         <table class="table table-bordered table-striped">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Email</th>
                    <th>Telefono</th>
                    
                </tr>
            </thead>
            <tbody>
                <% for(Usuario user :lstUser){ %>
                <tr>
                    <td><%= user.getNombre() %></td>
                    <td><%= user.getApellido() %></td>
                    <td><%= user.getEmail()%></td>
                    <td><%= user.getTelefono()%></td>
                   
                </tr>
                <% }%>
            </tbody>
        </table>
        </div>
        
        
        
        
        <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body>
</html>
