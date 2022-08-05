package com.idat.bodega.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.bodega.entity.Bodega;
import com.idat.bodega.service.BodegaService;

@RestController
@RequestMapping("/api/bodega/v1")
public class BodegaController {

	@Autowired
	private BodegaService service;

	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Bodega bodega) {
		service.guardarBodega(bodega);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarProductos() {
		service.asignarProductos();
	}
}
