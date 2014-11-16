package es.sebas.formularios.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Hoc {

	public Date getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	@Id
	@GeneratedValue
	private Integer Id;
	
	
	private String nombreNino;

	private String nombrePadre;
	private Boolean portatil;
	private Integer edad;
	private String email;
	private String telefono;
	private String curso;
	@Column(name="fecha_registro")
	private Date fechaRegistro;

	
	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


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
