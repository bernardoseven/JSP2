<%-- 
    Document   : asignacion_movil
    Created on : 02-12-2014, 12:21:52 AM
    Author     : Nicolas
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="cl.inacap.modelo.Solicitud"%>
<%@page import="cl.inacap.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asignacion de Movil</title>
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
    ArrayList <Solicitud> lstSol = (ArrayList)request.getAttribute("solicitudes");
    
        
     %>
    <body>
         <div id="contenedor"> 
            
            <div id="cabecera">
                <ul class="nav nav-tabs">
                    <li class="active"><a href="#">Hola, <%=user.getNombre()%></a></li>
         
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
                <form action="ControlUsuario">
                    <input type="hidden" name="email" value="<%=user.getEmail()%>"/>
                <input type="hidden" name="opt" value="SS"/>
  <button type="submit" class="btn btn-primary btn-lg ">Solicitud de Servicios</button>
                </form>
                
                <hr>
                <button type="submit" class="btn btn-primary btn-lg" disabled>Asignacion de Moviles</button>
                
                </div>
         
        
         
            
        <div id="principal"> 
         
            
            <h1>Solicitudes Asignadas</h1>
            
        <table style="border: 5px" class="table table-bordered table-striped">
            <thead>
                <tr>
                    <th>Numero de Solicitud</th>
                    <th>Tipo de Vehiculo (*)</th>
                    
                </tr>
            </thead>
            <tbody>
                
                <% for(Solicitud sol : lstSol){ %>
                <tr>
                    <td> <%= sol.getId_solicitud()%> </td>
                    <td> <%= sol.getTipo_vehiculo()%> </td>
                </tr>
               <% }%>
            </tbody>
        </table> 
         <span class="help-block">(*) taxi:Taxi | van_8:Van de 8 pasajeros | van_12:Van de 12 pasajeros</span>
         
            <form action="ControlUsuario">
                <input type="hidden" name="opt" value="detalle"/>
                <input type="hidden" name="email" value="<%=user.getEmail()%>">
        <select name="cboIdSolicitud"  >           
                <option selected>-- Seleccione el numero de la solicitud --</option>
                <% for(Solicitud sol : lstSol){ %>       
                <option ><%= sol.getId_solicitud() %></option>                           
                <% }%>
                </select>
                
                <button type="submit" >Ver detalle</button>
            </form>
        </div>
        </div>
</div>
        
        
        <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body>
</html>
