<%-- 
    Document   : servico
    Created on : 17/abr/2023, 10:39:34
    Author     : adm
--%>

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
       <div class="col-lg-6"> 
        <form action="../servicoServlet?comando=guardar" method="post">
            <label>Descricao</label>
            <input type="text" name="descricao" placeholder="Digite a descricao do servico" class="form-control" required />
             <label>Valor</label>
               <input type="number" name="valor" placeholder="Digite a descricao o valor" class="form-control" required />
               <button class="btn btn-success" style="margin-top: 10px;">Adicionar</button>
            
        </form>
        
        <%
            Servico s = new Servico();
            ServicoDao sDao = new ServicoDao();

            List<Servico> servicos = sDao.findAll();
           
        %>
        
        <table class="table">
            <thead>
            <th>CODIGO</th>
             <th>DESCRIÇAO</th>
              <th>VALOR</th>
              
            </thead>
            <tbody>
                <%
                    for (Servico elem : servicos) {
                %>
                <tr>
                    <td><%= elem.getCodigo() %></td>
                      <td><%= elem.getDescricao()%></td>
                        <td><%= elem.getValor()%> Kz</td>
                </tr>
                <%
                }
                %>
            </tbody>
        </table>
        </div>
    </body>
</html>
