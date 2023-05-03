/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import negocio.Transferencia;
import util.JPAUtil;

/**
 *
 * @author adm
 */
public class TransferenciaDao {

    EntityManager em;

    public void create(Transferencia t) {

        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
        em.close();
    }

    public void updateP(int codigo, double saldo) {
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        Query q = em.createQuery("UPDATE Estudante e SET e.saldo = :saldo WHERE e.codigo = :codigo");
        q.setParameter("saldo", saldo);
        q.setParameter("codigo", codigo);
        q.executeUpdate();
        em.getTransaction().commit();
        em.close();
    }

}
