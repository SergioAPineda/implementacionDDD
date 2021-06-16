package co.com.sofka.ddd.pelicula.events;

import co.com.sofka.ddd.pelicula.values.NombrePelicula;
import co.com.sofka.domain.generic.DomainEvent;

public class PeliculaCreada extends DomainEvent {

    private final NombrePelicula nombrePelicula;

    public PeliculaCreada(NombrePelicula nombrePelicula) {
        super("sofka.pelicula.peliculacreada");
        this.nombrePelicula = nombrePelicula;
    }



    public NombrePelicula getNombrePelicula() {
        return nombrePelicula;
    }
}
