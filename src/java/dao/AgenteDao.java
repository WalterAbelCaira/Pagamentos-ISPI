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
import negocio.Agente;
import util.JPAUtil;

/**
 *
 * @author ASK KAPAMBA
 */
public class AgenteDao {

    EntityManager em;
    List<Agente> agentes;

    public void create(Agente a) {
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Integer codigo) {

        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        Agente a = em.getReference(Agente.class, codigo);
        em.remove(a);
        em.getTransaction().commit();
        em.close();
    }

    public void update(Agente a) {
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        a = em.merge(a);
        em.persist(a);
        em.getTransaction().commit();
        em.close();
    }

    public Agente findByid(int id) {
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        Agente a = em.find(Agente.class, id);
        em.getTransaction().commit();
        em.close();
        return a;
    }

    public List<Agente> findAll() {
        em = JPAUtil.getEntityManager();
        agentes = new ArrayList<Agente>();

        Query q = em.createNamedQuery("Agente.findAll", Agente.class);
        this.agentes = q.getResultList();

        return agentes;
    }

    public Agente findByAgenteBi(String bi) {
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        Agente a;
        Query q = em.createNamedQuery("Agente.findByBi", Agente.class);
        q.setParameter("bi", bi);
        a = (Agente) q.getSingleResult();
        return a;
    }
}
