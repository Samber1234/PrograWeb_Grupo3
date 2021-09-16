package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICursoDao;
import pe.edu.upc.entities.Curso;
import pe.edu.upc.service.ICursoService;

@Named
@RequestScoped
public class CursoServiceImpl implements ICursoService {

	@Inject
	private ICursoDao cDao;

	@Override
	public void insert(Curso c) {
		cDao.insert(u);

	}

	@Override
	public List<Curso> list() {

		return cDao.list();
	}

}
