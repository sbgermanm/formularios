package es.sebas.formularios.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.sebas.formularios.Entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	Usuario findByNombre(String name);

}
