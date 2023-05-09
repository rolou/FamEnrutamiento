package com.rvalencia.famenrutamiento.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {

	@RequestMapping(" ")
	public String ruta() {
		return "Hola Coding Dojo";
	}
	
	@RequestMapping("/python")
	public String rutaDos() {
		return "¡Python/Django fue increíble!";
	}
	
	//EJEMPLO RUTA PARAMETRICA CON PATHVARIABLE
	@RequestMapping("/java")
	public String rutaTres() {
		return "¡Java/Spring en mejor!";
	}
}
