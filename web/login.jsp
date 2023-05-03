


<!DOCTYPE html>
<%
   
%>
<html>
    <head>
        <title>Sistema de Pagamento ISPI</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <!-- Custom styles for this template-->

    </head>
    <body style="#ccc">


        <%
        %>
        <div id="topo" class="col-lg-12"> 
            <div class="page-header panel-primary">
                <div class="h2 info"><img src="imgs/sp.png" width="100" height="75">Sistema de pagamentos ISPI
                    <button class="btn btn-sm pull-right"><span class="glyphicon glyphicon-log-in"></span></button>

                </div>
            </div>
        </div>
        <div id="esquerda" class="col-lg-3">

        </div>
        <div id="conteudo" class="col-md-6">
            <%   /*             String usuario = request.getParameter("usuario");
                String senha = request.getParameter("senha");
                try {

                    if (usuario != null && senha != null && !usuario.isEmpty() && !senha.isEmpty()) {

                        u = uDao.findByAgenteBi(usuario);

                        if (u.getBi().equalsIgnoreCase(usuario) && u.getSenha().equalsIgnoreCase(senha)) {
             session.setAttribute("usuario", u);
                                response.sendRedirect("home.jsp");
                            }
                        else {
                                out.print("<div class='alert alert-danger'>Não Tem permissão para aceder o sistema<br> "
                                        + "Contacte o Administrador</div>" + u.getNivel());

                            
                        }
                    }

                } catch (Exception e) {
                    out.print("<div class='alert alert-danger'>Usuario Nao existe \n Tente novamente</div>");
                }
                  
         */   %>
            <br>
            <div class="panel ">
                <div class="panel-heading">
                    <div class="panel-title"><center><img src="imgs/user.png" width="200" height="150" class="img-circle"></center></div>
                </div>
                <div class="panel-body">
                    <form action="index.jsp" method="post">
                        <div class="form-group row">
                            <label for="inputEmail3" class="col-sm-2 col-form-label">B.I</label>
                            <div class="col-sm-10">
                                <input type="text" name="usuario" class="form-control" id="inputEmail3" placeholder="Numero do B.I">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword3" class="col-sm-2 col-form-label">SENHA</label>
                            <div class="col-sm-10">
                                <input type="password" name="senha" class="form-control" id="inputPassword3" placeholder="Digite a senha">
                            </div>
                        </div>
                        <fieldset class="form-group">
                            <div class="row">

                                <div class="col-sm-10">



                                </div>
                            </div>
                        </fieldset>

                        <div class="form-group row">
                            <div class="col-sm-10">
                                <button type="submit" class="btn btn-primary">ENTRAR</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

        </div>
        <div id="direita" class="col-md-3">



        </div>
        <div class="navbar navbar-fixed-bottom " style="background-color: #000;">

        </div>
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
