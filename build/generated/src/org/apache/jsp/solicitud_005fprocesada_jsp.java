package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cl.inacap.modelo.Usuario;

public final class solicitud_005fprocesada_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Solictud Procesada</title>\n");
      out.write("    </head>\n");
      out.write("    ");
Usuario user = (Usuario) request.getAttribute("datosUser");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
 if (request.getAttribute("msgFormularioContactoEnviado") != null){ 
      out.write("\n");
      out.write("        <div class=\"container well\" style=\"color:green; font-size:18px; font-family: calibri;\">\n");
      out.write("            <h1> ");
      out.print( request.getAttribute("msgFormularioContactoEnviado").toString() );
      out.write("</h1>\n");
      out.write("            <form>\n");
      out.write("                <input type=\"hidden\" name=\"opt\" value=\"H\">\n");
      out.write("                <input type=\"hidden\" name=\"email\" value=\"");
      out.print(user.getEmail());
      out.write("\">\n");
      out.write("                \n");
      out.write("                <button type=\"submit\" class=\"btn btn-success btn-lg\">Volver al Home</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 if (request.getAttribute("msgSolicitudServicio") != null){ 
      out.write("\n");
      out.write("        <div class=\"container well\" style=\"color:green; font-size:18px; font-family: calibri;\">\n");
      out.write("            <h1> ");
      out.print( request.getAttribute("msgSolicitudServicio").toString() );
      out.write("</h1>\n");
      out.write("            <form>\n");
      out.write("                <input type=\"hidden\" name=\"opt\" value=\"H\">\n");
      out.write("                <input type=\"hidden\" name=\"email\" value=\"");
      out.print(user.getEmail());
      out.write("\">\n");
      out.write("                \n");
      out.write("                <button type=\"submit\" class=\"btn btn-success btn-lg\">Volver al Home</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 if (request.getAttribute("msgSolicitudAsignada") != null){ 
      out.write("\n");
      out.write("        <div class=\"container well\" style=\"color:green; font-size:18px; font-family: calibri;\">\n");
      out.write("            <a href=\"home_admin.jsp\">Volver</a>  \n");
      out.write("            <h1> ");
      out.print( request.getAttribute("msgSolicitudAsignada").toString() );
      out.write("</h1>\n");
      out.write("        </div>\n");
      out.write("        ");
 } 
      out.write("\n");
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
