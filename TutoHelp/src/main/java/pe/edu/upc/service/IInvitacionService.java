package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Invitacion;

public interface IInvitacionService {

	public void insert(Invitacion i);

	public List<Invitacion> list();
}
