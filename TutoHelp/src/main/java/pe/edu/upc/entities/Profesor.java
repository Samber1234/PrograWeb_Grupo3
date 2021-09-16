package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Profesor")
public class Profesor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int profesorid;
	
	@Column(name = "profesornombre",nullable = false,length = 15)
	private String profesornombre;

	@Column(name = "profesorapellido",nullable = false,length = 15)
	private String profesorapellido;

	@Column(name = "universidad",nullable = false,length = 30)
	private String universidad;
	
	@Column(name = "curso",nullable = false,length = 20)
	private String curso;

	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profesor(int profesorid, String profesornombre, String profesorapellido, String universidad, String curso) {
		super();
		this.profesorid = profesorid;
		this.profesornombre = profesornombre;
		this.profesorapellido = profesorapellido;
		this.universidad = universidad;
		this.curso = curso;
	}

	public int getProfesorid() {
		return profesorid;
	}

	public void setProfesorid(int profesorid) {
		this.profesorid = profesorid;
	}

	public String getProfesornombre() {
		return profesornombre;
	}

	public void setProfesornombre(String profesornombre) {
		this.profesornombre = profesornombre;
	}

	public String getProfesorapellido() {
		return profesorapellido;
	}

	public void setProfesorapellido(String profesorapellido) {
		this.profesorapellido = profesorapellido;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}
