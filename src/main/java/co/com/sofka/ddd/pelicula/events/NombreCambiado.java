package co.com.sofka.ddd.pelicula.events;

import co.com.sofka.ddd.pelicula.values.NombrePelicula;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreCambiado extends DomainEvent {
    private final NombrePelicula nombrePelicula;

    public NombreCambiado(NombrePelicula nombrePelicula) {
        super("sofka.pelicula.nombrecambiado");
        this.nombrePelicula = nombrePelicula;
    }

    public NombrePelicula getNombrePelicula() {
        return nombrePelicula;
    }
}
