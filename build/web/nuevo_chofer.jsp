<%-- 
    Document   : nuevo_chofer
    Created on : 03-12-2014, 04:58:21 PM
    Author     : Nicolas
--%>
<%@page contentType="text/html" errorPage="login_error.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Chofer</title>
    </head>
    <body>
        <div class="container well">
            
         <ul class="nav nav-tabs">
         <li ><a href="home_admin.jsp">Home</a></li>
         <li class="active" ><a href="#">Agregar Chofer</a></li>
         <li><a href="nuevo_vehiculo.jsp">Agregar Vehiculo</a></li>      
         <li><a href="ControlAdmin?opt=LU">Usuarios Registrados</a></li> 
         <li><a href="ControlAdmin?opt=LC">Reportes de Choferes</a></li>
         <li ><a href="ControlAdmin?opt=LV">Reportes de Vehiculos</a></li>
         <li><a href="ControlAdmin?opt=LS">Responder solicitudes de transporte</a></li>
         <li><a href="index.jsp">Cerrar Sesion</a></li>
         
         </ul>
         </div>
             
             
             <div class="container well">
                 <h1>Registrar Nuevo Chofer</h1>
             <fieldset><legend>Ingrese los datos del chofer</legend>
        <form class="form-horizontal" action="ControlAdmin" >
            
        <div class="form-group">
        <label for="rut" class="col-sm-2 control-label">Rut</label>
        <div class="col-sm-10">
            <input type="text" name="txtRut" maxlength="9" class="form-control" id="rut" placeholder="Ingrese el rut del chofer, sin puntos ni guion (Ej. 186040856)."  />
        </div>
        </div> 
            
        <div class="form-group">
        <label for="nombre" class="col-sm-2 control-label">Nombre</label>
        <div class="col-sm-10">
            <input type="text" name="txtNombre" class="form-control" id="nombre" placeholder="Ingrese el nombre del chofer.">
        </div>
        </div>
            
        <div class="form-group">
        <label for="apellido" class="col-sm-2 control-label">Apellido</label>
        <div class="col-sm-10">
        <input type="text" name="txtApellido" class="form-control" id="apellido" placeholder="Ingrese el apellido del chofer.">
        </div>
        </div>
            <input type="hidden" name="opt" value="NCh">
            
            <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-primary">Registrar chofer</button>
    </div>
            </div> 
        </form>
                 
        </fieldset>
             
         </div>
        
        
        
         <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body>
</html>
