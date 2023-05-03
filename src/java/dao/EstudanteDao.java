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
import util.JPAUtil;

/**
 *
 * @author adm
 */
public class EstudanteDao {
    EntityManager em;
    List<Estudante> estudantes;
 
    public void create(Estudante e) {
      em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        em.close();
    }

    
    public void delete(Integer codigo) {
       
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        Estudante e = em.getReference(Estudante.class, codigo);
        em.remove(e);
        em.getTransaction().commit();
        em.close();
    }

  
    public void update(Estudante e) {
    em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        e = em.merge(e);
        em.persist(e);
        em.getTransaction().commit();
        em.close(); 
    }


    public Estudante findByid(int id) {
    em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        Estudante a = em.find(Estudante.class, id);
        em.getTransaction().commit();
        em.close();
        return a;
    }


    public List<Estudante> findAll() {
      em= JPAUtil.getEntityManager();
        estudantes = new ArrayList<Estudante>() ;
        
        Query q = em.createNamedQuery("Estudante.findAll" ,Estudante.class);
        this.estudantes = q.getResultList(); 
      
        return estudantes;
    }
      public Estudante findByNumero(String bi) {
    em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
            Estudante a;
       Query q = em.createNamedQuery("Estudante.findByNumero" ,Estudante.class);
       q.setParameter("numero", bi);
      a = (Estudante) q.getSingleResult();
       return a;
    } 
      
        public Estudante findByEmail(String email) {
    em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
            Estudante a;
       Query q = em.createNamedQuery("Estudante.findByEmail" ,Estudante.class);
       q.setParameter("email", email);
      a = (Estudante) q.getSingleResult();
       return a;
    }   
}


