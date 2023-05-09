package com.rvalencia.famenrutamiento.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class DojoController {
	@RequestMapping("/{dojo}")
	public String dojos(@PathVariable("dojo") String dojo) {
		return "¡El Dojo es increíble!";
	}
	
	@RequestMapping("/{dojo}/{burbank-dojo}/{san-jose}")
	public String burbankDojo(@PathVariable("burbank-dojo") String burbank) {
		return "El Dojo Burbank está localizado al sur de California";
	}
	
	@RequestMapping("/{san-jose}")
	public String sanJoseDojo(@PathVariable("san-jose") String jose) {
		return "El Dojo SJ es el cuartel general";
	}
	
//	@RequestMapping("/{dojo}/{burbank-dojo}/{san-jose}")
//	public String dojos(@PathVariable("dojo") String dojo, @PathVariable("burbank-dojo") String burbank, @PathVariable("san-jose") String jose) {
//		return "Dojo: " + dojo + ", Burbank Dojo: " + burbank + ", San José: " + jose;
//	}
	
}
