package es.sebas.formularios.Controller;

import java.security.Principal;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.sebas.formularios.Entity.Hoc;
import es.sebas.formularios.Service.HocFormService;
import es.sebas.formularios.Service.UsuarioService;

@Controller
public class FormulariosController {

	@Autowired
	private HocFormService hocFormService;

	@Autowired
	private UsuarioService usuarioService;

	@ModelAttribute("hoc")
	public Hoc contructHoc() {
		return new Hoc();
	}

	@RequestMapping("/hoc")
	public String showHocForm(Principal principal) {
		System.out.println("entró");
		String vista = "hocform";
		if ((null != principal) && (usuarioService.esAdministrador(principal))) {
			vista = "hocformAdmin";
		}
		return vista;
	}

	@RequestMapping(value = "/hoc", method = RequestMethod.POST)
	public String suscribeHoc(@Valid @ModelAttribute("hoc") Hoc hoc, BindingResult result, Principal principal) {

		if (result.hasErrors()) {
			String vista = "hocform";
			if ((null != principal) && (usuarioService.esAdministrador(principal))) {
				vista = "hocformAdmin";
			}
			return vista;
		}

		hoc.setFechaRegistro(new Date());
		hocFormService.save(hoc);

		String vista = "redirect:/hoc.html?success=true";
		if ((null != principal) && (usuarioService.esAdministrador(principal))) {
			vista = "redirect:/hoc.html?success=true";
		}
		
		hocFormService.enviarEmail(hoc);
		
		return vista;
	}


}
