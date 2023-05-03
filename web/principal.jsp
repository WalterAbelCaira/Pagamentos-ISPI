<%-- 
    Document   : ProcessoListar
    Created on : 13/12/2021, 07:27:01
    Author     : SACOPA
--%>

 <%

                    try {
                        if (request.getParameter("r").equals("0")) {
                            out.print("<script>alert('Estudante inexistente no sistema !!!')</script>");
                        }
                    } catch (Exception ex) {
                    }

                %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <link href='css/estilo.css' rel="stylesheet">
    <body>
        <div class="row" style="margin-right: 20px;">
          
        <a class="btn btn-success pull-right" href="#" role="button" data-toggle="modal" data-target="#exampleModal"> <span class="glyphicon glyphicon-search" > </span> TRANSFERIR DINHEIRO </a>
    </div>

    <hr>   
<center>
    <img  src="imgs/imgfb/FB_IMG_16814496870995870.jpg" width="800" height="300" alt=""/>
    <h3>BANCO ESTUDANTIL DE PAGAMENTOs ON-LINE ISPI </h3>
</center>

<div class="panel panel-default">
    <!-- Default panel contents -->


    <!-- Table -->

</div>



<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h3 class="modal-title" id="exampleModalLabel">Buscar Estudante</h3>
               
            </div>
            <div class="modal-body">

                <form method="post"  action="auxiliar2.jsp">
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
<script>
    startclock();
</script>

<script src="js/relogio.js" type="text/javascript"></script>
</body>
</html>
