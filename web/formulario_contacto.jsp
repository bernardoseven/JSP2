<%-- 
    Document   : formulario_contacto
    Created on : 03-12-2014, 11:29:27 AM
    Author     : Nicolas
--%>

<%@page import="cl.inacap.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contactanos</title>
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
                
                <button type="submit" class="btn btn-primary btn-lg" disabled>Formulario de contacto</button>
                <hr>
                
                <form action="ControlUsuario">
                    <input type="hidden" name="email" value="<%=user.getEmail()%>"/>
                <input type="hidden" name="opt" value="SS"/>
  <button type="submit" class="btn btn-primary btn-lg">Solicitud de Servicios</button>
                </form>
                <hr>
                <form action="ControlUsuario">
                    <input type="hidden" name="email" value="<%=user.getEmail()%>"/>
                <input type="hidden" name="opt" value="AM"/>
  <button type="submit" class="btn btn-primary btn-lg">Asignacion de Moviles</button>
                </form>
                <hr>
                </div>
         
        
         
            
        <div id="principal"> 
            
            <h1>¿Necesitas que te contactemos?</h1>
        <fieldset><legend>Completa el siguiente formulario</legend>
                <form role="form" action="ControlUsuario" >
                    <input type="hidden" name="opt" value="EFC">
                    <input type="hidden" name="email" value="<%=user.getEmail()%>"/>
  <div class="form-group">
    <label for="name">Nombre</label>
    <input type="text" class="form-control" id="name" value="<%=user.getNombre()%> <%=user.getApellido()%>" readonly>
  </div>
  
  <div class="form-group">
    <label for="mail">Correo Electronico</label>
    <input type="email" class="form-control" id="mail" value="<%= user.getEmail() %>" readonly>
  </div>
  
  <div class="form-group">
    <label for="telefono">Telefono</label>
    <input type="text" class="form-control" id="telefono" value="<%=user.getTelefono()%>" readonly>
  </div>
  
  
  <div class="form-group">      
      <label >Tipo de Contacto</label><br>
      <div class="radio">
    <label for="cotizacion">
      <input type="radio" name="grpTipoContacto" value="cotizacion" id="cotizacion"> Cotizacion
    </label>
      <label for="reclamo">
      <input type="radio" name="grpTipoContacto" value="reclamo" id="reclamo"> Reclamo
    </label>
      <label for="felicitaciones">
      <input type="radio" name="grpTipoContacto" value="felicitaciones" id="felicitaciones"> Felicitaciones
    </label>
      <label for="otros">
      <input type="radio" name="grpTipoContacto" value="Otros" id="otros"> Otros
      </label>
      </div>
      <div class="text-area">
          
          <textarea class="form-control" rows="3" id="descripcion" placeholder="Danos una pequeña descripcion del motivo por el que quieres ser contactado"></textarea>
      </div>
  </div>
  
      <div class="form-group">
          <label>Medio de contacto</label>
          <div class="checkbox">
               <label>
                   <input type="checkbox"> Correo Electronico
              </label>
              <label>
              <input type="checkbox"> Telefono
              </label>
          </div>
      </div>
    
  
  <button type="submit" class="btn btn-primary">Enviar solicitud de contacto</button>
  
</form>
  </fieldset>
        
         
        
        
            
        </div>
        </div>
</div>
  
  <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body>
</html>
