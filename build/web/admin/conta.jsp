<%-- 
    Document   : servico
    Created on : 17/abr/2023, 10:32:46
    Author     : adm
--%>

<%@page import="java.util.Date"%>
<%@page import="negocio.Transferencia"%>
<%@page import="negocio.Pagamento"%>
<%@page import="util.DataUtil"%>
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
            Date date = new Date();

            try {
                EstudanteDao estDao = new EstudanteDao();

              //  Estudante est = (Estudante) session.getAttribute("usuario");
                Estudante est = estDao.findByid(Integer.parseInt(request.getParameter("cod_e")));


        %>

        <div id="conteudo" class="col-md-6">
            <p class="h3"> MINHA CONTA</p>

            <hr>
            <div class="col-md-6">
                <label for="nome">Nome:</label>
                <p class="h5"> <%= est.getNome().toUpperCase()%></p>
                <label for="nome">Data de Nascimento:</label>
                <p class="h5"> <%= (est.getDatanasc())%></p>
                <label for="nome">Numero do B.I:</label>
                <p class="h5"> <%= est.getNbi()%></p>
                <label for="nome">Numero de Estudante:</label>

                <p class="h5"> <%= est.getNe()%> </p>
            </div>
            <div class="col-md-6">
                <label for="nome">Sobrenome:</label>
                <p class="h5"> <%= est.getSobrenome().toUpperCase()%></p>
                <label for="nome">Telefone:</label>
                <p class="h5"> <%= est.getTelefone()%></p>
                <label for="nome">email:</label>
                <p class="h5"> <%= est.getEmail().toUpperCase()%></p>
                <label for="nome">Sexo:</label>

                <p class="h5"> <%= est.getSexo().toUpperCase()%></p>



            </div>
            <label for="nome">documento Fisico:</label>
            <p class="h4"><a>Acessar</a></p>

            <label for="nome">Senha:</label>
            <p class="h5"> ******************</p>
        </div>
              

        <div class="panel panel-default">
            <div class="panel-body">
                <div class="col-lg-4">
                <p class="h3">DEPOSITAR DINHEIRO</p>
                  <br>
                <label>NUMERO DA CONTA</label>
                <input type="text" value="<%= est.getNumero() %>" class="form-control" readonly/>
                <form method="get" action="verificardeposito.jsp">
                    <label>VALOR</label>
                    <input type="number" name="valor" class="form-control" required/>
                    <input type="hidden" name="estudante" value="<%= est.getCodigo() %>" class="form-control" required/>
                    <input type="hidden" name="data" value="<%= DataUtil.formataData(date) %>" class="form-control" required/>
                    <input type="hidden" name="hora" value="<%= DataUtil.formataHora(date) %>" class="form-control" required/>
                    <br><button class="btn btn-success">
                        Depositar
                    </button>
                </form>
                
           
                
                <br><label>SALDO</label>
                <div   class="" style="border: solid 2px #67b168; height: 150px; padding: 40px;padding-left: 40px; ">
                    <h1><%= est.getSaldo() %>0 Kz</h1>
                </div>
                </div>
                
            </div>
            <div class="panel-footer">
                
                <div class="col-md-6" style="border-right: solid 2px #ccc; ">
                                      <p class="h4">Pagamentos</p>
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
                %>

                </tbody>
            </table> 
                    
                    
                    
                    
                      <br><br>  <br><br>  <br><br>  <br><br>
                </div>
                
                <div class="col-md-6">
                    <p class="h4">Transferencias</p>
                    <table class="table">
                <thead>
                <th> CODIGO </th>
                <th>DATA </th>
                <th>HORA </th>
                <th>CONTA</th>
                <th>DESTINATARIO</th>

                <th>VALOR</th>
                
                </thead>
                <%
                    Estudante pgmm = new Estudante();
                    EstudanteDao eeDao = new EstudanteDao();
                    pgm = eDao.findByid(est.getCodigo());
                    List<Transferencia> transferencias = pgmm.getTransferenciaList();
                %>
                <tbody>
                    <%
                        if (transferencias.size() == 0) {
                            out.print("Nenhum dado registrado");
                        } else {
                            out.print("<button class='btn btn-primary' type='button'>" + " Total de transferencias " + "<span class='badge'>" + "" + transferencias.size() + "</span></button>");
                    %>

                    <%
                        for (Transferencia t : transferencias) {


                    %>

                    <tr 
                        <%            if (t.getCodigo() % 2 == 0) {
                                out.print("class='sucess'");
                            } else if (t.getCodigo() % 2 != 0) {
                                out.print("class='warning'");
                            } else {
                                out.print("class='danger'");
                            }

                        %>




                        >

                        <td><%= t.getCodigo()%></td>
                        <td><%= t.getData()%></td>

                        <td><%= t.getHora()%></td>
                        <td><%= t.getDestino().getNumero() %></td>

                        <td><%= t.getDestino().getNome()+ " "+t.getDestino().getSobrenome() %></td>

                        <td><%= t.getValor()%>0 Kz</td>



                       
                    </tr>


                    <!-- fim modal -->


                    <%                }
                            }
                      
                    %>

                </tbody>
            </table>
                    
                    
                </div>
                
                
            </div>

        </div>


        <hr>
        <div class="row">
        </div>
    </div><div class="col-lg-3">

    </div>



    <div class="navbar navbar-fixed-bottom " style="background-color: #67b168;">

    </div>

    <div class="modal fade" id="exampleModal10" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h3 class="modal-title" id="exampleModalLabel">Transporte</h3>
                </div>
                <div class="modal-body">
                    <div class="panel-success">
                        <div class="panel-heading">
                            <div class="panel-title">O PAGAMENTO DE TRANSPORTE</div>
                        </div>
                        <div class="panel-body">

                            <div class="row">
                                <div class="col-md-4">
                                    <img src="imgs/FBE.GIF" width="200" height="300">
                                </div>
                                <div class="col-md-7" style="margin-left: 30px; border-left:solid 2px #222; ">
                                    <p class="h3">Descricao: Transporte</p>

                                    <p class="h5">Valor: 8000,00 Kz</p>

                                    <br><br>
                                    <a class="btn btn-success btn-sm">Pagar Servico</a>
                                </div>
                            </div>

                        </div>

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>

                    </div>
                </div>
            </div>
        </div>
        <br><br>  <br><br>  <br><br>  <br><br>
        <%
            } catch (Exception e) {
            }
        %>
 
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>
