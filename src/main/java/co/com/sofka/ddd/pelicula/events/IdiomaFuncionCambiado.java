package co.com.sofka.ddd.pelicula.events;

import co.com.sofka.ddd.pelicula.values.FuncionID;
import co.com.sofka.ddd.pelicula.values.Idioma;
import co.com.sofka.domain.generic.DomainEvent;

public class IdiomaFuncionCambiado extends DomainEvent {
    private FuncionID entityId;
    private Idioma idioma;

    public IdiomaFuncionCambiado(FuncionID entityId, Idioma idioma) {
        super("sofka.pelicula.idiomafuncioncambiado");
        this.entityId = entityId;
        this.idioma = idioma;
    }

    public FuncionID getEntityId() {
        return entityId;
    }

    public Idioma getIdioma() {
        return idioma;
    }
}
