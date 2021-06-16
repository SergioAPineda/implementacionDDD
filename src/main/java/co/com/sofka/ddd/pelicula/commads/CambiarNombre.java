package co.com.sofka.ddd.pelicula.commads;

import co.com.sofka.ddd.pelicula.values.NombrePelicula;
import co.com.sofka.ddd.pelicula.values.PeliculaID;
import co.com.sofka.domain.generic.Command;

public class CambiarNombre implements Command {

    private final PeliculaID peliculaID;
    private final NombrePelicula nombrePelicula;

    public CambiarNombre(PeliculaID peliculaID, NombrePelicula nombrePelicula) {
        this.peliculaID = peliculaID;
        this.nombrePelicula = nombrePelicula;
    }

    public PeliculaID getPeliculaID() {
        return peliculaID;
    }

    public NombrePelicula getNombrePelicula() {
        return nombrePelicula;
    }
}
