package es.sebas.formularios.Service;


public interface EnvioCorreo {

	void sendMail(String from, String to, String subject, String msg);  

}
