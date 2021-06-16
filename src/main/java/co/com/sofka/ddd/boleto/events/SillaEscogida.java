package co.com.sofka.ddd.boleto.events;

import co.com.sofka.ddd.boleto.values.BoletoID;
import co.com.sofka.ddd.boleto.values.DisponibilidadSilla;
import co.com.sofka.ddd.boleto.values.SillaID;
import co.com.sofka.domain.generic.DomainEvent;

public class SillaEscogida extends DomainEvent {
    private final BoletoID boletoID;
    private final SillaID sillaID;
    private final DisponibilidadSilla disponibilidadSilla;

    public SillaEscogida(BoletoID boletoID, SillaID sillaID, DisponibilidadSilla disponibilidadSilla) {
        super("sofka.boleto.sillaescogida");
        this.boletoID = boletoID;
        this.sillaID = sillaID;
        this.disponibilidadSilla = disponibilidadSilla;
    }
}
