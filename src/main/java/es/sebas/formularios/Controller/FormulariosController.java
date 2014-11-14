package es.sebas.formularios.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.sebas.formularios.Entity.Hoc;
import es.sebas.formularios.Service.HocService;

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

	@RequestMapping(value="/hoc", method = RequestMethod.POST)
	public String suscribeHoc(@ModelAttribute("hoc") Hoc hoc) {
		HocService.save(hoc);
		return "hocform";
	}
	
	
}
