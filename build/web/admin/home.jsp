<%-- 
    Document   : atendente
    Created on : 25/11/2021, 22:08:09
    Author     : SACOPA
--%>


<%@page import="negocio.Agente"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Area Administrativa</title>
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href='css/estilo.css' rel="stylesheet">
        <link href="css/bootstrap-theme.min.css.css" rel="stylesheet">
        <script src="js/relogio.js" type="text/javascript"></script>

    </head>
    <body>

        <%
            try {

                Agente agente = (Agente) session.getAttribute("usuario");
                out.print(agente.getNome());
            } catch (Exception e) {
                response.sendRedirect("index.jsp");
            }

            Agente agente = (Agente) session.getAttribute("usuario");

        %>


        <nav class="navbar navbar-default navbar-fixed-top navbar-inverse" style="padding-left:20px;padding-right:50px; color: #fff; margin-bottom: 100px;">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand glyphicon " href="#" style="color: #4cae4c; margin-left: 250px;">AREA ADMINISTRATIVA</a>
            </div>

            <p>
            <p id="datahora" class="navbar-text navbar-right"> 
            </p>


        </nav>


        <br>
        <div class="col-md-2 navbar-fixed-top" style="background: #000; height: 900px; border-right: solid 4px  #4cae4c;;  color: #fff;">
            <br><br><br>
            <img src="../imgs/imgfb/FB_IMG_16814047693446532.jpg" width="150" height="150" class="img-circle" style="margin-left:30px;">

            <p style="margin: 0 auto;">   </p>
            <hr>
            <ul class="nav nav-pills nav-stacked">

                <li role="presentation" class=""><a href="home.jsp"><span class="glyphicon glyphicon-home"></span> HOME</a></li>
                <li role="presentation" class=""><a href="home.jsp?p=1"> <span class="glyphicon glyphicon-user"></span> CLIENTES</a></li>
                <li role="presentation"><a href="home.jsp?p=2">SERVICOS</a></li>
                <li role="presentation"><a  href="#" role="button" data-toggle="modal" data-target="#exampleModal">PAGAMENTOS</a></li>

               
                <div class="dropdown">
                    <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                        <span class="glyphicon glyphicon-user"></span> <%= agente.getNome() + " " + agente.getSobrenome()%></a></li>

                        <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                        <li>
                            <a class="" href="#" role="button" data-toggle="modal" data-target="#exampleModal10"> <span class="glyphicon glyphicon-plus-sign" > </span> Meus dados </a>


                        </li>
                        <li ></li>


                    </ul>
                    <li><a href="sair.jsp" class="btn btn-sm pull-right"><span class="glyphicon glyphicon-log-out"></span> Sair</a></li>
                    <p>



                    </p>
                </div>



            </ul>
        </div>
    </div>
    <div class="col-md-10 pull-right" style="margin-top: 50px;">



        <%
            try {

                String pag = request.getParameter("p");
                if (pag.equals("1")) {
        %>
        <%@include file="clientes.jsp" %>

        <%        } else if (pag.equals("2")) {
        %>
        <%@include file="servico.jsp" %>

        <%        } else if (pag.equals("3")) {
        %>
        <%//@include file="agentes.jsp" %>

        <%        } else if (pag.equals("4")) {
%>
        <%@include file="conta.jsp" %>

        <%//@include file="agente.jsp" %>
        <%   }else{
%>
        <%@include file="principal.jsp" %>
        <%}

        } catch (Exception e) {

        %>
        <%@include file="principal.jsp" %>
        <% }
        %>





    </div>




    <!-- Modal -->


    <div class="modal fade" id="exampleModal10" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h3 class="modal-title" id="exampleModalLabel">Dados Do Agente</h3>
                </div>
                <div class="modal-body">



                    <form method="post" action="agenteServlet?comando=guardar" enctype="multipart/form-data">

                        <label for="nome">Nome:</label>
                        <input required value="<%= agente.getNome()%>" name="nome" type="text" class="form-control" placeholder="Digite o Nome"/>
                        <label for="sobrenome">sobrenome:</label>
                        <input required name="sobrenome" value="<%= agente.getSobrenome()%>"  class="form-control" type="text" placeholder="Digite o sobrenome"/>
                        <label for="bi">B.I:</label>
                        <input required name="bi" value="<%= agente.getBi()%>"  class="form-control" type="text" placeholder="Digite o sobrenome"/>
                        <label for="foto">Foto:</label>
                        <input required name="foto"  class="form-control" type="file" placeholder="Digite o sobrenome"/>
                        <label for="tipo">Tipo:</label>
                        <select required class="form-control" name="tipo">
                            <option value="1">Administrador</option>
                            <option value="2">Usuario</option>
                        </select>
                        <label  for="senha">Senha:</label>
                        <input required name="senha" type="password" class="form-control" placeholder="*****"/>
                        <br>      <button type="submit" class="btn btn-success">
                            <span class="glyphicon glyphicon-save-file"></span>
                            Editar
                        </button>
                        <a type="reset" class="btn btn-danger">
                            <span class="glyphicon glyphicon-trash"></span>
                            Eliminar
                        </a>
                    </form>



                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>

                </div>
            </div>
        </div>
    </div>
    <!-- Modal  -->





    <!-- FOOTER -->










    <script>
        startclock();
    </script>





    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h3 class="modal-title" id="exampleModalLabel">Buscar Estudante</h3>

                </div>
                <div class="modal-body">

                    <form method="post"  action="auxiliar.jsp">
                        <label>Digite o numero da conta</label>
                        <input type="search" name="cod_d"  placeholder="Digite o numero de conta" class="form-control col-md-3"/>
                        <br>      <button type="submit" class="btn btn-primary">
                            <span class="glyphicon glyphicon-search"></span>
                        </button>
                    </form>



                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>

                </div>
            </div>
        </div>
    </div>

    <script src="js/bootstrap.js"></script>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery-ui.js" type="text/javascript"></script>
    <script src="js/script.js" type="text/javascript"></script>

    <div class="navbar navbar-fixed-bottom " style="background-color: #000; margin-top: ">
        <center><h4>ISPI  2023 </h4></center>
    </div>
</body>
</html>
