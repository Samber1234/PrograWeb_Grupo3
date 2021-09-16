package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.PruebasCompartidas;

public interface IPruebasCompartidasDao {
	public void insert(PruebasCompartidas pc);

	public List<PruebasCompartidas> list();
}
