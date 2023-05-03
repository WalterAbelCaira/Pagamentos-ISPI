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
import negocio.Pagamento;
import util.JPAUtil;

/**
 *
 * @author adm
 */
public class PagamentoDao implements GenericoDao<Pagamento>{
 EntityManager em;
    List<Pagamento> pagamentos;
    @Override
    public void create(Pagamento t) {
        
    em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
        em.close();
    
    }

     public void delete(Integer codigo) {
      em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        Pagamento s = em.getReference(Pagamento.class, codigo);
        em.remove(s);
        em.getTransaction().commit();
        em.close();
    }
    @Override
    public void delete(Pagamento t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Pagamento s) {
    
     em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        s = em.merge(s);
        em.persist(s);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Pagamento findByid(int id) {
      em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        Pagamento a = em.find(Pagamento.class, id);
        em.getTransaction().commit();
        em.close();
        return a;  
    }

    @Override
    public List<Pagamento> findAll() {
     em= JPAUtil.getEntityManager();
        pagamentos = new ArrayList<Pagamento>() ;
        
        Query q = em.createNamedQuery("Pagamento.findAll" ,Pagamento.class);
        this.pagamentos = q.getResultList(); 
      
        return pagamentos;
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
