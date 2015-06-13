<%-- 
    Document   : registro_usuario
    Created on : 19-11-2014, 12:00:04 PM
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de usuario</title>
    </head>
    <body>
        
        <div class="container well">
            
         <ul class="nav nav-tabs">
         <li ><a href="index.jsp">Inicio</a></li>
         <li class="active"><a href="registro_usuario.jsp">Registrarse</a></li>
         <li><a href="login_usuario.jsp">Iniciar Sesion</a></li>
         <li><a href="login_admin.jsp">Administrador</a></li>
         </ul>

            </div>
        
        <!--Recuperar datos de mensajeria-->
        <% if (request.getAttribute("msg") != null){ %>
        <div class="container well" style="color:red; font-size:18px; font-family: calibri">
            <%= request.getAttribute("msg").toString() %>
        </div>
        <% } %>
        
        <div class="container well">
         
            <h1>Registrate</h1>
            <fieldset><legend>para obtener mayores beneficios</legend>
        <form class="form-horizontal" action="RegistroUsuario" >
            
        <div class="form-group">
        <label for="rut" class="col-sm-2 control-label">Rut</label>
        <div class="col-sm-10">
            <input type="text" name="txtRut" maxlength="9" class="form-control" id="rut" placeholder="Ingresa tu rut sin puntos ni guion. Si termina en K reemplazalo por un cero (ej. 185432768)"  />
        </div>
        </div> 
            
        <div class="form-group">
        <label for="nombre" class="col-sm-2 control-label">Nombre</label>
        <div class="col-sm-10">
            <input type="text" name="txtNombre" class="form-control" id="nombre" placeholder="Ingresa tu nombre">
        </div>
        </div>
            
        <div class="form-group">
        <label for="apellido" class="col-sm-2 control-label">Apellido</label>
        <div class="col-sm-10">
        <input type="text" name="txtApellido" class="form-control" id="apellido" placeholder="Ingresa tu apellido">
        </div>
        </div>
            
        <div class="form-group">
        <label for="comuna" class="col-sm-2 control-label">Comuna</label>
        <div class="col-sm-10">
            <select name="cboComuna" class="form-control" id="comuna">
                <option selected>-- Seleccione su comuna --</option>
                <option value="Cerrillos">Cerrillos</option>                
                <option value="Cerro Navia">Cerro Navia</option>
                <option value="Conchali">Conchali</option>
                <option value="El Bosque">El Bosque</option>
                <option value="Estacion Central">Estacion Central</option>
                <option value="Huechuraba">Huechuraba</option>
                <option value="Independecia">Independencia</option>
                <option value="La Cisterna">La Cisterna</option>
                <option value="La Florida">La Florida</option>
                <option value="La Granja">La Granja</option>
                <option value="La Pintana">La Pintana</option>
                <option value="La Reina">La Reina</option>
                <option value="Las Condes">Las Condes</option>
                <option value="Lo Barnechea">Lo Barnechea</option>
                <option value="Lo Espejo">Lo Espejo</option>
                <option value="Lo Prado">Lo Prado</option>
                <option value="Macul">Macul</option>
                <option value="Maipu">Maipu</option>
                <option value="Ñuñoa">Ñuñoa</option>
                <option value="Padre Hurtado">Padre Hurtado</option>
                <option value="Pedro Aguirre Cerda">Pedro Aguirre Cerda</option>
                <option value="Peñalolen">Peñalolen</option>
                <option value="Pirque">Pirque</option>
                <option value="Providencia">Providencia</option>
                <option value="Pudahuel">Pudahuel</option>
                <option value="Puente Alto">Puente Alto</option>
                <option value="Quilicura">Qulicura</option>
                <option value="Quinta Normal">Quinta Normal</option>
                <option value="Recoleta">Recoleta</option>
                <option value="Renca">Renca</option>
                <option value="San Bernardo">San Bernardo</option>
                <option value="San Joaquin">San Joaquin</option>
                <option value="San Jose de Maipo">San Jose de Maipo</option>
                <option value="San Miguel">San Miguel</option>
                <option value="San Ramon">San Ramon</option>
                <option value="Santiago">Santiago</option>
                <option value="Vitacura">Vitacura</option>
            </select> 
       
        </div>
        </div>
            
             
            <div class="form-group">
        <label for="mail" class="col-sm-2 control-label">Correo Electronico</label>
        <div class="col-sm-10">
        <input type="email" name="txtEmail" class="form-control" id="mail" placeholder="Ingresa tu correo electronico">
        </div>
        </div>
            
            <div class="form-group">
        <label for="telefono" class="col-sm-2 control-label">Telefono Contacto</label>
        <div class="col-sm-10">
            <input type="text" name="txtTelefono" class="form-control" maxlength="8" id="telefono" placeholder="Ingresa tu numero telefonico de contacto">
        </div>
        </div>
        
           <div class="form-group">
        <label for="pass1" class="col-sm-2 control-label">Contraseña</label>
        <div class="col-sm-10">
        <input type="password" name="txtPass1" class="form-control" id="pass1" placeholder="Ingresa tu contraseña">
        </div>
        </div>    
          
           <div class="form-group">
        <label for="pass2" class="col-sm-2 control-label">Repita Contraseña</label>
        <div class="col-sm-10">
        <input type="password" name="txtPass2" class="form-control" id="pass2" placeholder="Repita contraseña">
        </div>
        </div> 
            
         
            
            <input type="hidden" name="opt" value="NU"/>
            
             <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-primary">Registrarme</button>
    </div>
  </div>
            
            
        </form>
                </fieldset>
        </div>
        
            
        
        
        
        
        
        
        
        
        
        
        <script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/bootstrap.min.js"></script>
    </body>
</html>
