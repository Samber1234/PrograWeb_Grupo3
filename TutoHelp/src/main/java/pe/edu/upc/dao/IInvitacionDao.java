package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Invitacion;

public interface IInvitacionDao {
	public void insert(Invitacion i);

	public List<Invitacion> list();
}
