package co.com.sofka.ddd.pelicula.events;

import co.com.sofka.ddd.pelicula.values.FuncionID;
import co.com.sofka.ddd.pelicula.values.Horario;
import co.com.sofka.domain.generic.DomainEvent;

public class HorarioFuncionCambiado extends DomainEvent {
    private final FuncionID entityId;
    private final Horario horario;

    public HorarioFuncionCambiado(FuncionID entityId, Horario horario) {
        super("sofka.pelicula.horariofuncioncambiado");
        this.entityId = entityId;
        this.horario = horario;
    }

    public FuncionID getEntityId() {
        return entityId;
    }

    public Horario getHorario() {
        return horario;
    }
}
