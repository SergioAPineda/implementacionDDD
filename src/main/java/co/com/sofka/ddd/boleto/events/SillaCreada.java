package co.com.sofka.ddd.boleto.events;

import co.com.sofka.ddd.boleto.values.DisponibilidadSilla;
import co.com.sofka.ddd.boleto.values.SillaID;
import co.com.sofka.domain.generic.DomainEvent;

public class SillaCreada extends DomainEvent {

    private final SillaID sillaID;
    private final DisponibilidadSilla disponibilidadSilla;

    public SillaCreada(SillaID sillaID, DisponibilidadSilla disponibilidadSilla) {
        super("sofka.boleto.sillacreada");
        this.sillaID = sillaID;
        this.disponibilidadSilla = disponibilidadSilla;
    }
}
