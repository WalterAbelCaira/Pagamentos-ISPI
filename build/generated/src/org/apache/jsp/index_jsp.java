package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.EstudanteDao;
import negocio.Estudante;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Sistema de Pagamento ISPI</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write(" <style>\n");
      out.write("        body{\n");
      out.write("            background-image:url(imgs/imgfb/FB_IMG_16814496016018379.jpg); \n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"topo\" class=\"col-lg-12\"> \n");
      out.write("\n");
      out.write("            <div class=\"navbar navbar-fixed-top\" style=\"background-color: #67b168; margin-bottom: 200px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\" panel-primary\">\n");
      out.write("                    <div class=\"h2 info\"><img  style=\"border-radius: 50px;\" src=\"imgs/imgfb/FB_IMG_16814047693446532.jpg\" alt=\"\" width=\"100\" height=\"75\"><span style=\"color: #fff\">Sistema de pagamentos ISPI</span>\n");
      out.write("                        <a class=\"btn btn-success pull-right\" href=\"#\" role=\"button\" data-toggle=\"modal\" data-target=\"#exampleModal10\" style=\"border: solid 1px #fff; margin-right:50px;  \"><span class=\"glyphicon glyphicon-log-in\"></span> Cadastrar-se</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br><br><br>   <br><br><br>   <br><br><br>\n");
      out.write("            <div id=\"esquerda\" class=\"col-lg-3\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"conteudo\" class=\"col-md-6\">\n");
      out.write("                \n");
      out.write("                ");
 Estudante u = new Estudante();  
                EstudanteDao uDao = new EstudanteDao();
       
       String usuario = request.getParameter("usuario");
                String senha = request.getParameter("senha");
                try {

                    if (usuario != null && senha != null && !usuario.isEmpty() && !senha.isEmpty()) {

                        u = uDao.findByAgenteBi(usuario);

                        if (u.getNbi().equalsIgnoreCase(usuario) && u.getSenha().equalsIgnoreCase(senha)) {
             session.setAttribute("usuario", u);
                                response.sendRedirect("home.jsp");
                            }
                        else {
                                out.print("<div class='alert alert-danger'>Não Tem permissão para aceder o sistema<br> "
                                        + "Contacte o Administrador</div>");

                            
                        }
                    }

                } catch (Exception e) {
                    out.print("<div class='alert alert-danger'>Usuario Nao existe \n Tente novamente</div>");
                }
                  
          
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("                <div class=\"panel \" style=\"border: solid 4px #67b168; border-radius: 10px; \">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                             <div class=\"panel-title\"><center><img src=\"imgs/user.png\" width=\"200\" height=\"150\" class=\"img-circle\"></center></div>\n");
      out.write("              \n");
      out.write("                     </div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <form action=\"home.html\" method=\"post\">\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-2 col-form-label\">B.I</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input style=\"border: solid 1px #67b168; color: #000; \" type=\"text\" name=\"usuario\" class=\"form-control\" id=\"inputEmail3\" placeholder=\"Numero do B.I\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label for=\"inputPassword3\" class=\"col-sm-2 col-form-label\">SENHA</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input style=\"border: solid 1px #67b168; color: #000 \" type=\"password\" name=\"senha\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Digite a senha\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <fieldset class=\"form-group\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("\n");
      out.write("                                    <div class=\"col-sm-10\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </fieldset>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <button   style=\"border: solid 1px #000; color: #000 \" type=\"submit\" class=\"btn btn-success\" >ENTRAR</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"direita\" class=\"col-md-3\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbar navbar-fixed-bottom \" style=\"background-color: #67b168; border-top:solid #ffffff 5px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Modal Historico -->\n");
      out.write("\n");
      out.write("                <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("                    <div class=\"modal-dialog\">\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                            <div class=\"modal-header\">\n");
      out.write("                                <h3 class=\"modal-title\" id=\"exampleModalLabel\">Editar dados do Recluso</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-body\"></div>\n");
      out.write("\n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Fechar</button>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- fim modal -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"modal fade\" id=\"exampleModal10\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <h3 class=\"modal-title\" id=\"exampleModalLabel\">Meus Dados</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <div class=\"panel-success\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    <div class=\"panel-title\"> Preencha o formulario com os seus dados </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                                        <form>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <label for=\"nome\">Nome:</label>\n");
      out.write("                                                <input  required name=\"nome\" type=\"text\" class=\"form-control\" placeholder=\"Digite o Nome\"/>\n");
      out.write("                                                <label for=\"nome\">Data de Nascimento:</label>\n");
      out.write("                                                <input  required name=\"datanasc\" type=\"date\" class=\"form-control\"/>\n");
      out.write("                                                <label for=\"nome\">Numero do B.I:</label>\n");
      out.write("                                                <input  required name=\"bi\" type=\"text\" class=\"form-control\" placeholder=\"Digite o Nome\"/>\n");
      out.write("                                                <label for=\"nome\">Numero de Estudante:</label>\n");
      out.write("                                                <input  required name=\"ne\" type=\"text\" class=\"form-control\" placeholder=\"Digite o Nome\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <label for=\"nome\">Sobrenome:</label>\n");
      out.write("                                                <input  required name=\"sobrenome\" type=\"text\" class=\"form-control\" placeholder=\"Digite o sobrenome\"/>\n");
      out.write("                                                <label for=\"nome\">Telefone:</label>\n");
      out.write("                                                <input  required name=\"telefone\" type=\"number\" class=\"form-control\" placeholder=\"Digite o Nome\"/>\n");
      out.write("                                                <label for=\"nome\">email:</label>\n");
      out.write("                                                <input  required name=\"email\" type=\"email\" class=\"form-control\" placeholder=\"Digite o Nome\"/>\n");
      out.write("                                                <label for=\"nome\">Sexo:</label>\n");
      out.write("\n");
      out.write("                                                <select class=\"form-control\" name=\"sexo\">\n");
      out.write("                                                    <option>Masculino</option>\n");
      out.write("                                                    <option>Femenino</option>\n");
      out.write("                                                </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <label for=\"nome\">documento Fisico:</label>\n");
      out.write("                                            <input type=\"file\" class=\"form-control\" name=\"doc\" />\n");
      out.write("\n");
      out.write("                                            <label for=\"nome\">Senha:</label>\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" name=\"senha\" />\n");
      out.write("                                    </div>\n");
      out.write("                                    <br>\n");
      out.write("                                    <button style=\"border: solid 1px #000; color: #000 \" type=\"submit\" class=\"btn btn-success\">\n");
      out.write("                                        <span class=\"glyphicon glyphicon-floppy-save\"> Cadastrar</span>\n");
      out.write("                                    </button>\n");
      out.write("                                    <button style=\"border: solid 1px #000; color: #000 \" type=\"reset\" class=\"btn btn-danger\">\n");
      out.write("                                        <span class=\"glyphicon glyphicon-floppy-remove\"> Limpar </span>\n");
      out.write("                                    </button>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Fechar</button>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("            <script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("            <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
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
