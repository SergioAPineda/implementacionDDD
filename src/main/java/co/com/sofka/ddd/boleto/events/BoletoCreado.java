package co.com.sofka.ddd.boleto.events;

import co.com.sofka.ddd.boleto.values.BoletoID;
import co.com.sofka.domain.generic.DomainEvent;

public class BoletoCreado extends DomainEvent {

    private final BoletoID boletoID;

    public BoletoCreado(BoletoID boletoID1){
        super("sofka.boleto.boletocreado");
        this.boletoID = boletoID1;
    }
}
