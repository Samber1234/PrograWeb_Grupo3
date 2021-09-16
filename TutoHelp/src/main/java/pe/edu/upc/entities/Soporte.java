package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Soporte")
public class Soporte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int soporteid;
	
	@ManyToOne
	@JoinColumn(name = "usuarioid", nullable = false)
	private Usuario usuario;
	
	@Column(name = "reportemensaje",nullable = false,length = 200)
	private String reportemensaje;


	public Soporte() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Soporte(int soporteid, Usuario usuario, String reportemensaje) {
		super();
		this.soporteid = soporteid;
		this.usuario = usuario;
		this.reportemensaje = reportemensaje;
	}


	public int getSoporteid() {
		return soporteid;
	}


	public void setSoporteid(int soporteid) {
		this.soporteid = soporteid;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public String getReportemensaje() {
		return reportemensaje;
	}


	public void setReportemensaje(String reportemensaje) {
		this.reportemensaje = reportemensaje;
	}
	
	
}
