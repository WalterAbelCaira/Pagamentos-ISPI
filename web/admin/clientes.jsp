<%-- 
    Document   : ProcessoListar
    Created on : 13/12/2021, 07:27:01
    Author     : SACOPA
--%>


<%@page import="java.util.List"%>
<%@page import="dao.EstudanteDao"%>
<%@page import="negocio.Estudante"%>
<%@page import="java.util.Date"%>
<%@page import="negocio.Agente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <link href='css/estilo.css' rel="stylesheet">
    <%

        Date data = new Date();


    %>

    <body>

        <%            try {
                String e = request.getParameter("e");
                if (e.equals("1")) {
                    out.print("<div class='alert alert-danger'><p>Erro ao cadastrar,  já existente no sistema ou dados incorrectos </p></div>");
                } else {
                    out.print("<div class='alert alert-success'><p> adicionado com sucesso !!! </p></div>");

                }
            } catch (Exception e) {
            }


        %>




        <div class="row" style="margin-right: 20px;">
            <p ><h4 style="color: #255625;"><span class="glyphicon glyphicon-inbox"> </span> ESTUDANTES</h4></p>
            <%                try {

                    Agente aaaa = (Agente) session.getAttribute("usuario");

                   

            %>
    </div>

    <hr>   
    


    <table class="table">
        <thead>
        
        <th>CODIGO</th>
        <th>CONTA</th>
        <th>NOME</th>
        <th>SALDO</th>
        <th>DATA NASCIMENTO</th>
        <th>B.I</th>
        <th>EMAIL</th>
        <th>TELEFONE</th>
        <th>Detalhes</th>
    </thead>
    <%
        Estudante e = new Estudante();
        EstudanteDao eDao = new EstudanteDao();

        List<Estudante> estudantes = eDao.findAll();
    %>
    <tbody>
        <%
            if (estudantes.size() == 0) {
                out.print("Nenhum dado registrado");
            } else {
                out.print("<button class='btn btn-success' type='button'>" + " Total de Estudantes no sistema " + "<span class='badge'>" + "" + estudantes.size() + "</span></button>");
        %>

        <%
            for (Estudante ee : estudantes) {

        %>
        <tr 
            <%      if (ee.getCodigo() % 2 == 0) {
                    out.print("class='danger'");
                } else {
                    out.print("class='warning'");
                }
            %>
            >
            <td>


                <%= ee.getCodigo()%>  
            </td>
            <td>


                <%= ee.getNumero()%>  
            </td>

            <td><%= ee.getNome() + " " + ee.getSobrenome()%></td>

            <td><%= ee.getSaldo()%></td>

            <td><%= ee.getDatanasc()%></td>

            <td><%= ee.getNbi()%></td>

            <td><%= ee.getEmail()%></td>
            <td><%= ee.getTelefone()%></td>



            <td><a class="btn btn-success btn-sm" href="home.jsp?p=4&cod_e=<%= ee.getCodigo()%>">Ver</a> </td>
        </tr>

        <!-- Modal -->



        <!-- fim modal -->


        <%                }
            }

        %>

    </tbody>
</table>
<br><br><br>
</div>

<!-- Modal -->




<!-- modal -->

<%   } catch(Exception e) {
       response.sendRedirect("index.jsp");
    }
%>



</body>
</html>
