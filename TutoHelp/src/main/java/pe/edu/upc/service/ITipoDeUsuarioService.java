package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.TipoDeUsuario;

public interface ITipoDeUsuarioService {

	public void insert(TipoDeUsuario t);

	public List<TipoDeUsuario> list();
}
