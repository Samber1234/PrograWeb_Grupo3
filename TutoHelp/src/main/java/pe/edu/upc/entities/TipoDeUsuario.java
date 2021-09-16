package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoDeUsuario")
public class TipoDeUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tipodeusuarioid;
	
	@Column(name = "descripciontipousuario",nullable = false,length = 10)
	private String descripciontipousuario;

	public TipoDeUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoDeUsuario(int tipodeusuarioid, String descripciontipousuario) {
		super();
		this.tipodeusuarioid = tipodeusuarioid;
		this.descripciontipousuario = descripciontipousuario;
	}

	public int getTipodeusuarioid() {
		return tipodeusuarioid;
	}

	public void setTipodeusuarioid(int tipodeusuarioid) {
		this.tipodeusuarioid = tipodeusuarioid;
	}



	public String getDescripciontipousuario() {
		return descripciontipousuario;
	}



	public void setDescripciontipousuario(String descripciontipousuario) {
		this.descripciontipousuario = descripciontipousuario;
	}



	@Override
	public int hashCode() {
		return Objects.hash(tipodeusuarioid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoDeUsuario other = (TipoDeUsuario) obj;
		return tipodeusuarioid == other.tipodeusuarioid;
	}
	
}
