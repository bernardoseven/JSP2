<%-- 
    Document   : solicitud_procesada
    Created on : 02-12-2014, 03:35:14 PM
    Author     : Nicolas
--%>

<%@page import="cl.inacap.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solictud Procesada</title>
    </head>
    <%Usuario user = (Usuario) request.getAttribute("datosUser");%>
    <body>
        
        
        
        <% if (request.getAttribute("msgFormularioContactoEnviado") != null){ %>
        <div class="container well" style="color:green; font-size:18px; font-family: calibri;">
            <h1> <%= request.getAttribute("msgFormularioContactoEnviado").toString() %></h1>
            <form>
                <input type="hidden" name="opt" value="H">
                <input type="hidden" name="email" value="<%=user.getEmail()%>">
                
                <button type="submit" class="btn btn-success btn-lg">Volver al Home</button>
            </form>
        </div>
        <% } %>
        
        <% if (request.getAttribute("msgSolicitudServicio") != null){ %>
        <div class="container well" style="color:green; font-size:18px; font-family: calibri;">
            <h1> <%= request.getAttribute("msgSolicitudServicio").toString() %></h1>
            <form>
                <input type="hidden" name="opt" value="H">
                <input type="hidden" name="email" value="<%=user.getEmail()%>">
                
                <button type="submit" class="btn btn-success btn-lg">Volver al Home</button>
            </form>
        </div>
        <% } %>
        
        <% if (request.getAttribute("msgSolicitudAsignada") != null){ %>
        <div class="container well" style="color:green; font-size:18px; font-family: calibri;">
            <a href="home_admin.jsp">Volver</a>  
            <h1> <%= request.getAttribute("msgSolicitudAsignada").toString() %></h1>
        </div>
        <% } %>
        
        
        
        
        
        
        <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body>
</html>
