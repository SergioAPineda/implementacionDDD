package co.com.sofka.ddd.pelicula.commads;

import co.com.sofka.ddd.pelicula.values.FuncionID;
import co.com.sofka.ddd.pelicula.values.Horario;
import co.com.sofka.ddd.pelicula.values.PeliculaID;
import co.com.sofka.domain.generic.Command;

public class CambiarHorarioFuncion implements Command {

    private final PeliculaID peliculaID;
    private final FuncionID entityId;
    private final Horario horario;

    public CambiarHorarioFuncion(PeliculaID peliculaID, FuncionID entityId, Horario horario) {
        this.peliculaID = peliculaID;
        this.entityId = entityId;
        this.horario = horario;
    }

    public PeliculaID getPeliculaID() {
        return peliculaID;
    }

    public FuncionID getEntityId() {
        return entityId;
    }

    public Horario getHorario() {
        return horario;
    }
}
