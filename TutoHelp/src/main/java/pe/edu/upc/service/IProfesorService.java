package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Profesor;

public interface IProfesorService {

	public void insert(Profesor p);

	public List<Profesor> list();
}
