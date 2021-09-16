package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int usuarioid;
	
	@ManyToOne
	@JoinColumn(name = "tipousuarioid", nullable = false)
	private TipoDeUsuario tipodeusuario;
	
	@Column(name = "nombreusuario",nullable = false,length = 10)
	private String nombreusuario;

	@Column(name = "apellidousuario",nullable = false,length = 10)
	private String apellidousuario;

	@Column(name = "dniusuario",nullable = false,length = 8)
	private int dniusuario;
	
	@Column(name = "correousuario",nullable = false,length = 20)
	private String correousuario;
	
	@Column(name = "telefonousuario",length = 9)
	private int telefonousuario;
	
	@Column(name = "direccionusuario",length = 20)
	private String direccionusuario;
	
	@Column(name = "nicknameusuario",nullable = false,length = 10)
	private String nicknameusuario;
	
	@Column(name = "contraseñausuario",nullable = false,length = 15)
	private String contraseñausuario;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(int usuarioid, TipoDeUsuario tipodeusuario, String nombreusuario, String apellidousuario,
			int dniusuario, String correousuario, int telefonousuario, String direccionusuario, String nicknameusuario,
			String contraseñausuario) {
		super();
		this.usuarioid = usuarioid;
		this.tipodeusuario = tipodeusuario;
		this.nombreusuario = nombreusuario;
		this.apellidousuario = apellidousuario;
		this.dniusuario = dniusuario;
		this.correousuario = correousuario;
		this.telefonousuario = telefonousuario;
		this.direccionusuario = direccionusuario;
		this.nicknameusuario = nicknameusuario;
		this.contraseñausuario = contraseñausuario;
	}

	public int getUsuarioid() {
		return usuarioid;
	}


	public void setUsuarioid(int usuarioid) {
		this.usuarioid = usuarioid;
	}
	
	public TipoDeUsuario getTipodeusuario() {
		return tipodeusuario;
	}

	public void setTipodeusuario(TipoDeUsuario tipodeusuario) {
		this.tipodeusuario = tipodeusuario;
	}

	public String getNombreusuario() {
		return nombreusuario;
	}


	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}


	public String getApellidousuario() {
		return apellidousuario;
	}


	public void setApellidousuario(String apellidousuario) {
		this.apellidousuario = apellidousuario;
	}


	public int getDniusuario() {
		return dniusuario;
	}


	public void setDniusuario(int dniusuario) {
		this.dniusuario = dniusuario;
	}


	public String getCorreousuario() {
		return correousuario;
	}


	public void setCorreousuario(String correousuario) {
		this.correousuario = correousuario;
	}


	public int getTelefonousuario() {
		return telefonousuario;
	}


	public void setTelefonousuario(int telefonousuario) {
		this.telefonousuario = telefonousuario;
	}


	public String getDireccionusuario() {
		return direccionusuario;
	}


	public void setDireccionusuario(String direccionusuario) {
		this.direccionusuario = direccionusuario;
	}


	public String getNicknameusuario() {
		return nicknameusuario;
	}


	public void setNicknameusuario(String nicknameusuario) {
		this.nicknameusuario = nicknameusuario;
	}


	public String getContraseñausuario() {
		return contraseñausuario;
	}


	public void setContraseñausuario(String contraseñausuario) {
		this.contraseñausuario = contraseñausuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(usuarioid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return usuarioid == other.usuarioid;
	}

}
