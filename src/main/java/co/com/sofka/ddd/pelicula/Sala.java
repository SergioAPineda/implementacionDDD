package co.com.sofka.ddd.pelicula;

import co.com.sofka.ddd.pelicula.values.Disponibilidad;
import co.com.sofka.ddd.pelicula.values.SalaID;
import co.com.sofka.ddd.pelicula.values.TipoSala;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Sala extends Entity<SalaID> {

    private Disponibilidad disponibilidad;
    private TipoSala tipoSala;

    public Sala(SalaID entityId, Disponibilidad disponibilidad, TipoSala tipoSala) {
        super(entityId);
        this.disponibilidad = disponibilidad;
        this.tipoSala = tipoSala;
    }

    public void actualizarTipo(TipoSala tipoSala){
        this.tipoSala = Objects.requireNonNull(tipoSala);
    }

    public void verificarDisponibilidad(Disponibilidad disponibilidad){
        this.disponibilidad = Objects.requireNonNull(disponibilidad);
    }

    public Disponibilidad disponibilidad() {
        return disponibilidad;
    }

    public TipoSala tipoSala() {
        return tipoSala;
    }
}
