package co.com.sofka.ddd.boleto.commands;

import co.com.sofka.ddd.boleto.values.BoletoID;
import co.com.sofka.ddd.boleto.values.Costo;
import co.com.sofka.domain.generic.Command;

public class ActualizarCosto implements Command {

    private final BoletoID boletoID;
    private final Costo costo;

    public ActualizarCosto(BoletoID boletoID, Costo costo) {
        this.boletoID = boletoID;
        this.costo = costo;
    }

    public BoletoID getBoletoID() {
        return boletoID;
    }

    public Costo getCosto() {
        return costo;
    }
}
