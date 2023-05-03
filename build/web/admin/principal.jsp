<%-- 
    Document   : ProcessoListar
    Created on : 13/12/2021, 07:27:01
    Author     : SACOPA
--%>


<%@page import="dao.EstudanteDao"%>
<%@page import="negocio.Estudante"%>
<%@page import="dao.TransferenciaDao"%>
<%@page import="negocio.Transferencia"%>
<%@page import="dao.PagamentoDao"%>
<%@page import="negocio.Pagamento"%>
<%@page import="negocio.Agente"%>
<%@page import="util.DataUtil"%>
<%@page import="java.util.List"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <link href='css/estilo.css' rel="stylesheet">
    <body>
        <%
        Agente aaa = new Agente();
       Pagamento p = new Pagamento();
        PagamentoDao pDao = new PagamentoDao();
        Transferencia t = new Transferencia();
        TransferenciaDao tDao = new TransferenciaDao();
        Estudante eeee = new Estudante();
        EstudanteDao eDao = new EstudanteDao();
        //Detido ddd = new Detido();
        //DetidoDao ddDao = new DetidoDao();
        //VisitaDao vDao = new VisitaDao();
        //List<Visita> vs = vDao.findAll();
         
        %>
      
    <center> <img src="../imgs/img2.PNG" width="900" height="500"></center>
   
  
  </div>

    
   
    <br><br><br><br>
       <div class="panel panel-default">
  <!-- Default panel contents -->

    
      </div>
    </div>
  </div>
</div>

    </body>
</html>
