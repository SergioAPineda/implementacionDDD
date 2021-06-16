package co.com.sofka.ddd.cliente;

import co.com.sofka.ddd.cliente.events.ClaseCambiada;
import co.com.sofka.ddd.cliente.events.ClienteCreado;
import co.com.sofka.ddd.cliente.events.GafasCompradas;
import co.com.sofka.ddd.cliente.events.NombreClienteCambiado;
import co.com.sofka.ddd.cliente.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;

public class Cliente extends AggregateEvent<ClienteID> {

    protected Gafas gafas;
    protected NombreCliente nombreCliente;
    protected TarjetaID tarjetaID;

    public Cliente(ClienteID entityId, NombreCliente nombreCliente) {
        super(entityId);
        appendChange(new ClienteCreado(entityId, nombreCliente)).apply();
    }

    public void actualizarNombre(ClienteID clienteID, NombreCliente nombreCliente){
        Objects.requireNonNull(clienteID);
        Objects.requireNonNull(nombreCliente);
        appendChange(new NombreClienteCambiado(clienteID,nombreCliente)).apply();
    }

    public void actualizarClaseTarjeta(TarjetaID tarjetaID, Clase clase){
        Objects.requireNonNull(tarjetaID);
        Objects.requireNonNull(clase);
        appendChange(new ClaseCambiada(tarjetaID, clase)).apply();
    }

    public void comprarGafas(ClienteID clienteID, Gafas gafas){
        Objects.requireNonNull(clienteID);
        Objects.requireNonNull(gafas);
        appendChange(new GafasCompradas(clienteID, gafas)).apply();
    }

    public Gafas gafas() {
        return gafas;
    }

    public NombreCliente nombreCliente() {
        return nombreCliente;
    }

    public TarjetaID tarjetaID() {
        return tarjetaID;
    }
}
