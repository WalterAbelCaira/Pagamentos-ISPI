<%-- 
    Document   : verificar
    Created on : 19/abr/2023, 7:57:27
    Author     : adm
--%>

<%@page import="negocio.Pagamento"%>
<%@page import="dao.PagamentoDao"%>
<%@page import="dao.ServicoDao"%>
<%@page import="negocio.Servico"%>
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
        try {

            String pin = request.getParameter("pin");
            int eLogado = Integer.parseInt(request.getParameter("cod_l"));
            String senha = request.getParameter("senha");
            String estudante = request.getParameter("estudante");
            String servico = request.getParameter("servico");
            double valor = Double.parseDouble(request.getParameter("valor"));
            Servico s;
            Estudante e;
            Date date = new Date();
            EstudanteDao eDao = new EstudanteDao();
            ServicoDao sDao = new ServicoDao();

            s = sDao.findByid(Integer.parseInt(servico));
            e = eDao.findByid(Integer.parseInt(estudante));

            PagamentoDao pDao = new PagamentoDao();
            Pagamento p = new Pagamento();
            p.setEstudanteCodigo(e);
            p.setServicoCodigo(s);
            p.setHora(DataUtil.formataHoraSeg(date));
            p.setData(DataUtil.formataData(date));

            e = eDao.findByid(eLogado);
         //   out.println(e.getNbi() + "  " + e.getSenhaA() + " // " + pin + " " + senha);
          //  out.print(e);
            if(e.getNbi().equals(pin) && e.getSenhaA().equals(senha)) {
                out.print("sim");
                //pDao.create(p);
                double saldo = e.getSaldo() - valor;
                System.out.println(saldo);
                if ((e.getSaldo() > valor) && (e.getSaldo() > 0)) {
                    pDao.create(p);
                    pDao.updateP(e.getCodigo(), saldo);

                    out.print("<br><br><center><br><br><hr><div class='deperro'><div class='alert alert-success'> Pagamento Efectuada com sucesso !!!<br><br><a href='home.jsp' class='btn btn-primry' style='border:solid 1px #000; margin:3px;'>Recibo</a><a href='home.jsp' class='btn btn-sm btn-success'>Voltar</a></div></div></center>");
                }   // response.sendRedirect("home.jsp");
              } else {
               
                  
                    out.print("<br><br><center><br><br><hr><div class='deperro'><div class='alert alert-danger'>Erro ao  Efectuar Pagamento, PIN ou SENHA errda !!!<br><br><a href='home.jsp' class='btn btn-success' style='border:solid 1px #000; margin:3px;'>Voltar</a></div></div></center>");
                    //response.sendRedirect("home.jsp");
                }

            
        } catch (Exception e) {
            response.sendRedirect("home.jsp");
            out.print("Caiu no catch" + e.getMessage());
        }


    %>






    }



</body></html>