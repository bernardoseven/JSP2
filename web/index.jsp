<%-- 
    Document   : index
    Created on : 19-11-2014, 11:38:22 AM
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TransFast</title>
    </head>
    <body>
        
        
        
        <div class="container well">
            
         <ul class="nav nav-tabs">
         <li class="active"><a href="#">Inicio</a></li>
         <li><a href="registro_usuario.jsp">Registrarse</a></li>
         <li><a href="login_usuario.jsp">Iniciar Sesion</a></li>
         <li><a href="login_admin.jsp">Administrador</a></li>
         
         </ul>
         </div>
        
        <div class="container well">
            
           
            
        <h1>Bienvenido a TransFast!</h1>
        <h4><em>Tus viajes mas rapidos</em></h4>
        
        <p class="text-justify">Bienvenido a TransFast. Somos una empresa emergente de transportes que ofrece
        un servicio de calidad y con las mejores plataformas de consultas para nuestros clientes </p>
        
         
        
        </div>
        
        
        <div id="slide1" class="carousel">
            <ol class="carousel-indicators">
                <li data-target="#slide1" data-slide-to="0" class="active"></li>
                <li data-target="#slide1" data-slide-to="1" ></li>
                <li data-target="#slide1" data-slide-to="2" ></li>               
            </ol>
            
            
            <div class="carousel-inner">
                <div class="item active">
                    <img src="img/img_index1.jpg"  alt="fast1" class="img-responsive">
            </div>
                
               
                
                <div class="item">
                    <img src="img/img_index2.jpg"  alt="fast2" class="img-responsive">
            </div>
                
                <div class="item">
                    <img src="img/img_index3.jpg"  alt="fast3" class="img-responsive">
            </div>
                
            
             
            
        </div>
        <a class="carousel-control left" href="#slide1" 
      data-slide="prev">&lsaquo;</a>
   <a class="carousel-control right" href="#slide1" 
      data-slide="next">&rsaquo;</a>
            
        </div>
        
        
        <div class="container well">
            
            <h3>Algo mas sobre nosotros...</h3><hr>
            <p>Somos una empresa emergente que esta ofreciendo sus servicios a todo tipo de publico,
            actualmente contamos con los mayores estandares de seguridad y calidad para nuestros clientes,
            ademas de las insuperables ofertas por inauguracion.</p>
            
            <h3>Se parte de la mejor atencion al cliente</h3><hr>
            <p>Actualmente contamos con potentes plataformas para ofrecer nuestros servicios al publico.
                Puedes <a href="registro_usuario.jsp">Registrarte</a> para comenzar a utilizar nuestras plataformas
            en las cuales podras solicitar servicios de transportes, consultar tus solicitudes, medios de contacto con la empresa
            y pronto muchas cosas mas. Rapido unete a nosotros y comienza a disfrutar todos estos beneficios</p>
            
            
        </div>
        
        
        
        
        
       
        <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body>
</html>
