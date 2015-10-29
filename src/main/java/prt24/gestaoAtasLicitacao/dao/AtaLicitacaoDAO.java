/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt24.gestaoAtasLicitacao.dao;

import java.util.List;
import prt24.gestaoAtasLicitacao.entities.AtaLicitacao;

/**
 *
 * @author joao.guedes
 */
public interface AtaLicitacaoDAO {
    
    public void salvarAtaLicitacao(AtaLicitacao ata);
    public void excluirAtaLicitacao(AtaLicitacao ata);
    public void atualizarAtaLicitacao(AtaLicitacao ata);
    public AtaLicitacao buscarAtaLicitacaoPorId(Integer id);
    public AtaLicitacao buscarAtaLicitacaoPorNumeroAta(String numeroAta);
    public List<AtaLicitacao> listar();
}
