package co.com.sofka.ddd.boleto.commands;

import co.com.sofka.ddd.boleto.values.BoletoID;
import co.com.sofka.ddd.boleto.values.Costo;
import co.com.sofka.ddd.pelicula.values.PeliculaID;
import co.com.sofka.domain.generic.Command;

public class CrearBoleto implements Command {

    private final BoletoID entityId;
    private final Costo costo;
    private final PeliculaID peliculaID;

    public CrearBoleto(BoletoID entityId, Costo costo, PeliculaID peliculaID) {
        this.entityId = entityId;
        this.costo = costo;
        this.peliculaID = peliculaID;
    }

    public BoletoID getEntityId() {
        return entityId;
    }

    public Costo getCosto() {
        return costo;
    }

    public PeliculaID getPeliculaID() {
        return peliculaID;
    }
}
