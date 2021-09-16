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
@Table(name="PruebasCompartidas")
public class PruebasCompartidas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pruebaid;
	
	@ManyToOne
	@JoinColumn(name = "usuarioid", nullable = false)
	private Usuario usuario;
	
	@Column(name = "nombrearchivo",nullable = false,length = 20)
	private String nombrearchivo;

	@Column(name = "descripcionarchivo",nullable = false,length = 100)
	private String descripcionarchivo;

	@Column(name = "url",nullable = false,length = 100)
	private String url;


	public PruebasCompartidas() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public PruebasCompartidas(int pruebaid, Usuario usuario, String nombrearchivo, String descripcionarchivo,
			String url) {
		super();
		this.pruebaid = pruebaid;
		this.usuario = usuario;
		this.nombrearchivo = nombrearchivo;
		this.descripcionarchivo = descripcionarchivo;
		this.url = url;
	}


	public int getPruebaid() {
		return pruebaid;
	}


	public void setPruebaid(int pruebaid) {
		this.pruebaid = pruebaid;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public String getNombrearchivo() {
		return nombrearchivo;
	}


	public void setNombrearchivo(String nombrearchivo) {
		this.nombrearchivo = nombrearchivo;
	}


	public String getDescripcionarchivo() {
		return descripcionarchivo;
	}


	public void setDescripcionarchivo(String descripcionarchivo) {
		this.descripcionarchivo = descripcionarchivo;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	


}
