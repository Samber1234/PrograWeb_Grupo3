package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Curso;

public interface ICursoService {

	public void insert(Curso c);

	public List<Curso> list();
}
