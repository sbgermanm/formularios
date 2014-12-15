package es.sebas.formularios.Helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class EnvioCorreoImpl implements EnvioCorreo {

	// http://www.codejava.net/frameworks/spring/sending-e-mail-with-spring-mvc
	// http://www.mkyong.com/spring/spring-sending-e-mail-via-gmail-smtp-server-with-mailsender/
	// http://examples.javacodegeeks.com/enterprise-java/spring/mail-spring/spring-e-mail-support-gmail-smtp-server-example/

	@Autowired
	private MailSender mailSender;

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	@Override
	public void sendMail(String origen, String to, String subject, String msg) {

		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom(origen);
		message.setReplyTo(((JavaMailSenderImpl)mailSender).getUsername());
		message.setTo(to);
		message.setSubject(subject);
		message.setText(msg);
		mailSender.send(message);
	}
}
