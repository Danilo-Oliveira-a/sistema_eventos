package com.sistemaevento.evento.service;

import com.sistemaevento.evento.model.Funcionario;
import com.sistemaevento.evento.model.Usuario;
import com.sistemaevento.evento.repository.FuncionarioRepository;
import com.sistemaevento.evento.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario>listaUsuario(){
       return repository.findAll();
    }

    public void incluir(Usuario usuario){
       repository.save(usuario);
    }
}
