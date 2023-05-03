<%-- 
    Document   : auxiliar
    Created on : 20/12/2022, 10:48:40
    Author     : ASK KAPAMBA
--%>

<%@page import="modelo.Detido"%>
<%@page import="ao.visitas.dao.DetidoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    Detido d = new Detido();
    DetidoDao dDao = new DetidoDao();
try {
    String np=request.getParameter("cod_d");
    out.print(np);
    d = dDao.findByDetidoNProcesso(np) ;
    out.print(d);
       response.sendRedirect("home.jsp?p=4&cod_d="+d.getCodigo()+"");
    } catch (Exception e) {
        out.print("<script>alert('Recluso não existe no sistema. !!!! ')</script>");
        response.sendRedirect("home.jsp?r=0");
    }




%>
