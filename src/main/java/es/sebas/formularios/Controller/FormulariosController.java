package es.sebas.formularios.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormulariosController {

	
	@RequestMapping("/hoc")
	public String showHocForm(){
		return "hoc-form";
	}
	
}
