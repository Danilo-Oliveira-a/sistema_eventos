package com.sistemaevento.evento.repository;

import com.sistemaevento.evento.model.EventoOnline;
import com.sistemaevento.evento.model.Participante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipanteRepository extends JpaRepository<Participante, Long> {

}
