<%-- 
    Document   : solicitud_servicio
    Created on : 02-12-2014, 12:20:50 AM
    Author     : Nicolas
--%>

<%@page import="cl.inacap.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitar Servicio</title>
              <style type="text/css"> 
            #contenedor{
   
   width: 1000px;
   margin: auto;
   
} 
#cabecera{
   
   
   font-size:12pt;
   
   padding: 3 3 3 10px;
   text-align: left;
}

#cuerpo{
   margin: 10 0 10 0px;
   
}
#lateral{
   width: 160px;
   
   float:left;
} 

#principal{
   margin-left: 250px;
   background-color: #ffffff;
   padding: 4 4 4 4px;
   
} 





            </style>
    </head>
    <% Usuario user = (Usuario) request.getAttribute("datosUser");
    
    %>
    <body >
        
        <div id="contenedor"> 
            <div id="cabecera">
        <ul class="nav nav-tabs">
            <li class="active"><a href="#">Hola, <%=user.getNombre()%> </a></li>
         
         <li><a href="index.jsp">Cerrar Sesion</a></li> 
         
         
         </ul>
            </div>
            
            <div id="cuerpo"> 
        
                <div id="lateral">
                    <label><mark>MENU DE OPCIONES</mark></label><br><br>
                    <form action="ControlUsuario">
                    <input type="hidden" name="email" value="<%=user.getEmail()%>"/>
                <input type="hidden" name="opt" value="H"/>
  <button type="submit" class="btn btn-success btn-lg">Home</button>
                </form>
                <hr>
         <form action="ControlUsuario">
                <input type="hidden" name="email" value="<%=user.getEmail()%>"/>
                <input type="hidden" name="opt" value="FC"/>
                
  <button type="submit" class="btn btn-primary btn-lg">Formulario de contacto</button>
            </form>
                <hr>
                
                <button type="submit" class="btn btn-primary btn-lg" disabled>Solicitud de Servicios</button>
                 <hr>
                 
                <form action="ControlUsuario">
                    <input type="hidden" name="email" value="<%=user.getEmail()%>"/>
                <input type="hidden" name="opt" value="AM"/>
  <button type="submit" class="btn btn-primary btn-lg">Asignacion de Moviles</button>
                </form>
                </div>
        
                <div id="principal"> 
        <h1>Solicita tu Transporte</h1>
         <fieldset><legend>Completa el siguiente formulario</legend>
                <form role="form" action="ControlUsuario" >
  <div class="form-group">
    <label for="name">Nombre</label>
    <input type="text" class="form-control" id="name" value="<%=user.getNombre()%> <%=user.getApellido()%>" readonly>
  </div>
  
  <div class="form-group">
    <label for="rut">RUT</label>
    <input type="text" class="form-control" id="rut" value="<%= user.getRut() %>" readonly>
  </div>
  
  <div class="form-group">
    <label for="comuna">Comuna</label>
    <input type="text" class="form-control" id="comuna" value="<%= user.getComuna() %>" readonly>
  </div>
  
  <div class="form-group">
        <label for="tipovehiculo">Tipo del Vehiculo</label>       
            <select name="cboTipoVehiculo" class="form-control" id="tipovehiculo">
                <option selected>-- Seleccione el tipo de vehiculo --</option>
                <option value="taxi">Taxi</option>                
                <option value="van_8">Van de 8 pasajeros</option>
                <option value="van_12">Van de 12 pasajeros</option>               
            </select> 
  </div>
  
  <input type="hidden" name="email" value="<%=user.getEmail()%>"/>
  <input type="hidden" name="opt" value="ESS"/>
   <button type="submit" class="btn btn-primary">Enviar solicitud</button>
                </form>
         </fieldset>
                </div>
            </div>
        </div>
  <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body>
</html>
