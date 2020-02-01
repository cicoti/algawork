package com.algaworks.algafood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;


@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
@Profile("dev")
public class NotificadorEmailMOCK implements Notificador {

	//teste
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("MOCK: Notificando %s através do e-mail  %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}