<%-- 
    Document   : atendente
    Created on : 25/11/2021, 22:08:09
    Author     : SACOPA
--%>


<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ISPI</title>
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href='css/estilo.css' rel="stylesheet">
        <link href="css/bootstrap-theme.min.css.css" rel="stylesheet">
        <script src="js/relogio.js" type="text/javascript"></script>

    </head>
    <body>

        <%/*
            try {

                Agente agente = (Agente) session.getAttribute("usuario");
                out.print(agente.getNome());
            } catch (Exception e) {
                response.sendRedirect("index.jsp");
            }

            Agente agente = (Agente) session.getAttribute("usuario");
*/
        %>


        <nav class="navbar navbar-default navbar-fixed-top navbar-inverse" style="padding-left:20px;padding-right:50px; color: #fff; margin-bottom: 100px;">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand glyphicon " href="#" style="color: #fff">ISPI</a>
            </div>

            <p>
            <p id="datahora" class="navbar-text navbar-right"> 
            </p>
            <form class="navbar-form navbar-right" method="post" action="auxiliar2.jsp" role="search">
                <div class="form-group">
                    <input type="text" name="querynome" class="form-control" placeholder="buscar recluso">
                </div>
                <button type="submit" class="btn btn-default">
                    <span class="glyphicon glyphicon-search"></span> 
                </button>
            </form>

        </nav>


        <br>
        <div class="col-md-2 navbar-fixed-top" style="background: #000; height: 900px; border-right: solid 4px  #4cae4c;;  color: #fff;">
            <br><br><br>
            <img src="imgs/sp.png" width="150" height="150" class="img-circle" style="margin-left:30px;">

            <p style="margin: 0 auto;">   </p>
            <hr>
            <ul class="nav nav-pills nav-stacked">

                <li role="presentation" class=""><a href="home.jsp"><span class="glyphicon glyphicon-home"></span> Inicio</a></li>
                <li role="presentation" class=""><a href="home.jsp?p=1"> <span class="glyphicon glyphicon-user"></span> Visitas</a></li>
                <li role="presentation"><a href="home.jsp?p=2">Reclusos</a></li>
                <li role="presentation"><a href="home.jsp?p=20">Soltos</a></li>

                <% /* if (agente.getNivel().equals("1")) {
                        out.print("<li role='presentation'><a href='home.jsp?p=3'>Agentes</a></li>");
                        out.print("<li role='presentation'><a href='home.jsp?p=5'>Estatisticas</a></li>");
                    }
               */ %>
                <div class="dropdown">
                    <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                        <span class="glyphicon glyphicon-user"></span> 
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





    </div>




    <!-- Modal -->






    <!-- FOOTER -->









    <script>
        startclock();
    </script>




    <script src="js/bootstrap.js"></script>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery-ui.js" type="text/javascript"></script>
    <script src="js/script.js" type="text/javascript"></script>

    <div class="navbar navbar-fixed-bottom " style="background-color: #000; margin-top: ">
        <center><h4>Todos os direitos reservados  2023 </h4></center>
    </div>
</body>
</html>
