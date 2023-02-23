package com.sistemaevento.evento.controller;

import com.sistemaevento.evento.model.EventoOnline;
import com.sistemaevento.evento.model.EventoPresencial;
import com.sistemaevento.evento.model.Funcionario;
import com.sistemaevento.evento.service.EventoOnlineService;
import com.sistemaevento.evento.service.EventoPresencialService;
import com.sistemaevento.evento.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping(value = "/eventos")
public class EventoController {

    @Autowired
    private EventoOnlineService eventoOnlineService;
    @Autowired
    private EventoPresencialService eventoPresencialService;

    @GetMapping(value = "/online")
    public ResponseEntity<List<EventoOnline>>listarEventosOnline(){
        try{
           return new ResponseEntity(eventoOnlineService.listar(), HttpStatus.OK);
        }
        catch (Exception e){
            return  new ResponseEntity(null, HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping(value = "/presencial")
    public ResponseEntity<List<EventoPresencial>>listarEventosPresenciais(){
        try{
            return new ResponseEntity(eventoPresencialService.listar(), HttpStatus.OK);
        }
        catch (Exception e){
            return  new ResponseEntity(null, HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping(value = "/online/incluir")
    public ResponseEntity incluirEventoOnline(@RequestBody EventoOnline evento){
        try{
            eventoOnlineService.incuir(evento);
            return new ResponseEntity(null, HttpStatus.CREATED);
        }
        catch (Exception e){
            return  new ResponseEntity(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value = "/presencial/incluir")
    public ResponseEntity incluirEventoPresencial(@RequestBody EventoPresencial evento){
        try{
            eventoPresencialService.incuir(evento);
            return new ResponseEntity(null, HttpStatus.CREATED);
        }
        catch (Exception e){
            return  new ResponseEntity(null, HttpStatus.BAD_REQUEST);
        }
    }

}
