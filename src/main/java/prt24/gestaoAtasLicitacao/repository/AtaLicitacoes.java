/**
 * 
 */
package prt24.gestaoAtasLicitacao.repository;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import prt24.gestaoAtasLicitacao.model.AtaLicitacao;

/**
 * @author joao
 *
 */

public class AtaLicitacoes implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public AtaLicitacao guardar(AtaLicitacao ataLicitacao) {
		// TODO chamar manager.merge();
		
		return null;
	}
	
	public AtaLicitacao porId(Long id) {
		return manager.find(AtaLicitacao.class, id);
	}
}
