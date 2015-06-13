<%-- 
    Document   : iniciar_sesion_usuario
    Created on : 24-11-2014, 04:02:08 PM
    Author     : Nicolas
--%>

<%@page import="cl.inacap.modelo.Usuario"%>
<%@page import="cl.inacap.dao.DAOUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesion</title>
    </head>
    <%
      %>
    <body>
        
        <div class="container well">
            
         <ul class="nav nav-tabs">
         <li ><a href="index.jsp">Inicio</a></li>
         <li ><a href="registro_usuario.jsp">Registrarse</a></li>
         <li class="active"><a href="#">Iniciar Sesion</a></li>
         <li><a href="login_admin.jsp">Administrador</a></li>
         </ul>

            </div>
        
        <div class="container well">
            <h1>Login</h1>
            <fieldset><legend>Ingrese sus datos</legend>
            <form class="form-horizontal" action="Login" >
        <div class="form-group">
        <label for="mail" class="col-sm-2 control-label">Correo Electronico</label>
        <div class="col-sm-10">
        <input type="email" name="txtEmail" class="form-control" id="mail" placeholder="Ingresa tu correo electronico">
        </div>
        </div>
        
        <div class="form-group">
        <label for="pass" class="col-sm-2 control-label">Contraseña</label>
        <div class="col-sm-10">
        <input type="password" name="txtPass" class="form-control" id="pass" placeholder="Ingresa tu contraseña">
        </div>
        </div>
        <input type="hidden" name="opt" value="LU"/>
                 
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
