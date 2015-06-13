<%-- 
    Document   : detalle
    Created on : 09-12-2014, 03:04:42 PM
    Author     : Nicolas
--%>

<%@page import="cl.inacap.modelo.Usuario"%>
<%@page import="cl.inacap.modelo.Vehiculo"%>
<%@page import="cl.inacap.modelo.Chofer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%Usuario user = (Usuario) request.getAttribute("datosUser");
        Chofer chf = (Chofer)request.getAttribute("chofer");
    Vehiculo vh = (Vehiculo)request.getAttribute("vehiculo");
String idSolicitud = (String) request.getAttribute("idSolicitud");
String email = (String) request.getAttribute("email"); %>
    <body>
        <div class="container well" >
        
            <h1>N° de Solictud: <%= idSolicitud %></h1>
        
        <table style="border: 5px" class="table table-bordered table-striped">
            <thead>
                <tr>
                    <th colspan="2">Datos del Chofer</th>
                    
                    <th colspan="3">Datos del vehiculo</th>
                    
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><strong><em>Nombre</em></strong></td>
                    <td><strong><em>Apellido</em></strong></td>
                    
                    <td><strong><em>Marca</em></strong></td>
                    <td><strong><em>Modelo</em></strong></td>
                    <td><strong><em>Año</em></strong></td>
                </tr>
                <tr>
                    <td><%=chf.getNombre()%></td>
                    <td><%=chf.getApellido()%></td>
                    
                    <td><%=vh.getMarca()%></td>
                    <td><%=vh.getModelo()%></td>
                    <td><%=vh.getAnio()%></td>
                </tr>
                
            </tbody>
        </table>
         
                <form action="ControlUsuario">
                    <input type="hidden" name="opt" value="AM"/>
                    <input type="hidden" name="email" value="<%=user.getEmail()%>"/>
                    
        <button type="submit" class="btn btn-success btn-lg">Volver a Asignaciones</button>
        </form> 
        
        
        
        
      
        </div>
        <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body>
</html>
