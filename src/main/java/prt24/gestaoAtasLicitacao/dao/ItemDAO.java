/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt24.gestaoAtasLicitacao.dao;

import java.util.List;
import prt24.gestaoAtasLicitacao.entities.AtaLicitacao;
import prt24.gestaoAtasLicitacao.entities.Item;

/**
 *
 * @author joao.guedes
 */
public interface ItemDAO {
    
    public void salvarItem(Item item);
    public void excluirItem(Item item);
    public void atualizarItem(Item item);
    public Item buscarItemPorId(Integer id);
    public Item buscarItemPorNumeroItemNaAta(String numeroItem);
    public List<Item> buscarItemPorDescricao(String descricao);
    public List<Item> buscarItensPorAtaLicitacao(AtaLicitacao ata);
    public List<Item> listar();
}
