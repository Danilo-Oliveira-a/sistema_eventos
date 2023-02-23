package com.sistemaevento.evento.model;
import javax.persistence.*;
import java.util.List;

@Table(name = "TB_EVENTO_ONLINE")
@Entity
public class EventoOnline extends  Evento{


    @Embedded
    private Plataforma plataforma;
    @Embedded
    private Ferramenta ferramenta;
    @OneToMany(cascade=CascadeType.PERSIST)
    @JoinColumn(name="participante_id")
    private List<Participante> participantes;

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public Ferramenta getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(Ferramenta ferramenta) {
        this.ferramenta = ferramenta;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }

}
