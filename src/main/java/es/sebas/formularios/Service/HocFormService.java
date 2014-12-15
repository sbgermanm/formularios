package es.sebas.formularios.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import es.sebas.formularios.Entity.Hoc;
import es.sebas.formularios.Helper.EnvioCorreo;
import es.sebas.formularios.Helper.EnvioCorreoImpl;
import es.sebas.formularios.Repository.HocRepository;

@Service
@Transactional
public class HocFormService {
	
	
	@Autowired
	private HocRepository hocRepository;
	
	@Autowired
	private EnvioCorreo envioCorreo;
	
	
	public void save(Hoc hocform){
		hocRepository.save(hocform);
	}


	public List<Hoc> damelosTodos() {
		
		return hocRepository.findAll();
	}


	public void enviarEmail(Hoc hoc) {
		String from = "ApaFilipense";
		String subject = "Registro taller HOC realizado con exito";
		String body = "" + 
					  "Registro taller HOC realizado con exito." + System.lineSeparator() +
					  "" + System.lineSeparator() +
				      "              Datos recogidos" + System.lineSeparator() +
					  "----------------------------------------" + System.lineSeparator() +
				      "Nombre niño: " + hoc.getNombreNino() + System.lineSeparator() +
				      "Edad niño: " + hoc.getEdad() + System.lineSeparator() +
				      "Curso: " + hoc.getCurso() + System.lineSeparator() +
				      "Nombre papa: " + hoc.getNombrePadre() + System.lineSeparator() +
				      "Portatil: " + (hoc.getPortatil() ? "Si" : "No" )   + System.lineSeparator() + 
				      "Email: " + hoc.getEmail() + System.lineSeparator() +
				      "Telefono: " + hoc.getTelefono() + System.lineSeparator() +
					  "" + System.lineSeparator() +
					  "Nos vemos en el taller" + System.lineSeparator() +
					  "Un saludo," + System.lineSeparator() +
					  "Apafilipense." + System.lineSeparator() +
				      "";
		envioCorreo.sendMail(from, hoc.getEmail(), subject, body);
		envioCorreo.sendMail(from, hoc.getEmail(), subject, body);

	}
}
