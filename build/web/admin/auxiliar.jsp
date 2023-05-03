<%-- 
    Document   : auxiliar
    Created on : 20/12/2022, 10:48:40
    Author     : ASK KAPAMBA
--%>


<%@page import="dao.EstudanteDao"%>
<%@page import="negocio.Estudante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    Estudante e = new Estudante();
 EstudanteDao eDao = new EstudanteDao();
try {
    String np=request.getParameter("cod_d");
    out.print(np);
    e = eDao.findByNumero((np)) ;
    out.print(e);
       response.sendRedirect("home.jsp?p=4&cod_e="+e.getCodigo()+"");
    } catch (Exception ee) {
        out.print("<script>alert('Estudante não existe no sistema. !!!! ')</script>");
        response.sendRedirect("home.jsp?r=0");
    }




%>
