package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.PagamentoDao;
import negocio.Pagamento;
import dao.EstudanteDao;
import negocio.Estudante;
import java.util.List;
import dao.ServicoDao;
import negocio.Servico;

public final class pagamentos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            try {
                    
               

            Estudante est = (Estudante) session.getAttribute("usuario");
            Estudante eee = new Estudante();

        
      out.write("\n");
      out.write("        ");

            Servico s = new Servico();
            ServicoDao sDao = new ServicoDao();

            List<Servico> servicos = sDao.findAll();
        
      out.write("\n");
      out.write("        <form class=\"pull-right\">\n");
      out.write("            <input type=\"search\" placeholder=\"buscar\" class=\"form-control\" style=\"border: solid 1px #222\" />\n");
      out.write("        </form>\n");
      out.write("        <div id=\"conteudo\" class=\"col-md-12\">\n");
      out.write("            <p class=\"h3\"> PAGAMENTOS </p>\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <table class=\"table\">\n");
      out.write("                <thead>\n");
      out.write("                <th> CODIGO </th>\n");
      out.write("                <th>DATA </th>\n");
      out.write("                <th>HORA\n");
      out.write("                </th>\n");
      out.write("                <th>TIPO DE SERVIÇOS</th>\n");
      out.write("               \n");
      out.write("                  <th>VALOR</th>\n");
      out.write("                <th>Detalhes</th>\n");
      out.write("                </thead>\n");
      out.write("                ");

                     Estudante pgm = new  Estudante();
                    EstudanteDao eDao = new EstudanteDao();
                     pgm = eDao.findByid(est.getCodigo());
                     List<Pagamento> pagamentos = pgm.getPagamentoList();
                
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        if (pagamentos.size() == 0) {
                            out.print("Nenhum dado registrado");
                        } else {
                            out.print("<button class='btn btn-primary' type='button'>" + " Total de pagamentos " + "<span class='badge'>" + "" + pagamentos.size() + "</span></button>");
                    
      out.write("\n");
      out.write("\n");
      out.write("                    ");

                        for (Pagamento p : pagamentos) {

                           

                    
      out.write("\n");
      out.write("\n");
      out.write("                    <tr \n");
      out.write("                        ");
            if (p.getCodigo() % 2 ==0) {
                                out.print("class=''");
                            } else if (p.getCodigo() % 2 != 0) {
                                out.print("class='warning'");
                            } else {
                                out.print("class='danger'");
                            }

                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        >\n");
      out.write("                     \n");
      out.write("                        <td>");
      out.print( p.getCodigo() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( p.getData() );
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <td>");
      out.print( p.getHora() );
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <td>");
      out.print( p.getServicoCodigo().getDescricao() );
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <td>");
      out.print( p.getServicoCodigo().getValor() );
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                      \n");
      out.write("                        <td><a class=\"btn btn-success btn-sm\" href=\"home.jsp?p=4&cod_d=\">Ver</a> </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- fim modal -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
                }
                        }
                    }catch(Exception ex){
}
                
      out.write("\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
