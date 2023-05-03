/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.EstudanteDao;
import dao.PagamentoDao;
import dao.ServicoDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Estudante;
import negocio.Pagamento;
import negocio.Servico;
import util.DataUtil;

/**
 *
 * @author adm
 */
@WebServlet(name = "PagamentoServlet", urlPatterns = {"/pagamentoServlet"})
public class PagamentoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            /* TODO output your page here. You may use following sample code. */

            //String comando = request.getParameter("comando");
            String estudante = request.getParameter("estudante");
            String servico = request.getParameter("servico");
            double valor = Double.parseDouble(request.getParameter("valor"));

            Servico s ;
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
            
            
            double saldo = e.getSaldo()-valor;
            
            System.out.println(saldo);
           
            if ((e.getSaldo() > valor) && (e.getSaldo() > 0)) {
                 pDao.create(p);
                 pDao.updateP(e.getCodigo(), saldo);
             
            }
    response.sendRedirect("home.jsp?p=1");
      
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
