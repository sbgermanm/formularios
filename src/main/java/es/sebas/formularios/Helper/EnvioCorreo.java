package es.sebas.formularios.Helper;


public interface EnvioCorreo {

	void sendMail(String from, String to, String subject, String msg);  

}
