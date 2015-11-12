/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt24.gestaoAtasLicitacao.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class Item implements Serializable {
    @ManyToOne
    private AtaLicitacao ataLicitacao;
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String numeroItemNaAta;
    private String descricao;
    private String marca;
    private Integer qtdeRegistrada;
    private Integer qtdeDisponivel;
    private BigDecimal valorMaximo;
    

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

    public String getNumeroItemNaAta() {
        return numeroItemNaAta;
    }

    public void setNumeroItemNaAta(String numeroItemNaAta) {
        this.numeroItemNaAta = numeroItemNaAta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getQtdeRegistrada() {
        return qtdeRegistrada;
    }

    public void setQtdeRegistrada(Integer qtdeRegistrada) {
        this.qtdeRegistrada = qtdeRegistrada;
    }

    public Integer getQtdeDisponivel() {
        return qtdeDisponivel;
    }

    public void setQtdeDisponivel(Integer qtdeDisponivel) {
        this.qtdeDisponivel = qtdeDisponivel;
    }

    public BigDecimal getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(BigDecimal valorMaximo) {
        this.valorMaximo = valorMaximo;
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
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "prt24.gestaoAtasLicitacao.entities.Item[ id=" + id + " ]";
    }
    
}
