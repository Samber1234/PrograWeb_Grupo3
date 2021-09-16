package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Curso;

public interface ICursoDao {
	public void insert(Curso c);

	public List<Curso> list();
}
