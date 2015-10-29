/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt24.gestaoAtasLicitacao.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import prt24.gestaoAtasLicitacao.dao.PedidoDAO;
import prt24.gestaoAtasLicitacao.entities.AtaLicitacao;
import prt24.gestaoAtasLicitacao.entities.Pedido;
import prt24.gestaoAtasLicitacao.util.jpa.JPAUtil;

/**
 *
 * @author joao.guedes
 */
public class PedidoJpa implements PedidoDAO {
    private final EntityManager em = JPAUtil.getEntityManager();
    private final EntityTransaction tx = em.getTransaction();

    @Override
    public void salvarPedido(Pedido pedido) {
        try {
            tx.begin();
            em.persist(pedido);
            tx.commit();
        } catch(Exception e) {
            System.out.println("Erro ao salvar o Pedido " + e.getMessage());
            tx.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void excluirPedido(Pedido pedido) {
        try {
            tx.begin();
            em.remove(pedido);
            tx.commit();
        } catch(Exception e) {
            System.out.println("Erro ao excluir o Pedido " + e.getMessage());
            tx.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void atualizarPedido(Pedido pedido) {
        try {
            tx.begin();
            em.merge(pedido);
            tx.commit();
        } catch(Exception e) {
            System.out.println("Erro ao atualizar o Pedido " + e.getMessage());
            tx.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public Pedido buscarPedidoPorId(Integer id) {
        Query q = em.createQuery("select p from Pedido p where p.id = :id", Pedido.class);
        q.setParameter("id", id);
        
        return (Pedido) q.getSingleResult();
    }

    @Override
    public Pedido buscarPedidoPorNumeroPedido(String numeroPedido) {
        Query q = em.createQuery("select p from Pedido p where p.numeroPedido = :numeroPedido", Pedido.class);
        q.setParameter("numeroPedido", numeroPedido);
        
        return (Pedido) q.getSingleResult();
    }

    @SuppressWarnings("unchecked")
	@Override
    public List<Pedido> buscarPedidoPorAtaLicitacao(AtaLicitacao ata) {
        Query q = em.createQuery("select p from Pedido p where p.ataLicitacao = :ata", Pedido.class);
        q.setParameter("ata", ata);
        
        return q.getResultList();
    }

    @SuppressWarnings("unchecked")
	@Override
    public List<Pedido> listar() {
        Query q = em.createQuery("select p from Pedido p", Pedido.class);
        
        return q.getResultList();
    }
}
