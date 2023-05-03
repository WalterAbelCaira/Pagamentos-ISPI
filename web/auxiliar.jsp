<%-- 
    Document   : auxiliar
    Created on : 17/abr/2023, 15:26:03
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
    <body>
        <%
             Estudante estudante = (Estudante) session.getAttribute("usuario");
          
             
             
             Estudante u = new Estudante();
            EstudanteDao uDao = new EstudanteDao();
            
            u = uDao.findByEmail(estudante.getEmail());
            session.removeAttribute("usuario");
          
            session.setAttribute("usuario", u);
            response.sendRedirect("home.jsp?p=1");

            
        %>
    </body>
</html>
