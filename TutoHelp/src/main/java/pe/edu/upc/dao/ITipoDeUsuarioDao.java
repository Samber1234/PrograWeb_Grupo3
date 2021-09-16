package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.TipoDeUsuario;

public interface ITipoDeUsuarioDao {
	public void insert(TipoDeUsuario t);

	public List<TipoDeUsuario> list();
}
