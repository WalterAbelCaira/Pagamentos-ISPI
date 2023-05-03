<%-- 
    Document   : servico
    Created on : 17/abr/2023, 10:32:46
    Author     : adm
--%>

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

            Estudante est = (Estudante) session.getAttribute("usuario");
            Estudante eee = new Estudante();

            EstudanteDao obj = new EstudanteDao();
            eee = obj.findByid(est.getCodigo());
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
            <p class="h3"> SERVIÇOS</p>

            <hr>
            <div class="row">


                <%
                    for (Servico elem : servicos) {


                %>
                <div class=" col-md-3" style="">
                    <div class="thumbnail">
                        <img src="imgs/imgfb/FB_IMG_16814496016018379.jpg" alt="Sem imagem" width="150" height="300" class="img-thumbnail">
                        <div class="caption">

                            <h5> <%= elem.getDescricao()%></h5>
                            <h6>Kz <%= elem.getValor()%>,00</h6>

                            <p> <a href="#" role="button" data-toggle="modal" data-target="#exampleModal10<%=elem.getCodigo()%>" class='btn btn-primary btn-sm' role='button'>Detalhes</a></p>

                        </div>
                    </div>
                </div>



                <div class="modal fade" id="exampleModal10<%=elem.getCodigo()%>" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h3 class="modal-title" id="exampleModalLabel"><%= elem.getDescricao()%></h3>
                            </div>
                            <div class="modal-body">
                                <div class="panel-success">
                                    <div class="panel-heading">
                                        <div class="panel-title"><%= elem.getDescricao()%></div>
                                    </div>
                                    <div class="panel-body">

                                        <div class="row">
                                            <div class="col-md-4">
                                                <img src="imgs/FBE.GIF" width="200" height="300">
                                            </div>
                                            <div class="col-md-7" style="margin-left: 30px; border-left:solid 2px #222; ">
                                                <p class="h3">Descricao: Transporte</p>

                                                <p class="h5">Valor: Kz <%= elem.getValor()%>,00</p>

                                                <br><br>
                                                <form method="post"  action="verificarpagamento.jsp">
                                                     <input type="hidden" name="cod_l" value="<%= est.getCodigo() %>"> 
                                                    <input type="hidden" name="valor" value="<%= elem.getValor()%>">  
                                                    <input type="hidden" name="estudante" value="<%= est.getCodigo()%>">    
                                                    <input type="hidden" name="servico" value="<%= elem.getCodigo()%>">

                                                    <label><code>PIN</code></label>
                                                    <input required type="text" class="form-control" style="border: solid 1px blue ; color: #419641;" name="pin">
                                                    <br><label><code>Confirmar a SENHA</code></label>
                                                    <input required type="number" class="form-control" style="border: solid 1px blue ; color: #419641;" name="senha">


                                                    <br>
                                                    <%
                                                        if (elem.getValor() > eee.getSaldo()) {
                                                            out.print("<h4 class='h4 label label-danger'>Voce não te saldo Suficiente<br> Recarrega porfavor</h4>");
                                                        } else {
                                                            out.print("<button type='submit' class='btn btn-success btn-sm'>Pagar Servico</button>");
                                                        }
                                                    %>

                                                </form>

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





                </div>
                <% }%>
            </div>









    </body>
</html>
