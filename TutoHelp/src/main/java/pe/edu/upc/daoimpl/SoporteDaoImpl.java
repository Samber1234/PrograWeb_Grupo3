package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ISoporteDao;
import pe.edu.upc.entities.Soporte;

public class SoporteDaoImpl implements ISoporteDao {

	@PersistenceContext(unitName = "TutoHelp")
	private EntityManager em;

	@Transactional
	public void insert(Soporte s) {
		try {

			em.persist(s);

		} catch (Exception e) {
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	public List<Soporte> list() {
		List<Soporte> lista = new ArrayList<Soporte>();
		try {

			Query q = em.createQuery("select s from Soporte s");
			lista = (List<Soporte>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar");
		}

		return lista;
	}
}
