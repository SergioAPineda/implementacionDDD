package co.com.sofka.ddd.boleto.commands;

import co.com.sofka.ddd.boleto.values.DisponibilidadSilla;
import co.com.sofka.ddd.boleto.values.SillaID;
import co.com.sofka.domain.generic.Command;

public class ActualizarDisponibilidadSilla implements Command {

    private final SillaID sillaID;
    private final DisponibilidadSilla disponibilidad;

    public ActualizarDisponibilidadSilla(SillaID sillaID, DisponibilidadSilla disponibilidad) {
        this.sillaID = sillaID;
        this.disponibilidad = disponibilidad;
    }

    public SillaID getSillaID() {
        return sillaID;
    }

    public DisponibilidadSilla getDisponibilidad() {
        return disponibilidad;
    }
}
