/**
 * 
 */
package prt24.gestaoAtasLicitacao.controller;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import prt24.gestaoAtasLicitacao.model.AtaLicitacao;

/**
 * @author joao
 *
 */

@Named
@ViewScoped
public class CadastroAtaLicitacaoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private AtaLicitacao ataLicitacao;

	public void salvar() {

	}

	/**
	 * @return the ataLicitacao
	 */
	public AtaLicitacao getAtaLicitacao() {
		return ataLicitacao;
	}

	/**
	 * @param ataLicitacao
	 *            the ataLicitacao to set
	 */
	public void setAtaLicitacao(AtaLicitacao ataLicitacao) {
		this.ataLicitacao = ataLicitacao;
	}

}
