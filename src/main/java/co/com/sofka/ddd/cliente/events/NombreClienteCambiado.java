package co.com.sofka.ddd.cliente.events;

import co.com.sofka.ddd.cliente.values.ClienteID;
import co.com.sofka.ddd.cliente.values.NombreCliente;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreClienteCambiado extends DomainEvent {

    private final ClienteID clienteID;
    private final NombreCliente nombreCliente;
    public NombreClienteCambiado(ClienteID clienteID, NombreCliente nombreCliente) {
        super("sofka.cliente.nombrecambiado");
        this.clienteID = clienteID;
        this.nombreCliente = nombreCliente;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public NombreCliente getNombreCliente() {
        return nombreCliente;
    }
}
