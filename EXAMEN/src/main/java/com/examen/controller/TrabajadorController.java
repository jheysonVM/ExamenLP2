package com.examen.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.examen.iservices.*;
import com.examen.models.*;

@Controller
@RequestMapping
public class TrabajadorController {
	@Autowired
	private ITrabajadorService service;
	
	@GetMapping("/listando")
	public String listar(Model model) {
		List<Trabajador> trabajador = service.listar();
		model.addAttribute("trabajador",trabajador);
		return "index";
	}
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("trabajador", new Trabajador());
		return"trabajador_add";
	}
	@GetMapping("/save")
	public String guardar(@Validated Trabajador trab,Model model)	{
		service.guardar(trab);
		return "redirect:/listando";
	}
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id,Model model) {	
		Optional<Trabajador> trabajador=service.buscarid(id);
		model.addAttribute("cliente",trabajador);
		return "trabajador_add";
	}
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.eliminar(id);
		return "redirect:/listando";
	}
}
