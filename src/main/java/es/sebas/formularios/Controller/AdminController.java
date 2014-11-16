package es.sebas.formularios.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/resumen")
	public String resumen(){
		return "resumen";
	}

	@RequestMapping("/taller_programacion")
	public String prog(){
		return "prog";
	}


	
}
