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

import prt24.gestaoAtasLicitacao.dao.ItemDAO;
import prt24.gestaoAtasLicitacao.entities.AtaLicitacao;
import prt24.gestaoAtasLicitacao.entities.Item;
import prt24.gestaoAtasLicitacao.util.jpa.JPAUtil;

/**
 *
 * @author joao.guedes
 */
public class ItemJpa implements ItemDAO {
    private final EntityManager em = JPAUtil.getEntityManager();
    private final EntityTransaction tx = em.getTransaction();

    @Override
    public void salvarItem(Item item) {
        try {
            tx.begin();
            em.persist(item);
            tx.commit();
        } catch(Exception e) {
            System.out.println("Erro ao salvar o Item " + e.getMessage());
            tx.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void excluirItem(Item item) {
        try {
            tx.begin();
            em.remove(item);
            tx.commit();
        } catch(Exception e) {
            System.out.println("Erro ao excluir o Item " + e.getMessage());
            tx.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void atualizarItem(Item item) {
        try {
            tx.begin();
            em.merge(item);
            tx.commit();
        } catch(Exception e) {
            System.out.println("Erro ao atualizar o Item " + e.getMessage());
            tx.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public Item buscarItemPorId(Integer id) {
        Query q = em.createQuery("select i from Item i where i.id = :id", Item.class);
        q.setParameter("id", id);
        Item item = (Item) q.getSingleResult();
        
        return item;
    }

    @Override
    public Item buscarItemPorNumeroItemNaAta(String numeroItem) {
        Query q = em.createQuery("select i from Item i where i.numeroItemNaAta = :numeroItem", Item.class);
        q.setParameter("numeroItem", numeroItem);
        Item item = (Item) q.getSingleResult();
        
        return item;
    }

    @SuppressWarnings("unchecked")
	@Override
    public List<Item> buscarItemPorDescricao(String descricao) {
        Query q = em.createQuery("select i from Item i where i.descricao like \'%descricao%\'", Item.class);
        q.setParameter("descricao", descricao);
        List<Item> itens = q.getResultList();
        
        return itens;
    }

    @SuppressWarnings("unchecked")
	@Override
    public List<Item> buscarItensPorAtaLicitacao(AtaLicitacao ata) {
        Query q = em.createQuery("select i from Item i where i.ataLicitacao = :ata", Item.class);
        q.setParameter("ata", ata);
        List<Item> itens = q.getResultList();
        
        return itens;
    }

    @SuppressWarnings("unchecked")
	@Override
    public List<Item> listar() {
        Query q = em.createQuery("select i from Item i", Item.class);
        return q.getResultList();
    }
    
}
