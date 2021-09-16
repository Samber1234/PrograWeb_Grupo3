package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entities.Usuario;

public class UsuarioDaoImpl implements IUsuarioDao {

	@PersistenceContext(unitName = "TutoHelp")
	private EntityManager em;

	@Transactional
	public void insert(Usuario u) {
		try {

			em.persist(u);

		} catch (Exception e) {
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	public List<Usuario> list() {
		List<Usuario> lista = new ArrayList<Usuario>();
		try {

			Query q = em.createQuery("select u from Usuario u");
			lista = (List<Usuario>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar");
		}

		return lista;
	}
}
