package com.examen.iservices;
import java.util.List;
import java.util.Optional;
import com.examen.models.Trabajador;

public interface ITrabajadorService {
	public List<Trabajador> listar();
	public Optional<Trabajador> buscarid(int id);
	public int guardar(Trabajador trab);
	public void eliminar(int id);
	

}
