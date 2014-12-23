package es.sebas.formularios.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.velocity.VelocityEngineUtils;

import es.sebas.formularios.Entity.Hoc;
import es.sebas.formularios.Repository.HocRepository;

@Service
@Transactional
public class HocFormService {
	
	private static final String VM_FILE = "velocity/hoc.vm";
	private static final String VM_BIND_OBJECT_KEY = "mensaje";
	
	
	@Autowired
	private HocRepository hocRepository;
	
	@Autowired
	private EnvioCorreoImpl envioCorreo;
	
	@Autowired
	private VelocityEngine velocityEngine;


	
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

	}



	public void enviarPreparedEmail(Hoc hoc) {
		String from = "ApaFilipense";
		String subject = "Registro taller HOC realizado con exito";

		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put(VM_BIND_OBJECT_KEY, hoc);
		String text = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, VM_FILE, "UTF-8", model);
		envioCorreo.sendPreparedMail(from, hoc.getEmail(), subject, text);

	}


}
