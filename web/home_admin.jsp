<%-- 
    Document   : home_admin
    Created on : 03-12-2014, 03:42:11 PM
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrador</title>
    </head>
    <body>
        
        <div class="container well">
            
         <ul class="nav nav-tabs">
         <li class="active"><a href="#">Home</a></li>
         <li><a href="nuevo_chofer.jsp">Agregar Chofer</a></li>
         <li><a href="nuevo_vehiculo.jsp">Agregar Vehiculo</a></li>         
         <li><a href="ControlAdmin?opt=LU">Usuarios Registrados</a></li>                 
         <li><a href="ControlAdmin?opt=LC">Reportes de Choferes</a></li>
         <li><a href="ControlAdmin?opt=LV">Reportes de Vehiculos</a></li>
         <li><a href="ControlAdmin?opt=LS">Responder solicitudes de transporte</a></li>
         <li><a href="index.jsp">Cerrar Sesion</a></li>
         
         
         </ul>
         </div>
        
        
        <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body>
</html>
