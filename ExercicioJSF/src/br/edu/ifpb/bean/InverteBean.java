package br.edu.ifpb.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifpb.entidade.Inverte;

@RequestScoped
@ManagedBean
public class InverteBean {
	
	private Inverte inverte;
	
	public InverteBean(){
		this.inverte = new Inverte();
	}

	public Inverte getInverte() {
		return inverte;
	}

	public void setInverte(Inverte inverte) {
		this.inverte = inverte;
	}
	
	public String inverter(){
		
		String aux;
		
		aux=inverte.getCampo1();
		inverte.setCampo1(inverte.getCampo2());
		inverte.setCampo2(aux);		
		
		return null;
	}
}
