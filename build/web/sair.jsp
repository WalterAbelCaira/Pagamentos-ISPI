<%-- 
    Document   : sair
    Created on : 15/08/2022, 03:05:46
    Author     : ASK KAPAMBA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
    </head>
    <body>
        <%
        session.removeAttribute("usuario");
        
        response.sendRedirect("index.jsp");
        %>
    </body>
</html>
