/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt24.gestaoAtasLicitacao.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author joao.guedes
 */
@Entity
public class AtaLicitacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String numeroAta;
    private String numeroProcesso;
    private Integer paginaProcesso;
    private String fornecedor;
    private String contato;
    private String objeto;
    
    @Temporal(TemporalType.DATE)
    private Calendar dataAssinatura;
    
    @Temporal(TemporalType.DATE)
    private Calendar dataTerminoVigencia;
    
    @OneToMany(mappedBy = "ataLicitacao")
    private List<Pedido> pedidos;
    
    @OneToMany(mappedBy = "ataLicitacao")
    private List<Item> itens;
    
    @OneToMany(mappedBy = "ataLicitacao")
    private List<AdesaoAta> adesoes;
    
    public AtaLicitacao() {
    	this.pedidos = new ArrayList<Pedido>();
    	this.itens = new ArrayList<Item>();
    	this.adesoes = new ArrayList<AdesaoAta>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroAta() {
        return numeroAta;
    }

    public void setNumeroAta(String numeroAta) {
        this.numeroAta = numeroAta;
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public Integer getPaginaProcesso() {
        return paginaProcesso;
    }

    public void setPaginaProcesso(Integer paginaProcesso) {
        this.paginaProcesso = paginaProcesso;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public Calendar getDataAssinatura() {
        return dataAssinatura;
    }

    public void setDataAssinatura(Calendar dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

    public Calendar getDataTerminoVigencia() {
        return dataTerminoVigencia;
    }

    public void setDataTerminoVigencia(Calendar dataTerminoVigencia) {
        this.dataTerminoVigencia = dataTerminoVigencia;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public List<AdesaoAta> getAdesoes() {
        return adesoes;
    }

    public void setAdesoes(List<AdesaoAta> adesoes) {
        this.adesoes = adesoes;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtaLicitacao)) {
            return false;
        }
        AtaLicitacao other = (AtaLicitacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "prt24.gestaoAtasLicitacao.entities.AtaLicitacao[ id=" + id + " ]";
    }
    
}
