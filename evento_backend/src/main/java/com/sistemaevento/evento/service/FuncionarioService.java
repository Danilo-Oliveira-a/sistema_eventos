package com.sistemaevento.evento.service;

import com.sistemaevento.evento.model.Funcionario;
import com.sistemaevento.evento.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario>listaFuncionarios(){
       return funcionarioRepository.findAll();
    }
    public void incuirFuncionario(){
        for (int i = 0; i < 10; i++) {
            Funcionario f = new Funcionario();
            f.setMatricula("00"+funcionarioRepository.count());
            f.setNome("Danilo - "+f.getMatricula());
            funcionarioRepository.save(f);
        }
    }
}
