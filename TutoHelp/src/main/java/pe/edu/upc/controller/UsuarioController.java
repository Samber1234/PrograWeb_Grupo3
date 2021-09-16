package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Usuario;
import pe.edu.upc.entities.TipoDeUsuario;
import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.ITipoDeUsuarioService;

@Named
@RequestScoped
public class UsuarioController {
	@Inject
	private IUsuarioService uService;
	@Inject
	private ITipoDeUsuarioService tService;

	private Usuario usuario;
	private TipoDeUsuario tipoDeUsuario;
	List<Usuario> listaUsuario;
	List<TipoDeUsuario> listaTipoDeUsuario;

	public String newUsuario() {
		this.setUsuario(new Usuario());
		return "person.xhtml";
	}
	
	public void listTipoDeUsuario() {
		listaTipoDeUsuario=tService.list();
	}
	
	public void insertUsuario() {
		uService.insert(usuario);
		this.listUsuario();
	}
	
	public void listUsuario() {
		listaUsuario=uService.list();
	}
	
	@PostConstruct
	public void init() {
		this.usuario=new Usuario();
		this.tipoDeUsuario=new TipoDeUsuario();
		this.listaUsuario=new ArrayList<Usuario>();
		this.listaTipoDeUsuario= new ArrayList<TipoDeUsuario>();
		this.listUsuario();
		this.listTipoDeUsuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TipoDeUsuario getTipoDeUsuario() {
		return tipoDeUsuario;
	}

	public void setTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
		this.tipoDeUsuario = tipoDeUsuario;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	public List<TipoDeUsuario> getListaTipoDeUsuario() {
		return listaTipoDeUsuario;
	}

	public void setListaTipoDeUsuario(List<TipoDeUsuario> listaTipoDeUsuario) {
		this.listaTipoDeUsuario = listaTipoDeUsuario;
	}

	
}
