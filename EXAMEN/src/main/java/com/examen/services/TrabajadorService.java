package com.examen.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.interfaces.ITrabajador;
import com.examen.iservices.*;
import com.examen.models.*;

@Service
public class TrabajadorService implements ITrabajadorService {
	@Autowired
	private ITrabajador data;

	@Override
	public List<Trabajador> listar() {
		// TODO Auto-generated method stub
		return (List<Trabajador>)data.findAll();
	}

	@Override
	public Optional<Trabajador> buscarid(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public int guardar(Trabajador trab) {
		// TODO Auto-generated method stub
		int res=0;
		Trabajador trabajador=data.save(trab);
		if (!trabajador.equals(null)) {
			res=1;
		}
		return 1;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}
	
}
