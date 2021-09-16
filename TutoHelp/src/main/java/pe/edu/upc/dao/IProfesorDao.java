package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Profesor;

public interface IProfesorDao {
	public void insert(Profesor p);

	public List<Profesor> list();
}
