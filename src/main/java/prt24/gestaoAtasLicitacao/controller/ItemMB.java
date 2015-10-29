/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt24.gestaoAtasLicitacao.controller;

import java.math.BigDecimal;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author joao.guedes
 */
@ManagedBean(name="itemMB")
@SessionScoped
public class ItemMB {
    private String numeroAtaLicitacao;
    private String numeroItemNaAta;
    private String descricao;
    private String marca;
    private Integer qtdeRegistrada;
    private Integer qtdeDisponivel;
    private BigDecimal valorMaximo;

    /**
     * Creates a new instance of ItemMB
     */
    public ItemMB() {
        
    }
    
    // Actions Aqui.

    public String getNumeroAtaLicitacao() {
        return numeroAtaLicitacao;
    }

    public void setNumeroAtaLicitacao(String numeroAtaLicitacao) {
        this.numeroAtaLicitacao = numeroAtaLicitacao;
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
}
