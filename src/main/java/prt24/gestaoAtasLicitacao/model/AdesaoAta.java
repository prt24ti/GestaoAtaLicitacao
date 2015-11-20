/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt24.gestaoAtasLicitacao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author joao.guedes
 */

@Entity
@Table(name = "adesao_ata")
public class AdesaoAta implements Serializable {
	
	public static final Integer QUANTIDADE_MAXIMA_ADESAO = 5;
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String numeroAdesaoNaAta;
	private String orgao;
	private Boolean aprovacaoMpt;
	private Integer quantidadeAdesaoDisponivel;
	private String motivoNaoAprovacao;
	private Integer quantidadeItensAutorizados;
	private AtaLicitacao ataLicitacao;

	/**
	 * @return the id
	 */
	
	@Id
	@GeneratedValue
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
	 * @return the numeroAdesaoNaAta
	 */
	public String getNumeroAdesaoNaAta() {
		return numeroAdesaoNaAta;
	}

	/**
	 * @param numeroAdesaoNaAta
	 *            the numeroAdesaoNaAta to set
	 */
	public void setNumeroAdesaoNaAta(String numeroAdesaoNaAta) {
		this.numeroAdesaoNaAta = numeroAdesaoNaAta;
	}

	/**
	 * @return the orgao
	 */
	public String getOrgao() {
		return orgao;
	}

	/**
	 * @param orgao
	 *            the orgao to set
	 */
	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}

	/**
	 * @return the aprovacaoMpt
	 */
	public Boolean getAprovacaoMpt() {
		return aprovacaoMpt;
	}

	/**
	 * @param aprovacaoMpt
	 *            the aprovacaoMpt to set
	 */
	public void setAprovacaoMpt(Boolean aprovacaoMpt) {
		this.aprovacaoMpt = aprovacaoMpt;
	}

	/**
	 * @return the quantidadeAdesaoDisponivel
	 */
	public Integer getQuantidadeAdesaoDisponivel() {
		return quantidadeAdesaoDisponivel;
	}

	/**
	 * @param quantidadeAdesaoDisponivel
	 *            the quantidadeAdesaoDisponivel to set
	 */
	public void setQuantidadeAdesaoDisponivel(Integer quantidadeAdesaoDisponivel) {
		this.quantidadeAdesaoDisponivel = quantidadeAdesaoDisponivel;
	}

	/**
	 * @return the motivoNaoAprovacao
	 */
	public String getMotivoNaoAprovacao() {
		return motivoNaoAprovacao;
	}

	/**
	 * @param motivoNaoAprovacao
	 *            the motivoNaoAprovacao to set
	 */
	public void setMotivoNaoAprovacao(String motivoNaoAprovacao) {
		this.motivoNaoAprovacao = motivoNaoAprovacao;
	}

	/**
	 * @return the quantidadeItensAutorizados
	 */
	public Integer getQuantidadeItensAutorizados() {
		return quantidadeItensAutorizados;
	}

	/**
	 * @param quantidadeItensAutorizados
	 *            the quantidadeItensAutorizados to set
	 */
	public void setQuantidadeItensAutorizados(Integer quantidadeItensAutorizados) {
		this.quantidadeItensAutorizados = quantidadeItensAutorizados;
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
		AdesaoAta other = (AdesaoAta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
