package co.com.sofka.ddd.pelicula.events;

import co.com.sofka.ddd.pelicula.values.FuncionID;
import co.com.sofka.ddd.pelicula.values.Horario;
import co.com.sofka.ddd.pelicula.values.Idioma;
import co.com.sofka.domain.generic.DomainEvent;

public class FuncionAgregada extends DomainEvent {
    private final FuncionID entityId;
    private final Idioma idioma;
    private final Horario horario;

    public FuncionAgregada(FuncionID entityId, Idioma idioma, Horario horario) {
        super("sofka.pelicula.funcioncreada");
        this.entityId = entityId;
        this.idioma = idioma;
        this.horario = horario;
    }

    public FuncionID getEntityId() {
        return entityId;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public Horario getHorario() {
        return horario;
    }
}
