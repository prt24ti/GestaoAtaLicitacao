/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt24.gestaoAtasLicitacao.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author joao.guedes
 */
@Entity
public class AdesaoAta implements Serializable {
	private static final long serialVersionUID = 1L;
	
    @ManyToOne
    private AtaLicitacao ataLicitacao;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String numeroAdesaoNaAta;
    private String orgao;
    private Boolean aprovacaoMpt;
    private Integer qtdeAdesaoDisponivel;
    @SuppressWarnings("unused")
	private static final Integer qtdeMaximaAdesao = 5;
    private String motivoNaoAprovacao;
    private Integer qtdeItensAutorizados;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AtaLicitacao getAtaLicitacao() {
        return ataLicitacao;
    }

    public void setAtaLicitacao(AtaLicitacao ataLicitacao) {
        this.ataLicitacao = ataLicitacao;
    }

    public String getNumeroAdesaoNaAta() {
        return numeroAdesaoNaAta;
    }

    public void setNumeroAdesaoNaAta(String numeroAdesaoNaAta) {
        this.numeroAdesaoNaAta = numeroAdesaoNaAta;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public Boolean getAprovacaoMpt() {
        return aprovacaoMpt;
    }

    public void setAprovacaoMpt(Boolean aprovacaoMpt) {
        this.aprovacaoMpt = aprovacaoMpt;
    }

    public Integer getQtdeAdesaoDisponivel() {
        return qtdeAdesaoDisponivel;
    }

    public void setQtdeAdesaoDisponivel(Integer qtdeAdesaoDisponivel) {
        this.qtdeAdesaoDisponivel = qtdeAdesaoDisponivel;
    }

    public String getMotivoNaoAprovacao() {
        return motivoNaoAprovacao;
    }

    public void setMotivoNaoAprovacao(String motivoNaoAprovacao) {
        this.motivoNaoAprovacao = motivoNaoAprovacao;
    }

    public Integer getQtdeItensAutorizados() {
        return qtdeItensAutorizados;
    }

    public void setQtdeItensAutorizados(Integer qtdeItensAutorizados) {
        this.qtdeItensAutorizados = qtdeItensAutorizados;
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
        if (!(object instanceof AdesaoAta)) {
            return false;
        }
        AdesaoAta other = (AdesaoAta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "prt24.gestaoAtasLicitacao.entities.AdesaoAta[ id=" + id + " ]";
    }
    
}
