<%-- 
    Document   : listar_choferes
    Created on : 09-12-2014, 10:24:07 AM
    Author     : Nicolas
--%>

<%@page import="cl.inacap.modelo.Chofer"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Choferes</title>
    </head>
    <%ArrayList <Chofer> lstChf = (ArrayList)request.getAttribute("choferes");%>
    <body>
        
        <div class="container well">
            
         <ul class="nav nav-tabs">
         <li ><a href="home_admin.jsp">Home</a></li>
         <li><a href="nuevo_chofer.jsp">Agregar Chofer</a></li>
         <li><a href="nuevo_vehiculo.jsp">Agregar Vehiculo</a></li>         
         <li><a href="ControlAdmin?opt=LU">Usuarios Registrados</a></li> 
         <li class="active"><a href="#">Reportes de Choferes</a></li>
         <li><a href="ControlAdmin?opt=LV">Reportes de Vehiculos</a></li>
         <li><a href="ControlAdmin?opt=LS">Responder solicitudes de transporte</a></li>
         <li><a href="index.jsp">Cerrar Sesion</a></li>
         
         
         </ul>
         </div>
        
        <div class="container well">
        <h1>Listado de Choferes</h1>
        
        <table class="table table-bordered table-striped">
            <thead>
                <tr>
                    <th>Rut</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    
                </tr>
            </thead>
            <tbody>
                <% for(Chofer chf :lstChf){ %>
                <tr>
                    <td><%= chf.getRut() %></td>
                    <td><%= chf.getNombre() %></td>
                    <td><%= chf.getApellido() %></td>
                   
                </tr>
                <% }%>
            </tbody>
        </table>
            </div>
            <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body>
</html>
