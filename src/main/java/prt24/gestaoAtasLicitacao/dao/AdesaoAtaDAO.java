/**
 * 
 */
package prt24.gestaoAtasLicitacao.dao;

import java.util.List;

import prt24.gestaoAtasLicitacao.entities.AdesaoAta;
import prt24.gestaoAtasLicitacao.entities.AtaLicitacao;

/**
 * @author joao.guedes
 *
 */

public interface AdesaoAtaDAO {
	    
	public void salvarAdesaoAta(AdesaoAta adesao);
	public void excluirAdesaoAta(AdesaoAta adesao);
	public void atualizarAdesaoAta(AdesaoAta adesao);
	public AdesaoAta buscarAdesaoAtaPorId(Integer id);
	public AdesaoAta buscarAdesaoAtaPorNumeroAdesaoAta(String numero);
	public List<AdesaoAta> buscarAdesaoAtaPorAtaLicitacao(AtaLicitacao ata);
	public List<AdesaoAta> listar();	
}
