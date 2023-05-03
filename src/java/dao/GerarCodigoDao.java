/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import negocio.Estudante;
import negocio.Geracodigo;
import util.JPAUtil;

/**
 *
 * @author adm
 */
public class GerarCodigoDao {

    EntityManager em;
List<Geracodigo> geracodigos;
    public void create(Geracodigo t) {
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
        em.close();

    }
     public List<Geracodigo> findAll() {
      em= JPAUtil.getEntityManager();
        geracodigos = new ArrayList<Geracodigo>() ;
        
        Query q = em.createNamedQuery("Geracodigo.findAll" ,Geracodigo.class);
        this.geracodigos = q.getResultList(); 
      
        return geracodigos;
    }
}
