/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt24.gestaoAtasLicitacao.util.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author joao.guedes
 */
public class JPAUtil {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestaoAtasLicitacoesPrt24PU");
    
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
