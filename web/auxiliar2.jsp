<%-- 
    Document   : auxiliar2
    Created on : 17/abr/2023, 18:37:01
    Author     : adm
--%>

<%@page import="dao.EstudanteDao"%>
<%@page import="negocio.Estudante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>



    <%
        Estudante e = new Estudante();
        EstudanteDao dDao = new EstudanteDao();
        try {
            String np = request.getParameter("cod_d");
            out.print(np);
            e = dDao.findByNumero(np);
            out.print(e);
            response.sendRedirect("home.jsp?p=4&cod_d=" + e.getCodigo() + "");
        }catch (Exception ex){
            out.print("<script>alert('Estudante não existe no sistema. !!!! ')</script>");
            response.sendRedirect("home.jsp?r=0");
        }


    %>

</html>
