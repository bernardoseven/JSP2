<%-- 
    Document   : registro_ok
    Created on : 26-11-2014, 12:36:05 PM
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Satisfactorio</title>
    </head>
    
    <body>
        
        
        
        <% if (request.getAttribute("msgRegistroChoferOk") != null){ %>
        <div class="container well">
        <a href="home_admin.jsp">Volver</a>  
        </div>
        <div class="container well" style="color:green; font-size:18px; font-family: calibri;">
            <h1> <%= request.getAttribute("msgRegistroChoferOk").toString() %></h1>
        </div>
        <% } %>
        
        <% if (request.getAttribute("msgRegistroVehiculoOk") != null){ %>
        <div class="container well">
        <a href="home_admin.jsp">Volver</a>  
        </div>
        <div class="container well" style="color:green; font-size:18px; font-family: calibri;">
            <h1> <%= request.getAttribute("msgRegistroVehiculoOk").toString() %></h1>
        </div>
        <% } %>
        
         <% if (request.getAttribute("msgRegistroUsuarioOk") != null){ %>
         <div class="container well">
        <a href="login_usuario.jsp">Iniciar Sesion</a>  
        </div>
        <div class="container well" style="color:green; font-size:18px; font-family: calibri;">
            <h1> <%= request.getAttribute("msgRegistroUsuarioOk").toString() %></h1>
        </div>
        <% } %>
        
        
        <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body >
</html>
