package com.curso.javaspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.curso.javaspring.modelo.entidad.Cliente;

@Controller
public class FormularioClientesController {

	@GetMapping("/formularioClientes")
	public ModelAndView verFormularioClientes() {
		
		System.out.println("FormularioClientesController.verFormularioClientes");
		ModelAndView mav = new ModelAndView("formularioClientes");
		return mav;
	}
	
	@PostMapping("/insertarCliente")
	public ModelAndView insertarCliente(@ModelAttribute Cliente cliente) {
		
		System.out.println("FormularioClientesController.insertarCliente");
		ModelAndView mav = new ModelAndView("listadoClientes");
		mav.addObject("cliente", new Cliente());
		return mav;
	}
}
