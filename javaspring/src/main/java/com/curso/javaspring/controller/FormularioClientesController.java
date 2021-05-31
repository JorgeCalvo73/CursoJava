package com.curso.javaspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class FormularioClientesController {

	@GetMapping("/formularioClientes")
	public ModelAndView verFormularioClientes() {
		
		System.out.println("FormularioClientesController.verFormularioClientes");
		ModelAndView mav = new ModelAndView("formularioClientes");
		return mav;
	}
}