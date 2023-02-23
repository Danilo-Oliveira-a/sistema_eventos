package com.sistemaevento.evento.model;



import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Ferramenta implements Serializable {

    private String nomeFerramenta;

    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    public void setNomeFerramenta(String nomeFerramenta) {
        this.nomeFerramenta = nomeFerramenta;
    }
}
