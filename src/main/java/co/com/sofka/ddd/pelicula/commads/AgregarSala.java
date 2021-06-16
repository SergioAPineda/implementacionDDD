package co.com.sofka.ddd.pelicula.commads;

import co.com.sofka.ddd.pelicula.values.Disponibilidad;
import co.com.sofka.ddd.pelicula.values.PeliculaID;
import co.com.sofka.ddd.pelicula.values.SalaID;
import co.com.sofka.ddd.pelicula.values.TipoSala;
import co.com.sofka.domain.generic.Command;

public class AgregarSala implements Command {

    private final PeliculaID peliculaID;
    private final SalaID entityId;
    private final Disponibilidad disponibilidad;
    private final TipoSala tipoSala;

    public AgregarSala(PeliculaID peliculaID, SalaID entityId, Disponibilidad disponibilidad, TipoSala tipoSala) {
        this.peliculaID = peliculaID;
        this.entityId = entityId;
        this.disponibilidad = disponibilidad;
        this.tipoSala = tipoSala;
    }

    public PeliculaID getPeliculaID() {
        return peliculaID;
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
