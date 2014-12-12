package es.sebas.formularios.Helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class EnvioCorreoImpl implements EnvioCorreo {

//	private MailSender mailSender;

//	public void setMailSender(MailSender mailSender) {
//		this.mailSender = mailSender;
//	}
	
	
//	http://www.codejava.net/frameworks/spring/sending-e-mail-with-spring-mvc
//	http://www.mkyong.com/spring/spring-sending-e-mail-via-gmail-smtp-server-with-mailsender/
	
	@Autowired
	private MailSender mailSender;

	@Override
	public void sendMail(String from, String to, String subject, String msg) {

		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom(from);
		message.setTo(to);
		message.setSubject(subject);
		message.setText(msg);
		mailSender.send(message);
	}
}
