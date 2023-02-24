package com.sistemaevento.evento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sistemaevento.evento.model.Local;
import com.sistemaevento.evento.service.LocalService;

@RestController
@CrossOrigin
@RequestMapping(value="/local")
public class LocalController {
	
	@Autowired
	private LocalService service;
	
	@PostMapping(value = "/incluir")
	private ResponseEntity incluirLocal(@RequestBody Local local) {
		try {
			service.incluirLocal(local);
			return  ResponseEntity.ok().build();
		} catch (Exception e) {
			return  ResponseEntity.badRequest().build();
		}
	}

	@PutMapping(value = "/alterar")
	private ResponseEntity alterarLocal (@RequestBody Local local) {
		try {
			service.alterarLocal(local);
			return  ResponseEntity.ok().build();
		} catch (Exception e) {
			return  ResponseEntity.badRequest().build();
		}
	}

	@GetMapping(value="/detalhe/{id}")
	private ResponseEntity<Local> detalhe (@PathVariable long id) {
		Local local = null;
		try {
			local = service.consultarDetalhe(id);
			return  ResponseEntity.ok(local);
		} catch (Exception e) {
			return  ResponseEntity.badRequest().body(local);
		}
	}

}
