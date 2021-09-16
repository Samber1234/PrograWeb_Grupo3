package pe.edu.upc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Invitacion")
public class Invitacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int invitacionid;
	
	@ManyToOne
	@JoinColumn(name = "usuarioid", nullable = false)
	private Usuario usuario;
	
	@Column(name = "tutorid",nullable = false)
	private int tutorid;

	private Date fecha;

	@Column(name = "comentario",nullable = false,length = 100)
	private String comentario;
	
	@Column(name = "linkreunion",nullable = false,length = 100)
	private String linkreunion;
	
	@Column(name = "estado",nullable = false,length = 10)
	private String estado;

	public Invitacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Invitacion(int invitacionid, Usuario usuario, int tutorid, Date fecha, String comentario, String linkreunion,
			String estado) {
		super();
		this.invitacionid = invitacionid;
		this.usuario = usuario;
		this.tutorid = tutorid;
		this.fecha = fecha;
		this.comentario = comentario;
		this.linkreunion = linkreunion;
		this.estado = estado;
	}

	public int getInvitacionid() {
		return invitacionid;
	}

	public void setInvitacionid(int invitacionid) {
		this.invitacionid = invitacionid;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getTutorid() {
		return tutorid;
	}

	public void setTutorid(int tutorid) {
		this.tutorid = tutorid;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getLinkreunion() {
		return linkreunion;
	}

	public void setLinkreunion(String linkreunion) {
		this.linkreunion = linkreunion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	


}
