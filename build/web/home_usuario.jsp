<%-- 
    Document   : home_usuario
    Created on : 26-11-2014, 11:48:49 AM
    Author     : Nicolas
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="cl.inacap.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sitio Privado</title>
        <style type="text/css">
            
            #contenedor{
   
   width: 1000px;
   margin: auto;
   
} 
#cabecera{
   
   
   font-size:12pt;
   
   padding: 3 3 3 10px;
   text-align: right;
   
}


#cuerpo{
   margin: 10 0 10 0px;
   
}
#lateral{
   width: 160px;
   
   float:left;
  
   
  
} 
#lateral ul{

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
                    <li class="active"><a href="#">Hola, <%=user.getNombre()%></a></li>
         
         <li><a href="index.jsp">Cerrar Sesion</a></li>        
         </ul>
  </div> 
       
            <div id="cuerpo"> 
            
                <div id="lateral"> 
                    <label><mark>MENU DE OPCIONES</mark></label><br><br>
                    
                    <button type="submit" class="btn btn-success btn-lg" disabled>Home</button>
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
        <h2>Bienvenido <%=user.getNombre()%></h2>
        <hr>
        
        
        <h3><em>Revisa los vehiculos con los que contamos para tu transporte</em></h3>
        <div id="slide1" class="carousel">
            <ol class="carousel-indicators">
                <li data-target="#slide1" data-slide-to="0" class="active"></li>
                <li data-target="#slide1" data-slide-to="1" ></li>
                <li data-target="#slide1" data-slide-to="2" ></li>  
                <li data-target="#slide1" data-slide-to="3" ></li>  
                <li data-target="#slide1" data-slide-to="4" ></li>  
                <li data-target="#slide1" data-slide-to="5" ></li>  
                
            </ol>
            
            
            <div class="carousel-inner">
                <div class="item active">
                    
                    <img src="img/vehiculos/img_vehiculo.jpg"  alt="fast1" class="img-responsive">
            
                </div>
                
               
                
                <div class="item">
                    <img src="img/vehiculos/img_vehiculos2.jpg"  alt="fast2" class="img-responsive">
            </div>
                
                <div class="item">
                    <img src="img/vehiculos/img_vehiculos3.jpg"  alt="fast3" class="img-responsive">
            </div>
                
                 <div class="item">
                    <img src="img/vehiculos/img_vehiculos4.jpg"  alt="fast3" class="img-responsive">
            </div>
                
                   <div class="item">
                       <p class="bg-primary text-center">Vehiculo Destacado</p>
                    <img src="img/vehiculos/img_vh_destacado.jpg"  alt="fast3" class="img-responsive">
            </div>
                
                   <div class="item">
                       <p class="bg-primary text-center">Vehiculo Destacado</p>
                    <img src="img/vehiculos/img_vh_destacado2.jpg"  alt="fast3" class="img-responsive">
            </div>
                
                
            
             
            
        </div>
        <a class="carousel-control left" href="#slide1" 
      data-slide="prev">&lsaquo;</a>
   <a class="carousel-control right" href="#slide1" 
      data-slide="next">&rsaquo;</a>
            
        </div>
         
        <div class="col-lg-5">
            <h3><em>Inventos para recordar...</em></h3>   
            <p style="color: tomato">Automóvil</p>

                    <p>El hombre busco la manera de inventar un aparato 
que lo transportase rápida y cómodamente sin la necesidad de utilizar animales. 
En 1882, con el descubrimiento del petróleo, Gottlielo Damler descubrió que utilizando petróleo, podía impulsar un pistón más rápido, poco a poco fueron surgiendo más inventos con la aplicación del petróleo y buen acerobarato que fue el que utilizó en su producción Henry Ford, 
con lo que se creó el automóvil. Las guerras desarrollaron nuevas clases de automóviles, tales como los tanques y autobuses. Después surgieron variedades de autos y hoy en día la industria automotriz es una de las grandes e importantes del mundo, se consideraban como un lujo y ahora se puede considerar 
que hoy en día el tener un auto no es un lujo, si no que es una necesidad.</p>
                    
                </div>
        
            
        </div>
        </div>
</div>
        
        
        <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body>
</html>
