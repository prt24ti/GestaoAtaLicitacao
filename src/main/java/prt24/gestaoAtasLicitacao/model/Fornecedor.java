/**
 * 
 */
package prt24.gestaoAtasLicitacao.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author joao
 *
 */

public class Fornecedor implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String cnpj;
	private String telefone;
	private List<Contato> contatos;
	private List<Endereco> endereco;
	private AtaLicitacao ataLicitacao;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj
	 *            the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone
	 *            the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the contatos
	 */
	public List<Contato> getContatos() {
		return contatos;
	}

	/**
	 * @param contatos
	 *            the contatos to set
	 */
	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	/**
	 * @return the endereco
	 */
	public List<Endereco> getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco
	 *            the endereco to set
	 */
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
