package com.sistemaevento.evento.repository;

import com.sistemaevento.evento.model.EventoOnline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoOnlineRepository extends JpaRepository<EventoOnline, Long> {

}
