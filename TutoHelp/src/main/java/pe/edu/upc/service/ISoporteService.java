package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Soporte;

public interface ISoporteService {

	public void insert(Soporte s);

	public List<Soporte> list();
}
