<%-- 
    Document   : verificar
    Created on : 19/abr/2023, 7:57:27
    Author     : adm
--%>

<%@page import="dao.DepositoDao"%>
<%@page import="negocio.Deposito"%>
<%@page import="dao.TransferenciaDao"%>
<%@page import="util.DataUtil"%>
<%@page import="java.util.Date"%>
<%@page import="negocio.Transferencia"%>
<%@page import="dao.EstudanteDao"%>
<%@page import="negocio.Estudante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<head>
    <style>
        body{
            background-color: #255625;
        }
    </style>   
</head>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="css/estiloproj.css" rel="stylesheet" type="text/css"/>
<body background="green">


    <%
        Date date = new Date();

        int est = Integer.parseInt(request.getParameter("estudante"));

        String data = request.getParameter("data");
        String hora = request.getParameter("hora");
        String valor = request.getParameter("valor");

        System.out.println(data + " " + hora + " " + valor);
        try {
            Estudante e = new Estudante();
            Estudante estu;
            EstudanteDao eDao = new EstudanteDao();
            e.setCodigo(est);
            Deposito d = new Deposito();

            //EstudanteDao eDao = new EstudanteDao();
            DepositoDao dDao = new DepositoDao();

            d.setData(data);
            d.setHora(hora);
            d.setValor(valor);
            d.setEstudanteCodigo(e);
            out.print(e);
            //out.println(e.getNbi() + "  " + e.getSenhaA() + " // " + pin + " " + senha);
            //  if (e.getNbi().equals(pin) && e.getSenhaA().equals(senha)) {
            dDao.create(d);
            estu = eDao.findByid(est);
            TransferenciaDao tDao = new TransferenciaDao();

            out.print(estu);
            //   o = eDao.findByid(o.getCodigo());
            //   d = eDao.findByid(d.getCodigo());
          double saldo = estu.getSaldo() + Integer.parseInt(valor);
           out.println(saldo + " Saldo");

            tDao.updateP(estu.getCodigo(), saldo);

             out.print("<br><br><center><br><br><hr><div class='deperro'><div class='alert alert-success'> Deposito Efectuada com sucesso !!!<br><br><a href='home.jsp' class='btn btn-primry' style='border:solid 1px #000; margin:3px;'>Recibo</a><a href='home.jsp' class='btn btn-sm btn-success'>Voltar</a></div></div></center>");
            // out.print("<br><br><center><br><br><hr><div class='deperro'><div class='alert alert-success'> Transerencia Efectuada com sucesso !!!<br><br><a href='home.jsp' class='btn btn-primry' style='border:solid 1px #000; margin:3px;'>Recibo</a><a href='home.jsp' class='btn btn-sm btn-success'>Voltar</a></div></div></center>");
            // response.sendRedirect("home.jsp");
          //response.sendRedirect("home.jsp");
        } catch (Exception e) {
            out.print("Caiu no catch" + e.getMessage());
            //  response.sendRedirect("home.jsp");
              out.print("<br><br><center><br><br><hr><div class='deperro'><div class='alert alert-danger'>Erro ao  Efectuar o deposito, Rever os dados !!!<br><br><a href='home.jsp' class='btn btn-success' style='border:solid 1px #000; margin:3px;'>Voltar</a></div></div></center>");
            
            e.printStackTrace();
        }
    %>

</body></html>