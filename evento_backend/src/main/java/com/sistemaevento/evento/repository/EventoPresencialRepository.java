package com.sistemaevento.evento.repository;

import com.sistemaevento.evento.model.EventoOnline;
import com.sistemaevento.evento.model.EventoPresencial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoPresencialRepository extends JpaRepository<EventoPresencial, Long> {

    void alterar(EventoPresencial evento);
}
