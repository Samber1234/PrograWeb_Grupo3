package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.PruebasCompartidas;

public interface IPruebasCompartidasService {

	public void insert(PruebasCompartidas pc);

	public List<PruebasCompartidas> list();
}
