package co.com.sofka.ddd.boleto.commands;

import co.com.sofka.ddd.boleto.values.BoletoID;
import co.com.sofka.ddd.boleto.values.DisponibilidadSilla;
import co.com.sofka.ddd.boleto.values.SillaID;
import co.com.sofka.domain.generic.Command;

public class EscogerSilla implements Command {

    private final BoletoID boletoID;
    private final SillaID sillaID;
    private final DisponibilidadSilla disponibilidadSilla;

    public EscogerSilla(BoletoID boletoID, SillaID sillaID, DisponibilidadSilla disponibilidadSilla) {
        this.boletoID = boletoID;
        this.sillaID = sillaID;
        this.disponibilidadSilla = disponibilidadSilla;
    }

    public BoletoID getBoletoID() {
        return boletoID;
    }

    public SillaID getSillaID() {
        return sillaID;
    }

    public DisponibilidadSilla getDisponibilidadSilla() {
        return disponibilidadSilla;
    }
}
