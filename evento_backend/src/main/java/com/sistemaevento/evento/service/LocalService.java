package com.sistemaevento.evento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaevento.evento.model.Local;
import com.sistemaevento.evento.repository.LocalRepository;

@Service
public class LocalService {
	
	@Autowired
	private LocalRepository repository;

	public void incluirLocal(Local local) {
		repository.save(local);
	}

	public void alterarLocal(Local local) {
		repository.save(local);
	}
}
