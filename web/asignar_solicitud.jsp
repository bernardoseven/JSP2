<%-- 
    Document   : asignar_solicitud
    Created on : 06-12-2014, 09:02:10 PM
    Author     : Nicolas
--%>

<%@page import="cl.inacap.modelo.Solicitud"%>
<%@page import="cl.inacap.modelo.Vehiculo"%>
<%@page import="cl.inacap.modelo.Chofer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cl.inacap.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <% Usuario user = (Usuario) request.getAttribute("datosUsuario");
    Chofer chf = (Chofer)request.getAttribute("datosChofer");
    Vehiculo vh = (Vehiculo)request.getAttribute("datosVehiculo");
    Solicitud sol = (Solicitud)request.getAttribute("datosSolicitud");
    
    
    %>
    <body>
        
        
        <div class="container well">
            <h1>N° de Solicitud: <%=sol.getId_solicitud()%></h1>
        </div>
        
        
        <div class="container well">
            
            
            <fieldset><legend>Datos del Usuario</legend>
                <form >
            <div class="form-group">
    <label for="rutUser">Rut</label>
    <input type="text" class="form-control" id="rutUser" value="<%=user.getRut()%>" readonly>
  </div>
         <div class="form-group">
    <label for="nombreUser">Nombre</label>
    <input type="text" class="form-control" id="nombreUser" value="<%=user.getNombre()%>" readonly>
  </div>
   <div class="form-group">
    <label for="apellidoUser">Apellido</label>
    <input type="text" class="form-control" id="apellidoUser" value="<%=user.getApellido()%>" readonly>
  </div>
  <div class="form-group">
    <label for="comunaUser">Comuna</label>
    <input type="text" class="form-control" id="comunaUser" value="<%=user.getComuna()%>" readonly>
  </div>
  <div class="form-group">
    <label for="telefonoUser">Telefono de contacto</label>
    <input type="text" class="form-control" id="telefonoUser" value="<%=user.getTelefono()%>" readonly>
  </div>
  <div class="form-group">
    <label for="correoUser">Correo Electronico</label>
    <input type="text" class="form-control" id="correoUser" value="<%=user.getEmail()%>" readonly>
  </div>
  
  </form>
  </fieldset>
  </div>
  
  <div class="container well">
  
      
  <fieldset><legend>Datos del Chofer</legend>
        <form>
            <div class="form-group">
    <label for="rutChofer">Rut</label>
    <input type="text" class="form-control" id="rutChofer" value="<%=chf.getRut()%>" readonly/>
  </div>
         <div class="form-group">
    <label for="nombreChofer">Nombre</label>
    <input type="text" class="form-control" id="nombreChofer" value="<%=chf.getNombre()%>" readonly/>
  </div>
   <div class="form-group">
    <label for="apellidoChofer">Apellido</label>
    <input type="text" class="form-control" id="apellidoChofer" value="<%=chf.getApellido()%>" readonly/>
  </div>
        </form>
  </fieldset>
  
  </div>
  
  
  <div class="container well">
      
  <fieldset><legend>Datos del Vehiculo</legend>
      <form>
            <div class="form-group">
    <label for="patente">Patente</label>
    <input type="text" class="form-control" id="patente" value="<%=vh.getPatente()%>" readonly>
  </div>
         <div class="form-group">
    <label for="marca">Marca</label>
    <input type="text" class="form-control" id="marca" value="<%=vh.getMarca()%>" readonly>
  </div>
   <div class="form-group">
    <label for="modelo">Modelo</label>
    <input type="text" class="form-control" id="modelo" value="<%=vh.getModelo()%>" readonly>
  </div>
  <div class="form-group">
    <label for="anio">Año</label>
    <input type="text" class="form-control" id="anio" value="<%=vh.getAnio()%>" readonly>
  </div>
  <div class="form-group">
    <label for="tipo">Tipo de Vehiculo</label>
    <input type="text" class="form-control" id="tipo" value="<%=vh.getTipo()%>" readonly>
  </div>
  
        </form>
  </fieldset>
  
  

  </div>
  
  
  <div class="container well">
  <form action="ControlAdmin">
      <input type="hidden" name="opt" value="ResS">
      <input type="hidden" name="idSolicitud" value="<%=sol.getId_solicitud()%>" >
      <input type="hidden" name="txtRutChofer" value="<%=chf.getRut()%>" >
      <input type="hidden" name="txtPatente" value="<%=vh.getPatente()%>" >
      <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-success"  >Asignar Solicitud</button>
    </div>
  </div>
  </form><br>
  <form action="ControlAdmin">
      <input type="hidden" name="opt" value="volverSolicitudes">
      <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-danger"  >Cancelar</button>
    </div>
  </div>
  </form>
  </div>
  
            
        
         
         
         <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body>
</html>
