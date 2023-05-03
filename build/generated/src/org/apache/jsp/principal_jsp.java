package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <link href='css/estilo.css' rel=\"stylesheet\">\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\" style=\"margin-right: 20px;\">\n");
      out.write("        <p ><h4 style=\"color: #d9534f;\"><span class=\"glyphicon glyphicon-home\"> </span> Principal</h4></p>\n");
      out.write("        <a class=\"btn btn-primary pull-right\" href=\"#\" role=\"button\" data-toggle=\"modal\" data-target=\"#exampleModal\"> <span class=\"glyphicon glyphicon-search\" > </span> Buscar Recluso</a>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("  <hr>   \n");
      out.write("    <center>\n");
      out.write("  <img  src=\"imgs/home.png\" width=\"700\" height=\"300\" alt=\"\"/>\n");
      out.write("    <h3>BANCO ISPI </h3>\n");
      out.write("    </center>\n");
      out.write("  \n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("  <!-- Default panel contents -->\n");
      out.write(" \n");
      out.write("\n");
      out.write("  <!-- Table -->\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h3 class=\"modal-title\" id=\"exampleModalLabel\">Buscar Estudante</h3>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("      \n");
      out.write("          <form method=\"post\"  action=\"auxiliar.jsp\">\n");
      out.write("        \n");
      out.write("              <input type=\"search\" name=\"cod_d\"  placeholder=\"Digite o numero de processo\" class=\"form-control col-md-3\"/>\n");
      out.write("            <br>      <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                <span class=\"glyphicon glyphicon-search\"></span>\n");
      out.write("            </button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Fechar</button>\n");
      out.write("   \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("        startclock();\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("<script src=\"js/relogio.js\" type=\"text/javascript\"></script>\n");
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
