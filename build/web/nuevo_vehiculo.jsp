<%-- 
    Document   : nuevo_vehiculo
    Created on : 04-12-2014, 10:22:06 AM
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Vehiculo</title>
        <style type="text/css">

p{color: red; font-family: calibri; font-size: 13px}
</style>
    </head>
    <body >
        <div class="container well">
            
         <ul class="nav nav-tabs">
         <li><a href="home_admin.jsp">Home</a></li>
         <li><a href="nuevo_chofer.jsp">Agregar Chofer</a></li>
         <li class="active"><a href="#">Agregar Vehiculo</a></li>
         <li><a href="ControlAdmin?opt=LU">Usuarios Registrados</a></li> 
         <li><a href="ControlAdmin?opt=LC">Reportes de Choferes</a></li>
         <li ><a href="ControlAdmin?opt=LV">Reportes de Vehiculos</a></li>
         <li><a href="ControlAdmin?opt=LS">Responder solicitudes de transporte</a></li>
         <li><a href="index.jsp">Cerrar Sesion</a></li>
         
         </ul>
         </div>
        
        <div class="container well">
             <h1>Registrar Nuevo Vehiculo</h1>
         
             <fieldset><legend>Ingrese los datos del vehiculo</legend>
                 
        <form class="form-horizontal" action="ControlAdmin" >
            
        <div class="form-group">
        <label for="patente" class="col-sm-2 control-label">Patente</label>
        <div class="col-sm-4">
            <input type="text" name="txtPatente" maxlength="6" class="form-control" id="patente" placeholder="Ingrese la patente del vehiculo."  />
        </div>
        </div> 
            
        <div class="form-group">
        <label for="marca" class="col-sm-2 control-label">Marca</label>
        <div class="col-sm-4">
            <input type="text" name="txtMarca" class="form-control" id="marca" placeholder="Ingrese la marca del vehiculo.">
        </div>
        </div>
            
        <div class="form-group">
        <label for="modelo" class="col-sm-2 control-label">Modelo</label>
        <div class="col-sm-4">
        <input type="text" name="txtModelo" class="form-control" id="modelo" placeholder="Ingrese el modelo del vehiculo.">
        </div>
        </div>
            
            <div class="form-group">
        <label for="anio" class="col-sm-2 control-label">Año</label>
        <div class="col-sm-4">
        <input type="text" name="txtAnio" class="form-control" id="anio" placeholder="Ingrese el año del vehiculo (Ej. 2010).">
        </div>
        </div>
            
            <div class="form-group">
        <label for="tipovehiculo" class="col-sm-2 control-label">Tipo del Vehiculo (*)</label>
        <div class="col-sm-4">
            <select name="cboTipoVehiculo" class="form-control" id="tipovehiculo">
                <option selected>-- Seleccione el tipo de vehiculo --</option>
                <option value="taxi">Taxi</option>                
                <option value="van_8">Van de 8 pasajeros</option>
                <option value="van_12">Van de 12 pasajeros</option>               
            </select> 
       

<span class="help-block">(*) taxi:Taxi | van_8:Van de 8 pasajeros | van_12:Van de 12 pasajeros</span>


        </div>
        </div>
            
            
            <input type="hidden" name="opt" value="NVh">
            
            <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-primary">Registrar Vehiculo</button>
    </div>
            </div> 
        </form>
                 
        </fieldset>
             
         </div>
        
    </body>
</html>
