package com.sistemaevento.evento.model;

import com.sistemaevento.evento.enums.PerfilUsuario;
import javax.persistence.*;

import java.io.Serializable;
@Table(name = "TB_USUARIO")
@Entity
public class Usuario implements Serializable {
    private String nome;
    private String senha;
    @Id
    private String matricula;
    private String indicadorHabilitado;

    private PerfilUsuario tipoUsuario;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(String indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public PerfilUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(PerfilUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
