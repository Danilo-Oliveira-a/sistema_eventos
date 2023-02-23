package com.sistemaevento.evento.model;

import javax.persistence.*;

@Table(name = "TB_EVENTO_PRESENCIAL")
@Entity
public class EventoPresencial extends  Evento{

    @OneToOne(cascade=CascadeType.PERSIST)
    private Local local;

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
