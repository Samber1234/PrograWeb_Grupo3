package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoDeUsuarioDao;
import pe.edu.upc.entities.TipoDeUsuario;
import pe.edu.upc.service.ITipoDeUsuarioService;

@Named
@RequestScoped
public class TipoDeUsuarioServiceImpl implements ITipoDeUsuarioService {

	@Inject
	private ITipoDeUsuarioDao tuDao;

	@Override
	public void insert(TipoDeUsuario t) {
		tuDao.insert(t);

	}

	@Override
	public List<TipoDeUsuario> list() {

		return tuDao.list();
	}

}
