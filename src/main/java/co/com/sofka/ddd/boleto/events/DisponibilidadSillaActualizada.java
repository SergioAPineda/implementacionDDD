package co.com.sofka.ddd.boleto.events;

import co.com.sofka.ddd.boleto.values.DisponibilidadSilla;
import co.com.sofka.ddd.boleto.values.SillaID;
import co.com.sofka.domain.generic.DomainEvent;

public class DisponibilidadSillaActualizada extends DomainEvent {

    private final SillaID sillaID;
    private final DisponibilidadSilla disponibilidadSilla;

    public DisponibilidadSillaActualizada(SillaID sillaID, DisponibilidadSilla disponibilidadSilla) {
        super("sofka.boleto.disponibilidadSillaActualizada");
        this.sillaID = sillaID;
        this.disponibilidadSilla = disponibilidadSilla;
    }

    public SillaID getSillaID() {
        return sillaID;
    }

    public DisponibilidadSilla getDisponibilidad() {
        return disponibilidadSilla;
    }
}
