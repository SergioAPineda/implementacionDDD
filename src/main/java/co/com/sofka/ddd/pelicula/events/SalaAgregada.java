package co.com.sofka.ddd.pelicula.events;

import co.com.sofka.ddd.pelicula.values.Disponibilidad;
import co.com.sofka.ddd.pelicula.values.SalaID;
import co.com.sofka.ddd.pelicula.values.TipoSala;
import co.com.sofka.domain.generic.DomainEvent;

public class SalaAgregada extends DomainEvent {
    private final SalaID entityId;
    private final Disponibilidad disponibilidad;
    private final TipoSala tipoSala;

    public SalaAgregada(SalaID entityId, Disponibilidad disponibilidad, TipoSala tipoSala) {
        super("sofka.pelicula.salaagregada");
        this.entityId = entityId;
        this.disponibilidad = disponibilidad;
        this.tipoSala = tipoSala;
    }

    public SalaID getEntityId() {
        return entityId;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public TipoSala getTipoSala() {
        return tipoSala;
    }
}
