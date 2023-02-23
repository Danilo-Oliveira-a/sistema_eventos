package com.sistemaevento.evento.controller;

import com.sistemaevento.evento.model.Funcionario;
import com.sistemaevento.evento.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping(value = "/funcionarios")
    public ResponseEntity<List<Funcionario>>listaFuncionarios(){
        try{
           return  new ResponseEntity(funcionarioService.listaFuncionarios(), HttpStatus.OK);
        }
        catch (Exception e){
            return  new ResponseEntity(funcionarioService.listaFuncionarios(), HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping(value = "/funcionario/incluir")
    public ResponseEntity incluirFuncionario(){
        try{
            funcionarioService.incuirFuncionario();
            return  new ResponseEntity(null, HttpStatus.CREATED);
        }
        catch (Exception e){
            return  new ResponseEntity(null, HttpStatus.BAD_REQUEST);
        }
    }




}
