/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt24.gestaoAtasLicitacao.controller;

import java.util.Calendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author joao.guedes
 */
@ManagedBean
@SessionScoped
public class PedidoMB {
    private String numeroAtaLicitacao;
    private String numeroPedido;
    private Calendar dataPedido;
    private Integer quantidade;
    
    /**
     * Creates a new instance of PedidoMB
     */
    public PedidoMB() {
        
    }
    
    // Actions aqui!!!

    public String getNumeroAtaLicitacao() {
        return numeroAtaLicitacao;
    }

    public void setNumeroAtaLicitacao(String numeroAtaLicitacao) {
        this.numeroAtaLicitacao = numeroAtaLicitacao;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Calendar getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Calendar dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
