package es.sebas.formularios.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import es.sebas.formularios.Entity.Usuario;
import es.sebas.formularios.Repository.UsuarioRepository;

@Service
@Transactional
public class DbInitializer {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostConstruct
	public void init()
	{
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); 
		Usuario user = new Usuario("sebas", encoder.encode("sebas"), "ADMINISTRADOR", true);
		
		usuarioRepository.save(user);
	}
	
}
