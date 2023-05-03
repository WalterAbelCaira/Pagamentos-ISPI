<%-- 
    Document   : index
    Created on : 24/abr/2023, 13:19:24
    Author     : CAIRA
--%>

<%@page import="dao.AgenteDao"%>
<%@page import="negocio.Agente"%>
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
    <body background="../imgs/imgfb/FB_IMG_16814496136538239.jpg">


        <%

            Agente u = new Agente();
            AgenteDao uDao = new AgenteDao();

        %>
        <div id="topo" class="col-lg-12" style="background-color: #fff; opacity: 90% ;border-bottom: solid #255625 2px;"> 
            <div class=" panel-primary" style=" b">
                <div class="h2 info" style="color:"><img src="../imgs/imgfb/FB_IMG_16814047693446532.jpg" width="100" height="75">BANCO OnLine - Area Administrativa
                    <button class="btn btn-sm pull-right"><span class="glyphicon glyphicon-log-in"></span></button>

                </div>
            </div>
        </div>
        <div id="esquerda" class="col-lg-3" >
        </div>
        <div id="conteudo" class="col-md-6" >
            <%                String usuario = request.getParameter("usuario");
                String senha = request.getParameter("senha");
                try {

                    if (usuario != null && senha != null && !usuario.isEmpty() && !senha.isEmpty()) {

                        u = uDao.findByAgenteBi(usuario);

                        if (u.getBi().equalsIgnoreCase(usuario) && u.getSenha().equalsIgnoreCase(senha)) {
                            session.setAttribute("usuario", u);
                            response.sendRedirect("home.jsp");
                        } else {
                            out.print("<div class='alert alert-danger'>Não Tem permissão para aceder o sistema<br> "
                                    + "Contacte o Administrador</div>" + u.getNivel());

                        }
                    }

                } catch (Exception e) {
                    out.print("<div class='alert alert-danger'>Usuario Nao existe \n Tente novamente</div>");
                }

            %>
            <br>
            <div class="panel " style="border: solid #255625 2px; border-radius: 10px; ">
                <div class="panel-heading">
                    <div class="panel-title"><center><img src="../imgs/imgfb/FB_IMG_16814047693446532.jpg" width="200" height="150" class="img-circle"></center></div>
                </div>
                <div class="panel-body">
                    <form action="index.jsp" method="post">
                        <div class="form-group row">
                            <label for="inputEmail3" class="col-sm-2 col-form-label">USUARIO</label>
                            <div class="col-sm-10">
                                <input style="border: solid #255625 2px; border-radius: 10px; " type="text" name="usuario" class="form-control" id="inputEmail3" placeholder="Numero do B.I">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword3" class="col-sm-2 col-form-label">SENHA</label>
                            <div class="col-sm-10">
                                <input style="border: solid #255625  2px; border-radius: 10px; " type="password" name="senha" class="form-control" id="inputPassword3" placeholder="Digite a senha">
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
                                <button type="submit" class="btn btn-success " style="width: 150px; border:solid 1px #080808;" >Login</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

        </div>
        <div id="direita" class="col-md-3">



        </div>
        <div class="navbar navbar-fixed-bottom " style="background-color: #fff; background-color: #fff; opacity: 90% ;border-top: solid #255625 2px;">

        </div>
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>

    </body>
</html>
