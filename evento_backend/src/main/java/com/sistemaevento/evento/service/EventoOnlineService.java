package com.sistemaevento.evento.service;

import com.sistemaevento.evento.enums.TipoEvento;
import com.sistemaevento.evento.model.EventoOnline;
import com.sistemaevento.evento.model.Funcionario;
import com.sistemaevento.evento.repository.EventoOnlineRepository;
import com.sistemaevento.evento.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoOnlineService {

    @Autowired
    private EventoOnlineRepository repository;

    public List<EventoOnline> listar(){
        return repository.findAll();
    }
    public void incuir(EventoOnline evento){
        evento.setTipoEvento(TipoEvento.ONLINE);
        repository.save(evento);
    }
}
