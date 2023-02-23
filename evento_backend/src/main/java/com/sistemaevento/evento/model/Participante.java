package com.sistemaevento.evento.model;

import javax.persistence.*;

import java.io.Serializable;
@Table(name = "TB_PARTICIPANTE")
@Entity
public class Participante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private  String nome;
    private  String email;

    @ManyToOne
    private EventoOnline eventoOnline;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EventoOnline getEventoOnline() {
        return eventoOnline;
    }

    public void setEventoOnline(EventoOnline eventoOnline) {
        this.eventoOnline = eventoOnline;
    }
}
