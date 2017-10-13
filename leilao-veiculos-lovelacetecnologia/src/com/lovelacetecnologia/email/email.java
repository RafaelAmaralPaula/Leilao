package com.lovelacetecnologia.email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class email {

	public void enviar(String para, String assunto, String mensagem) throws EmailException {

		Email email = new SimpleEmail();

		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator(" rafaelpachecoipda@gmail.com ", "mapa12345"));
		email.setSSLOnConnect(true);
		email.setFrom("rafael@lovelacetecnologia.com");
		email.setSubject(assunto);
		email.setMsg(mensagem);
		email.addTo(para);
		email.send();

	}
}
