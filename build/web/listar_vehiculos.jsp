<%-- 
    Document   : listar_vehiculos
    Created on : 09-12-2014, 10:24:21 AM
    Author     : Nicolas
--%>

<%@page import="cl.inacap.modelo.Vehiculo"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de vehiculos</title>
    </head>
    <%ArrayList <Vehiculo> lstVh = (ArrayList)request.getAttribute("vehiculos");%>
    <body>
        
        
        <div class="container well">
            
         <ul class="nav nav-tabs">
         <li ><a href="home_admin.jsp">Home</a></li>
         <li><a href="nuevo_chofer.jsp">Agregar Chofer</a></li>
         <li><a href="nuevo_vehiculo.jsp">Agregar Vehiculo</a></li>         
         <li><a href="ControlAdmin?opt=LU">Usuarios Registrados</a></li> 
         <li><a href="ControlAdmin?opt=LC">Reportes de Choferes</a></li>
         <li class="active"><a href="#">Reportes de Vehiculos</a></li>
         <li><a href="ControlAdmin?opt=LS">Responder solicitudes de transporte</a></li>
         <li><a href="index.jsp">Cerrar Sesion</a></li>
         
         
         </ul>
         </div>
        
        <div class="container well">
        <h1>Listado de Vehiculos</h1>
        
        <table class="table table-bordered table-striped">
            <thead>
                <tr>
                    <th>Patente</th>
                    <th>Marca</th>
                    <th>Modelo</th>
                    <th>Año</th>
                    <th>Tipo (*)</th>
                    
                </tr>
            </thead>
            <tbody>
                <% for(Vehiculo vh :lstVh){ %>
                <tr>
                    <td><%= vh.getPatente() %></td>
                    <td><%= vh.getMarca() %></td>
                    <td><%= vh.getModelo() %></td>
                    <td><%= vh.getAnio() %></td>
                    <td><%= vh.getTipo() %></td>
                   
                </tr>
                <% }%>
            </tbody>
        </table>
            <span class="help-block">(*) taxi:Taxi | van_8:Van de 8 pasajeros | van_12:Van de 12 pasajeros</span>
            </div>
        
        
        
        <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body>
</html>
