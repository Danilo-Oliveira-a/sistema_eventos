package com.sistemaevento.evento.model;

import com.sistemaevento.evento.enums.TipoEvento;
import com.sun.istack.NotNull;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
public abstract class Evento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @NotNull
    private String nome;
    @NotNull
    private TipoEvento tipoEvento;
    @NotNull
    private Date data;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
