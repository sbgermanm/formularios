package es.sebas.formularios.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import es.sebas.formularios.Entity.Hoc;

@Controller
public class FormulariosController {

	@ModelAttribute("hoc")
	public Hoc contructHoc() {
		return new Hoc();
	}

	@RequestMapping("/hoc")
	public String showHocForm() {
		System.out.println("entró");

		return "hocform";
	}

}
