/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt24.gestaoAtasLicitacao.dao.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import prt24.gestaoAtasLicitacao.dao.AtaLicitacaoDAO;
import prt24.gestaoAtasLicitacao.entities.AtaLicitacao;
import prt24.gestaoAtasLicitacao.util.jpa.JPAUtil;

/**
 *
 * @author joao.guedes
 */
public class AtaLicitacaoJpa implements AtaLicitacaoDAO {
    
    private EntityManager em = JPAUtil.getEntityManager();
    private EntityTransaction tx = em.getTransaction();

    @Override
    public void salvarAtaLicitacao(AtaLicitacao ata) {
        try {
            tx.begin();
            em.persist(ata);
            tx.commit();
        } catch(Exception e) {
            System.out.print("Erro ao salvar uma AtaLicitacao " + e.getMessage());
            e.printStackTrace();
            tx.rollback();
        }
    }

    @Override
    public void excluirAtaLicitacao(AtaLicitacao ata) {
        try {
            tx.begin();
            em.remove(ata);
            tx.commit();
        } catch(Exception e) {
            System.out.print("Erro ao excluir uma AtaLicitacao" + e.getMessage());
            e.printStackTrace();
            tx.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void atualizarAtaLicitacao(AtaLicitacao ata) {
        try {
            tx.begin();
            em.merge(ata);
            tx.commit();
        } catch(Exception e) {
            System.out.print("Erro ao atualizar uma AtaLicitacao" + e.getMessage());
            e.printStackTrace();
            tx.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public AtaLicitacao buscarAtaLicitacaoPorId(Integer id) {
        Query q = em.createQuery("select a from AtaLicitacao a where a.id = :id", AtaLicitacao.class);
        q.setParameter("id", id);
        AtaLicitacao ata = (AtaLicitacao) q.getSingleResult();
        
        return ata;
    }

    @Override
    public AtaLicitacao buscarAtaLicitacaoPorNumeroAta(String numeroAta) {
        Query q = em.createNamedQuery("select a from AtaLicitacao a where a.numeroAta = :numeroAta", AtaLicitacao.class);
        q.setParameter("numeroAta", numeroAta);
        AtaLicitacao ata = (AtaLicitacao) q.getSingleResult();
        
        return ata;
    }

    @SuppressWarnings("unchecked")
	@Override
    public List<AtaLicitacao> listar() {
        Query q = em.createQuery("select a from AtaLicitacao a", AtaLicitacao.class);
        List<AtaLicitacao> atasList = new ArrayList<AtaLicitacao>();
        atasList = q.getResultList();
        
        return atasList;
    }
    
}
