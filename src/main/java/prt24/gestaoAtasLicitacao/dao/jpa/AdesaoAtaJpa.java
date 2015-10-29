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

import prt24.gestaoAtasLicitacao.dao.AdesaoAtaDAO;
import prt24.gestaoAtasLicitacao.entities.AdesaoAta;
import prt24.gestaoAtasLicitacao.entities.AtaLicitacao;
import prt24.gestaoAtasLicitacao.util.jpa.JPAUtil;

/**
 *
 * @author joao.guedes
 */
public class AdesaoAtaJpa implements AdesaoAtaDAO {
    
    private final EntityManager em = JPAUtil.getEntityManager();
    private final EntityTransaction tx = em.getTransaction();

    @Override
    public void salvarAdesaoAta(AdesaoAta adesao) {
        try {
            tx.begin();
            em.persist(adesao);
            tx.commit();
        } catch(Exception e) {
            System.out.print("Erro ao salvar uma AdesaoAta" + e.getMessage());
            tx.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void excluirAdesaoAta(AdesaoAta adesao) {
        try {
            tx.begin();
            em.remove(adesao);
            tx.commit();
        } catch(Exception e) {
            System.out.print("Erro ao excluir uma AdesaoAta" + e.getMessage());
            tx.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void atualizarAdesaoAta(AdesaoAta adesao) {
        try {
            tx.begin();
            em.merge(adesao);
            tx.commit();
        } catch(Exception e) {
            System.out.print("Erro ao atualizar uma AdesaoAta" + e.getMessage());
            tx.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public AdesaoAta buscarAdesaoAtaPorId(Integer id) {
        Query q = em.createQuery("select a from AdesaoAta a where a.id = :id", AdesaoAta.class);
        q.setParameter("id", id);
        AdesaoAta adesao = (AdesaoAta) q.getSingleResult();
        
        return adesao;
    }

    @Override
    public AdesaoAta buscarAdesaoAtaPorNumeroAdesaoAta(String numero) {
        Query q = em.createQuery("select a from AdesaoAta a where a.numeroAdesaoNaAta = :numero", AdesaoAta.class);
        q.setParameter("numero", numero);
        AdesaoAta adesao = (AdesaoAta) q.getSingleResult();
        
        return adesao;
    }

    @SuppressWarnings("unchecked")
	@Override
    public List<AdesaoAta> buscarAdesaoAtaPorAtaLicitacao(AtaLicitacao ata) {
        Query q = em.createQuery("select a from AdesaoAta a where a.ataLicitacao = :ata", AdesaoAta.class);
        q.setParameter("ata", ata);
        List<AdesaoAta> adesoes = q.getResultList();
        
        return adesoes;
    }

    @SuppressWarnings("unchecked")
	@Override
    public List<AdesaoAta> listar() {
        Query q = em.createQuery("select a from AdesaoAta a", AdesaoAta.class);
        List<AdesaoAta> adesoes = q.getResultList();
        
        return adesoes;
    }
}
