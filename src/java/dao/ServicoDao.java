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
import negocio.Servico;
import util.JPAUtil;

/**
 *
 * @author adm
 */
public class ServicoDao implements GenericoDao<Servico>{
 EntityManager em;
    List<Servico> servicos;
    @Override
    public void create(Servico s) {
    em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
        em.close();
    
    }

    
    public void delete(Integer codigo) {
      em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        Servico s = em.getReference(Servico.class, codigo);
        em.remove(s);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void update(Servico s) {
    em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        s = em.merge(s);
        em.persist(s);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Servico findByid(int id) {
     em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        Servico a = em.find( Servico.class, id);
        em.getTransaction().commit();
        em.close();
        return a;
    }

    @Override
    public List<Servico> findAll() {
    em= JPAUtil.getEntityManager();
        servicos = new ArrayList<Servico>() ;
        
        Query q = em.createNamedQuery("Servico.findAll" ,Servico.class);
        this.servicos = q.getResultList(); 
      
        return servicos;
    }

    @Override
    public void delete(Servico t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
