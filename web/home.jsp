
<%@page import="dao.EstudanteDao"%>
<%@page import="negocio.Estudante"%>
<%
    EstudanteDao eda = new EstudanteDao();
    try {

        Estudante estudante = (Estudante) session.getAttribute("usuario");
     
        Estudante ed = new Estudante();
              ed  = eda.findByid(estudante.getCodigo());

%>

<!DOCTYPE html>

<html>
    <head>
        <title>Sistema de Pagamento ISPI</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <!-- Custom styles for this template-->
        <style>
            body{
                background-color: #fcf8f8; 
            }
        </style>
    </head>
    <body>


        <div id="topo" class="col-lg-12"> 

            <div class="navbar navbar-fixed-top" style="background-color: #67b168; margin-bottom: 200px;">


                <div class=" panel-primary">
                    <div class="h2 info"><a href="home.jsp"><img src="imgs/imgfb/FB_IMG_16814047693446532.jpg" style="border-radius: 50px;" alt="" width="100" height="75"></a>Sistema de pagamentos ISPI
                        <a href="sair.jsp" class="btn btn-default pull-right" style="border: solid 2px #fff; margin-right:50px;  "><span class="glyphicon glyphicon-log-in"></span> SAIR</a>
                        <a href="home.jsp?p=3" class="btn btn-success pull-right" style="border: solid 2px #fff; margin-right:20px  "><span class="glyphicon glyphicon-log-in"></span> CONTA</a>
                        <a href="home.jsp?p=5"  class="btn btn-success pull-right" style="border: solid 2px #fff;   margin-right:20px"><span class="glyphicon glyphicon-log-in"></span> TRANFERENCIAS</a>
                        <a href="home.jsp?p=2" class="btn btn-success pull-right" style="border: solid 2px #fff;  margin-right:20px"><span class="glyphicon glyphicon-log-in"></span> PAGAMENTOS</a>

                        <a href="home.jsp?p=1" class="btn btn-success pull-right" style="border: solid 2px #fff; margin-right:20px "><span class="glyphicon glyphicon-log-in"></span> SERVIÇOS</a>

                    </div>
                </div>
            </div>
            <br><br><br>   <br><br><br></div> 
        <div id="esquerda" style="background-color: #67b168; margin-left: 0px;" class="col-lg-3">
            <br><br><br>   



            <div class="panel panel-success">
                <div class="panel-heading">
                    <div class="panel-title">Minha Carteira</div>
                </div>
                <div class="panel-body">
                    <div class="panel-title"><center><img style="background-color: #fff;" src="imgs/user.png" width="200" height="150" class="img-circle"></center></div>
                    <hr> <p class="h5"><span class="glyphicon glyphicon-user"></span> NOME: <%= estudante.getNome().toUpperCase() + " " + estudante.getSobrenome().toUpperCase()%></p>
                </div>
                <div class="panel-footer">


                    <p class="h5"><span class="glyphicon glyphicon-bitcoin"></span>CONTA: <%= estudante.getNumero().toUpperCase()%></p>
                    <p class="h3"><span class="glyphicon glyphicon-usd"></span> Kz <%= ed.getSaldo()%></p>

                </div>
            </div>

        </div>
    </div>
    <div id="conteudo" class="col-md-9">
        <%
            try {
                String pag = request.getParameter("p");
        if (pag.equals("1")) {%>

        <%@include file="servico.jsp" %>


        <%} else if (pag.equals("2")) {%>

        <%@include file="pagamentos.jsp" %>
        <%                } else if (pag.equals("3")) {%>

        <%@include file="conta.jsp" %>
        <%                     } else if (pag.equals("4")) {%>

        <%@include file="Estudante.jsp" %>
        <%                     } else if (pag.equals("5")) {%>

        <%@include file="transferencias.jsp" %>
        <%                    }

        } catch (Exception e) {
        %>
        <%@include file="principal.jsp"%>
        <%                } finally {
            }

        %>


    </div>

    <div class="navbar navbar-fixed-bottom " style="background-color: #67b168;">

    </div>
    <script src="js/bootstrap.js" type="text/javascript"></script>
    <script src="js/jquery.min.js" type="text/javascript"></script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>
<%    } catch (Exception e) {
        response.sendRedirect("index.jsp");
    }
%>