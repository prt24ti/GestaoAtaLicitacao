/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt24.gestaoAtasLicitacao.dao;

import java.util.List;
import prt24.gestaoAtasLicitacao.entities.AtaLicitacao;
import prt24.gestaoAtasLicitacao.entities.Pedido;

/**
 *
 * @author joao.guedes
 */
public interface PedidoDAO {
    
    public void salvarPedido(Pedido pedido);
    public void excluirPedido(Pedido pedido);
    public void atualizarPedido(Pedido pedido);
    public Pedido buscarPedidoPorId(Integer id);
    public Pedido buscarPedidoPorNumeroPedido(String numeroPedido);
    public List<Pedido> buscarPedidoPorAtaLicitacao(AtaLicitacao ata);
    public List<Pedido> listar();
}
