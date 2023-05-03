<%-- 
    Document   : servico
    Created on : 17/abr/2023, 10:32:46
    Author     : adm
--%>

<%@page import="dao.PagamentoDao"%>
<%@page import="negocio.Pagamento"%>
<%@page import="dao.EstudanteDao"%>
<%@page import="negocio.Estudante"%>
<%@page import="java.util.List"%>
<%@page import="dao.ServicoDao"%>
<%@page import="negocio.Servico"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try {
                    
               

            Estudante est = (Estudante) session.getAttribute("usuario");
            Estudante eee = new Estudante();

        %>
        <%
            Servico s = new Servico();
            ServicoDao sDao = new ServicoDao();

            List<Servico> servicos = sDao.findAll();
        %>
        <form class="pull-right">
            <input type="search" placeholder="buscar" class="form-control" style="border: solid 1px #222" />
        </form>
        <div id="conteudo" class="col-md-12">

            <p class="h3"> PAGAMENTOS </p>

            <hr>


            <table class="table">
                <thead>
                <th> CODIGO </th>
                <th>DATA </th>
                <th>HORA
                </th>
                <th>TIPO DE SERVIÇOS</th>
               
                  <th>VALOR</th>
                
                </thead>
                <%
                     Estudante pgm = new  Estudante();
                    EstudanteDao eDao = new EstudanteDao();
                     pgm = eDao.findByid(est.getCodigo());
                     List<Pagamento> pagamentos = pgm.getPagamentoList();
                %>
                <tbody>
                    <%
                        if (pagamentos.size() == 0) {
                            out.print("Nenhum dado registrado");
                        } else {
                            out.print("<button class='btn btn-primary' type='button'>" + " Total de pagamentos " + "<span class='badge'>" + "" + pagamentos.size() + "</span></button>");
                    %>

                    <%
                        for (Pagamento p : pagamentos) {

                           

                    %>

                    <tr 
                        <%            if (p.getCodigo() % 2 ==0) {
                                out.print("class='sucess'");
                            } else if (p.getCodigo() % 2 != 0) {
                                out.print("class='warning'");
                            } else {
                                out.print("class='danger'");
                            }

                        %>




                        >
                     
                        <td><%= p.getCodigo() %></td>
                        <td><%= p.getData() %></td>

                        <td><%= p.getHora() %></td>

                        <td><%= p.getServicoCodigo().getDescricao() %></td>

                        <td><%= p.getServicoCodigo().getValor() %>0 Kz</td>


                      
                     
                    </tr>


                <!-- fim modal -->


                <%                }
                        }
                    }catch(Exception ex){
}
                %>

                </tbody>
            </table>



        </div>

    </div>









</body>
</html>
