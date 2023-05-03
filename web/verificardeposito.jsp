<%-- 
    Document   : verificar
    Created on : 19/abr/2023, 7:57:27
    Author     : adm
--%>

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
        try {

            int origem = Integer.parseInt(request.getParameter("origem"));
            int destino = Integer.parseInt(request.getParameter("destino"));
            String pin = request.getParameter("pin");
            String senha = request.getParameter("senha");
            int valor = Integer.parseInt(request.getParameter("valor"));

            Estudante o = new Estudante();
            Estudante d = new Estudante();
            Estudante e = new Estudante();

            EstudanteDao eDao = new EstudanteDao();
            Transferencia t = new Transferencia();
            t.setData(DataUtil.formataData(date));
            t.setHora(DataUtil.formataHora(date));
            t.setValor((valor));

            o.setCodigo(origem);
            t.setOrigem(o);

            d.setCodigo(destino);
            t.setDestino(d);

            TransferenciaDao tDao = new TransferenciaDao();
            e = eDao.findByid(origem);
            out.println(e.getNbi() + "  " + e.getSenhaA() + " // " + pin + " " + senha);

            if (e.getNbi().equals(pin) && e.getSenhaA().equals(senha)) {
                tDao.create(t);

                o = eDao.findByid(o.getCodigo());
                d = eDao.findByid(d.getCodigo());
                double saldo = d.getSaldo() + valor;
                out.println(saldo);
                double saldo1 = o.getSaldo() - valor;
               
                
                
                out.println(saldo1);

                System.out.println(saldo);

                if ((e.getSaldo() > valor) && (e.getSaldo() > 0)) {
                    tDao.create(t);
                    out.print(saldo);
                    tDao.updateP(d.getCodigo(), saldo);
                    out.print(saldo1);
                    tDao.updateP(o.getCodigo(), saldo1);

                    out.print("<br><br><center><br><br><hr><div class='deperro'><div class='alert alert-success'> Pagamento Efectuada com sucesso !!!<br><br><a href='home.jsp' class='btn btn-primry' style='border:solid 1px #000; margin:3px;'>Recibo</a><a href='home.jsp' class='btn btn-sm btn-success'>Voltar</a></div></div></center>");
                }
                // out.print("<br><br><center><br><br><hr><div class='deperro'><div class='alert alert-success'> Transerencia Efectuada com sucesso !!!<br><br><a href='home.jsp' class='btn btn-primry' style='border:solid 1px #000; margin:3px;'>Recibo</a><a href='home.jsp' class='btn btn-sm btn-success'>Voltar</a></div></div></center>");
                // response.sendRedirect("home.jsp");
            } else {
                out.print("<br><br><center><br><br><hr><div class='deperro'><div class='alert alert-danger'>Erro ao  Efectuar Transerencia, PIN ou SENHA errda !!!<br><br><a href='home.jsp' class='btn btn-success' style='border:solid 1px #000; margin:3px;'>Voltar</a></div></div></center>");
                //response.sendRedirect("home.jsp");
            }

        } catch (Exception e) {
            out.print("Caiu no catch" + e.getMessage());
            //  response.sendRedirect("home.jsp");
        }
    %>

</body></html>