package com.sistemaevento.evento.repository;

import com.sistemaevento.evento.model.Funcionario;
import com.sistemaevento.evento.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
