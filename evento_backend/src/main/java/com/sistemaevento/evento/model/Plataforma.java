package com.sistemaevento.evento.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class Plataforma implements Serializable {

    private String nomePlataforma;

    public String getNomePlataforma() {
        return nomePlataforma;
    }

    public void setNomePlataforma(String nomePlataforma) {
        this.nomePlataforma = nomePlataforma;
    }
}
