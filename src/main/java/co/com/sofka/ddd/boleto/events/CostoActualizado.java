package co.com.sofka.ddd.boleto.events;

import co.com.sofka.ddd.boleto.values.BoletoID;
import co.com.sofka.ddd.boleto.values.Costo;
import co.com.sofka.domain.generic.DomainEvent;

public class CostoActualizado extends DomainEvent {

    private final BoletoID boletoID;
    private final Costo costo;

    public CostoActualizado(BoletoID boletoID, Costo costo) {
        super("sofka.boleto.costoactualizado");
        this.boletoID = boletoID;
        this.costo = costo;
    }
}
