/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt24.gestaoAtasLicitacao.controller;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import prt24.gestaoAtasLicitacao.dao.AtaLicitacaoDAO;
import prt24.gestaoAtasLicitacao.dao.jpa.AtaLicitacaoJpa;
import prt24.gestaoAtasLicitacao.entities.AtaLicitacao;
import prt24.gestaoAtasLicitacao.entities.Item;
import prt24.gestaoAtasLicitacao.util.jsf.JSFMessageUtil;

/**
 *
 * @author joao.guedes
 */
@ManagedBean(name="ataLicitacaoMB")
@RequestScoped
public class AtaLicitacaoMB {
     private String numeroAta;
     private String numeroProcesso;
     private Integer paginaProcesso;
     private String fornecedor;
     private String contato;
     private String objeto;
     private Calendar dataAssinatura;
     private Calendar dataTerminoVigencia;
     
     //Campos do Item no Dialog.
     private String numeroItemNaAta;
     private String descricaoItem;
     private String marcaItem;
     private Integer qtdeRegistradaItem;
     private Integer qtdeDisponivelItem;
     private BigDecimal valorMaximoItem;
     
//     private List<Item> itensAta = new ArrayList<Item>();
//     private Item item = new Item();
//     private ItemDAO daoItem = new ItemJpa();
     
     private AtaLicitacao ataLicitacao;
     private AtaLicitacao ataDialog;
     private final AtaLicitacaoDAO daoAta;
     
     private final JSFMessageUtil messageUtil = new JSFMessageUtil();

    /**
     * Creates a new instance of AtaLicitacaoMB
     */
    public AtaLicitacaoMB() {
        ataLicitacao = new AtaLicitacao();
        ataDialog = new AtaLicitacao();
        daoAta = new AtaLicitacaoJpa();
    }
    
    public void salvar() {
        try {
            ataLicitacao.setNumeroAta(numeroAta);
            ataLicitacao.setNumeroProcesso(numeroProcesso);
            ataLicitacao.setPaginaProcesso(paginaProcesso);
            ataLicitacao.setFornecedor(fornecedor);
            ataLicitacao.setContato(contato);
            ataLicitacao.setObjeto(objeto);
            ataLicitacao.setDataAssinatura(dataAssinatura);
            ataLicitacao.setDataTerminoVigencia(dataAssinatura);
            
            daoAta.salvarAtaLicitacao(ataLicitacao);
            
            messageUtil.sendInfoMessageToUser("Ata de Licita��o no. " + ataLicitacao.getNumeroAta() + " salvo com sucesso!");
        } catch(Exception e) {
            messageUtil.sendErrorMessageToUser("N�o foi poss�vel salvar a ata de licita��o.");
            System.out.println("Erro em salvar " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // Action: add um Item na AtaLicitacao correspondente.
    public void addItemNaAta() {
        try {
            for(Item i : ataLicitacao.getItens()) {
                i.setNumeroItemNaAta(this.numeroItemNaAta);
                i.setDescricao(this.descricaoItem);
                i.setMarca(this.marcaItem);
                i.setQtdeRegistrada(this.qtdeRegistradaItem);
                i.setQtdeDisponivel(qtdeDisponivelItem);
                i.setValorMaximo(valorMaximoItem);
                
                ataLicitacao.getItens().add(i);
                // daoItem.salvarItem(i);
            }
            
            daoAta.atualizarAtaLicitacao(ataLicitacao);
        } catch(Exception e) {
            messageUtil.sendErrorMessageToUser("N�o foi poss�vel adicionar o item a ata de licita��o " + ataLicitacao.getNumeroAta());
            System.out.println("Erro ao add Item pelo Dialog " + e.getMessage() + "\n");
            e.printStackTrace();
        }
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

//    public List<Item> getItensAta() {
//        return itensAta;
//    }
//
//    public void setItensAta(List<Item> itensAta) {
//        this.itensAta = itensAta;
//    }

    public AtaLicitacao getAtaDialog() {
        return ataDialog;
    }

    public void setAtaDialog(AtaLicitacao ataDialog) {
        this.ataDialog = ataDialog;
    }

    public AtaLicitacao getAtaLicitacao() {
        return ataLicitacao;
    }

    public void setAtaLicitacao(AtaLicitacao ataLicitacao) {
        this.ataLicitacao = ataLicitacao;
    }

//    public Item getItem() {
//        return item;
//    }
//
//    public void setItem(Item item) {
//        this.item = item;
//    }

    public String getNumeroItemNaAta() {
        return numeroItemNaAta;
    }

    public void setNumeroItemNaAta(String numeroItemNaAta) {
        this.numeroItemNaAta = numeroItemNaAta;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public String getMarcaItem() {
        return marcaItem;
    }

    public void setMarcaItem(String marcaItem) {
        this.marcaItem = marcaItem;
    }

    public Integer getQtdeRegistradaItem() {
        return qtdeRegistradaItem;
    }

    public void setQtdeRegistradaItem(Integer qtdeRegistradaItem) {
        this.qtdeRegistradaItem = qtdeRegistradaItem;
    }

    public Integer getQtdeDisponivelItem() {
        return qtdeDisponivelItem;
    }

    public void setQtdeDisponivelItem(Integer qtdeDisponivelItem) {
        this.qtdeDisponivelItem = qtdeDisponivelItem;
    }

    public BigDecimal getValorMaximoItem() {
        return valorMaximoItem;
    }

    public void setValorMaximoItem(BigDecimal valorMaximoItem) {
        this.valorMaximoItem = valorMaximoItem;
    }
}
