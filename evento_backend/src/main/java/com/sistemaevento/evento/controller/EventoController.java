package com.sistemaevento.evento.controller;

import com.sistemaevento.evento.model.EventoOnline;
import com.sistemaevento.evento.model.EventoPresencial;
import com.sistemaevento.evento.model.Funcionario;
import com.sistemaevento.evento.model.Local;
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
           return  ResponseEntity.ok(eventoOnlineService.listar());
        }
        catch (Exception e){
            return  ResponseEntity.badRequest().build();
        }
    }
    @GetMapping(value = "/presencial")
    public ResponseEntity<List<EventoPresencial>>listarEventosPresenciais(){
        try{
            return ResponseEntity.ok(eventoPresencialService.listar());
        }
        catch (Exception e){
            return  ResponseEntity.badRequest().build();
        }
    }
    @PostMapping(value = "/online/incluir")
    public ResponseEntity incluirEventoOnline(@RequestBody EventoOnline evento){
        try{
            eventoOnlineService.incuir(evento);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        catch (Exception e){
            return  ResponseEntity.badRequest().build();
        }
    }

    @PostMapping(value = "/presencial/incluir")
    public ResponseEntity incluirEventoPresencial(@RequestBody EventoPresencial evento){
        try{
            eventoPresencialService.incuir(evento);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        catch (Exception e){
            return  ResponseEntity.badRequest().build();
        }
    }

    @PutMapping(value = "/alterarEventoOnline")
    public ResponseEntity alterarEventoOnline(@RequestBody EventoOnline evento){
        try {
            eventoOnlineService.alterar(evento);
            return  ResponseEntity.ok().build();
        } catch (Exception e) {
            return  ResponseEntity.badRequest().build();
        }
    }

    @PutMapping(value = "/alterarEventoPresencial")
    public ResponseEntity alterarEventoPresencial(@RequestBody EventoPresencial evento){
        try {
            eventoPresencialService.alterar(evento);
            return  ResponseEntity.ok().build();
        } catch (Exception e) {
            return  ResponseEntity.badRequest().build();
        }
    }

}
