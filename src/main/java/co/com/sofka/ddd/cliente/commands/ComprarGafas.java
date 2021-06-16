package co.com.sofka.ddd.cliente.commands;

import co.com.sofka.ddd.cliente.values.ClienteID;
import co.com.sofka.ddd.cliente.values.Gafas;
import co.com.sofka.domain.generic.Command;

public class ComprarGafas implements Command {

    private final ClienteID clienteID;
    private final Gafas gafas;

    public ComprarGafas(ClienteID clienteID, Gafas gafas) {
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
