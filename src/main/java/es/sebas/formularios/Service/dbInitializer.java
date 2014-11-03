package es.sebas.formularios.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sebas.formularios.Entity.Usuario;
import es.sebas.formularios.Repository.UsuarioRepository;

@Service
@Transactional
public class dbInitializer {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostConstruct
	public void init()
	{
		Usuario user = new Usuario("sebas", "sebas");
		usuarioRepository.save(user);
	}
	
}
