/**
 * 
 */
package prt24.gestaoAtasLicitacao.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import prt24.gestaoAtasLicitacao.model.AtaLicitacao;
import prt24.gestaoAtasLicitacao.model.Fornecedor;
import prt24.gestaoAtasLicitacao.repository.AtaLicitacoes;

/**
 * @author joao
 *
 */

@FacesConverter(forClass = Fornecedor.class)
public class FornecedorConverter implements Converter {
	
	@Inject
	private AtaLicitacoes atas;

	/* (non-Javadoc)
	 * @see javax.faces.convert.Converter#getAsObject(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.String)
	 */
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		AtaLicitacao retorno = null;
		
		if(value != null && !value.isEmpty()) {
			retorno = this.atas.porId(new Long(value));
		}
		
		return retorno;
	}

	/* (non-Javadoc)
	 * @see javax.faces.convert.Converter#getAsString(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.Object)
	 */
	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null) {
			AtaLicitacao ata = (AtaLicitacao) value;
			return ata.getId() == null ? null : ata.getId().toString();
		}
		
		return "";
	}

}
