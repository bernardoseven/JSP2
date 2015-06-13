<%-- 
    Document   : responder_solicitud
    Created on : 05-12-2014, 01:48:18 PM
    Author     : Nicolas
--%>

<%@page import="cl.inacap.modelo.Vehiculo"%>
<%@page import="cl.inacap.modelo.Chofer"%>
<%@page import="cl.inacap.modelo.Solicitud"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <% 
        ArrayList <Solicitud> lstSol = (ArrayList)request.getAttribute("solicitudes");
    ArrayList <Chofer> lstChf = (ArrayList)request.getAttribute("choferes");
    ArrayList <Vehiculo> lstVh = (ArrayList)request.getAttribute("vehiculos");
    ArrayList <Vehiculo> taxis = (ArrayList)request.getAttribute("taxis");
    ArrayList <Vehiculo> van8 = (ArrayList)request.getAttribute("van8");
    ArrayList <Vehiculo> van12 = (ArrayList)request.getAttribute("van12");
    
    %>
    <body>
        
        <div class="container well">
            
         <ul class="nav nav-tabs">
         <li ><a href="home_admin.jsp">Home</a></li>
         <li><a href="nuevo_chofer.jsp">Agregar Chofer</a></li>
         <li><a href="nuevo_vehiculo.jsp">Agregar Vehiculo</a></li>
         <li><a href="ControlAdmin?opt=LU">Usuarios Registrados</a></li> 
         <li><a href="ControlAdmin?opt=LC">Reportes de Choferes</a></li>
         <li ><a href="ControlAdmin?opt=LV">Reportes de Vehiculos</a></li>
         <li class="active"><a href="#">Responder solicitudes de transporte</a></li>
         <li><a href="index.jsp">Cerrar Sesion</a></li>
         
         </ul>
         </div>
        
        <div class="container well">
            <h1>Solicitudes pendientes por responder</h1>
            
            <table style="border: 5px" class="table table-bordered table-striped">
            <thead>
                <tr>
                    <th>Numero de Solicitud</th>
                    <th>Rut Usuario</th>
                    <th>Tipo de Vehiculo(*)</th>
                    
                </tr>
            </thead>
            <tbody>
                
                <% for(Solicitud sol : lstSol){ %>
                <tr>
                    <td> <%= sol.getId_solicitud()%> </td>
                    <td><%= sol.getRut_user() %></td>
                    <td><%= sol.getTipo_vehiculo()%></td>
                </tr>
               <% }%>
            </tbody>
            </table> 
            <span class="help-block" >(*) taxi:Taxi | van_8:Van de 8 pasajeros | van_12:Van de 12 pasajeros</span>
            <hr>
            
            <fieldset><legend>Vehiculos Disponible</legend>
            <div class="col-lg-4 ">
            
            
                
                <table style="border: 3px" class="table table-bordered table-striped">
            <thead>
                <tr>
                    <th colspan="3">Taxi</th>
                                  
                </tr>
            </thead>
            <tbody>
                <tr>
                <td><strong><em>Patente</em></strong></td>
                    <td><strong><em>Marca</em></strong></td>
                    <td><strong><em>Año</em></strong></td>
                    
                    
                </tr>
                
                <% for(Vehiculo taxi : taxis){ %>
                <tr>
                    <td> <%= taxi.getPatente() %> </td>
                    <td><%= taxi.getMarca() %></td>
                    <td><%= taxi.getAnio() %></td>
                  </tr>
               <% }%>
                 
            </tbody>
        </table>
            
            
            
            
            
            
            
            </div>    
            
            <div class="col-lg-4 ">
            
            
                <table style="border: 3px" class="table table-bordered table-striped">
            <thead>
                <tr>
                    <th colspan="3">Van de 8 Pasajeros</th>
                               
                </tr>
            </thead>
            <tbody>
                <tr>
                <td><strong><em>Patente</em></strong></td>
                    <td><strong><em>Marca</em></strong></td>
                    <td><strong><em>Año</em></strong></td>
                    
                </tr>
                
                <% for(Vehiculo van : van8){ %>
                <tr>
                    <td> <%= van.getPatente() %> </td>
                    <td><%= van.getMarca() %></td>
                    <td><%= van.getAnio() %></td>
                  
                  
                              
                </tr>
               <% }%>
               
            </tbody>
        </table>
            
            
            
            
            
            
            
            </div>
               
               
            <div class="col-lg-4 ">
            
            
                <table style="border: 3px" class="table table-bordered table-striped">
            <thead>
                <tr>
                    <th colspan="3">Van de 12 Pasajeros</th>
                    
                    
                    
                    
                </tr>
            </thead>
            <tbody>
                <tr>
                <td><strong><em>Patente</em></strong></td>
                    <td><strong><em>Marca</em></strong></td>
                    <td><strong><em>Año</em></strong></td>
                    
                </tr>
                
                
                    
                    
                    <% for(Vehiculo van2 : van12){ %>
                    <tr>
                    <td> <%= van2.getPatente() %> </td>
                    <td><%= van2.getMarca() %></td>
                    <td><%= van2.getAnio() %></td>
                    
                </tr>
               <% }%>
               
            </tbody>
        </table>
                        
            </div>   
               </fieldset>
               
        </div>
            
            <div class="container well">
            
            <form action="ControlAdmin">
                
                <input type="hidden" name="opt" value="RSU"/>
                <select name="cboIdSolicitud" class="form-control col-sm-4" >
                <option selected>-- Seleccione el numero de la soliticitud a responder --</option>
                <% for(Solicitud sol : lstSol){ %>       
                <option ><%= sol.getId_solicitud() %></option>                           
                <% }%>
                </select> <br><br>
                
                <select name="cboRutChofer" class="form-control col-sm-6" >
                <option selected>-- Seleccione el Rut del chofer designado a la solicitud --</option>
                <% for(Chofer chf : lstChf){ %>       
                <option ><%= chf.getRut() %></option>                           
                <% }%>
                </select> <br><br>
                
                <select name="cboPatenteVehiculo" class="form-control col-sm-6" >
                <option selected>-- Seleccione la patente del vehiculo designado a la solicitud --</option>
                <% for(Vehiculo vh : lstVh){ %>       
                <option ><%= vh.getPatente() %></option>                           
                <% }%>
                </select> <hr>
                
         <button type="submit" class="btn btn-primary">Responder Solicitud</button>
            </form>
            </div>
            
             <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body>
</html>
