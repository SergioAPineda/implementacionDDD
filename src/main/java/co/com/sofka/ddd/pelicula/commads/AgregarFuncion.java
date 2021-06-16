package co.com.sofka.ddd.pelicula.commads;

import co.com.sofka.ddd.pelicula.values.FuncionID;
import co.com.sofka.ddd.pelicula.values.Horario;
import co.com.sofka.ddd.pelicula.values.Idioma;
import co.com.sofka.ddd.pelicula.values.PeliculaID;
import co.com.sofka.domain.generic.Command;

public class AgregarFuncion implements Command {

    private final PeliculaID peliculaID;
    private final FuncionID entityId;
    private final Idioma idioma;
    private final Horario horario;

    public AgregarFuncion(PeliculaID peliculaID, FuncionID entityId, Idioma idioma, Horario horario) {
        this.peliculaID = peliculaID;
        this.entityId = entityId;
        this.idioma = idioma;
        this.horario = horario;
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

    public Horario getHorario() {
        return horario;
    }
}
