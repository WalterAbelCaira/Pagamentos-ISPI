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
import negocio.Deposito;
import negocio.Servico;
import util.JPAUtil;

/**
 *
 * @author adm
 */
public class DepositoDao implements GenericoDao<Deposito>{

     EntityManager em;
    List<Deposito> depositos;
    
    @Override
    public void create(Deposito t) {
      em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
        em.close();
    
    }
    
    
      public void delete(Integer codigo) {
      em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        Deposito s = em.getReference(Deposito.class, codigo);
        em.remove(s);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void delete(Deposito t) {
    
    
    }

    @Override
    public void update(Deposito s) {
    
       em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        s = em.merge(s);
        em.persist(s);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Deposito findByid(int id) {
         em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        Deposito a = em.find( Deposito.class, id);
        em.getTransaction().commit();
        em.close();
        return a;
    }

    @Override
    public List<Deposito> findAll() {
       em= JPAUtil.getEntityManager();
        depositos = new ArrayList<Deposito>() ;
        
        Query q = em.createNamedQuery("Deposito.findAll" ,Deposito.class);
        this.depositos = q.getResultList(); 
      
        return depositos;
    }
    
}
