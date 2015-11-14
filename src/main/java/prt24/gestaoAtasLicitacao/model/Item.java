/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt24.gestaoAtasLicitacao.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author joao.guedes
 */

@Entity
@Table(name = "item")
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String numeroItemNaAta;
	private String descricao;
	private String marca;
	private Integer quantidadeRegistrada;
	private Integer quantidadeDisponivel;
	private BigDecimal valorMaximo;

	/**
	 * @return the id
	 */

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the numeroItemNaAta
	 */
	public String getNumeroItemNaAta() {
		return numeroItemNaAta;
	}

	/**
	 * @param numeroItemNaAta
	 *            the numeroItemNaAta to set
	 */
	public void setNumeroItemNaAta(String numeroItemNaAta) {
		this.numeroItemNaAta = numeroItemNaAta;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 *            the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca
	 *            the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the quantidadeRegistrada
	 */
	public Integer getQuantidadeRegistrada() {
		return quantidadeRegistrada;
	}

	/**
	 * @param quantidadeRegistrada
	 *            the quantidadeRegistrada to set
	 */
	public void setQuantidadeRegistrada(Integer qtdeRegistrada) {
		this.quantidadeRegistrada = qtdeRegistrada;
	}

	/**
	 * @return the quantidadeDisponivel
	 */
	public Integer getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}

	/**
	 * @param quantidadeDisponivel
	 *            the quantidadeDisponivel to set
	 */
	public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}

	/**
	 * @return the valorMaximo
	 */
	public BigDecimal getValorMaximo() {
		return valorMaximo;
	}

	/**
	 * @param valorMaximo
	 *            the valorMaximo to set
	 */
	public void setValorMaximo(BigDecimal valorMaximo) {
		this.valorMaximo = valorMaximo;
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
		Item other = (Item) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
