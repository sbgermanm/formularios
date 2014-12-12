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
	
	
	public void save(Hoc hocform){
		hocRepository.save(hocform);
	}


	public List<Hoc> damelosTodos() {
		
		return hocRepository.findAll();
	}


	public void enviarEmail(Hoc hoc) {
		EnvioCorreo envioCorreo = new EnvioCorreoImpl();
		envioCorreo.sendMail("apaFilipense", hoc.getEmail(), "registro talle HOC realizado con exito", "registro talle HOC realizado con exito");
	}
}
