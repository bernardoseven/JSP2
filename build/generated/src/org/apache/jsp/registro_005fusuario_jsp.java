package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_005fusuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registro de usuario</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container well\">\n");
      out.write("            \n");
      out.write("         <ul class=\"nav nav-tabs\">\n");
      out.write("         <li ><a href=\"index.jsp\">Inicio</a></li>\n");
      out.write("         <li class=\"active\"><a href=\"registro_usuario.jsp\">Registrarse</a></li>\n");
      out.write("         <li><a href=\"login_usuario.jsp\">Iniciar Sesion</a></li>\n");
      out.write("         <li><a href=\"login_admin.jsp\">Administrador</a></li>\n");
      out.write("         </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        <!--Recuperar datos de mensajeria-->\n");
      out.write("        ");
 if (request.getAttribute("msg") != null){ 
      out.write("\n");
      out.write("        <div class=\"container well\" style=\"color:red; font-size:18px; font-family: calibri\">\n");
      out.write("            ");
      out.print( request.getAttribute("msg").toString() );
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container well\">\n");
      out.write("         \n");
      out.write("            <h1>Registrate</h1>\n");
      out.write("            <fieldset><legend>para obtener mayores beneficios</legend>\n");
      out.write("        <form class=\"form-horizontal\" action=\"RegistroUsuario\" >\n");
      out.write("            \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <label for=\"rut\" class=\"col-sm-2 control-label\">Rut</label>\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("            <input type=\"text\" name=\"txtRut\" maxlength=\"9\" class=\"form-control\" id=\"rut\" placeholder=\"Ingresa tu rut sin puntos ni guion. Si termina en K reemplazalo por un cero (ej. 185432768)\"  />\n");
      out.write("        </div>\n");
      out.write("        </div> \n");
      out.write("            \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <label for=\"nombre\" class=\"col-sm-2 control-label\">Nombre</label>\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("            <input type=\"text\" name=\"txtNombre\" class=\"form-control\" id=\"nombre\" placeholder=\"Ingresa tu nombre\">\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <label for=\"apellido\" class=\"col-sm-2 control-label\">Apellido</label>\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("        <input type=\"text\" name=\"txtApellido\" class=\"form-control\" id=\"apellido\" placeholder=\"Ingresa tu apellido\">\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <label for=\"comuna\" class=\"col-sm-2 control-label\">Comuna</label>\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("            <select name=\"cboComuna\" class=\"form-control\" id=\"comuna\">\n");
      out.write("                <option selected>-- Seleccione su comuna --</option>\n");
      out.write("                <option value=\"Cerrillos\">Cerrillos</option>                \n");
      out.write("                <option value=\"Cerro Navia\">Cerro Navia</option>\n");
      out.write("                <option value=\"Conchali\">Conchali</option>\n");
      out.write("                <option value=\"El Bosque\">El Bosque</option>\n");
      out.write("                <option value=\"Estacion Central\">Estacion Central</option>\n");
      out.write("                <option value=\"Huechuraba\">Huechuraba</option>\n");
      out.write("                <option value=\"Independecia\">Independencia</option>\n");
      out.write("                <option value=\"La Cisterna\">La Cisterna</option>\n");
      out.write("                <option value=\"La Florida\">La Florida</option>\n");
      out.write("                <option value=\"La Granja\">La Granja</option>\n");
      out.write("                <option value=\"La Pintana\">La Pintana</option>\n");
      out.write("                <option value=\"La Reina\">La Reina</option>\n");
      out.write("                <option value=\"Las Condes\">Las Condes</option>\n");
      out.write("                <option value=\"Lo Barnechea\">Lo Barnechea</option>\n");
      out.write("                <option value=\"Lo Espejo\">Lo Espejo</option>\n");
      out.write("                <option value=\"Lo Prado\">Lo Prado</option>\n");
      out.write("                <option value=\"Macul\">Macul</option>\n");
      out.write("                <option value=\"Maipu\">Maipu</option>\n");
      out.write("                <option value=\"Ñuñoa\">Ñuñoa</option>\n");
      out.write("                <option value=\"Padre Hurtado\">Padre Hurtado</option>\n");
      out.write("                <option value=\"Pedro Aguirre Cerda\">Pedro Aguirre Cerda</option>\n");
      out.write("                <option value=\"Peñalolen\">Peñalolen</option>\n");
      out.write("                <option value=\"Pirque\">Pirque</option>\n");
      out.write("                <option value=\"Providencia\">Providencia</option>\n");
      out.write("                <option value=\"Pudahuel\">Pudahuel</option>\n");
      out.write("                <option value=\"Puente Alto\">Puente Alto</option>\n");
      out.write("                <option value=\"Quilicura\">Qulicura</option>\n");
      out.write("                <option value=\"Quinta Normal\">Quinta Normal</option>\n");
      out.write("                <option value=\"Recoleta\">Recoleta</option>\n");
      out.write("                <option value=\"Renca\">Renca</option>\n");
      out.write("                <option value=\"San Bernardo\">San Bernardo</option>\n");
      out.write("                <option value=\"San Joaquin\">San Joaquin</option>\n");
      out.write("                <option value=\"San Jose de Maipo\">San Jose de Maipo</option>\n");
      out.write("                <option value=\"San Miguel\">San Miguel</option>\n");
      out.write("                <option value=\"San Ramon\">San Ramon</option>\n");
      out.write("                <option value=\"Santiago\">Santiago</option>\n");
      out.write("                <option value=\"Vitacura\">Vitacura</option>\n");
      out.write("            </select> \n");
      out.write("       \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("        <label for=\"mail\" class=\"col-sm-2 control-label\">Correo Electronico</label>\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("        <input type=\"email\" name=\"txtEmail\" class=\"form-control\" id=\"mail\" placeholder=\"Ingresa tu correo electronico\">\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("        <label for=\"telefono\" class=\"col-sm-2 control-label\">Telefono Contacto</label>\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("            <input type=\"text\" name=\"txtTelefono\" class=\"form-control\" maxlength=\"8\" id=\"telefono\" placeholder=\"Ingresa tu numero telefonico de contacto\">\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("           <div class=\"form-group\">\n");
      out.write("        <label for=\"pass1\" class=\"col-sm-2 control-label\">Contraseña</label>\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("        <input type=\"password\" name=\"txtPass1\" class=\"form-control\" id=\"pass1\" placeholder=\"Ingresa tu contraseña\">\n");
      out.write("        </div>\n");
      out.write("        </div>    \n");
      out.write("          \n");
      out.write("           <div class=\"form-group\">\n");
      out.write("        <label for=\"pass2\" class=\"col-sm-2 control-label\">Repita Contraseña</label>\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("        <input type=\"password\" name=\"txtPass2\" class=\"form-control\" id=\"pass2\" placeholder=\"Repita contraseña\">\n");
      out.write("        </div>\n");
      out.write("        </div> \n");
      out.write("            \n");
      out.write("         \n");
      out.write("            \n");
      out.write("            <input type=\"hidden\" name=\"opt\" value=\"NU\"/>\n");
      out.write("            \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("    <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("      <button type=\"submit\" class=\"btn btn-primary\">Registrarme</button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("                </fieldset>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery-1.11.1.min.js\"></script> \n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
