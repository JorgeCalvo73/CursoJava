package com.curso.javaspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListadoClientesController {

	public ListadoClientesController() {
		super();
		System.out.println("Creando una instancia de ListadoClientesController");
	}
	
	@GetMapping(path="/listadoClientes")
	public ModelAndView verListadoClientes() {
		
		ModelAndView mav = new ModelAndView("listadoClientes");
		return mav;
	}
	

}
