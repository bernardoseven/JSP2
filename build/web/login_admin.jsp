<%-- 
    Document   : menu_admin
    Created on : 03-12-2014, 03:31:50 PM
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrador</title>
    </head>
    <% 
    %>
    <body>
         <div class="container well">
            
         <ul class="nav nav-tabs">
         <li ><a href="index.jsp">Inicio</a></li>
         <li ><a href="registro_usuario.jsp">Registrarse</a></li>
         <li ><a href="login_usuario.jsp">Iniciar Sesion</a></li>
         <li class="active"><a href="#">Administrador</a></li>
         </ul>

            </div>
        
        <div class="container well">
            <h1>Seccion de Administrador</h1>
        
            <fieldset><legend>Ingrese las credenciales</legend>
            <form class="form-horizontal" action="Login" method="post" >
        <div class="form-group">
        <label for="usuario" class="col-sm-2 control-label">Usuario</label>
        <div class="col-sm-10">
        <input type="text" name="txtUsuario" class="form-control" id="usuario" placeholder="Ingresa tu nombre de usuario">
        </div>
        </div>
        
        <div class="form-group">
        <label for="pass" class="col-sm-2 control-label">Contraseña</label>
        <div class="col-sm-10">
        <input type="password" name="txtPass" class="form-control" id="pass" placeholder="Ingresa tu contraseña">
        </div>
        </div>
        <input type="hidden" name="opt" value="LA"/>
                 
        <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-primary">Iniciar Sesion </button>
    </div>
  </div>
               
                </form>
            </fieldset>
        </div>
        
        
        <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body>
</html>
