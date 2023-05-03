


<%@page import="dao.EstudanteDao"%>
<%@page import="negocio.Estudante"%>
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
                background-image:url(imgs/imgfb/FB_IMG_16814496016018379.jpg); 
            }
        </style>
    </head

    <body>

        <%
            try {

                String mensagem = request.getParameter("e");
                if (mensagem.equals("0")) {
                    out.print("<script>alert('Usuario cadastrado com sucesso !!!')</script>");
                }
                }catch (Exception e) {
                }
        %>
        <div id="topo" class="col-lg-12"> 

            <div class="navbar navbar-fixed-top" style="background-color: #67b168; margin-bottom: 200px;">


                <div class=" panel-primary">
                    <div class="h2 info"><img  style="border-radius: 50px;" src="imgs/imgfb/FB_IMG_16814047693446532.jpg" alt="" width="100" height="75"><span style="color: #fff">Sistema de pagamentos ISPI</span>
                        <a class="btn btn-success pull-right" href="#" role="button" data-toggle="modal" data-target="#exampleModal10" style="border: solid 1px #fff; margin-right:50px;  "><span class="glyphicon glyphicon-log-in"></span> Cadastrar-se</a>




                    </div>
                </div>
            </div>
            <br><br><br>   <br><br><br>   <br><br><br>
            <div id="esquerda" class="col-lg-3">

            </div>
            <div id="conteudo" class="col-md-6">

                <% Estudante u = new Estudante();
                    EstudanteDao uDao = new EstudanteDao();

                    String usuario = request.getParameter("usuario");
                    String senha = request.getParameter("senha");

                    try {

                        if (usuario != null && senha != null && !usuario.isEmpty() && !senha.isEmpty()) {

                            u = uDao.findByEmail(usuario);

                            if (u.getEmail().equalsIgnoreCase(usuario) && u.getSenha().equalsIgnoreCase(senha)) {
                                session.setAttribute("usuario", u);
                                response.sendRedirect("home.jsp");
                            } else {
                                out.print("<div class='alert alert-danger'>Não Tem permissão para aceder o sistema<br> "
                                        + "</div>");

                            }
                        }

                    } catch (Exception e) {
                        out.print("<div class='alert alert-danger'>Usuario Nao existe \n Tens de estar cadastrado no sistema</div>");




                    }

                %>







                <br>
                <div class="panel " style="border-left: solid 4px #67b168; border-radius: 0px; ">
                    <div class="panel-heading">
                        <div class="panel-title"><center><img src="imgs/user.png" width="200" height="150" class="img-circle"></center></div>

                    </div>
                    <div class="panel-body">
                        <form action="index.jsp" method="post">
                            <div class="form-group row">
                                <label for="inputEmail3" class="col-sm-2 col-form-label">EMAIL</label>
                                <div class="col-sm-10">
                                    <input required="" style="border: solid 1px #67b168; color: #000; " type="email" name="usuario" class="form-control" id="inputEmail3" placeholder="Digite email">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword3" class="col-sm-2 col-form-label">SENHA</label>
                                <div class="col-sm-10">
                                    <input required style="border: solid 1px #67b168; color: #000 " type="password" name="senha" class="form-control" id="inputPassword3" placeholder="Digite a senha">
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
                                    <button   style="border: solid 1px #000; color: #000 " type="submit" class="btn btn-success" >ENTRAR</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>

            </div>
            <div id="direita" class="col-md-3">



            </div>
            <div class="navbar navbar-fixed-bottom " style="background-color: #67b168; border-top:solid #ffffff 5px;">



                <!-- Modal Historico -->

                <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h3 class="modal-title" id="exampleModalLabel">Editar dados do Recluso</h3>
                            </div>
                            <div class="modal-body"></div>

                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>

                            </div>
                        </div>
                    </div>
                </div>

                <!-- fim modal -->






            </div>


            <div class="modal fade" id="exampleModal10" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h3 class="modal-title" id="exampleModalLabel">Meus Dados</h3>
                        </div>
                        <div class="modal-body">
                            <div class="panel-success">
                                <div class="panel-heading">
                                    <div class="panel-title"> Preencha o formulario com os seus dados </div>
                                </div>
                                <div class="panel-body">

                                    <div class="row">

                                        
                                        
                                        
                                        <form method="post" action="estudanteServlet?comando=guardar">
                                            <div class="col-md-6">
                                                <label for="nome">Nome:</label>
                                                <input  required name="nome" type="text" class="form-control" placeholder="Digite o Nome"/>
                                                <label for="nome">Data de Nascimento:</label>
                                                <input  required name="datanasc" type="date" class="form-control"/>
                                                <label for="nome">Numero do B.I:</label>
                                                <input  required name="bi" type="text" class="form-control" placeholder="Digite o B.I"/>
                                                <label for="nome">Numero de Estudante:</label>
                                                <input  required name="ne" type="text" class="form-control" placeholder="Digite o Nº De Estudante"/>


                                            </div>
                                            <div class="col-md-6">
                                                <label for="nome">Sobrenome:</label>
                                                <input  required name="sobrenome" type="text" class="form-control" placeholder="Digite o sobrenome"/>
                                                <label for="nome">Telefone:</label>
                                                <input  required name="telefone" type="number" class="form-control" placeholder="Digite o Telefone"/>
                                                <label for="nome">email:</label>
                                                <input  required name="email" type="email" class="form-control" placeholder="Digite o Email"/>
                                                <label for="nome">Sexo:</label>

                                                <select class="form-control" name="sexo">
                                                    <option>Masculino</option>
                                                    <option>Femenino</option>
                                                </select>



                                            </div>
                                            <label for="nome">documento Fisico:</label>
                                            <input type="file" class="form-control" name="doc" />

                                           
                                            <label for="nome">Senha:</label>
                                            <input type="password" class="form-control" name="senha" maxlength="8"/>
                                    </div>
                                    <br>
                                    <button style="border: solid 1px #000; color: #000 " type="submit" class="btn btn-success">
                                        <span class="glyphicon glyphicon-floppy-save"> Cadastrar</span>
                                    </button>
                                    <button style="border: solid 1px #000; color: #000 " type="reset" class="btn btn-danger">
                                        <span class="glyphicon glyphicon-floppy-remove"> Limpar </span>
                                    </button>
                                    </form>
                                </div>

                            </div>

                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>

                        </div>
                    </div>
                </div>
            </div>

            <script src="js/bootstrap.js" type="text/javascript"></script>
            <script src="js/jquery.min.js" type="text/javascript"></script>
            <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
