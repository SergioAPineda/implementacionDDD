package co.com.sofka.ddd.cliente.commands;
import co.com.sofka.ddd.cliente.values.ClienteID;
import co.com.sofka.ddd.cliente.values.NombreCliente;
import co.com.sofka.domain.generic.Command;

public class CrearCliente implements Command {

    private final ClienteID clienteID;
    private final NombreCliente nombreCliente;

    public CrearCliente(ClienteID clienteID, NombreCliente nombreCliente){
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
