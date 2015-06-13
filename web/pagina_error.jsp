<%-- 
    Document   : login_error
    Created on : 01-12-2014, 03:56:23 PM
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
        
        
         <!--Recuperar datos de mensajeria-->
        <% if (request.getAttribute("msgErrNuevoChf") != null){ %>
        <div class="container well" style="color:red; font-size:20px; font-family: calibri">
            <a href="home_admin.jsp">Volver</a>  
            <h1> <%= request.getAttribute("msgErrNuevoChf").toString() %></h1>
        </div>
            <%}%>
            
            <% if (request.getAttribute("msgErrorLoginUsuario") != null){ %>
        <div class="container well" style="color:red; font-size:18px; font-family: calibri;">
            <a href="login_usuario.jsp">Volver</a>  
            <h1> <%= request.getAttribute("msgErrorLoginUsuario").toString() %></h1>
        </div>
        <% } %>
        
        <% if (request.getAttribute("msgErrorLoginAdmin") != null){ %>
        <div class="container well" style="color:red; font-size:18px; font-family: calibri;">
            <a href="login_admin.jsp">Volver</a>  
            <h1> <%= request.getAttribute("msgErrorLoginAdmin").toString() %></h1>
        </div>
        <% } %>
        
        
        
            
        <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body>
</html>
