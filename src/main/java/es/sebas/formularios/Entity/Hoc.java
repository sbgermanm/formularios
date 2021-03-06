package es.sebas.formularios.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;


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
	
	@NotNull
	@Size(min = 2, max=256,  message = "El nombre debe tener al menos 2 caracteres")
	private String nombreNino;
	
	@NotNull
	@Size(min = 2, max=256,  message = "El nombre debe tener al menos 2 caracteres")
	private String nombrePadre;
	
	@NotNull(message = "Debe indicar si traera portatil")
	private Boolean portatil;
	
	@Transient
	private String portatilTexto;
	



	@NotNull
	@Digits(integer=2, fraction=0, message = "La edad debe estar entre 0 y 99")
	private Integer edad;
	
	@NotNull(message = "Es necesario indicar un email")
	@Email
	private String email;
	
	@Pattern(regexp="(^$|[0-9]{9})", message = "Debe escribir un numero de tel�fono v�lido")
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
		setPortatilTexto(portatil ? "Si" : "No");
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
	
	public String getPortatilTexto() {
		return portatilTexto;
	}


	public void setPortatilTexto(String portatilTexto) {
		this.portatilTexto = portatilTexto;
	}
	
	
}
