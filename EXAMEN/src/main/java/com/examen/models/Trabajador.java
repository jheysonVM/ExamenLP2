package com.examen.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trabajador")

public class Trabajador {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String apellido_pa;
	private String apellido_ma;
	private String correo;
	private String dni;
	private String celular;
	private String direccion;
	
	
	public Trabajador() {
	}


	public Trabajador(int id, String nombre, String apellido_pa, String apellido_ma, String correo, String dni,
			String celular, String direccion) {
		this.id = id;
		this.nombre = nombre;
		this.apellido_pa = apellido_pa;
		this.apellido_ma = apellido_ma;
		this.correo = correo;
		this.dni = dni;
		this.celular = celular;
		this.direccion = direccion;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido_pa() {
		return apellido_pa;
	}


	public void setApellido_pa(String apellido_pa) {
		this.apellido_pa = apellido_pa;
	}


	public String getApellido_ma() {
		return apellido_ma;
	}


	public void setApellido_ma(String apellido_ma) {
		this.apellido_ma = apellido_ma;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	

}
