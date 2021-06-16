package co.com.sofka.ddd.cliente.events;

import co.com.sofka.ddd.cliente.values.ClienteID;
import co.com.sofka.ddd.cliente.values.Gafas;
import co.com.sofka.domain.generic.DomainEvent;

public class GafasCompradas extends DomainEvent {
    private final ClienteID clienteID;
    private final Gafas gafas;

    public GafasCompradas(ClienteID clienteID, Gafas gafas) {
        super("sofka.cliente.gafascompradas");
        this.clienteID = clienteID;
        this.gafas = gafas;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public Gafas getGafas() {
        return gafas;
    }
}
