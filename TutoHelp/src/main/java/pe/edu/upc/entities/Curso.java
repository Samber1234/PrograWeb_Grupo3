package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Curso")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cursoid;
	
	@Column(name = "cursonombre",nullable = false,length = 15)
	private String cursonombre;

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Curso(int cursoid, String cursonombre) {
		super();
		this.cursoid = cursoid;
		this.cursonombre = cursonombre;
	}

	public int getCursoid() {
		return cursoid;
	}

	public void setCursoid(int cursoid) {
		this.cursoid = cursoid;
	}

	public String getCursonombre() {
		return cursonombre;
	}

	public void setCursonombre(String cursonombre) {
		this.cursonombre = cursonombre;
	}
	
	


}
