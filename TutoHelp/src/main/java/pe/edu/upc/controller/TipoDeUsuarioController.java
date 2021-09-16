package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.TipoDeUsuario;
import pe.edu.upc.service.ITipoDeUsuarioService;

@Named
@RequestScoped
public class TipoDeUsuarioController {
	@Inject
	private ITipoDeUsuarioService tService;

	private TipoDeUsuario tipoDeUsuario;
	List<TipoDeUsuario> listaTipoDeUsuario;

	@PostConstruct
	public void init() {
		this.tipoDeUsuario = new TipoDeUsuario();
		this.listaTipoDeUsuario = new ArrayList<>();
		this.list();
	}

	public String newTipoDeUsuario() {
		this.setTipoDeUsuario(new TipoDeUsuario());
		return "vaccination.xhtml";
	}

	public void insert() {
		tService.insert(tipoDeUsuario);
		this.list();
	}

	public void list() {
		listaTipoDeUsuario=tService.list();
	}


	public TipoDeUsuario getTipoDeUsuario() {
		return tipoDeUsuario;
	}

	public void setTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
		this.tipoDeUsuario = tipoDeUsuario;
	}

	public List<TipoDeUsuario> getlistaTipoDeUsuario() {
		return listaTipoDeUsuario;
	}

	public void setListaVacunatorios(List<TipoDeUsuario> listaTipoDeUsuario) {
		this.listaTipoDeUsuario = listaTipoDeUsuario;
	}

}
