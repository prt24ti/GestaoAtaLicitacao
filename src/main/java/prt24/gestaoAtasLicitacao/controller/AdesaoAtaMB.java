/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt24.gestaoAtasLicitacao.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author joao.guedes
 */
@ManagedBean
@SessionScoped
public class AdesaoAtaMB {
    private String numeroAtaLicitacao;
    private String numeroAdesaoNaAta;
    private String orgao;
    private Boolean aprovacaoMpt;
    private String qtdeAdesaoDisponiveis;
    @SuppressWarnings("unused")
	private static final Integer qtdeMaxAdesao = 5;
    private String motivoNaoAprovacao;
    private Integer qtdeItensAutorizados;
    
    /**
     * Creates a new instance of AdesaoAtaMB
     */
    public AdesaoAtaMB() {
        
    }
    
    // Actions aqui!!!

    public String getNumeroAtaLicitacao() {
        return numeroAtaLicitacao;
    }

    public void setNumeroAtaLicitacao(String numeroAtaLicitacao) {
        this.numeroAtaLicitacao = numeroAtaLicitacao;
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

    public String getQtdeAdesaoDisponiveis() {
        return qtdeAdesaoDisponiveis;
    }

    public void setQtdeAdesaoDisponiveis(String qtdeAdesaoDisponiveis) {
        this.qtdeAdesaoDisponiveis = qtdeAdesaoDisponiveis;
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
    
    
}
