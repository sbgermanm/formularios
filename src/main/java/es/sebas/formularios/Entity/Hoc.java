package es.sebas.formularios.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Hoc {

	@Id
	@GeneratedValue
	private Integer Id;
	
	
	private String nombreNino;

	private String nombrePadre;
	private Boolean portatil;
	private Integer edad;
	private String email;

	
	public String getNombreNino() {
		return nombreNino;
	}


	public void setNombreNino(String nombreNino) {
		this.nombreNino = nombreNino;
	}


	public Integer getId() {
		return Id;
	}


	public String getNombrePadre() {
		return nombrePadre;
	}


	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}


	public Boolean getPortatil() {
		return portatil;
	}


	public void setPortatil(Boolean portatil) {
		this.portatil = portatil;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
