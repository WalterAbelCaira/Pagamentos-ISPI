/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;


import dao.AgenteDao;
import dao.EstudanteDao;
import dao.GerarCodigoDao;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import negocio.Agente;
import negocio.Estudante;
import negocio.Geracodigo;


/**
 *
 * @author ASK KAPAMBA
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      // String[] letras = {"abgr","fdad","bcfd","cdffc","cffd","Dfdr","kryh","lhgh","mhgy","yytu3","tu3","4tut5"};
       
        
        
        
        
        Agente agente = new Agente();
        AgenteDao aDao = new AgenteDao();
        
        
        System.out.println(aDao.findByAgenteBi("123"));
      
      /*Geracodigo go = new Geracodigo(1, "senhaA");
       
        GerarCodigoDao gDao = new GerarCodigoDao();
        gDao.create(go);
        List<Geracodigo> geracodigos = gDao.findAll();
        System.out.println("");
        System.out.println(geracodigos.get(geracodigos.size()-1).getSenha());*/
    }
    
}
