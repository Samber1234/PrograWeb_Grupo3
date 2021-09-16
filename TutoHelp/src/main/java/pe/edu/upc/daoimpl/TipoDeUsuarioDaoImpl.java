package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITipoDeUsuarioDao;
import pe.edu.upc.entities.TipoDeUsuario;

public class TipoDeUsuarioDaoImpl implements ITipoDeUsuarioDao {

	@PersistenceContext(unitName = "TutoHelp")
	private EntityManager em;

	@Transactional
	public void insert(TipoDeUsuario t) {
		try {

			em.persist(t);

		} catch (Exception e) {
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	public List<TipoDeUsuario> list() {
		List<TipoDeUsuario> lista = new ArrayList<TipoDeUsuario>();
		try {

			Query q = em.createQuery("select t from TipoDeUsuario t");
			lista = (List<TipoDeUsuario>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar");
		}

		return lista;
	}
}
