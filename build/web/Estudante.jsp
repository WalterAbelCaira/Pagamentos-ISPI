<%-- 
    Document   : Estudante
    Created on : 17/abr/2023, 19:02:05
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
        <h1>TRANSFERÊNCIA</h1>
        <hr>
        <div class="row">
            
            
              <%     
                      try {
                          
                          
                Estudante estudante2 = (Estudante) session.getAttribute("usuario");
           
     

                              Estudante estuuu = new Estudante();
                        EstudanteDao eDao = new EstudanteDao();
                        estuuu = eDao.findByid(Integer.parseInt(request.getParameter("cod_d")));
                   
                       
                  %>
            <div class="col-lg-3">
                <div class="panel-primary">
                    <form action="verificardeposito.jsp" method="post">
                    <label>Numero da Conta</label>
                    <input type="hidden" required class="form-control" value="<%= estudante2.getCodigo() %>" style="border: solid 1px #67b168; color: #419641;" name="origem" readonly>
                    <input type="hidden" required class="form-control" value="<%= estuuu.getCodigo() %>" style="border: solid 1px #67b168; color: #419641;" name="destino" readonly>
                     
                    <input type="text" required class="form-control" value="<%= estuuu.getNumero() %>" style="border: solid 1px #67b168; color: #419641;" name="conta" readonly>
                     <label>Valor a depositar</label>
                     <input type="number" class="form-control" style="border: solid 1px #67b168; color: #419641;" name="valor">
                     
                </div>
        </div>
              <div class="col-md-6">
                
              <label>Titular da conta</label>
              <input readonly type="text"value="<%= estuuu.getNome().toUpperCase()+" "+estuuu.getSobrenome().toUpperCase() %>" class="form-control" style="border: solid 1px #67b168; color: #419641;" name="conta">
              <div class="col-lg-6">  <br><label><code>PIN</code></label>
                     <input required type="text" class="form-control" style="border: solid 1px blue ; color: #419641;" name="pin">
                      <br><label><code>Confirmar a SENHA</code></label>
                     <input required type="number" class="form-control" style="border: solid 1px blue ; color: #419641;" name="senha">
                     <button class="btn btn-success" style="background-color: #fff; color: #419641; border: solid 2px #419641; margin-top: 10px;  " type="submit">TRANSFERIR</button>
                    </form>
              </div>
              
              
                     <% 
                     
                        } catch (Exception eeeee) {
                          }
                  
                     %>
        </div>
        </div>
    </body>
</html>
