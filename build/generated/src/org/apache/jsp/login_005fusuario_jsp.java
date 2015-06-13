package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cl.inacap.modelo.Usuario;
import cl.inacap.dao.DAOUsuario;

public final class login_005fusuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Iniciar Sesion</title>\n");
      out.write("    </head>\n");
      out.write("    ");

      
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container well\">\n");
      out.write("            \n");
      out.write("         <ul class=\"nav nav-tabs\">\n");
      out.write("         <li ><a href=\"index.jsp\">Inicio</a></li>\n");
      out.write("         <li ><a href=\"registro_usuario.jsp\">Registrarse</a></li>\n");
      out.write("         <li class=\"active\"><a href=\"#\">Iniciar Sesion</a></li>\n");
      out.write("         <li><a href=\"login_admin.jsp\">Administrador</a></li>\n");
      out.write("         </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        <div class=\"container well\">\n");
      out.write("            <h1>Login</h1>\n");
      out.write("            <fieldset><legend>Ingrese sus datos</legend>\n");
      out.write("            <form class=\"form-horizontal\" action=\"Login\" >\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <label for=\"mail\" class=\"col-sm-2 control-label\">Correo Electronico</label>\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("        <input type=\"email\" name=\"txtEmail\" class=\"form-control\" id=\"mail\" placeholder=\"Ingresa tu correo electronico\">\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <label for=\"pass\" class=\"col-sm-2 control-label\">Contraseña</label>\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("        <input type=\"password\" name=\"txtPass\" class=\"form-control\" id=\"pass\" placeholder=\"Ingresa tu contraseña\">\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <input type=\"hidden\" name=\"opt\" value=\"LU\"/>\n");
      out.write("                 \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("    <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("      <button type=\"submit\" class=\"btn btn-primary\">Iniciar Sesion </button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("               \n");
      out.write("                </form>\n");
      out.write("            </fieldset>\n");
      out.write("        </div>\n");
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
