/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt24.gestaoAtasLicitacao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author joao.guedes
 */

@Entity
@Table(name = "ata_licitacao")
public class AtaLicitacao implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String numeroAta;
	private String numeroProcesso;
	private Integer paginaProcesso;
	private String objeto;
	private Calendar dataAssinatura;
	private Calendar dataTerminoVigencia;
	private List<Pedido> pedidos;
	private List<Item> itens;
	private List<AdesaoAta> adesoes;

	public AtaLicitacao() {
		this.pedidos = new ArrayList<Pedido>();
		this.itens = new ArrayList<Item>();
		this.adesoes = new ArrayList<AdesaoAta>();
	}

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
	 * @return the numeroAta
	 */
	public String getNumeroAta() {
		return numeroAta;
	}

	/**
	 * @param numeroAta
	 *            the numeroAta to set
	 */
	public void setNumeroAta(String numeroAta) {
		this.numeroAta = numeroAta;
	}

	/**
	 * @return the numeroProcesso
	 */
	public String getNumeroProcesso() {
		return numeroProcesso;
	}

	/**
	 * @param numeroProcesso
	 *            the numeroProcesso to set
	 */
	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	/**
	 * @return the paginaProcesso
	 */
	public Integer getPaginaProcesso() {
		return paginaProcesso;
	}

	/**
	 * @param paginaProcesso
	 *            the paginaProcesso to set
	 */
	public void setPaginaProcesso(Integer paginaProcesso) {
		this.paginaProcesso = paginaProcesso;
	}

	/**
	 * @return the objeto
	 */
	public String getObjeto() {
		return objeto;
	}

	/**
	 * @param objeto
	 *            the objeto to set
	 */
	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	/**
	 * @return the dataAssinatura
	 */
	public Calendar getDataAssinatura() {
		return dataAssinatura;
	}

	/**
	 * @param dataAssinatura
	 *            the dataAssinatura to set
	 */
	public void setDataAssinatura(Calendar dataAssinatura) {
		this.dataAssinatura = dataAssinatura;
	}

	/**
	 * @return the dataTerminoVigencia
	 */
	public Calendar getDataTerminoVigencia() {
		return dataTerminoVigencia;
	}

	/**
	 * @param dataTerminoVigencia
	 *            the dataTerminoVigencia to set
	 */
	public void setDataTerminoVigencia(Calendar dataTerminoVigencia) {
		this.dataTerminoVigencia = dataTerminoVigencia;
	}

	/**
	 * @return the pedidos
	 */
	public List<Pedido> getPedidos() {
		return pedidos;
	}

	/**
	 * @param pedidos
	 *            the pedidos to set
	 */
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	/**
	 * @return the itens
	 */
	public List<Item> getItens() {
		return itens;
	}

	/**
	 * @param itens
	 *            the itens to set
	 */
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	/**
	 * @return the adesoes
	 */
	public List<AdesaoAta> getAdesoes() {
		return adesoes;
	}

	/**
	 * @param adesoes
	 *            the adesoes to set
	 */
	public void setAdesoes(List<AdesaoAta> adesoes) {
		this.adesoes = adesoes;
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
		AtaLicitacao other = (AtaLicitacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
