/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.EstudanteDao;
import dao.GerarCodigoDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Estudante;
import negocio.Geracodigo;

/**
 *
 * @author adm
 */
@WebServlet(name = "EstudanteServlet", urlPatterns = {"/estudanteServlet"})
public class EstudanteServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) {

        Date date = new Date();
        String comando = request.getParameter("comando");

        if (comando.equalsIgnoreCase("guardar")) {
            try {

                String nome = request.getParameter("nome");
                String sobrenome = request.getParameter("sobrenome");
                String bi = request.getParameter("bi");
                String senha = request.getParameter("senha");
                String sexo = request.getParameter("sexo");
                String telefone = request.getParameter("telefone");
                String email = request.getParameter("email");
                String ne = request.getParameter("ne");
                String doc = request.getParameter("doc");
                String datanasc = request.getParameter("datanasc");
                Geracodigo go = new Geracodigo(1, "senhaA");
       
        
        GerarCodigoDao gDao = new GerarCodigoDao();
        gDao.create(go);
        List<Geracodigo> geracodigos = gDao.findAll();
        System.out.println("");
        System.out.println(geracodigos.get(geracodigos.size()-1).getSenha());
                
                String senhaA = geracodigos.get(geracodigos.size()-1).getSenha().toString();
                
                EstudanteDao eDao = new EstudanteDao();
                Estudante estudante = new Estudante(Integer.SIZE, datanasc, datanasc, doc, email, bi, ne, nome, nome, Integer.SIZE, senha, sexo, sobrenome, telefone, senhaA);
                eDao.create(estudante);
                response.sendRedirect("./index.jsp?e=0");
                System.out.println(estudante);

            } catch (Exception e) {
                try {
                    response.sendRedirect("./index.jsp?e=1");
                } catch (IOException ex) {
                    Logger.getLogger(EstudanteServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                e.printStackTrace();
            }
        }

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
