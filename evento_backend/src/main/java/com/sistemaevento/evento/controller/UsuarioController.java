package com.sistemaevento.evento.controller;

import com.sistemaevento.evento.model.Funcionario;
import com.sistemaevento.evento.model.Usuario;
import com.sistemaevento.evento.service.FuncionarioService;
import com.sistemaevento.evento.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;


    @PostMapping(value = "/incluir")
    public ResponseEntity incluirUsuario(@RequestBody Usuario usuario){
        try{
            service.incluir(usuario);
            return  new ResponseEntity(null, HttpStatus.CREATED);
        }
        catch (Exception e){
            return  new ResponseEntity(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping(value = "/editar")
    public ResponseEntity editarUsuario(@RequestBody Usuario usuario){
        try{
            service.incluir(usuario);
            return  new ResponseEntity(null, HttpStatus.CREATED);
        }
        catch (Exception e){
            return  new ResponseEntity(null, HttpStatus.BAD_REQUEST);
        }
    }
}
