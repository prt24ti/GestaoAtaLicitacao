/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt24.gestaoAtasLicitacao.util.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

/**
 *
 * @author joao.guedes
 */
public class JSFMessageUtil {
    public void sendInfoMessageToUser(String message) {
        FacesMessage facesMessage = createMessage(FacesMessage.SEVERITY_INFO, message);
        addMessageToJsfContext(facesMessage);
    }
    
    public void sendWarnMessageToUser(String message) {
        FacesMessage facesMessage = createMessage(FacesMessage.SEVERITY_WARN, message);
        addMessageToJsfContext(facesMessage);
    }
    
    public void sendErrorMessageToUser(String message) {
        FacesMessage facesMessage = createMessage(FacesMessage.SEVERITY_ERROR, message);
        addMessageToJsfContext(facesMessage);
    }
    
    public void sendFatalMessageToUser(String message) {
        FacesMessage facesMessage = createMessage(FacesMessage.SEVERITY_FATAL, message);
        addMessageToJsfContext(facesMessage);
    }
    
    public FacesMessage createMessage(Severity severity, String mensagemErro) {
        return new FacesMessage(severity, mensagemErro, mensagemErro);
    }
    
    public void addMessageToJsfContext(FacesMessage facesMessage) {
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
    }
}
