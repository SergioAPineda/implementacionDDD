package co.com.sofka.ddd.pelicula.commads;

import co.com.sofka.ddd.pelicula.values.FuncionID;
import co.com.sofka.ddd.pelicula.values.Idioma;
import co.com.sofka.ddd.pelicula.values.PeliculaID;
import co.com.sofka.domain.generic.Command;

public class CambiarIdiomaFuncion implements Command {

    private final PeliculaID peliculaID;
    private final FuncionID entityId;
    private final Idioma idioma;

    public CambiarIdiomaFuncion(PeliculaID peliculaID, FuncionID entityId, Idioma idioma) {
        this.peliculaID = peliculaID;
        this.entityId = entityId;
        this.idioma = idioma;
    }

    public PeliculaID getPeliculaID() {
        return peliculaID;
    }

    public FuncionID getEntityId() {
        return entityId;
    }

    public Idioma getIdioma() {
        return idioma;
    }
}
