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
	private ResponseEntity incluirLocal (@RequestBody Local local) {
		try {
			service.incluirLocal(local);
			return new ResponseEntity<>(null, HttpStatus.CREATED);
		} catch (Exception e) {
			return  new ResponseEntity(null, HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping(value = "/alterar")
	private ResponseEntity alterarLocal (@RequestBody Local local) {
		try {
			service.alterarLocal(local);
			return new ResponseEntity<>(null, HttpStatus.OK);
		} catch (Exception e) {
			return  new ResponseEntity(null, HttpStatus.BAD_REQUEST);
		}
	}

}
