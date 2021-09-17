package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Usuario;
import pe.edu.upc.entities.Soporte;
import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.ISoporteService;

@Named
@RequestScoped
public class SoporteController {
	@Inject
	private IUsuarioService uService;
	@Inject
	private ISoporteService sService;

	private Usuario usuario;
	private Soporte soporte;
	List<Usuario> listaUsuario;
	List<Soporte> listaSoporte;

	public String newSoporte() {
		this.setSoporte(new Soporte());
		return "soporte.xhtml";
	}
	
	public void listUsuario() {
		listaUsuario=uService.list();
	}
	
	public void insertSoporte() {
		sService.insert(soporte);
		this.listSoporte();
	}
	
	public void listSoporte() {
		listaSoporte=sService.list();
	}
	
	@PostConstruct
	public void init() {
		this.usuario=new Usuario();
		this.soporte=new Soporte();
		this.listaUsuario=new ArrayList<Usuario>();
		this.listaSoporte= new ArrayList<Soporte>();
		this.listUsuario();
		this.listSoporte();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Soporte getSoporte() {
		return soporte;
	}

	public void setSoporte(Soporte soporte) {
		this.soporte = soporte;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	public List<Soporte> getListaSoporte() {
		return listaSoporte;
	}

	public void setListaSoporte(List<Soporte> listaSoporte) {
		this.listaSoporte = listaSoporte;
	}

	
}
