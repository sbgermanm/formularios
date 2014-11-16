package es.sebas.formularios.Service;

import java.security.Principal;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sebas.formularios.Entity.Usuario;
import es.sebas.formularios.Repository.UsuarioRepository;


@Service
@Transactional
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public boolean esAdministrador(Principal principal) {
		String name = principal.getName();
		Usuario usuario = usuarioRepository.findByNombre(name);
		return usuario.getRol().equals(Usuario.ADMINISTRADOR);
	}
	
}
