package co.com.sofka.ddd.boleto;

import co.com.sofka.ddd.boleto.values.DisponibilidadSilla;
import co.com.sofka.ddd.boleto.values.SillaID;
import co.com.sofka.domain.generic.Entity;

public class Silla extends Entity<SillaID> {

    private DisponibilidadSilla disponibilidadSilla;

    public Silla(SillaID entityId, DisponibilidadSilla disponibilidadSilla) {
        super(entityId);
        this.disponibilidadSilla = disponibilidadSilla;
    }

    public DisponibilidadSilla disponibilidadSilla() {
        return disponibilidadSilla;
    }

}
