package es.sebas.formularios.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import es.sebas.formularios.Entity.Hoc;
import es.sebas.formularios.Service.HocFormService;

@Controller
public class AdminController {

	@Autowired
	private HocFormService hocFormService;
	
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/resumen")
	public String resumen(Model modelo){
		recuperaApuntadosTallerProgramacion(modelo);
		return "resumen";
	}


	@RequestMapping("/taller_programacion")
	public String prog(Model modelo){
		recuperaApuntadosTallerProgramacion(modelo);
		return "prog";
	}

	private void recuperaApuntadosTallerProgramacion(Model modelo) {
		List<Hoc> apuntadosProg = hocFormService.damelosTodos(); 
		modelo.addAttribute("apuntadoProg", apuntadosProg);
	}


	
}
