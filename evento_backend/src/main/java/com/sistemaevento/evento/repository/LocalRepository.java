package com.sistemaevento.evento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemaevento.evento.model.Local;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long>{
	
	Local findById(long id);

}
