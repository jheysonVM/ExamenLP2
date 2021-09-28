package com.examen.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.examen.models.Trabajador;

@Repository
public interface ITrabajador extends CrudRepository<Trabajador,Integer> {

}
